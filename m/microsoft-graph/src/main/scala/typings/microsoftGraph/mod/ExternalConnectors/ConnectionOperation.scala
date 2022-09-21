package typings.microsoftGraph.mod.ExternalConnectors

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.NullableOption
import typings.microsoftGraph.mod.PublicError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionOperation
  extends StObject
     with Entity {
  
  // If status is failed, provides more information about the error that caused the failure.
  var error: js.UndefOr[NullableOption[PublicError]] = js.undefined
  
  /**
    * Indicates the status of the asynchronous operation. Possible values are: unspecified, inprogress, completed, failed,
    * unknownFutureValue.
    */
  var status: js.UndefOr[NullableOption[ConnectionOperationStatus]] = js.undefined
}
object ConnectionOperation {
  
  inline def apply(): ConnectionOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOperation]
  }
  
  extension [Self <: ConnectionOperation](x: Self) {
    
    inline def setError(value: NullableOption[PublicError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setStatus(value: NullableOption[ConnectionOperationStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
