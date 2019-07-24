package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetPasscodeActionResult extends DeviceActionResult {
  // Newly generated passcode for the device
  var passcode: js.UndefOr[java.lang.String] = js.undefined
}

object ResetPasscodeActionResult {
  @scala.inline
  def apply(
    actionName: java.lang.String = null,
    actionState: ActionState = null,
    lastUpdatedDateTime: java.lang.String = null,
    passcode: java.lang.String = null,
    startDateTime: java.lang.String = null
  ): ResetPasscodeActionResult = {
    val __obj = js.Dynamic.literal()
    if (actionName != null) __obj.updateDynamic("actionName")(actionName)
    if (actionState != null) __obj.updateDynamic("actionState")(actionState)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (passcode != null) __obj.updateDynamic("passcode")(passcode)
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime)
    __obj.asInstanceOf[ResetPasscodeActionResult]
  }
}

