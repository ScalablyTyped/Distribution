package typings.postmark.distClientModelsMessagesOutboundMessageMod

import typings.postmark.distClientModelsClientSupportingTypesMod.Hash
import typings.postmark.distClientModelsMessageSupportingTypesMod.Attachment
import typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutboundMessage extends js.Object {
  var Attachments: js.Array[Attachment]
  var Bcc: js.Array[Recipient]
  var Cc: js.Array[Recipient]
  var From: String
  var MessageID: String
  var MessageStream: String
  var Metadata: Hash[String]
  var ReceivedAt: String
  var Recipients: js.Array[String]
  var Status: String
  var Subject: String
  var Tag: js.UndefOr[String] = js.undefined
  var To: js.Array[Recipient]
  var TrackLinks: LinkTrackingOptions
  var TrackOpens: Boolean
}

object OutboundMessage {
  @scala.inline
  def apply(
    Attachments: js.Array[Attachment],
    Bcc: js.Array[Recipient],
    Cc: js.Array[Recipient],
    From: String,
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
    Tag: String = null
  ): OutboundMessage = {
    val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], Bcc = Bcc.asInstanceOf[js.Any], Cc = Cc.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], Metadata = Metadata.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], TrackLinks = TrackLinks.asInstanceOf[js.Any], TrackOpens = TrackOpens.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutboundMessage]
  }
}

