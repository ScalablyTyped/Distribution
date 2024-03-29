package typings.minappEnv

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayLike[T]
  extends StObject
     with /* n */ NumberDictionary[T] {
  
  val length: Double
}
object ArrayLike {
  
  inline def apply[T](length: Double): ArrayLike[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayLike[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayLike[?], T] (val x: Self & ArrayLike[T]) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
