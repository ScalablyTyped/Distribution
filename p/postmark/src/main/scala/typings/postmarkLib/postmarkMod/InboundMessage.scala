package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InboundMessage extends InboundMessageBase {
  var BlockedReason: js.UndefOr[java.lang.String] = js.undefined
  var Headers: js.Array[PostmarkMessageHeader]
  var HtmlBody: java.lang.String
  var MessageEvents: js.Array[MessageEvents]
  var TextBody: java.lang.String
}

object InboundMessage {
  @scala.inline
  def apply(
    Attachments: js.Array[PostmarkAttachment],
    Cc: java.lang.String,
    CcFull: js.Array[ExpandedEmail],
    Date: java.lang.String,
    From: java.lang.String,
    FromFull: ExpandedEmail,
    FromName: java.lang.String,
    Headers: js.Array[PostmarkMessageHeader],
    HtmlBody: java.lang.String,
    MailboxHash: java.lang.String,
    MessageEvents: js.Array[MessageEvents],
    MessageID: java.lang.String,
    OriginalRecipient: java.lang.String,
    ReplyTo: java.lang.String,
    Status: java.lang.String,
    Subject: java.lang.String,
    Tag: java.lang.String,
    TextBody: java.lang.String,
    To: java.lang.String,
    ToFull: js.Array[ExpandedEmail],
    BlockedReason: java.lang.String = null
  ): InboundMessage = {
    val __obj = js.Dynamic.literal(Attachments = Attachments, Cc = Cc, CcFull = CcFull, Date = Date, From = From, FromFull = FromFull, FromName = FromName, Headers = Headers, HtmlBody = HtmlBody, MailboxHash = MailboxHash, MessageEvents = MessageEvents, MessageID = MessageID, OriginalRecipient = OriginalRecipient, ReplyTo = ReplyTo, Status = Status, Subject = Subject, Tag = Tag, TextBody = TextBody, To = To, ToFull = ToFull)
    if (BlockedReason != null) __obj.updateDynamic("BlockedReason")(BlockedReason)
    __obj.asInstanceOf[InboundMessage]
  }
}

