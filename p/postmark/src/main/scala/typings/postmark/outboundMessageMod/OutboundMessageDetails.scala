package typings.postmark.outboundMessageMod

import typings.postmark.messageSupportingTypesMod.Attachment
import typings.postmark.messageSupportingTypesMod.LinkTrackingOptions
import typings.postmark.outboundMessageEventsMod.MessageEvent
import typings.postmark.supportingTypesMod.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutboundMessageDetails extends OutboundMessage {
  
  var Body: String = js.native
  
  var HtmlBody: js.UndefOr[String] = js.native
  
  var MessageEvents: js.Array[MessageEvent] = js.native
  
  var TextBody: js.UndefOr[String] = js.native
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
    TrackOpens: Boolean
  ): OutboundMessageDetails = {
    val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], Bcc = Bcc.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], Cc = Cc.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], MessageEvents = MessageEvents.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], Metadata = Metadata.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], TrackLinks = TrackLinks.asInstanceOf[js.Any], TrackOpens = TrackOpens.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutboundMessageDetails]
  }
  
  @scala.inline
  implicit class OutboundMessageDetailsOps[Self <: OutboundMessageDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: String): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageEventsVarargs(value: MessageEvent*): Self = this.set("MessageEvents", js.Array(value :_*))
    
    @scala.inline
    def setMessageEvents(value: js.Array[MessageEvent]): Self = this.set("MessageEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlBody(value: String): Self = this.set("HtmlBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlBody: Self = this.set("HtmlBody", js.undefined)
    
    @scala.inline
    def setTextBody(value: String): Self = this.set("TextBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextBody: Self = this.set("TextBody", js.undefined)
  }
}
