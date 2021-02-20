package typings.meteor.meteorMod.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Connection **/
@js.native
trait Connection extends StObject {
  
  var clientAddress: String = js.native
  
  def close(): Unit = js.native
  
  var httpHeaders: js.Object = js.native
  
  var id: String = js.native
  
  def onClose(callback: js.Function0[Unit]): Unit = js.native
}
object Connection {
  
  @scala.inline
  def apply(
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
  implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientAddress(value: String): Self = StObject.set(x, "clientAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHttpHeaders(value: js.Object): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClose(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
  }
}
