package typings.parityPmr

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parity-pmr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(message: PMRMessage): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(message.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def parse(buffer: Buffer): PMRMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buffer.asInstanceOf[js.Any]).asInstanceOf[PMRMessage]
  
  trait PMRMessage extends StObject {
    
    var canceledQuantity: js.UndefOr[Double] = js.undefined
    
    var incomingOrderNumber: js.UndefOr[Double] = js.undefined
    
    var instrument: js.UndefOr[String] = js.undefined
    
    var matchNumber: js.UndefOr[Double] = js.undefined
    
    var messageType: String
    
    var orderNumber: js.UndefOr[String] = js.undefined
    
    var price: js.UndefOr[Double] = js.undefined
    
    var quantity: js.UndefOr[Double] = js.undefined
    
    var restingOrderNumber: js.UndefOr[Double] = js.undefined
    
    var side: js.UndefOr[String] = js.undefined
    
    var timestamp: js.UndefOr[Double] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object PMRMessage {
    
    inline def apply(messageType: String): PMRMessage = {
      val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any])
      __obj.asInstanceOf[PMRMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PMRMessage] (val x: Self) extends AnyVal {
      
      inline def setCanceledQuantity(value: Double): Self = StObject.set(x, "canceledQuantity", value.asInstanceOf[js.Any])
      
      inline def setCanceledQuantityUndefined: Self = StObject.set(x, "canceledQuantity", js.undefined)
      
      inline def setIncomingOrderNumber(value: Double): Self = StObject.set(x, "incomingOrderNumber", value.asInstanceOf[js.Any])
      
      inline def setIncomingOrderNumberUndefined: Self = StObject.set(x, "incomingOrderNumber", js.undefined)
      
      inline def setInstrument(value: String): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
      
      inline def setInstrumentUndefined: Self = StObject.set(x, "instrument", js.undefined)
      
      inline def setMatchNumber(value: Double): Self = StObject.set(x, "matchNumber", value.asInstanceOf[js.Any])
      
      inline def setMatchNumberUndefined: Self = StObject.set(x, "matchNumber", js.undefined)
      
      inline def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      inline def setOrderNumber(value: String): Self = StObject.set(x, "orderNumber", value.asInstanceOf[js.Any])
      
      inline def setOrderNumberUndefined: Self = StObject.set(x, "orderNumber", js.undefined)
      
      inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      inline def setRestingOrderNumber(value: Double): Self = StObject.set(x, "restingOrderNumber", value.asInstanceOf[js.Any])
      
      inline def setRestingOrderNumberUndefined: Self = StObject.set(x, "restingOrderNumber", js.undefined)
      
      inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
