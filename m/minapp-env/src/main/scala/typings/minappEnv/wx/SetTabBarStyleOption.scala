package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTabBarStyleOption extends js.Object {
  /** tab 的背景色，HexColor */
  var backgroundColor: String
  /** tabBar上边框的颜色， 仅支持 black/white */
  var borderStyle: String
  /** tab 上的文字默认颜色，HexColor */
  var color: String
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetTabBarStyleCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetTabBarStyleFailCallback] = js.undefined
  /** tab 上的文字选中时的颜色，HexColor */
  var selectedColor: String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetTabBarStyleSuccessCallback] = js.undefined
}

object SetTabBarStyleOption {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderStyle: String,
    color: String,
    selectedColor: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): SetTabBarStyleOption = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], selectedColor = selectedColor.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SetTabBarStyleOption]
  }
}

