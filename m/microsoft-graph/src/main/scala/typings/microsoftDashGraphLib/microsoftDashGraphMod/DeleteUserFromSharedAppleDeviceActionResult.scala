package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserFromSharedAppleDeviceActionResult extends DeviceActionResult {
  // User principal name of the user to be deleted
  var userPrincipalName: js.UndefOr[java.lang.String] = js.undefined
}

object DeleteUserFromSharedAppleDeviceActionResult {
  @scala.inline
  def apply(
    actionName: java.lang.String = null,
    actionState: ActionState = null,
    lastUpdatedDateTime: java.lang.String = null,
    startDateTime: java.lang.String = null,
    userPrincipalName: java.lang.String = null
  ): DeleteUserFromSharedAppleDeviceActionResult = {
    val __obj = js.Dynamic.literal()
    if (actionName != null) __obj.updateDynamic("actionName")(actionName)
    if (actionState != null) __obj.updateDynamic("actionState")(actionState)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime)
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName)
    __obj.asInstanceOf[DeleteUserFromSharedAppleDeviceActionResult]
  }
}

