package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutboundMessageBase extends MessageBase {
  var ReceivedAt: String
  var Recipients: js.Array[String]
  var To: js.Array[ExpandedEmail]
  var TrackLinks: String
  var TrackOpens: Boolean
}

object OutboundMessageBase {
  @scala.inline
  def apply(
    Attachments: js.Array[PostmarkAttachment],
    Cc: String,
    From: String,
    MessageID: String,
    ReceivedAt: String,
    Recipients: js.Array[String],
    Status: String,
    Subject: String,
    Tag: String,
    To: js.Array[ExpandedEmail],
    TrackLinks: String,
    TrackOpens: Boolean
  ): OutboundMessageBase = {
    val __obj = js.Dynamic.literal(Attachments = Attachments, Cc = Cc, From = From, MessageID = MessageID, ReceivedAt = ReceivedAt, Recipients = Recipients, Status = Status, Subject = Subject, Tag = Tag, To = To, TrackLinks = TrackLinks, TrackOpens = TrackOpens)
  
    __obj.asInstanceOf[OutboundMessageBase]
  }
}

