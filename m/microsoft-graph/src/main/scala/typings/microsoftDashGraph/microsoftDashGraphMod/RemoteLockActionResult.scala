package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteLockActionResult extends DeviceActionResult {
  // Pin to unlock the client
  var unlockPin: js.UndefOr[String] = js.undefined
}

object RemoteLockActionResult {
  @scala.inline
  def apply(
    actionName: String = null,
    actionState: ActionState = null,
    lastUpdatedDateTime: String = null,
    startDateTime: String = null,
    unlockPin: String = null
  ): RemoteLockActionResult = {
    val __obj = js.Dynamic.literal()
    if (actionName != null) __obj.updateDynamic("actionName")(actionName.asInstanceOf[js.Any])
    if (actionState != null) __obj.updateDynamic("actionState")(actionState.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime.asInstanceOf[js.Any])
    if (unlockPin != null) __obj.updateDynamic("unlockPin")(unlockPin.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteLockActionResult]
  }
}

