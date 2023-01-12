package typings.meteor.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Connection **/
trait Connection extends StObject {
  
  var clientAddress: String
  
  def close(): Unit
  
  var httpHeaders: js.Object
  
  var id: String
  
  def onClose(callback: js.Function0[Unit]): Unit
}
object Connection {
  
  inline def apply(
    clientAddress: String,
    close: () => Unit,
    httpHeaders: js.Object,
    id: String,
    onClose: js.Function0[Unit] => Unit
  ): Connection = {
    val __obj = js.Dynamic.literal(clientAddress = clientAddress.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), httpHeaders = httpHeaders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClose = js.Any.fromFunction1(onClose))
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
    
    inline def setClientAddress(value: String): Self = StObject.set(x, "clientAddress", value.asInstanceOf[js.Any])
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setHttpHeaders(value: js.Object): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOnClose(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
  }
}
