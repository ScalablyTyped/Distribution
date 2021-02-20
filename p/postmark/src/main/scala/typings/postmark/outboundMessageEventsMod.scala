package typings.postmark

import typings.postmark.anon.BounceID
import typings.postmark.anon.ClickLocation
import typings.postmark.anon.DeliveryMessage
import typings.postmark.anon.Summary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outboundMessageEventsMod {
  
  @js.native
  trait BounceEvent extends MessageEvent {
    
    @JSName("Details")
    var Details_BounceEvent: BounceID = js.native
  }
  object BounceEvent {
    
    @scala.inline
    def apply(Details: BounceID, ReceivedAt: String, Recipient: String, Type: String): BounceEvent = {
      val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[BounceEvent]
    }
    
    @scala.inline
    implicit class BounceEventMutableBuilder[Self <: BounceEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: BounceID): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClickEvent extends MessageEvent {
    
    @JSName("Details")
    var Details_ClickEvent: ClickLocation = js.native
  }
  object ClickEvent {
    
    @scala.inline
    def apply(Details: ClickLocation, ReceivedAt: String, Recipient: String, Type: String): ClickEvent = {
      val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClickEvent]
    }
    
    @scala.inline
    implicit class ClickEventMutableBuilder[Self <: ClickEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: ClickLocation): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeliveryEvent extends MessageEvent {
    
    @JSName("Details")
    var Details_DeliveryEvent: DeliveryMessage = js.native
  }
  object DeliveryEvent {
    
    @scala.inline
    def apply(Details: DeliveryMessage, ReceivedAt: String, Recipient: String, Type: String): DeliveryEvent = {
      val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeliveryEvent]
    }
    
    @scala.inline
    implicit class DeliveryEventMutableBuilder[Self <: DeliveryEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: DeliveryMessage): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MessageEvent extends StObject {
    
    var Details: js.Object = js.native
    
    var ReceivedAt: String = js.native
    
    var Recipient: String = js.native
    
    var Type: String = js.native
  }
  object MessageEvent {
    
    @scala.inline
    def apply(Details: js.Object, ReceivedAt: String, Recipient: String, Type: String): MessageEvent = {
      val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageEvent]
    }
    
    @scala.inline
    implicit class MessageEventMutableBuilder[Self <: MessageEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: js.Object): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceivedAt(value: String): Self = StObject.set(x, "ReceivedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipient(value: String): Self = StObject.set(x, "Recipient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OpenEvent extends MessageEvent {
    
    @JSName("Details")
    var Details_OpenEvent: Summary = js.native
  }
  object OpenEvent {
    
    @scala.inline
    def apply(Details: Summary, ReceivedAt: String, Recipient: String, Type: String): OpenEvent = {
      val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenEvent]
    }
    
    @scala.inline
    implicit class OpenEventMutableBuilder[Self <: OpenEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: Summary): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransientDelayEvent extends MessageEvent {
    
    @JSName("Details")
    var Details_TransientDelayEvent: DeliveryMessage = js.native
  }
  object TransientDelayEvent {
    
    @scala.inline
    def apply(Details: DeliveryMessage, ReceivedAt: String, Recipient: String, Type: String): TransientDelayEvent = {
      val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransientDelayEvent]
    }
    
    @scala.inline
    implicit class TransientDelayEventMutableBuilder[Self <: TransientDelayEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: DeliveryMessage): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    }
  }
}
