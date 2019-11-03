package typings.postmark.distClientModelsMessagesInboundMessageMod

import typings.postmark.distClientModelsMessageSupportingTypesMod.Attachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InboundMessage extends js.Object {
  var Attachments: js.Array[Attachment]
  var Bcc: String
  var BccFull: js.Array[InboundRecipient]
  var Cc: String
  var CcFull: js.Array[InboundRecipient]
  var Date: String
  var From: String
  var FromFull: InboundRecipient
  var FromName: String
  var MailboxHash: String
  var MessageID: String
  var OriginalRecipient: String
  var ReplyTo: String
  var Status: String
  var Subject: String
  var Tag: js.UndefOr[String] = js.undefined
  var To: String
  var ToFull: js.Array[InboundRecipient]
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
    OriginalRecipient: String,
    ReplyTo: String,
    Status: String,
    Subject: String,
    To: String,
    ToFull: js.Array[InboundRecipient],
    Tag: String = null
  ): InboundMessage = {
    val __obj = js.Dynamic.literal(Attachments = Attachments, Bcc = Bcc, BccFull = BccFull, Cc = Cc, CcFull = CcFull, Date = Date, From = From, FromFull = FromFull, FromName = FromName, MailboxHash = MailboxHash, MessageID = MessageID, OriginalRecipient = OriginalRecipient, ReplyTo = ReplyTo, Status = Status, Subject = Subject, To = To, ToFull = ToFull)
    if (Tag != null) __obj.updateDynamic("Tag")(Tag)
    __obj.asInstanceOf[InboundMessage]
  }
}

