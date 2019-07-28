package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainState extends js.Object {
  /**
    * Timestamp for when the last activity occurred. The value is updated when an operation is scheduled, the asynchronous
    * task starts, and when the operation completes.
    */
  var lastActionDateTime: js.UndefOr[String] = js.undefined
  // Type of asynchronous operation. The values can be ForceDelete or Verification
  var operation: js.UndefOr[String] = js.undefined
  /**
    * Current status of the operation. Scheduled - Operation has been scheduled but has not started. InProgress - Task has
    * started and is in progress. Failed - Operation has failed.
    */
  var status: js.UndefOr[String] = js.undefined
}

object DomainState {
  @scala.inline
  def apply(lastActionDateTime: String = null, operation: String = null, status: String = null): DomainState = {
    val __obj = js.Dynamic.literal()
    if (lastActionDateTime != null) __obj.updateDynamic("lastActionDateTime")(lastActionDateTime)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[DomainState]
  }
}

