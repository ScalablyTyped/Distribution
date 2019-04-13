package typings
package postmarkLib.postmarkMod

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
    val __obj = js.Dynamic.literal(Attachments = Attachments, Cc = Cc, From = From, MessageID = MessageID, ReceivedAt = ReceivedAt, Recipients = Recipients, Status = Status, Subject = Subject, Tag = Tag, To = To, TrackLinks = TrackLinks, TrackOpens = TrackOpens)
  
    __obj.asInstanceOf[OutboundMessageBase]
  }
}

