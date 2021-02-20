package typings.officeJs.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventHandlers[T] extends StObject {
  
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
  implicit class EventHandlersMutableBuilder[Self <: EventHandlers[_], T] (val x: Self with EventHandlers[T]) extends AnyVal {
    
    @scala.inline
    def setAdd(value: js.Function1[/* args */ T, js.Promise[_]] => EventHandlerResult[T]): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: js.Function1[/* args */ T, js.Promise[_]] => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
