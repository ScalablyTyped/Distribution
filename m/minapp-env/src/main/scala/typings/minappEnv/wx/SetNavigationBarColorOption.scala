package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetNavigationBarColorOption extends js.Object {
  /** 动画效果 */
  var animation: AnimationOption
  /** 背景颜色值，有效值为十六进制颜色 */
  var backgroundColor: String
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetNavigationBarColorCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetNavigationBarColorFailCallback] = js.undefined
  /** 前景颜色值，包括按钮、标题、状态栏的颜色，仅支持 #ffffff 和 #000000 */
  var frontColor: String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetNavigationBarColorSuccessCallback] = js.undefined
}

object SetNavigationBarColorOption {
  @scala.inline
  def apply(
    animation: AnimationOption,
    backgroundColor: String,
    frontColor: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): SetNavigationBarColorOption = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], frontColor = frontColor.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SetNavigationBarColorOption]
  }
}

