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
    if (actionName != null) __obj.updateDynamic("actionName")(actionName)
    if (actionState != null) __obj.updateDynamic("actionState")(actionState)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime)
    if (unlockPin != null) __obj.updateDynamic("unlockPin")(unlockPin)
    __obj.asInstanceOf[RemoteLockActionResult]
  }
}

