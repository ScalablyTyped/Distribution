package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationErrors extends StObject {
  
  /** The list of errors encountered while processing this operation. */
  var errors: js.UndefOr[js.Array[OperationError]] = js.undefined
  
  /** This is always *sql#operationErrors*. */
  var kind: js.UndefOr[String] = js.undefined
}
object OperationErrors {
  
  @scala.inline
  def apply(): OperationErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationErrors]
  }
  
  @scala.inline
  implicit class OperationErrorsMutableBuilder[Self <: OperationErrors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[OperationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: OperationError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
