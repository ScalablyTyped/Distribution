package typings.minappEnv.wx

import typings.minappEnv.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendHCEMessageOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SendHCEMessageCompleteCallback] = js.undefined
  /** 二进制数据 */
  var data: ArrayBuffer
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SendHCEMessageFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SendHCEMessageSuccessCallback] = js.undefined
}

object SendHCEMessageOption {
  @scala.inline
  def apply(
    data: ArrayBuffer,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): SendHCEMessageOption = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SendHCEMessageOption]
  }
}

