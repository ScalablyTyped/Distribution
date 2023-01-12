package typings.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsError extends StObject {
  
  var isError: Boolean
  
  var isHelp: Boolean
  
  var isValid: Boolean
}
object IsError {
  
  inline def apply(isError: Boolean, isHelp: Boolean, isValid: Boolean): IsError = {
    val __obj = js.Dynamic.literal(isError = isError.asInstanceOf[js.Any], isHelp = isHelp.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsError] (val x: Self) extends AnyVal {
    
    inline def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
    
    inline def setIsHelp(value: Boolean): Self = StObject.set(x, "isHelp", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
  }
}
