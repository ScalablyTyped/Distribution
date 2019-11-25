package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends Entity {
  // The start time of the operation.
  var createdDateTime: js.UndefOr[String] = js.undefined
  // The time of the last action of the operation.
  var lastActionDateTime: js.UndefOr[String] = js.undefined
  // The current status of the operation: notStarted, running, completed, failed
  var status: js.UndefOr[OperationStatus] = js.undefined
}

object Operation {
  @scala.inline
  def apply(
    createdDateTime: String = null,
    id: String = null,
    lastActionDateTime: String = null,
    status: OperationStatus = null
  ): Operation = {
    val __obj = js.Dynamic.literal()
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastActionDateTime != null) __obj.updateDynamic("lastActionDateTime")(lastActionDateTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
}

