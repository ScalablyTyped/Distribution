package typings.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indicates that the type that implements the interface provides disposing notifications.
  * Implement this interface if the class must notify other objects when it is releasing resources. The base component class already implements this interface. Therefore, typically this interface is already available.
  */
@js.native
trait INotifyDisposing extends js.Object {
  
  //#region Events
  /**
    * Occurs when an object's resources are released.
    * @param handler
    *       The name of the event handler for the disposing event.
    */
  def add_disposing(handler: js.Function): Unit = js.native
  
  /**
    * Occurs when an object's resources are released.
    * @param handler
    *       The name of the event handler for the disposing event.
    */
  def remove_disposing(handler: js.Function): Unit = js.native
}
object INotifyDisposing {
  
  @scala.inline
  def apply(add_disposing: js.Function => Unit, remove_disposing: js.Function => Unit): INotifyDisposing = {
    val __obj = js.Dynamic.literal(add_disposing = js.Any.fromFunction1(add_disposing), remove_disposing = js.Any.fromFunction1(remove_disposing))
    __obj.asInstanceOf[INotifyDisposing]
  }
  
  @scala.inline
  implicit class INotifyDisposingOps[Self <: INotifyDisposing] (val x: Self) extends AnyVal {
    
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
    def setAdd_disposing(value: js.Function => Unit): Self = this.set("add_disposing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove_disposing(value: js.Function => Unit): Self = this.set("remove_disposing", js.Any.fromFunction1(value))
  }
}
