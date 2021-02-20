package typings.officeJsPreview.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventInfo[T] extends StObject {
  
  def eventArgsTransformFunc(args: js.Any): js.Promise[T] = js.native
  
  def registerFunc(callback: js.Function1[/* args */ js.Any, Unit]): js.Promise[_] = js.native
  
  def unregisterFunc(callback: js.Function1[/* args */ js.Any, Unit]): js.Promise[_] = js.native
}
object EventInfo {
  
  @scala.inline
  def apply[T](
    eventArgsTransformFunc: js.Any => js.Promise[T],
    registerFunc: js.Function1[/* args */ js.Any, Unit] => js.Promise[_],
    unregisterFunc: js.Function1[/* args */ js.Any, Unit] => js.Promise[_]
  ): EventInfo[T] = {
    val __obj = js.Dynamic.literal(eventArgsTransformFunc = js.Any.fromFunction1(eventArgsTransformFunc), registerFunc = js.Any.fromFunction1(registerFunc), unregisterFunc = js.Any.fromFunction1(unregisterFunc))
    __obj.asInstanceOf[EventInfo[T]]
  }
  
  @scala.inline
  implicit class EventInfoMutableBuilder[Self <: EventInfo[_], T] (val x: Self with EventInfo[T]) extends AnyVal {
    
    @scala.inline
    def setEventArgsTransformFunc(value: js.Any => js.Promise[T]): Self = StObject.set(x, "eventArgsTransformFunc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterFunc(value: js.Function1[/* args */ js.Any, Unit] => js.Promise[_]): Self = StObject.set(x, "registerFunc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregisterFunc(value: js.Function1[/* args */ js.Any, Unit] => js.Promise[_]): Self = StObject.set(x, "unregisterFunc", js.Any.fromFunction1(value))
  }
}
