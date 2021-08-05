package typings.postmark

import typings.postmark.messageSupportingTypesMod.LinkClickLocation
import typings.postmark.outboundMessageOpenMod.ClientDetails
import typings.postmark.outboundMessageOpenMod.GeoLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outboundMessageClickMod {
  
  trait ClickEvent extends StObject {
    
    var ClickLocation: LinkClickLocation
    
    var Client: ClientDetails
    
    var Geo: GeoLocation
    
    var MessageID: String
    
    var MessageStream: String
    
    var OS: ClientDetails
    
    var OriginalLink: String
    
    var Platform: String
    
    var ReceivedAt: String
    
    var Recipient: String
    
    var RecordType: String
    
    var Tag: String
    
    var UserAgent: String
  }
  object ClickEvent {
    
    inline def apply(
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
    
    extension [Self <: ClickEvent](x: Self) {
      
      inline def setClickLocation(value: LinkClickLocation): Self = StObject.set(x, "ClickLocation", value.asInstanceOf[js.Any])
      
      inline def setClient(value: ClientDetails): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
      
      inline def setGeo(value: GeoLocation): Self = StObject.set(x, "Geo", value.asInstanceOf[js.Any])
      
      inline def setMessageID(value: String): Self = StObject.set(x, "MessageID", value.asInstanceOf[js.Any])
      
      inline def setMessageStream(value: String): Self = StObject.set(x, "MessageStream", value.asInstanceOf[js.Any])
      
      inline def setOS(value: ClientDetails): Self = StObject.set(x, "OS", value.asInstanceOf[js.Any])
      
      inline def setOriginalLink(value: String): Self = StObject.set(x, "OriginalLink", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
      
      inline def setReceivedAt(value: String): Self = StObject.set(x, "ReceivedAt", value.asInstanceOf[js.Any])
      
      inline def setRecipient(value: String): Self = StObject.set(x, "Recipient", value.asInstanceOf[js.Any])
      
      inline def setRecordType(value: String): Self = StObject.set(x, "RecordType", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "UserAgent", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutboundMessageClicks extends StObject {
    
    var Clicks: js.Array[ClickEvent]
    
    var TotalCount: Double
  }
  object OutboundMessageClicks {
    
    inline def apply(Clicks: js.Array[ClickEvent], TotalCount: Double): OutboundMessageClicks = {
      val __obj = js.Dynamic.literal(Clicks = Clicks.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutboundMessageClicks]
    }
    
    extension [Self <: OutboundMessageClicks](x: Self) {
      
      inline def setClicks(value: js.Array[ClickEvent]): Self = StObject.set(x, "Clicks", value.asInstanceOf[js.Any])
      
      inline def setClicksVarargs(value: ClickEvent*): Self = StObject.set(x, "Clicks", js.Array(value :_*))
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
}
