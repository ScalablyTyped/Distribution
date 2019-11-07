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
    val __obj = js.Dynamic.literal(Attachments = Attachments, Bcc = Bcc, BccFull = BccFull, BlockedReason = BlockedReason, Cc = Cc, CcFull = CcFull, Date = Date, From = From, FromFull = FromFull, FromName = FromName, Headers = Headers, HtmlBody = HtmlBody, MailboxHash = MailboxHash, MessageID = MessageID, MessageStream = MessageStream, OriginalRecipient = OriginalRecipient, ReplyTo = ReplyTo, Status = Status, StrippedTextReply = StrippedTextReply, Subject = Subject, TextBody = TextBody, To = To, ToFull = ToFull)
    if (Tag != null) __obj.updateDynamic("Tag")(Tag)
    __obj.asInstanceOf[InboundMessageDetails]
  }
}

