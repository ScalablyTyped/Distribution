package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookOperation
  extends StObject
     with Entity {
  
  // The error returned by the operation.
  var error: js.UndefOr[NullableOption[WorkbookOperationError]] = js.undefined
  
  // The resource URI for the result.
  var resourceLocation: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The current status of the operation. Possible values are: NotStarted, Running, Completed, Failed.
  var status: js.UndefOr[WorkbookOperationStatus] = js.undefined
}
object WorkbookOperation {
  
  inline def apply(): WorkbookOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookOperation]
  }
  
  extension [Self <: WorkbookOperation](x: Self) {
    
    inline def setError(value: NullableOption[WorkbookOperationError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setResourceLocation(value: NullableOption[String]): Self = StObject.set(x, "resourceLocation", value.asInstanceOf[js.Any])
    
    inline def setResourceLocationNull: Self = StObject.set(x, "resourceLocation", null)
    
    inline def setResourceLocationUndefined: Self = StObject.set(x, "resourceLocation", js.undefined)
    
    inline def setStatus(value: WorkbookOperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
