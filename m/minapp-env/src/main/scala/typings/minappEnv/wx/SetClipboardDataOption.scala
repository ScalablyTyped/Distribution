package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetClipboardDataOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetClipboardDataCompleteCallback] = js.undefined
  /** 剪贴板的内容 */
  var data: String
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetClipboardDataFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetClipboardDataSuccessCallback] = js.undefined
}

object SetClipboardDataOption {
  @scala.inline
  def apply(
    data: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): SetClipboardDataOption = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SetClipboardDataOption]
  }
}

