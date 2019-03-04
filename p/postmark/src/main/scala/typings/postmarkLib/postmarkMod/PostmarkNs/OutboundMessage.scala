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
    val __obj = js.Dynamic.literal(Attachments = Attachments, Body = Body, Cc = Cc, From = From, HtmlBody = HtmlBody, MessageEvents = MessageEvents, MessageID = MessageID, ReceivedAt = ReceivedAt, Recipients = Recipients, Status = Status, Subject = Subject, Tag = Tag, TextBody = TextBody, To = To, TrackLinks = TrackLinks, TrackOpens = TrackOpens)
  
    __obj.asInstanceOf[OutboundMessage]
  }
}

