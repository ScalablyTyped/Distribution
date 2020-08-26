package typings.postmark.inboundMessageMod

import typings.postmark.messageSupportingTypesMod.Attachment
import typings.postmark.messageSupportingTypesMod.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InboundMessageDetails extends InboundMessage {
  var BlockedReason: String = js.native
  var Headers: js.Array[Header] = js.native
  var HtmlBody: String = js.native
  var StrippedTextReply: String = js.native
  var TextBody: String = js.native
}

object InboundMessageDetails {
  @scala.inline
  def apply(
    Attachments: js.Array[Attachment],
    Bcc: String,
    BccFull: js.Array[InboundRecipient],
    BlockedReason: String,
    Cc: String,
    CcFull: js.Array[InboundRecipient],
    Date: String,
    From: String,
    FromFull: InboundRecipient,
    FromName: String,
    Headers: js.Array[Header],
    HtmlBody: String,
    MailboxHash: String,
    MessageID: String,
    MessageStream: String,
    OriginalRecipient: String,
    ReplyTo: String,
    Status: String,
    StrippedTextReply: String,
    Subject: String,
    TextBody: String,
    To: String,
    ToFull: js.Array[InboundRecipient]
  ): InboundMessageDetails = {
    val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], Bcc = Bcc.asInstanceOf[js.Any], BccFull = BccFull.asInstanceOf[js.Any], BlockedReason = BlockedReason.asInstanceOf[js.Any], Cc = Cc.asInstanceOf[js.Any], CcFull = CcFull.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], FromFull = FromFull.asInstanceOf[js.Any], FromName = FromName.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], HtmlBody = HtmlBody.asInstanceOf[js.Any], MailboxHash = MailboxHash.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], OriginalRecipient = OriginalRecipient.asInstanceOf[js.Any], ReplyTo = ReplyTo.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], StrippedTextReply = StrippedTextReply.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], TextBody = TextBody.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], ToFull = ToFull.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundMessageDetails]
  }
  @scala.inline
  implicit class InboundMessageDetailsOps[Self <: InboundMessageDetails] (val x: Self) extends AnyVal {
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
    def setBlockedReason(value: String): Self = this.set("BlockedReason", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadersVarargs(value: Header*): Self = this.set("Headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[Header]): Self = this.set("Headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtmlBody(value: String): Self = this.set("HtmlBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrippedTextReply(value: String): Self = this.set("StrippedTextReply", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextBody(value: String): Self = this.set("TextBody", value.asInstanceOf[js.Any])
  }
  
}

