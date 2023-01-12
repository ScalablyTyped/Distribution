package typings.meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactiveVar[T] extends StObject {
  
  /**
    * Returns the current value of the ReactiveVar, establishing a reactive dependency.
    */
  def get(): T
  
  /**
    * Sets the current value of the ReactiveVar, invalidating the Computations that called `get` if `newValue` is different from the old value.
    */
  def set(newValue: T): Unit
}
object ReactiveVar {
  
  inline def apply[T](get: () => T, set: T => Unit): ReactiveVar[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[ReactiveVar[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReactiveVar[?], T] (val x: Self & ReactiveVar[T]) extends AnyVal {
    
    inline def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setSet(value: T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
