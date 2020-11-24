package typings.officeJs.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventHandlers[T] extends js.Object {
  
  /**
    * Adds a function to be called when the event is triggered.
    * @param handler A promise-based function that takes in any relevant event arguments.
    */
  def add(handler: js.Function1[/* args */ T, js.Promise[_]]): EventHandlerResult[T] = js.native
  
  /**
    * Removes the specified function from the event handler list so that it will not be called on subsequent events. 
    * 
    * **Note**: The same {@link OfficeExtension.ClientRequestContext | RequestContext} object that the handler was added in must be used when removing the handler. 
    * More information can be found in {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-events#remove-an-event-handler | Remove an event handler}. 
    * 
    * @param handler A reference to a function previously provided to the `add` method as an event handler. 
    */
  def remove(handler: js.Function1[/* args */ T, js.Promise[_]]): Unit = js.native
}
object EventHandlers {
  
  @scala.inline
  def apply[T](
    add: js.Function1[/* args */ T, js.Promise[_]] => EventHandlerResult[T],
    remove: js.Function1[/* args */ T, js.Promise[_]] => Unit
  ): EventHandlers[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[EventHandlers[T]]
  }
  
  @scala.inline
  implicit class EventHandlersOps[Self <: EventHandlers[_], T] (val x: Self with EventHandlers[T]) extends AnyVal {
    
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
    def setAdd(value: js.Function1[/* args */ T, js.Promise[_]] => EventHandlerResult[T]): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: js.Function1[/* args */ T, js.Promise[_]] => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
}
