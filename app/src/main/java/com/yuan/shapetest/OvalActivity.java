package com.yuan.shapetest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class OvalActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oval);

        findViewById(R.id.iv_shape).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
