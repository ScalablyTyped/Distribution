package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsAsyncOperation extends Entity {
  var attemptsCount: js.UndefOr[Double] = js.native
  var createdDateTime: js.UndefOr[String] = js.native
  var error: js.UndefOr[OperationError] = js.native
  var lastActionDateTime: js.UndefOr[String] = js.native
  var operationType: js.UndefOr[TeamsAsyncOperationType] = js.native
  var status: js.UndefOr[TeamsAsyncOperationStatus] = js.native
  var targetResourceId: js.UndefOr[String] = js.native
  var targetResourceLocation: js.UndefOr[String] = js.native
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
    def setError(value: OperationError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
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
    def setTargetResourceId(value: String): Self = this.set("targetResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetResourceId: Self = this.set("targetResourceId", js.undefined)
    @scala.inline
    def setTargetResourceLocation(value: String): Self = this.set("targetResourceLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetResourceLocation: Self = this.set("targetResourceLocation", js.undefined)
  }
  
}

