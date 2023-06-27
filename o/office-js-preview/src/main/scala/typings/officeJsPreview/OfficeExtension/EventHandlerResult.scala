package typings.officeJsPreview.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables the removal of an event handler. Returned by the `EventHandlers.add` method.
	*
	* **Note**: The same {@link OfficeExtension.ClientRequestContext | RequestContext} object that the handler was added in must be used when removing the handler.
  * More information can be found in {@link https://learn.microsoft.com/office/dev/add-ins/excel/excel-add-ins-events#remove-an-event-handler | Remove an event handler}.
  */
trait EventHandlerResult[T] extends StObject {
  
  /** The request context associated with the object */
  var context: ClientRequestContext
  
  /**
  		* Removes the handler from the event.
  		*/
  def remove(): Unit
}
object EventHandlerResult {
  
  inline def apply[T](context: ClientRequestContext, remove: () => Unit): EventHandlerResult[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[EventHandlerResult[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventHandlerResult[?], T] (val x: Self & EventHandlerResult[T]) extends AnyVal {
    
    inline def setContext(value: ClientRequestContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
