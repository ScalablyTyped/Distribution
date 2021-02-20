package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationError extends StObject {
  
  /** Identifies the specific error that occurred. */
  var code: js.UndefOr[String] = js.native
  
  /** This is always *sql#operationError*. */
  var kind: js.UndefOr[String] = js.native
  
  /** Additional information about the error encountered. */
  var message: js.UndefOr[String] = js.native
}
object OperationError {
  
  @scala.inline
  def apply(): OperationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationError]
  }
  
  @scala.inline
  implicit class OperationErrorMutableBuilder[Self <: OperationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
