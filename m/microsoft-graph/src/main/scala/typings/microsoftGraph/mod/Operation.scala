package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operation extends Entity {
  // The start time of the operation.
  var createdDateTime: js.UndefOr[String] = js.native
  // The time of the last action of the operation.
  var lastActionDateTime: js.UndefOr[String] = js.native
  // The current status of the operation: notStarted, running, completed, failed
  var status: js.UndefOr[OperationStatus] = js.native
}

object Operation {
  @scala.inline
  def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  implicit class OperationOps[Self <: Operation] (val x: Self) extends AnyVal {
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
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    @scala.inline
    def setLastActionDateTime(value: String): Self = this.set("lastActionDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastActionDateTime: Self = this.set("lastActionDateTime", js.undefined)
    @scala.inline
    def setStatus(value: OperationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

