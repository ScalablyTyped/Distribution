package typings.paypalRestSdk.mod.invoice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailRequest extends js.Object {
  var cc_emails: js.UndefOr[js.Array[String]] = js.native
  var note: js.UndefOr[String] = js.native
  var send_to_merchant: js.UndefOr[Boolean] = js.native
  var send_to_payer: js.UndefOr[Boolean] = js.native
  var subject: js.UndefOr[String] = js.native
}

object EmailRequest {
  @scala.inline
  def apply(): EmailRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailRequest]
  }
  @scala.inline
  implicit class EmailRequestOps[Self <: EmailRequest] (val x: Self) extends AnyVal {
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
    def setCc_emailsVarargs(value: String*): Self = this.set("cc_emails", js.Array(value :_*))
    @scala.inline
    def setCc_emails(value: js.Array[String]): Self = this.set("cc_emails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCc_emails: Self = this.set("cc_emails", js.undefined)
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setSend_to_merchant(value: Boolean): Self = this.set("send_to_merchant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSend_to_merchant: Self = this.set("send_to_merchant", js.undefined)
    @scala.inline
    def setSend_to_payer(value: Boolean): Self = this.set("send_to_payer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSend_to_payer: Self = this.set("send_to_payer", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
  
}

