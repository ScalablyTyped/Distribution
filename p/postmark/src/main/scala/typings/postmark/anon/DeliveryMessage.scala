package typings.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryMessage extends StObject {
  
  var DeliveryMessage: String
  
  var DestinationIP: String
  
  var DestinationServer: String
}
object DeliveryMessage {
  
  inline def apply(DeliveryMessage: String, DestinationIP: String, DestinationServer: String): DeliveryMessage = {
    val __obj = js.Dynamic.literal(DeliveryMessage = DeliveryMessage.asInstanceOf[js.Any], DestinationIP = DestinationIP.asInstanceOf[js.Any], DestinationServer = DestinationServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeliveryMessage] (val x: Self) extends AnyVal {
    
    inline def setDeliveryMessage(value: String): Self = StObject.set(x, "DeliveryMessage", value.asInstanceOf[js.Any])
    
    inline def setDestinationIP(value: String): Self = StObject.set(x, "DestinationIP", value.asInstanceOf[js.Any])
    
    inline def setDestinationServer(value: String): Self = StObject.set(x, "DestinationServer", value.asInstanceOf[js.Any])
  }
}
