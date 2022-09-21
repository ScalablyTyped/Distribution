package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorsArray extends StObject {
  
  var errors: js.Array[Column]
}
object ErrorsArray {
  
  inline def apply(errors: js.Array[Column]): ErrorsArray = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorsArray]
  }
  
  extension [Self <: ErrorsArray](x: Self) {
    
    inline def setErrors(value: js.Array[Column]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: Column*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
