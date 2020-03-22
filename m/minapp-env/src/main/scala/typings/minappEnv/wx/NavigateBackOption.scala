package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateBackOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[NavigateBackCompleteCallback] = js.undefined
  /** 返回的页面数，如果 delta 大于现有页面数，则返回到首页。 */
  var delta: Double
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[NavigateBackFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[NavigateBackSuccessCallback] = js.undefined
}

object NavigateBackOption {
  @scala.inline
  def apply(
    delta: Double,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): NavigateBackOption = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[NavigateBackOption]
  }
}

