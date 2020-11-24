package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsAsyncOperation extends Entity {
  
  // Number of times the operation was attempted before being marked successful or failed.
  var attemptsCount: js.UndefOr[Double] = js.native
  
  // Time when the operation was created.
  var createdDateTime: js.UndefOr[String] = js.native
  
  // Any error that causes the async operation to fail.
  var error: js.UndefOr[NullableOption[OperationError]] = js.native
  
  // Time when the async operation was last updated.
  var lastActionDateTime: js.UndefOr[String] = js.native
  
  // Denotes which type of operation is being described.
  var operationType: js.UndefOr[TeamsAsyncOperationType] = js.native
  
  // Operation status.
  var status: js.UndefOr[TeamsAsyncOperationStatus] = js.native
  
  // The ID of the object that's created or modified as result of this async operation, typically a team.
  var targetResourceId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The location of the object that's created or modified as result of this async operation. This URL should be treated as
    * an opaque value and not parsed into its component paths.
    */
  var targetResourceLocation: js.UndefOr[NullableOption[String]] = js.native
}
object TeamsAsyncOperation {
  
  @scala.inline
  def apply(): TeamsAsyncOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsAsyncOperation]
  }
  
  @scala.inline
  implicit class TeamsAsyncOperationOps[Self <: TeamsAsyncOperation] (val x: Self) extends AnyVal {
    
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
    def setAttemptsCount(value: Double): Self = this.set("attemptsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttemptsCount: Self = this.set("attemptsCount", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setError(value: NullableOption[OperationError]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
    
    @scala.inline
    def setLastActionDateTime(value: String): Self = this.set("lastActionDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastActionDateTime: Self = this.set("lastActionDateTime", js.undefined)
    
    @scala.inline
    def setOperationType(value: TeamsAsyncOperationType): Self = this.set("operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    
    @scala.inline
    def setStatus(value: TeamsAsyncOperationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTargetResourceId(value: NullableOption[String]): Self = this.set("targetResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetResourceId: Self = this.set("targetResourceId", js.undefined)
    
    @scala.inline
    def setTargetResourceIdNull: Self = this.set("targetResourceId", null)
    
    @scala.inline
    def setTargetResourceLocation(value: NullableOption[String]): Self = this.set("targetResourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetResourceLocation: Self = this.set("targetResourceLocation", js.undefined)
    
    @scala.inline
    def setTargetResourceLocationNull: Self = this.set("targetResourceLocation", null)
  }
}
