package typings.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFWorker extends js.Object {
  
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
  implicit class PDFWorkerOps[Self <: PDFWorker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPromise(value: js.Promise[_]): Self = this.set("promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageHandler(value: js.Any): Self = this.set("messageHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageHandlerNull: Self = this.set("messageHandler", null)
    
    @scala.inline
    def setPort(value: js.Any): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortNull: Self = this.set("port", null)
  }
}
