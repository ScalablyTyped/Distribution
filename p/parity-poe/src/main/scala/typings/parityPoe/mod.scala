package typings.parityPoe

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parity-poe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def formatInbound(message: POEMessage): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("formatInbound")(message.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def formatOutbound(message: POEMessage): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("formatOutbound")(message.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def parseInbound(buffer: Buffer): POEMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInbound")(buffer.asInstanceOf[js.Any]).asInstanceOf[POEMessage]
  
  @scala.inline
  def parseOutbound(buffer: Buffer): POEMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOutbound")(buffer.asInstanceOf[js.Any]).asInstanceOf[POEMessage]
  
  trait POEMessage extends StObject {
    
    var canceledQuantity: js.UndefOr[Double] = js.undefined
    
    var instrument: js.UndefOr[String] = js.undefined
    
    var liquidityFlag: js.UndefOr[String] = js.undefined
    
    var matchNumber: js.UndefOr[Double] = js.undefined
    
    var messageType: String
    
    var orderId: js.UndefOr[String] = js.undefined
    
    var price: js.UndefOr[Double] = js.undefined
    
    var quantity: js.UndefOr[Double] = js.undefined
    
    var reason: js.UndefOr[String] = js.undefined
    
    var side: js.UndefOr[String] = js.undefined
    
    var timestamp: js.UndefOr[Double] = js.undefined
  }
  object POEMessage {
    
    @scala.inline
    def apply(messageType: String): POEMessage = {
      val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any])
      __obj.asInstanceOf[POEMessage]
    }
    
    @scala.inline
    implicit class POEMessageMutableBuilder[Self <: POEMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanceledQuantity(value: Double): Self = StObject.set(x, "canceledQuantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanceledQuantityUndefined: Self = StObject.set(x, "canceledQuantity", js.undefined)
      
      @scala.inline
      def setInstrument(value: String): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstrumentUndefined: Self = StObject.set(x, "instrument", js.undefined)
      
      @scala.inline
      def setLiquidityFlag(value: String): Self = StObject.set(x, "liquidityFlag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiquidityFlagUndefined: Self = StObject.set(x, "liquidityFlag", js.undefined)
      
      @scala.inline
      def setMatchNumber(value: Double): Self = StObject.set(x, "matchNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchNumberUndefined: Self = StObject.set(x, "matchNumber", js.undefined)
      
      @scala.inline
      def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
      
      @scala.inline
      def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      @scala.inline
      def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
}
