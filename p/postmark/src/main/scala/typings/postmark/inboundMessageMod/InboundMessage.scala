package typings.postmark.inboundMessageMod

import typings.postmark.messageSupportingTypesMod.Attachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InboundMessage extends js.Object {
  var Attachments: js.Array[Attachment] = js.native
  var Bcc: String = js.native
  var BccFull: js.Array[InboundRecipient] = js.native
  var Cc: String = js.native
  var CcFull: js.Array[InboundRecipient] = js.native
  var Date: String = js.native
  var From: String = js.native
  var FromFull: InboundRecipient = js.native
  var FromName: String = js.native
  var MailboxHash: String = js.native
  var MessageID: String = js.native
  var MessageStream: String = js.native
  var OriginalRecipient: String = js.native
  var ReplyTo: String = js.native
  var Status: String = js.native
  var Subject: String = js.native
  var Tag: js.UndefOr[String] = js.native
  var To: String = js.native
  var ToFull: js.Array[InboundRecipient] = js.native
}

object InboundMessage {
  @scala.inline
  def apply(
    Attachments: js.Array[Attachment],
    Bcc: String,
    BccFull: js.Array[InboundRecipient],
    Cc: String,
    CcFull: js.Array[InboundRecipient],
    Date: String,
    From: String,
    FromFull: InboundRecipient,
    FromName: String,
    MailboxHash: String,
    MessageID: String,
    MessageStream: String,
    OriginalRecipient: String,
    ReplyTo: String,
    Status: String,
    Subject: String,
    To: String,
    ToFull: js.Array[InboundRecipient]
  ): InboundMessage = {
    val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], Bcc = Bcc.asInstanceOf[js.Any], BccFull = BccFull.asInstanceOf[js.Any], Cc = Cc.asInstanceOf[js.Any], CcFull = CcFull.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], FromFull = FromFull.asInstanceOf[js.Any], FromName = FromName.asInstanceOf[js.Any], MailboxHash = MailboxHash.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], OriginalRecipient = OriginalRecipient.asInstanceOf[js.Any], ReplyTo = ReplyTo.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], ToFull = ToFull.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundMessage]
  }
  @scala.inline
  implicit class InboundMessageOps[Self <: InboundMessage] (val x: Self) extends AnyVal {
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
    def setAttachmentsVarargs(value: Attachment*): Self = this.set("Attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[Attachment]): Self = this.set("Attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def setBcc(value: String): Self = this.set("Bcc", value.asInstanceOf[js.Any])
    @scala.inline
    def setBccFullVarargs(value: InboundRecipient*): Self = this.set("BccFull", js.Array(value :_*))
    @scala.inline
    def setBccFull(value: js.Array[InboundRecipient]): Self = this.set("BccFull", value.asInstanceOf[js.Any])
    @scala.inline
    def setCc(value: String): Self = this.set("Cc", value.asInstanceOf[js.Any])
    @scala.inline
    def setCcFullVarargs(value: InboundRecipient*): Self = this.set("CcFull", js.Array(value :_*))
    @scala.inline
    def setCcFull(value: js.Array[InboundRecipient]): Self = this.set("CcFull", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: String): Self = this.set("Date", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: String): Self = this.set("From", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromFull(value: InboundRecipient): Self = this.set("FromFull", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromName(value: String): Self = this.set("FromName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMailboxHash(value: String): Self = this.set("MailboxHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageID(value: String): Self = this.set("MessageID", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageStream(value: String): Self = this.set("MessageStream", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalRecipient(value: String): Self = this.set("OriginalRecipient", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplyTo(value: String): Self = this.set("ReplyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: String): Self = this.set("To", value.asInstanceOf[js.Any])
    @scala.inline
    def setToFullVarargs(value: InboundRecipient*): Self = this.set("ToFull", js.Array(value :_*))
    @scala.inline
    def setToFull(value: js.Array[InboundRecipient]): Self = this.set("ToFull", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

