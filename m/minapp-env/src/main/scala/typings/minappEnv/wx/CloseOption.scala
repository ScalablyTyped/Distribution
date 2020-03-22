package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseOption extends js.Object {
  /** 一个数字值表示关闭连接的状态号，表示连接被关闭的原因。 */
  var code: js.UndefOr[Double] = js.undefined
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CloseCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CloseFailCallback] = js.undefined
  /** 一个可读的字符串，表示连接被关闭的原因。这个字符串必须是不长于 123 字节的 UTF-8 文本（不是字符）。 */
  var reason: js.UndefOr[String] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CloseSuccessCallback] = js.undefined
}

object CloseOption {
  @scala.inline
  def apply(
    code: Int | Double = null,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    reason: String = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): CloseOption = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[CloseOption]
  }
}

