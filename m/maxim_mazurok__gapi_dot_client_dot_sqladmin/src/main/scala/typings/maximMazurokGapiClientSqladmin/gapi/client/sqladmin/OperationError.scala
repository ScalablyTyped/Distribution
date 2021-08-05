package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationError extends StObject {
  
  /** Identifies the specific error that occurred. */
  var code: js.UndefOr[String] = js.undefined
  
  /** This is always *sql#operationError*. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Additional information about the error encountered. */
  var message: js.UndefOr[String] = js.undefined
}
object OperationError {
  
  inline def apply(): OperationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationError]
  }
  
  extension [Self <: OperationError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
