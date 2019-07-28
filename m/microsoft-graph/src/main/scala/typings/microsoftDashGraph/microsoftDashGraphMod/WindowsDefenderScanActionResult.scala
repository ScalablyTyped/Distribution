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
    if (actionName != null) __obj.updateDynamic("actionName")(actionName)
    if (actionState != null) __obj.updateDynamic("actionState")(actionState)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (scanType != null) __obj.updateDynamic("scanType")(scanType)
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime)
    __obj.asInstanceOf[WindowsDefenderScanActionResult]
  }
}

