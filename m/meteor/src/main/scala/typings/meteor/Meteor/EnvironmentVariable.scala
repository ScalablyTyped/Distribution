package typings.meteor.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentVariable[T] extends StObject {
  
  def get(): T = js.native
  
  def getOrNullIfOutsideFiber(): T | Null = js.native
  
  val slot: Double = js.native
  
  def withValue[U](value: T, fn: js.Function0[U]): U = js.native
}
object EnvironmentVariable {
  
  @scala.inline
  def apply[T](
    get: () => T,
    getOrNullIfOutsideFiber: () => T | Null,
    slot: Double,
    withValue: (T, js.Function0[js.Any]) => js.Any
  ): EnvironmentVariable[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), getOrNullIfOutsideFiber = js.Any.fromFunction0(getOrNullIfOutsideFiber), slot = slot.asInstanceOf[js.Any], withValue = js.Any.fromFunction2(withValue))
    __obj.asInstanceOf[EnvironmentVariable[T]]
  }
  
  @scala.inline
  implicit class EnvironmentVariableMutableBuilder[Self <: EnvironmentVariable[_], T] (val x: Self with EnvironmentVariable[T]) extends AnyVal {
    
    @scala.inline
    def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOrNullIfOutsideFiber(value: () => T | Null): Self = StObject.set(x, "getOrNullIfOutsideFiber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSlot(value: Double): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithValue(value: (T, js.Function0[js.Any]) => js.Any): Self = StObject.set(x, "withValue", js.Any.fromFunction2(value))
  }
}
