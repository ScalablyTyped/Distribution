package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceActionResult extends js.Object {
  /** Action name */
  var actionName: js.UndefOr[java.lang.String] = js.undefined
  /** State of the action. Possible values are: none, pending, canceled, active, done, failed, notSupported. */
  var actionState: js.UndefOr[ActionState] = js.undefined
  /** Time the action state was last updated */
  var lastUpdatedDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Time the action was initiated */
  var startDateTime: js.UndefOr[java.lang.String] = js.undefined
}

object DeviceActionResult {
  @scala.inline
  def apply(
    actionName: java.lang.String = null,
    actionState: ActionState = null,
    lastUpdatedDateTime: java.lang.String = null,
    startDateTime: java.lang.String = null
  ): DeviceActionResult = {
    val __obj = js.Dynamic.literal()
    if (actionName != null) __obj.updateDynamic("actionName")(actionName)
    if (actionState != null) __obj.updateDynamic("actionState")(actionState)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime)
    __obj.asInstanceOf[DeviceActionResult]
  }
}

