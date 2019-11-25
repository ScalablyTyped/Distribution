package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocateDeviceActionResult extends DeviceActionResult {
  // device location
  var deviceLocation: js.UndefOr[DeviceGeoLocation] = js.undefined
}

object LocateDeviceActionResult {
  @scala.inline
  def apply(
    actionName: String = null,
    actionState: ActionState = null,
    deviceLocation: DeviceGeoLocation = null,
    lastUpdatedDateTime: String = null,
    startDateTime: String = null
  ): LocateDeviceActionResult = {
    val __obj = js.Dynamic.literal()
    if (actionName != null) __obj.updateDynamic("actionName")(actionName.asInstanceOf[js.Any])
    if (actionState != null) __obj.updateDynamic("actionState")(actionState.asInstanceOf[js.Any])
    if (deviceLocation != null) __obj.updateDynamic("deviceLocation")(deviceLocation.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocateDeviceActionResult]
  }
}

