package typings.parityPmr

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parity-pmr", "format")
  @js.native
  def format(message: PMRMessage): Buffer = js.native
  
  @JSImport("parity-pmr", "parse")
  @js.native
  def parse(buffer: Buffer): PMRMessage = js.native
  
  @js.native
  trait PMRMessage extends StObject {
    
    var canceledQuantity: js.UndefOr[Double] = js.native
    
    var incomingOrderNumber: js.UndefOr[Double] = js.native
    
    var instrument: js.UndefOr[String] = js.native
    
    var matchNumber: js.UndefOr[Double] = js.native
    
    var messageType: String = js.native
    
    var orderNumber: js.UndefOr[String] = js.native
    
    var price: js.UndefOr[Double] = js.native
    
    var quantity: js.UndefOr[Double] = js.native
    
    var restingOrderNumber: js.UndefOr[Double] = js.native
    
    var side: js.UndefOr[String] = js.native
    
    var timestamp: js.UndefOr[Double] = js.native
    
    var username: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
  object PMRMessage {
    
    @scala.inline
    def apply(messageType: String): PMRMessage = {
      val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any])
      __obj.asInstanceOf[PMRMessage]
    }
    
    @scala.inline
    implicit class PMRMessageMutableBuilder[Self <: PMRMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanceledQuantity(value: Double): Self = StObject.set(x, "canceledQuantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanceledQuantityUndefined: Self = StObject.set(x, "canceledQuantity", js.undefined)
      
      @scala.inline
      def setIncomingOrderNumber(value: Double): Self = StObject.set(x, "incomingOrderNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncomingOrderNumberUndefined: Self = StObject.set(x, "incomingOrderNumber", js.undefined)
      
      @scala.inline
      def setInstrument(value: String): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstrumentUndefined: Self = StObject.set(x, "instrument", js.undefined)
      
      @scala.inline
      def setMatchNumber(value: Double): Self = StObject.set(x, "matchNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchNumberUndefined: Self = StObject.set(x, "matchNumber", js.undefined)
      
      @scala.inline
      def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderNumber(value: String): Self = StObject.set(x, "orderNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderNumberUndefined: Self = StObject.set(x, "orderNumber", js.undefined)
      
      @scala.inline
      def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      @scala.inline
      def setRestingOrderNumber(value: Double): Self = StObject.set(x, "restingOrderNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestingOrderNumberUndefined: Self = StObject.set(x, "restingOrderNumber", js.undefined)
      
      @scala.inline
      def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
