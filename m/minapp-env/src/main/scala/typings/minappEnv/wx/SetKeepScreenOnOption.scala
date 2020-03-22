package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetKeepScreenOnOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetKeepScreenOnCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetKeepScreenOnFailCallback] = js.undefined
  /** 是否保持屏幕常亮 */
  var keepScreenOn: Boolean
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetKeepScreenOnSuccessCallback] = js.undefined
}

object SetKeepScreenOnOption {
  @scala.inline
  def apply(
    keepScreenOn: Boolean,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): SetKeepScreenOnOption = {
    val __obj = js.Dynamic.literal(keepScreenOn = keepScreenOn.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SetKeepScreenOnOption]
  }
}

