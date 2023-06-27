package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicErrorResponse extends StObject {
  
  var error: js.UndefOr[NullableOption[PublicError]] = js.undefined
}
object PublicErrorResponse {
  
  inline def apply(): PublicErrorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicErrorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicErrorResponse] (val x: Self) extends AnyVal {
    
    inline def setError(value: NullableOption[PublicError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
