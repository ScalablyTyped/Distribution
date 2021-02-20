package typings.postmark

import typings.postmark.messageSupportingTypesMod.LinkClickLocation
import typings.postmark.outboundMessageOpenMod.ClientDetails
import typings.postmark.outboundMessageOpenMod.GeoLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outboundMessageClickMod {
  
  @js.native
  trait ClickEvent extends StObject {
    
    var ClickLocation: LinkClickLocation = js.native
    
    var Client: ClientDetails = js.native
    
    var Geo: GeoLocation = js.native
    
    var MessageID: String = js.native
    
    var MessageStream: String = js.native
    
    var OS: ClientDetails = js.native
    
    var OriginalLink: String = js.native
    
    var Platform: String = js.native
    
    var ReceivedAt: String = js.native
    
    var Recipient: String = js.native
    
    var RecordType: String = js.native
    
    var Tag: String = js.native
    
    var UserAgent: String = js.native
  }
  object ClickEvent {
    
    @scala.inline
    def apply(
      ClickLocation: LinkClickLocation,
      Client: ClientDetails,
      Geo: GeoLocation,
      MessageID: String,
      MessageStream: String,
      OS: ClientDetails,
      OriginalLink: String,
      Platform: String,
      ReceivedAt: String,
      Recipient: String,
      RecordType: String,
      Tag: String,
      UserAgent: String
    ): ClickEvent = {
      val __obj = js.Dynamic.literal(ClickLocation = ClickLocation.asInstanceOf[js.Any], Client = Client.asInstanceOf[js.Any], Geo = Geo.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], OS = OS.asInstanceOf[js.Any], OriginalLink = OriginalLink.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], RecordType = RecordType.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], UserAgent = UserAgent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClickEvent]
    }
    
    @scala.inline
    implicit class ClickEventMutableBuilder[Self <: ClickEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickLocation(value: LinkClickLocation): Self = StObject.set(x, "ClickLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient(value: ClientDetails): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeo(value: GeoLocation): Self = StObject.set(x, "Geo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageID(value: String): Self = StObject.set(x, "MessageID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageStream(value: String): Self = StObject.set(x, "MessageStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOS(value: ClientDetails): Self = StObject.set(x, "OS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalLink(value: String): Self = StObject.set(x, "OriginalLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceivedAt(value: String): Self = StObject.set(x, "ReceivedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipient(value: String): Self = StObject.set(x, "Recipient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordType(value: String): Self = StObject.set(x, "RecordType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "UserAgent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OutboundMessageClicks extends StObject {
    
    var Clicks: js.Array[ClickEvent] = js.native
    
    var TotalCount: Double = js.native
  }
  object OutboundMessageClicks {
    
    @scala.inline
    def apply(Clicks: js.Array[ClickEvent], TotalCount: Double): OutboundMessageClicks = {
      val __obj = js.Dynamic.literal(Clicks = Clicks.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutboundMessageClicks]
    }
    
    @scala.inline
    implicit class OutboundMessageClicksMutableBuilder[Self <: OutboundMessageClicks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClicks(value: js.Array[ClickEvent]): Self = StObject.set(x, "Clicks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClicksVarargs(value: ClickEvent*): Self = StObject.set(x, "Clicks", js.Array(value :_*))
      
      @scala.inline
      def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
}
