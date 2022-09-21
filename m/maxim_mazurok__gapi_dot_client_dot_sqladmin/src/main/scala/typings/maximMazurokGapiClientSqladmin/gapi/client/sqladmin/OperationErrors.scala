package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationErrors extends StObject {
  
  /** The list of errors encountered while processing this operation. */
  var errors: js.UndefOr[js.Array[OperationError]] = js.undefined
  
  /** This is always `sql#operationErrors`. */
  var kind: js.UndefOr[String] = js.undefined
}
object OperationErrors {
  
  inline def apply(): OperationErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationErrors]
  }
  
  extension [Self <: OperationErrors](x: Self) {
    
    inline def setErrors(value: js.Array[OperationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: OperationError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
