package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataPolicyOperation extends Entity {
  /**
    * Represents when the request for this data policy operation was completed, in UTC time, using the ISO 8601 format. For
    * example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Null until the operation completes.
    */
  var completedDateTime: js.UndefOr[String] = js.native
  // Specifies the progress of an operation.
  var progress: js.UndefOr[Double] = js.native
  // Possible values are: notStarted, running, complete, failed, unknownFutureValue.
  var status: js.UndefOr[DataPolicyOperationStatus] = js.native
  // The URL location to where data is being exported for export requests.
  var storageLocation: js.UndefOr[String] = js.native
  /**
    * Represents when the request for this data operation was submitted, in UTC time, using the ISO 8601 format. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var submittedDateTime: js.UndefOr[String] = js.native
  // The id for the user on whom the operation is performed.
  var userId: js.UndefOr[String] = js.native
}

object DataPolicyOperation {
  @scala.inline
  def apply(): DataPolicyOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPolicyOperation]
  }
  @scala.inline
  implicit class DataPolicyOperationOps[Self <: DataPolicyOperation] (val x: Self) extends AnyVal {
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
    def setCompletedDateTime(value: String): Self = this.set("completedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletedDateTime: Self = this.set("completedDateTime", js.undefined)
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setStatus(value: DataPolicyOperationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStorageLocation(value: String): Self = this.set("storageLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageLocation: Self = this.set("storageLocation", js.undefined)
    @scala.inline
    def setSubmittedDateTime(value: String): Self = this.set("submittedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmittedDateTime: Self = this.set("submittedDateTime", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

