package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenSettingOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[OpenSettingCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[OpenSettingFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[OpenSettingSuccessCallback] = js.undefined
}

object OpenSettingOption {
  @scala.inline
  def apply(
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* result */ OpenSettingSuccessCallbackResult => Unit = null
  ): OpenSettingOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenSettingOption]
  }
}

