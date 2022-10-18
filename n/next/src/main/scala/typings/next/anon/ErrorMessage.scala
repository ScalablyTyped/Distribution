package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorMessage extends StObject {
  
  var errorMessage: String
}
object ErrorMessage {
  
  inline def apply(errorMessage: String): ErrorMessage = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorMessage]
  }
  
  extension [Self <: ErrorMessage](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
  }
}
