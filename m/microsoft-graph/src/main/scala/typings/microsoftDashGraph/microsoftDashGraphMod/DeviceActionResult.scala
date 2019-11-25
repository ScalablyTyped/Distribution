package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceActionResult extends js.Object {
  // Action name
  var actionName: js.UndefOr[String] = js.undefined
  // State of the action. Possible values are: none, pending, canceled, active, done, failed, notSupported.
  var actionState: js.UndefOr[ActionState] = js.undefined
  // Time the action state was last updated
  var lastUpdatedDateTime: js.UndefOr[String] = js.undefined
  // Time the action was initiated
  var startDateTime: js.UndefOr[String] = js.undefined
}

object DeviceActionResult {
  @scala.inline
  def apply(
    actionName: String = null,
    actionState: ActionState = null,
    lastUpdatedDateTime: String = null,
    startDateTime: String = null
  ): DeviceActionResult = {
    val __obj = js.Dynamic.literal()
    if (actionName != null) __obj.updateDynamic("actionName")(actionName.asInstanceOf[js.Any])
    if (actionState != null) __obj.updateDynamic("actionState")(actionState.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceActionResult]
  }
}

