package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutboundMessage extends OutboundMessageBase {
  var Body: java.lang.String
  var HtmlBody: java.lang.String
  var MessageEvents: js.Array[MessageEvents]
  var TextBody: java.lang.String
}

object OutboundMessage {
  @scala.inline
  def apply(
    Attachments: js.Array[PostmarkAttachment],
    Body: java.lang.String,
    Cc: java.lang.String,
    From: java.lang.String,
    HtmlBody: java.lang.String,
    MessageEvents: js.Array[MessageEvents],
    MessageID: java.lang.String,
    ReceivedAt: java.lang.String,
    Recipients: js.Array[java.lang.String],
    Status: java.lang.String,
    Subject: java.lang.String,
    Tag: java.lang.String,
    TextBody: java.lang.String,
    To: js.Array[ExpandedEmail],
    TrackLinks: java.lang.String,
    TrackOpens: scala.Boolean
  ): OutboundMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Attachments")(Attachments)
    __obj.updateDynamic("Body")(Body)
    __obj.updateDynamic("Cc")(Cc)
    __obj.updateDynamic("From")(From)
    __obj.updateDynamic("HtmlBody")(HtmlBody)
    __obj.updateDynamic("MessageEvents")(MessageEvents)
    __obj.updateDynamic("MessageID")(MessageID)
    __obj.updateDynamic("ReceivedAt")(ReceivedAt)
    __obj.updateDynamic("Recipients")(Recipients)
    __obj.updateDynamic("Status")(Status)
    __obj.updateDynamic("Subject")(Subject)
    __obj.updateDynamic("Tag")(Tag)
    __obj.updateDynamic("TextBody")(TextBody)
    __obj.updateDynamic("To")(To)
    __obj.updateDynamic("TrackLinks")(TrackLinks)
    __obj.updateDynamic("TrackOpens")(TrackOpens)
    __obj.asInstanceOf[OutboundMessage]
  }
}

