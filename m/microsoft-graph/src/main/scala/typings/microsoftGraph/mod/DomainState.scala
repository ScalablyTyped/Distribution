package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainState extends js.Object {
  /**
    * Timestamp for when the last activity occurred. The value is updated when an operation is scheduled, the asynchronous
    * task starts, and when the operation completes.
    */
  var lastActionDateTime: js.UndefOr[String] = js.native
  // Type of asynchronous operation. The values can be ForceDelete or Verification
  var operation: js.UndefOr[String] = js.native
  /**
    * Current status of the operation. Scheduled - Operation has been scheduled but has not started. InProgress - Task has
    * started and is in progress. Failed - Operation has failed.
    */
  var status: js.UndefOr[String] = js.native
}

object DomainState {
  @scala.inline
  def apply(): DomainState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainState]
  }
  @scala.inline
  implicit class DomainStateOps[Self <: DomainState] (val x: Self) extends AnyVal {
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
    def setLastActionDateTime(value: String): Self = this.set("lastActionDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastActionDateTime: Self = this.set("lastActionDateTime", js.undefined)
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

