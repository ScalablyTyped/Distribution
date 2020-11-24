package typings.preloadjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractRequest extends js.Object {
  
  def cancel(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def load(): Unit = js.native
}
object AbstractRequest {
  
  @scala.inline
  def apply(cancel: () => Unit, destroy: () => Unit, load: () => Unit): AbstractRequest = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), destroy = js.Any.fromFunction0(destroy), load = js.Any.fromFunction0(load))
    __obj.asInstanceOf[AbstractRequest]
  }
  
  @scala.inline
  implicit class AbstractRequestOps[Self <: AbstractRequest] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoad(value: () => Unit): Self = this.set("load", js.Any.fromFunction0(value))
  }
}
