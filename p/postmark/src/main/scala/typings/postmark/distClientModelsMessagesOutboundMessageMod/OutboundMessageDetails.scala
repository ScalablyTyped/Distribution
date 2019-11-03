package typings.postmark.distClientModelsMessagesOutboundMessageMod

import typings.postmark.distClientModelsClientSupportingTypesMod.Hash
import typings.postmark.distClientModelsMessageSupportingTypesMod.Attachment
import typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions
import typings.postmark.distClientModelsMessagesOutboundMessageEventsMod.MessageEvent
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
    val __obj = js.Dynamic.literal(Attachments = Attachments, Bcc = Bcc, Body = Body, Cc = Cc, From = From, MessageEvents = MessageEvents, MessageID = MessageID, Metadata = Metadata, ReceivedAt = ReceivedAt, Recipients = Recipients, Status = Status, Subject = Subject, To = To, TrackLinks = TrackLinks, TrackOpens = TrackOpens)
    if (HtmlBody != null) __obj.updateDynamic("HtmlBody")(HtmlBody)
    if (Tag != null) __obj.updateDynamic("Tag")(Tag)
    if (TextBody != null) __obj.updateDynamic("TextBody")(TextBody)
    __obj.asInstanceOf[OutboundMessageDetails]
  }
}

