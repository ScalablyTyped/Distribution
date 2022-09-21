package typings.moize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxAgeMaxAge[MaxAge /* <: Double */] extends StObject {
  
  var maxAge: MaxAge
}
object MaxAgeMaxAge {
  
  inline def apply[MaxAge /* <: Double */](maxAge: MaxAge): MaxAgeMaxAge[MaxAge] = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAgeMaxAge[MaxAge]]
  }
  
  extension [Self <: MaxAgeMaxAge[?], MaxAge /* <: Double */](x: Self & MaxAgeMaxAge[MaxAge]) {
    
    inline def setMaxAge(value: MaxAge): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
  }
}
