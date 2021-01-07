package com.example.bannerdemo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    //  tv_banner.ellipsize = TextUtils.TruncateAt.MARQUEE
    //   tv_banner.setSingleLine()
        tv_banner.setText("Its Demo Text Which can be replaced by the user of this application")
        tv_banner.isSelected = true


    }
}