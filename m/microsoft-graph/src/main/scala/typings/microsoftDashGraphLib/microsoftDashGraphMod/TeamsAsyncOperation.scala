package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAsyncOperation extends Entity {
  var attemptsCount: js.UndefOr[scala.Double] = js.undefined
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[OperationError] = js.undefined
  var lastActionDateTime: js.UndefOr[java.lang.String] = js.undefined
  var operationType: js.UndefOr[TeamsAsyncOperationType] = js.undefined
  var status: js.UndefOr[TeamsAsyncOperationStatus] = js.undefined
  var targetResourceId: js.UndefOr[java.lang.String] = js.undefined
  var targetResourceLocation: js.UndefOr[java.lang.String] = js.undefined
}

object TeamsAsyncOperation {
  @scala.inline
  def apply(
    attemptsCount: scala.Int | scala.Double = null,
    createdDateTime: java.lang.String = null,
    error: OperationError = null,
    id: java.lang.String = null,
    lastActionDateTime: java.lang.String = null,
    operationType: TeamsAsyncOperationType = null,
    status: TeamsAsyncOperationStatus = null,
    targetResourceId: java.lang.String = null,
    targetResourceLocation: java.lang.String = null
  ): TeamsAsyncOperation = {
    val __obj = js.Dynamic.literal()
    if (attemptsCount != null) __obj.updateDynamic("attemptsCount")(attemptsCount.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (error != null) __obj.updateDynamic("error")(error)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastActionDateTime != null) __obj.updateDynamic("lastActionDateTime")(lastActionDateTime)
    if (operationType != null) __obj.updateDynamic("operationType")(operationType)
    if (status != null) __obj.updateDynamic("status")(status)
    if (targetResourceId != null) __obj.updateDynamic("targetResourceId")(targetResourceId)
    if (targetResourceLocation != null) __obj.updateDynamic("targetResourceLocation")(targetResourceLocation)
    __obj.asInstanceOf[TeamsAsyncOperation]
  }
}

