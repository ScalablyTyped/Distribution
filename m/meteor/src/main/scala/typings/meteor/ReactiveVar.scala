package typings.meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactiveVar[T] extends StObject {
  
  def get(): T
  
  def set(newValue: T): Unit
}
object ReactiveVar {
  
  inline def apply[T](get: () => T, set: T => Unit): ReactiveVar[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[ReactiveVar[T]]
  }
  
  extension [Self <: ReactiveVar[?], T](x: Self & ReactiveVar[T]) {
    
    inline def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setSet(value: T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
