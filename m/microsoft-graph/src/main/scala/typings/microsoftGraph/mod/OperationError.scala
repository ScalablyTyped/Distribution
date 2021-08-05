package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationError extends StObject {
  
  // Operation error code.
  var code: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Operation error message.
  var message: js.UndefOr[NullableOption[String]] = js.undefined
}
object OperationError {
  
  inline def apply(): OperationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationError]
  }
  
  extension [Self <: OperationError](x: Self) {
    
    inline def setCode(value: NullableOption[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: NullableOption[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
