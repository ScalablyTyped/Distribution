package typings.minappEnv.wx

import typings.minappEnv.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SendCompleteCallback] = js.undefined
  /** 需要发送的内容 */
  var data: String | ArrayBuffer
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SendFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SendSuccessCallback] = js.undefined
}

object SendOption {
  @scala.inline
  def apply(
    data: String | ArrayBuffer,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): SendOption = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SendOption]
  }
}

