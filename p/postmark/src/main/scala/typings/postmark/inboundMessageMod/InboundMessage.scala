package typings.postmark.inboundMessageMod

import typings.postmark.messageSupportingTypesMod.Attachment
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
  var MessageStream: String
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
    MessageStream: String,
    OriginalRecipient: String,
    ReplyTo: String,
    Status: String,
    Subject: String,
    To: String,
    ToFull: js.Array[InboundRecipient],
    Tag: String = null
  ): InboundMessage = {
    val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], Bcc = Bcc.asInstanceOf[js.Any], BccFull = BccFull.asInstanceOf[js.Any], Cc = Cc.asInstanceOf[js.Any], CcFull = CcFull.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], FromFull = FromFull.asInstanceOf[js.Any], FromName = FromName.asInstanceOf[js.Any], MailboxHash = MailboxHash.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], OriginalRecipient = OriginalRecipient.asInstanceOf[js.Any], ReplyTo = ReplyTo.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], ToFull = ToFull.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundMessage]
  }
}

