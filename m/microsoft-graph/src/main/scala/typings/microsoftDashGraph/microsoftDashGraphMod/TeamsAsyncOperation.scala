package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAsyncOperation extends Entity {
  var attemptsCount: js.UndefOr[Double] = js.undefined
  var createdDateTime: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[OperationError] = js.undefined
  var lastActionDateTime: js.UndefOr[String] = js.undefined
  var operationType: js.UndefOr[TeamsAsyncOperationType] = js.undefined
  var status: js.UndefOr[TeamsAsyncOperationStatus] = js.undefined
  var targetResourceId: js.UndefOr[String] = js.undefined
  var targetResourceLocation: js.UndefOr[String] = js.undefined
}

object TeamsAsyncOperation {
  @scala.inline
  def apply(
    attemptsCount: Int | Double = null,
    createdDateTime: String = null,
    error: OperationError = null,
    id: String = null,
    lastActionDateTime: String = null,
    operationType: TeamsAsyncOperationType = null,
    status: TeamsAsyncOperationStatus = null,
    targetResourceId: String = null,
    targetResourceLocation: String = null
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

