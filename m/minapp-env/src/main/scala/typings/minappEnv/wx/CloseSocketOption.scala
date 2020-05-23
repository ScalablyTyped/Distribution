package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseSocketOption extends js.Object {
  /** 一个数字值表示关闭连接的状态号，表示连接被关闭的原因。 */
  var code: js.UndefOr[Double] = js.undefined
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CloseSocketCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CloseSocketFailCallback] = js.undefined
  /** 一个可读的字符串，表示连接被关闭的原因。这个字符串必须是不长于 123 字节的 UTF-8 文本（不是字符）。 */
  var reason: js.UndefOr[String] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CloseSocketSuccessCallback] = js.undefined
}

object CloseSocketOption {
  @scala.inline
  def apply(
    code: js.UndefOr[Double] = js.undefined,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    reason: String = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): CloseSocketOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[CloseSocketOption]
  }
}

