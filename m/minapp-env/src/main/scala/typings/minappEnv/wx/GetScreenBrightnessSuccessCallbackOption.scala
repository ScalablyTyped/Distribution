package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScreenBrightnessSuccessCallbackOption extends js.Object {
  /** 屏幕亮度值，范围 0 ~ 1，0 最暗，1 最亮 */
  var value: Double
}

object GetScreenBrightnessSuccessCallbackOption {
  @scala.inline
  def apply(value: Double): GetScreenBrightnessSuccessCallbackOption = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScreenBrightnessSuccessCallbackOption]
  }
}

