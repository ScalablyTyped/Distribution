package typings.officeJsPreview.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventHandlerResult[T] extends StObject {
  
  /** The request context associated with the object */
  var context: ClientRequestContext
  
  def remove(): Unit
}
object EventHandlerResult {
  
  inline def apply[T](context: ClientRequestContext, remove: () => Unit): EventHandlerResult[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[EventHandlerResult[T]]
  }
  
  extension [Self <: EventHandlerResult[?], T](x: Self & EventHandlerResult[T]) {
    
    inline def setContext(value: ClientRequestContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
