package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraContextStartRecordOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CameraContextStartRecordCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CameraContextStartRecordFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CameraContextStartRecordSuccessCallback] = js.undefined
  /** 超过30s或页面 `onHide` 时会结束录像 */
  var timeoutCallback: js.UndefOr[StartRecordTimeoutCallback] = js.undefined
}

object CameraContextStartRecordOption {
  @scala.inline
  def apply(
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null,
    timeoutCallback: /* result */ StartRecordTimeoutCallbackResult => Unit = null
  ): CameraContextStartRecordOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (timeoutCallback != null) __obj.updateDynamic("timeoutCallback")(js.Any.fromFunction1(timeoutCallback))
    __obj.asInstanceOf[CameraContextStartRecordOption]
  }
}

