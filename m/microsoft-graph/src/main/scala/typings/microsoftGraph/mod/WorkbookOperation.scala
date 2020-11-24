package typings.microsoftGraph.mod

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
  implicit class WorkbookOperationOps[Self <: WorkbookOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: NullableOption[WorkbookOperationError]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
    
    @scala.inline
    def setResourceLocation(value: NullableOption[String]): Self = this.set("resourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceLocation: Self = this.set("resourceLocation", js.undefined)
    
    @scala.inline
    def setResourceLocationNull: Self = this.set("resourceLocation", null)
    
    @scala.inline
    def setStatus(value: WorkbookOperationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
