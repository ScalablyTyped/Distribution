package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait ArrayLike2[T]
  extends StObject
     with /* n */ NumberDictionary[T] {
  
  var length: Double
}
object ArrayLike2 {
  
  inline def apply[T](length: Double): ArrayLike2[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayLike2[T]]
  }
  
  extension [Self <: ArrayLike2[?], T](x: Self & ArrayLike2[T]) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
