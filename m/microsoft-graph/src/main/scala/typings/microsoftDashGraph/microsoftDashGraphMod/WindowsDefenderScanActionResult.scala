package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsDefenderScanActionResult extends DeviceActionResult {
  // Scan type either full scan or quick scan
  var scanType: js.UndefOr[String] = js.undefined
}

object WindowsDefenderScanActionResult {
  @scala.inline
  def apply(
    actionName: String = null,
    actionState: ActionState = null,
    lastUpdatedDateTime: String = null,
    scanType: String = null,
    startDateTime: String = null
  ): WindowsDefenderScanActionResult = {
    val __obj = js.Dynamic.literal()
    if (actionName != null) __obj.updateDynamic("actionName")(actionName.asInstanceOf[js.Any])
    if (actionState != null) __obj.updateDynamic("actionState")(actionState.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (scanType != null) __obj.updateDynamic("scanType")(scanType.asInstanceOf[js.Any])
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsDefenderScanActionResult]
  }
}

