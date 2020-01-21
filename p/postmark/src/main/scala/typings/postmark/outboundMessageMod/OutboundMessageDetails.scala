package typings.postmark.outboundMessageMod

import typings.postmark.messageSupportingTypesMod.Attachment
import typings.postmark.messageSupportingTypesMod.LinkTrackingOptions
import typings.postmark.outboundMessageEventsMod.MessageEvent
import typings.postmark.supportingTypesMod.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutboundMessageDetails extends OutboundMessage {
  var Body: String
  var HtmlBody: js.UndefOr[String] = js.undefined
  var MessageEvents: js.Array[MessageEvent]
  var TextBody: js.UndefOr[String] = js.undefined
}

object OutboundMessageDetails {
  @scala.inline
  def apply(
    Attachments: js.Array[Attachment],
    Bcc: js.Array[Recipient],
    Body: String,
    Cc: js.Array[Recipient],
    From: String,
    MessageEvents: js.Array[MessageEvent],
    MessageID: String,
    MessageStream: String,
    Metadata: Hash[String],
    ReceivedAt: String,
    Recipients: js.Array[String],
    Status: String,
    Subject: String,
    To: js.Array[Recipient],
    TrackLinks: LinkTrackingOptions,
    TrackOpens: Boolean,
    HtmlBody: String = null,
    Tag: String = null,
    TextBody: String = null
  ): OutboundMessageDetails = {
    val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], Bcc = Bcc.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], Cc = Cc.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], MessageEvents = MessageEvents.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], Metadata = Metadata.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], TrackLinks = TrackLinks.asInstanceOf[js.Any], TrackOpens = TrackOpens.asInstanceOf[js.Any])
    if (HtmlBody != null) __obj.updateDynamic("HtmlBody")(HtmlBody.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    if (TextBody != null) __obj.updateDynamic("TextBody")(TextBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutboundMessageDetails]
  }
}

