package typings.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliveryMessage extends StObject {
  
  var DeliveryMessage: String = js.native
  
  var DestinationIP: String = js.native
  
  var DestinationServer: String = js.native
}
object DeliveryMessage {
  
  @scala.inline
  def apply(DeliveryMessage: String, DestinationIP: String, DestinationServer: String): DeliveryMessage = {
    val __obj = js.Dynamic.literal(DeliveryMessage = DeliveryMessage.asInstanceOf[js.Any], DestinationIP = DestinationIP.asInstanceOf[js.Any], DestinationServer = DestinationServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryMessage]
  }
  
  @scala.inline
  implicit class DeliveryMessageMutableBuilder[Self <: DeliveryMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryMessage(value: String): Self = StObject.set(x, "DeliveryMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationIP(value: String): Self = StObject.set(x, "DestinationIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationServer(value: String): Self = StObject.set(x, "DestinationServer", value.asInstanceOf[js.Any])
  }
}
