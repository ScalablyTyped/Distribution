package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InboundMessage extends InboundMessageBase {
  var BlockedReason: js.UndefOr[String] = js.undefined
  var Headers: js.Array[PostmarkMessageHeader]
  var HtmlBody: String
  var MessageEvents: js.Array[typings.postmark.postmarkMod.MessageEvents]
  var TextBody: String
}

object InboundMessage {
  @scala.inline
  def apply(
    Attachments: js.Array[PostmarkAttachment],
    Cc: String,
    CcFull: js.Array[ExpandedEmail],
    Date: String,
    From: String,
    FromFull: ExpandedEmail,
    FromName: String,
    Headers: js.Array[PostmarkMessageHeader],
    HtmlBody: String,
    MailboxHash: String,
    MessageEvents: js.Array[MessageEvents],
    MessageID: String,
    OriginalRecipient: String,
    ReplyTo: String,
    Status: String,
    Subject: String,
    Tag: String,
    TextBody: String,
    To: String,
    ToFull: js.Array[ExpandedEmail],
    BlockedReason: String = null
  ): InboundMessage = {
    val __obj = js.Dynamic.literal(Attachments = Attachments, Cc = Cc, CcFull = CcFull, Date = Date, From = From, FromFull = FromFull, FromName = FromName, Headers = Headers, HtmlBody = HtmlBody, MailboxHash = MailboxHash, MessageEvents = MessageEvents, MessageID = MessageID, OriginalRecipient = OriginalRecipient, ReplyTo = ReplyTo, Status = Status, Subject = Subject, Tag = Tag, TextBody = TextBody, To = To, ToFull = ToFull)
    if (BlockedReason != null) __obj.updateDynamic("BlockedReason")(BlockedReason)
    __obj.asInstanceOf[InboundMessage]
  }
}

