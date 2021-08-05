package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFWorker extends StObject {
  
  def destroy(): Unit
  
  val messageHandler: js.Any | Null
  
  val port: js.Any | Null
  
  val promise: js.Promise[js.Any]
}
object PDFWorker {
  
  inline def apply(destroy: () => Unit, promise: js.Promise[js.Any]): PDFWorker = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), promise = promise.asInstanceOf[js.Any], messageHandler = null, port = null)
    __obj.asInstanceOf[PDFWorker]
  }
  
  extension [Self <: PDFWorker](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setMessageHandler(value: js.Any): Self = StObject.set(x, "messageHandler", value.asInstanceOf[js.Any])
    
    inline def setMessageHandlerNull: Self = StObject.set(x, "messageHandler", null)
    
    inline def setPort(value: js.Any): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPromise(value: js.Promise[js.Any]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
  }
}
