package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScaleOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetScaleCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetScaleFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetScaleSuccessCallback] = js.undefined
}

object GetScaleOption {
  @scala.inline
  def apply(
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* result */ GetScaleSuccessCallbackResult => Unit = null
  ): GetScaleOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetScaleOption]
  }
}

