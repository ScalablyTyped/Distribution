package typings.meteor.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Connection **/
trait Connection extends StObject {
  
  var clientAddress: String
  
  var close: js.Function
  
  var httpHeaders: js.Object
  
  var id: String
  
  var onClose: js.Function
}
object Connection {
  
  inline def apply(
    clientAddress: String,
    close: js.Function,
    httpHeaders: js.Object,
    id: String,
    onClose: js.Function
  ): Connection = {
    val __obj = js.Dynamic.literal(clientAddress = clientAddress.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], httpHeaders = httpHeaders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  
  extension [Self <: Connection](x: Self) {
    
    inline def setClientAddress(value: String): Self = StObject.set(x, "clientAddress", value.asInstanceOf[js.Any])
    
    inline def setClose(value: js.Function): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setHttpHeaders(value: js.Object): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
  }
}
