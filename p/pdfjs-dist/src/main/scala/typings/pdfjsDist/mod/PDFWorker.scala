package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFWorker extends StObject {
  
  def destroy(): Unit = js.native
  
  val messageHandler: js.Any | Null = js.native
  
  val port: js.Any | Null = js.native
  
  val promise: js.Promise[_] = js.native
}
object PDFWorker {
  
  @scala.inline
  def apply(destroy: () => Unit, promise: js.Promise[_]): PDFWorker = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFWorker]
  }
  
  @scala.inline
  implicit class PDFWorkerMutableBuilder[Self <: PDFWorker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessageHandler(value: js.Any): Self = StObject.set(x, "messageHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageHandlerNull: Self = StObject.set(x, "messageHandler", null)
    
    @scala.inline
    def setPort(value: js.Any): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortNull: Self = StObject.set(x, "port", null)
    
    @scala.inline
    def setPromise(value: js.Promise[_]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
  }
}
