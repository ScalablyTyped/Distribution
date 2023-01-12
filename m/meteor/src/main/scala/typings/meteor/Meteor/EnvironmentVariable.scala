package typings.meteor.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentVariable[T] extends StObject {
  
  def get(): T
  
  def getOrNullIfOutsideFiber(): T | Null
  
  val slot: Double
  
  def withValue[U](value: T, fn: js.Function0[U]): U
}
object EnvironmentVariable {
  
  inline def apply[T](
    get: () => T,
    getOrNullIfOutsideFiber: () => T | Null,
    slot: Double,
    withValue: (T, js.Function0[Any]) => Any
  ): EnvironmentVariable[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), getOrNullIfOutsideFiber = js.Any.fromFunction0(getOrNullIfOutsideFiber), slot = slot.asInstanceOf[js.Any], withValue = js.Any.fromFunction2(withValue))
    __obj.asInstanceOf[EnvironmentVariable[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentVariable[?], T] (val x: Self & EnvironmentVariable[T]) extends AnyVal {
    
    inline def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setGetOrNullIfOutsideFiber(value: () => T | Null): Self = StObject.set(x, "getOrNullIfOutsideFiber", js.Any.fromFunction0(value))
    
    inline def setSlot(value: Double): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setWithValue(value: (T, js.Function0[Any]) => Any): Self = StObject.set(x, "withValue", js.Any.fromFunction2(value))
  }
}
