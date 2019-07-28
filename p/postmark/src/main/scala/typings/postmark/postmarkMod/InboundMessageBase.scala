package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InboundMessageBase extends MessageBase {
  var CcFull: js.Array[ExpandedEmail]
  var Date: String
  var FromFull: ExpandedEmail
  var FromName: String
  var MailboxHash: String
  var OriginalRecipient: String
  var ReplyTo: String
  var To: String
  var ToFull: js.Array[ExpandedEmail]
}

object InboundMessageBase {
  @scala.inline
  def apply(
    Attachments: js.Array[PostmarkAttachment],
    Cc: String,
    CcFull: js.Array[ExpandedEmail],
    Date: String,
    From: String,
    FromFull: ExpandedEmail,
    FromName: String,
    MailboxHash: String,
    MessageID: String,
    OriginalRecipient: String,
    ReplyTo: String,
    Status: String,
    Subject: String,
    Tag: String,
    To: String,
    ToFull: js.Array[ExpandedEmail]
  ): InboundMessageBase = {
    val __obj = js.Dynamic.literal(Attachments = Attachments, Cc = Cc, CcFull = CcFull, Date = Date, From = From, FromFull = FromFull, FromName = FromName, MailboxHash = MailboxHash, MessageID = MessageID, OriginalRecipient = OriginalRecipient, ReplyTo = ReplyTo, Status = Status, Subject = Subject, Tag = Tag, To = To, ToFull = ToFull)
  
    __obj.asInstanceOf[InboundMessageBase]
  }
}

