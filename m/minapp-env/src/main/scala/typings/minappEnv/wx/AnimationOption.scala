package typings.minappEnv.wx

import typings.minappEnv.minappEnvStrings.easeIn
import typings.minappEnv.minappEnvStrings.easeInOut
import typings.minappEnv.minappEnvStrings.easeOut
import typings.minappEnv.minappEnvStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 动画效果 */
trait AnimationOption extends js.Object {
  /** 动画变化时间，单位 ms */
  var duration: js.UndefOr[Double] = js.undefined
  /** 动画变化方式
    *
    * 可选值：
    * - 'linear': 动画从头到尾的速度是相同的;
    * - 'easeIn': 动画以低速开始;
    * - 'easeOut': 动画以低速结束;
    * - 'easeInOut': 动画以低速开始和结束; */
  var timingFunc: js.UndefOr[linear | easeIn | easeOut | easeInOut] = js.undefined
}

object AnimationOption {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    timingFunc: linear | easeIn | easeOut | easeInOut = null
  ): AnimationOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (timingFunc != null) __obj.updateDynamic("timingFunc")(timingFunc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOption]
  }
}

