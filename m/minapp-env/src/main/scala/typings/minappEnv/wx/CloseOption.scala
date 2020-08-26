package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseOption extends js.Object {
  /** 一个数字值表示关闭连接的状态号，表示连接被关闭的原因。 */
  var code: js.UndefOr[Double] = js.native
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CloseCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CloseFailCallback] = js.native
  /** 一个可读的字符串，表示连接被关闭的原因。这个字符串必须是不长于 123 字节的 UTF-8 文本（不是字符）。 */
  var reason: js.UndefOr[String] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CloseSuccessCallback] = js.native
}

object CloseOption {
  @scala.inline
  def apply(): CloseOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseOption]
  }
  @scala.inline
  implicit class CloseOptionOps[Self <: CloseOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

