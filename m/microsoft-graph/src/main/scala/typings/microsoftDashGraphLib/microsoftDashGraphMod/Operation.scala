package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends Entity {
  // The start time of the operation.
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
  // The time of the last action of the operation.
  var lastActionDateTime: js.UndefOr[java.lang.String] = js.undefined
  // The current status of the operation: notStarted, running, completed, failed
  var status: js.UndefOr[OperationStatus] = js.undefined
}

object Operation {
  @scala.inline
  def apply(
    createdDateTime: java.lang.String = null,
    id: java.lang.String = null,
    lastActionDateTime: java.lang.String = null,
    status: OperationStatus = null
  ): Operation = {
    val __obj = js.Dynamic.literal()
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastActionDateTime != null) __obj.updateDynamic("lastActionDateTime")(lastActionDateTime)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Operation]
  }
}

