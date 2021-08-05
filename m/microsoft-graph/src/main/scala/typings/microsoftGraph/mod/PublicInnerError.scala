package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicInnerError extends StObject {
  
  var code: js.UndefOr[NullableOption[String]] = js.undefined
  
  var details: js.UndefOr[NullableOption[js.Array[PublicErrorDetail]]] = js.undefined
  
  var message: js.UndefOr[NullableOption[String]] = js.undefined
  
  var target: js.UndefOr[NullableOption[String]] = js.undefined
}
object PublicInnerError {
  
  inline def apply(): PublicInnerError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicInnerError]
  }
  
  extension [Self <: PublicInnerError](x: Self) {
    
    inline def setCode(value: NullableOption[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDetails(value: NullableOption[js.Array[PublicErrorDetail]]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: PublicErrorDetail*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    inline def setMessage(value: NullableOption[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setTarget(value: NullableOption[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
