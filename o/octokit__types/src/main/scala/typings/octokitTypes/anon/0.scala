package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[T] extends StObject {
  
  var previews: Array[T | String]
}
object `0` {
  
  inline def apply[T](previews: Array[T | String]): `0`[T] = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[T]]
  }
  
  extension [Self <: `0`[?], T](x: Self & `0`[T]) {
    
    inline def setPreviews(value: Array[T | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}
