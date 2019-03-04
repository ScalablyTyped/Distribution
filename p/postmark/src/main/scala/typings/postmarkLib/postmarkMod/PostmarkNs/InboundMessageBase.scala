package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InboundMessageBase extends MessageBase {
  var CcFull: js.Array[ExpandedEmail]
  var Date: java.lang.String
  var FromFull: ExpandedEmail
  var FromName: java.lang.String
  var MailboxHash: java.lang.String
  var OriginalRecipient: java.lang.String
  var ReplyTo: java.lang.String
  var To: java.lang.String
  var ToFull: js.Array[ExpandedEmail]
}

object InboundMessageBase {
  @scala.inline
  def apply(
    Attachments: js.Array[PostmarkAttachment],
    Cc: java.lang.String,
    CcFull: js.Array[ExpandedEmail],
    Date: java.lang.String,
    From: java.lang.String,
    FromFull: ExpandedEmail,
    FromName: java.lang.String,
    MailboxHash: java.lang.String,
    MessageID: java.lang.String,
    OriginalRecipient: java.lang.String,
    ReplyTo: java.lang.String,
    Status: java.lang.String,
    Subject: java.lang.String,
    Tag: java.lang.String,
    To: java.lang.String,
    ToFull: js.Array[ExpandedEmail]
  ): InboundMessageBase = {
    val __obj = js.Dynamic.literal(Attachments = Attachments, Cc = Cc, CcFull = CcFull, Date = Date, From = From, FromFull = FromFull, FromName = FromName, MailboxHash = MailboxHash, MessageID = MessageID, OriginalRecipient = OriginalRecipient, ReplyTo = ReplyTo, Status = Status, Subject = Subject, Tag = Tag, To = To, ToFull = ToFull)
  
    __obj.asInstanceOf[InboundMessageBase]
  }
}

