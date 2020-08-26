package typings.postmark.inboundMessageMod

import typings.postmark.outboundMessageMod.Recipient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InboundRecipient extends Recipient {
  var MailboxHash: String = js.native
}

object InboundRecipient {
  @scala.inline
  def apply(Email: String, MailboxHash: String, Name: String): InboundRecipient = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], MailboxHash = MailboxHash.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundRecipient]
  }
  @scala.inline
  implicit class InboundRecipientOps[Self <: InboundRecipient] (val x: Self) extends AnyVal {
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
    def setMailboxHash(value: String): Self = this.set("MailboxHash", value.asInstanceOf[js.Any])
  }
  
}

