package typings.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// request params
@js.native
trait SendParams extends js.Object {
  var Messages: js.Array[SendParamsMessage] = js.native
  var SandboxMode: js.UndefOr[Boolean] = js.native
}

object SendParams {
  @scala.inline
  def apply(Messages: js.Array[SendParamsMessage]): SendParams = {
    val __obj = js.Dynamic.literal(Messages = Messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendParams]
  }
  @scala.inline
  implicit class SendParamsOps[Self <: SendParams] (val x: Self) extends AnyVal {
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
    def setMessagesVarargs(value: SendParamsMessage*): Self = this.set("Messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[SendParamsMessage]): Self = this.set("Messages", value.asInstanceOf[js.Any])
    @scala.inline
    def setSandboxMode(value: Boolean): Self = this.set("SandboxMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSandboxMode: Self = this.set("SandboxMode", js.undefined)
  }
  
}

