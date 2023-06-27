package typings.officeJs.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	* Used by Office to construct event handlers. Do not call in your code.
	*/
trait EventInfo[T] extends StObject {
  
  def eventArgsTransformFunc(args: Any): js.Promise[T]
  
  def registerFunc(callback: js.Function1[/* args */ Any, Unit]): js.Promise[Any]
  
  def unregisterFunc(callback: js.Function1[/* args */ Any, Unit]): js.Promise[Any]
}
object EventInfo {
  
  inline def apply[T](
    eventArgsTransformFunc: Any => js.Promise[T],
    registerFunc: js.Function1[/* args */ Any, Unit] => js.Promise[Any],
    unregisterFunc: js.Function1[/* args */ Any, Unit] => js.Promise[Any]
  ): EventInfo[T] = {
    val __obj = js.Dynamic.literal(eventArgsTransformFunc = js.Any.fromFunction1(eventArgsTransformFunc), registerFunc = js.Any.fromFunction1(registerFunc), unregisterFunc = js.Any.fromFunction1(unregisterFunc))
    __obj.asInstanceOf[EventInfo[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventInfo[?], T] (val x: Self & EventInfo[T]) extends AnyVal {
    
    inline def setEventArgsTransformFunc(value: Any => js.Promise[T]): Self = StObject.set(x, "eventArgsTransformFunc", js.Any.fromFunction1(value))
    
    inline def setRegisterFunc(value: js.Function1[/* args */ Any, Unit] => js.Promise[Any]): Self = StObject.set(x, "registerFunc", js.Any.fromFunction1(value))
    
    inline def setUnregisterFunc(value: js.Function1[/* args */ Any, Unit] => js.Promise[Any]): Self = StObject.set(x, "unregisterFunc", js.Any.fromFunction1(value))
  }
}
