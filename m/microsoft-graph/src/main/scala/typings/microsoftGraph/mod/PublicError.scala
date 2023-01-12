package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicError extends StObject {
  
  // Represents the error code.
  var code: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Details of the error.
  var details: js.UndefOr[NullableOption[js.Array[PublicErrorDetail]]] = js.undefined
  
  // Details of the inner error.
  var innerError: js.UndefOr[NullableOption[PublicInnerError]] = js.undefined
  
  // A non-localized message for the developer.
  var message: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The target of the error.
  var target: js.UndefOr[NullableOption[String]] = js.undefined
}
object PublicError {
  
  inline def apply(): PublicError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: NullableOption[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDetails(value: NullableOption[js.Array[PublicErrorDetail]]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: PublicErrorDetail*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setInnerError(value: NullableOption[PublicInnerError]): Self = StObject.set(x, "innerError", value.asInstanceOf[js.Any])
    
    inline def setInnerErrorNull: Self = StObject.set(x, "innerError", null)
    
    inline def setInnerErrorUndefined: Self = StObject.set(x, "innerError", js.undefined)
    
    inline def setMessage(value: NullableOption[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setTarget(value: NullableOption[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
