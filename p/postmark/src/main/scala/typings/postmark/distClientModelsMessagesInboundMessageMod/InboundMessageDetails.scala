package typings.postmark.distClientModelsMessagesInboundMessageMod

import typings.postmark.distClientModelsMessageSupportingTypesMod.Attachment
import typings.postmark.distClientModelsMessageSupportingTypesMod.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InboundMessageDetails extends InboundMessage {
  var BlockedReason: String
  var Headers: js.Array[Header]
  var HtmlBody: String
  var StrippedTextReply: String
  var TextBody: String
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
    ToFull: js.Array[InboundRecipient],
    Tag: String = null
  ): InboundMessageDetails = {
    val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], Bcc = Bcc.asInstanceOf[js.Any], BccFull = BccFull.asInstanceOf[js.Any], BlockedReason = BlockedReason.asInstanceOf[js.Any], Cc = Cc.asInstanceOf[js.Any], CcFull = CcFull.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], FromFull = FromFull.asInstanceOf[js.Any], FromName = FromName.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], HtmlBody = HtmlBody.asInstanceOf[js.Any], MailboxHash = MailboxHash.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], OriginalRecipient = OriginalRecipient.asInstanceOf[js.Any], ReplyTo = ReplyTo.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], StrippedTextReply = StrippedTextReply.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], TextBody = TextBody.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], ToFull = ToFull.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundMessageDetails]
  }
}

