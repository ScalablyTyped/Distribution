package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutboundMessage extends OutboundMessageBase {
  var Body: String
  var HtmlBody: String
  var MessageEvents: js.Array[typings.postmark.postmarkMod.MessageEvents]
  var TextBody: String
}

object OutboundMessage {
  @scala.inline
  def apply(
    Attachments: js.Array[PostmarkAttachment],
    Body: String,
    Cc: String,
    From: String,
    HtmlBody: String,
    MessageEvents: js.Array[MessageEvents],
    MessageID: String,
    ReceivedAt: String,
    Recipients: js.Array[String],
    Status: String,
    Subject: String,
    Tag: String,
    TextBody: String,
    To: js.Array[ExpandedEmail],
    TrackLinks: String,
    TrackOpens: Boolean
  ): OutboundMessage = {
    val __obj = js.Dynamic.literal(Attachments = Attachments, Body = Body, Cc = Cc, From = From, HtmlBody = HtmlBody, MessageEvents = MessageEvents, MessageID = MessageID, ReceivedAt = ReceivedAt, Recipients = Recipients, Status = Status, Subject = Subject, Tag = Tag, TextBody = TextBody, To = To, TrackLinks = TrackLinks, TrackOpens = TrackOpens)
  
    __obj.asInstanceOf[OutboundMessage]
  }
}

