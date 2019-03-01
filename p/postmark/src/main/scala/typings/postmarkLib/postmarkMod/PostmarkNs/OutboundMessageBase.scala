package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutboundMessageBase extends MessageBase {
  var ReceivedAt: java.lang.String
  var Recipients: js.Array[java.lang.String]
  var To: js.Array[ExpandedEmail]
  var TrackLinks: java.lang.String
  var TrackOpens: scala.Boolean
}

object OutboundMessageBase {
  @scala.inline
  def apply(
    Attachments: js.Array[PostmarkAttachment],
    Cc: java.lang.String,
    From: java.lang.String,
    MessageID: java.lang.String,
    ReceivedAt: java.lang.String,
    Recipients: js.Array[java.lang.String],
    Status: java.lang.String,
    Subject: java.lang.String,
    Tag: java.lang.String,
    To: js.Array[ExpandedEmail],
    TrackLinks: java.lang.String,
    TrackOpens: scala.Boolean
  ): OutboundMessageBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Attachments")(Attachments)
    __obj.updateDynamic("Cc")(Cc)
    __obj.updateDynamic("From")(From)
    __obj.updateDynamic("MessageID")(MessageID)
    __obj.updateDynamic("ReceivedAt")(ReceivedAt)
    __obj.updateDynamic("Recipients")(Recipients)
    __obj.updateDynamic("Status")(Status)
    __obj.updateDynamic("Subject")(Subject)
    __obj.updateDynamic("Tag")(Tag)
    __obj.updateDynamic("To")(To)
    __obj.updateDynamic("TrackLinks")(TrackLinks)
    __obj.updateDynamic("TrackOpens")(TrackOpens)
    __obj.asInstanceOf[OutboundMessageBase]
  }
}

