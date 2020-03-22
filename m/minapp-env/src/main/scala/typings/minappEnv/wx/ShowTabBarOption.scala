package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowTabBarOption extends js.Object {
  /** 是否需要动画效果 */
  var animation: js.UndefOr[Boolean] = js.undefined
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ShowTabBarCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ShowTabBarFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ShowTabBarSuccessCallback] = js.undefined
}

object ShowTabBarOption {
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): ShowTabBarOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ShowTabBarOption]
  }
}

