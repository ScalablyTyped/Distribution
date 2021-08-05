package typings.postmark

import typings.postmark.anon.BounceID
import typings.postmark.anon.ClickLocation
import typings.postmark.anon.DeliveryMessage
import typings.postmark.anon.Summary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outboundMessageEventsMod {
  
  trait BounceEvent
    extends StObject
       with MessageEvent {
    
    @JSName("Details")
    var Details_BounceEvent: BounceID
  }
  object BounceEvent {
    
    inline def apply(Details: BounceID, ReceivedAt: String, Recipient: String, Type: String): BounceEvent = {
      val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[BounceEvent]
    }
    
    extension [Self <: BounceEvent](x: Self) {
      
      inline def setDetails(value: BounceID): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClickEvent
    extends StObject
       with MessageEvent {
    
    @JSName("Details")
    var Details_ClickEvent: ClickLocation
  }
  object ClickEvent {
    
    inline def apply(Details: ClickLocation, ReceivedAt: String, Recipient: String, Type: String): ClickEvent = {
      val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClickEvent]
    }
    
    extension [Self <: ClickEvent](x: Self) {
      
      inline def setDetails(value: ClickLocation): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeliveryEvent
    extends StObject
       with MessageEvent {
    
    @JSName("Details")
    var Details_DeliveryEvent: DeliveryMessage
  }
  object DeliveryEvent {
    
    inline def apply(Details: DeliveryMessage, ReceivedAt: String, Recipient: String, Type: String): DeliveryEvent = {
      val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeliveryEvent]
    }
    
    extension [Self <: DeliveryEvent](x: Self) {
      
      inline def setDetails(value: DeliveryMessage): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageEvent extends StObject {
    
    var Details: js.Object
    
    var ReceivedAt: String
    
    var Recipient: String
    
    var Type: String
  }
  object MessageEvent {
    
    inline def apply(Details: js.Object, ReceivedAt: String, Recipient: String, Type: String): MessageEvent = {
      val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageEvent]
    }
    
    extension [Self <: MessageEvent](x: Self) {
      
      inline def setDetails(value: js.Object): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
      
      inline def setReceivedAt(value: String): Self = StObject.set(x, "ReceivedAt", value.asInstanceOf[js.Any])
      
      inline def setRecipient(value: String): Self = StObject.set(x, "Recipient", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenEvent
    extends StObject
       with MessageEvent {
    
    @JSName("Details")
    var Details_OpenEvent: Summary
  }
  object OpenEvent {
    
    inline def apply(Details: Summary, ReceivedAt: String, Recipient: String, Type: String): OpenEvent = {
      val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenEvent]
    }
    
    extension [Self <: OpenEvent](x: Self) {
      
      inline def setDetails(value: Summary): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransientDelayEvent
    extends StObject
       with MessageEvent {
    
    @JSName("Details")
    var Details_TransientDelayEvent: DeliveryMessage
  }
  object TransientDelayEvent {
    
    inline def apply(Details: DeliveryMessage, ReceivedAt: String, Recipient: String, Type: String): TransientDelayEvent = {
      val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransientDelayEvent]
    }
    
    extension [Self <: TransientDelayEvent](x: Self) {
      
      inline def setDetails(value: DeliveryMessage): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    }
  }
}
