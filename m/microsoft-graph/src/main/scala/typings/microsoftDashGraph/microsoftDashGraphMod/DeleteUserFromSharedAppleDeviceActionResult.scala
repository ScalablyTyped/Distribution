package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserFromSharedAppleDeviceActionResult extends DeviceActionResult {
  // User principal name of the user to be deleted
  var userPrincipalName: js.UndefOr[String] = js.undefined
}

object DeleteUserFromSharedAppleDeviceActionResult {
  @scala.inline
  def apply(
    actionName: String = null,
    actionState: ActionState = null,
    lastUpdatedDateTime: String = null,
    startDateTime: String = null,
    userPrincipalName: String = null
  ): DeleteUserFromSharedAppleDeviceActionResult = {
    val __obj = js.Dynamic.literal()
    if (actionName != null) __obj.updateDynamic("actionName")(actionName.asInstanceOf[js.Any])
    if (actionState != null) __obj.updateDynamic("actionState")(actionState.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime.asInstanceOf[js.Any])
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserFromSharedAppleDeviceActionResult]
  }
}

