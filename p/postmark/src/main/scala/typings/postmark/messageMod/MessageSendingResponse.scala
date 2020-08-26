package typings.postmark.messageMod

import typings.postmark.defaultResponseMod.DefaultResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageSendingResponse extends DefaultResponse {
  var Bcc: js.UndefOr[String] = js.native
  var Cc: js.UndefOr[String] = js.native
  var MessageID: String = js.native
  var SubmittedAt: String = js.native
  var To: js.UndefOr[String] = js.native
}

object MessageSendingResponse {
  @scala.inline
  def apply(ErrorCode: Double, Message: String, MessageID: String, SubmittedAt: String): MessageSendingResponse = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], SubmittedAt = SubmittedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageSendingResponse]
  }
  @scala.inline
  implicit class MessageSendingResponseOps[Self <: MessageSendingResponse] (val x: Self) extends AnyVal {
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
    def setMessageID(value: String): Self = this.set("MessageID", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmittedAt(value: String): Self = this.set("SubmittedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setBcc(value: String): Self = this.set("Bcc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBcc: Self = this.set("Bcc", js.undefined)
    @scala.inline
    def setCc(value: String): Self = this.set("Cc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCc: Self = this.set("Cc", js.undefined)
    @scala.inline
    def setTo(value: String): Self = this.set("To", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("To", js.undefined)
  }
  
}

