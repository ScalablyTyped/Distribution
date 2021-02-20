package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookOperation extends Entity {
  
  // The error returned by the operation.
  var error: js.UndefOr[NullableOption[WorkbookOperationError]] = js.native
  
  // The resource URI for the result.
  var resourceLocation: js.UndefOr[NullableOption[String]] = js.native
  
  // The current status of the operation. Possible values are: NotStarted, Running, Completed, Failed.
  var status: js.UndefOr[WorkbookOperationStatus] = js.native
}
object WorkbookOperation {
  
  @scala.inline
  def apply(): WorkbookOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookOperation]
  }
  
  @scala.inline
  implicit class WorkbookOperationMutableBuilder[Self <: WorkbookOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: NullableOption[WorkbookOperationError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = StObject.set(x, "error", null)
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setResourceLocation(value: NullableOption[String]): Self = StObject.set(x, "resourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLocationNull: Self = StObject.set(x, "resourceLocation", null)
    
    @scala.inline
    def setResourceLocationUndefined: Self = StObject.set(x, "resourceLocation", js.undefined)
    
    @scala.inline
    def setStatus(value: WorkbookOperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
