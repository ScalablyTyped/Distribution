package typings
package postmarkLib.postmarkMod.PostmarkNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Attachments")(Attachments)
    __obj.updateDynamic("Cc")(Cc)
    __obj.updateDynamic("CcFull")(CcFull)
    __obj.updateDynamic("Date")(Date)
    __obj.updateDynamic("From")(From)
    __obj.updateDynamic("FromFull")(FromFull)
    __obj.updateDynamic("FromName")(FromName)
    __obj.updateDynamic("Headers")(Headers)
    __obj.updateDynamic("HtmlBody")(HtmlBody)
    __obj.updateDynamic("MailboxHash")(MailboxHash)
    __obj.updateDynamic("MessageEvents")(MessageEvents)
    __obj.updateDynamic("MessageID")(MessageID)
    __obj.updateDynamic("OriginalRecipient")(OriginalRecipient)
    __obj.updateDynamic("ReplyTo")(ReplyTo)
    __obj.updateDynamic("Status")(Status)
    __obj.updateDynamic("Subject")(Subject)
    __obj.updateDynamic("Tag")(Tag)
    __obj.updateDynamic("TextBody")(TextBody)
    __obj.updateDynamic("To")(To)
    __obj.updateDynamic("ToFull")(ToFull)
    if (BlockedReason != null) __obj.updateDynamic("BlockedReason")(BlockedReason)
    __obj.asInstanceOf[InboundMessage]
  }
}

