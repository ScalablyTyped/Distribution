package typings.meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactiveVar[T] extends StObject {
  
  def get(): T = js.native
  
  def set(newValue: T): Unit = js.native
}
object ReactiveVar {
  
  @scala.inline
  def apply[T](get: () => T, set: T => Unit): ReactiveVar[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[ReactiveVar[T]]
  }
  
  @scala.inline
  implicit class ReactiveVarMutableBuilder[Self <: ReactiveVar[_], T] (val x: Self with ReactiveVar[T]) extends AnyVal {
    
    @scala.inline
    def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
