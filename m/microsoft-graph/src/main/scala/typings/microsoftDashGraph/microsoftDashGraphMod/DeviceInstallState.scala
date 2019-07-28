package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceInstallState extends Entity {
  // Device Id.
  var deviceId: js.UndefOr[String] = js.undefined
  // Device name.
  var deviceName: js.UndefOr[String] = js.undefined
  // The error code for install failures.
  var errorCode: js.UndefOr[String] = js.undefined
  /**
    * The install state of the eBook. Possible values are: notApplicable, installed, failed, notInstalled, uninstallFailed,
    * unknown.
    */
  var installState: js.UndefOr[InstallState] = js.undefined
  // Last sync date and time.
  var lastSyncDateTime: js.UndefOr[String] = js.undefined
  // OS Description.
  var osDescription: js.UndefOr[String] = js.undefined
  // OS Version.
  var osVersion: js.UndefOr[String] = js.undefined
  // Device User Name.
  var userName: js.UndefOr[String] = js.undefined
}

object DeviceInstallState {
  @scala.inline
  def apply(
    deviceId: String = null,
    deviceName: String = null,
    errorCode: String = null,
    id: String = null,
    installState: InstallState = null,
    lastSyncDateTime: String = null,
    osDescription: String = null,
    osVersion: String = null,
    userName: String = null
  ): DeviceInstallState = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName)
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode)
    if (id != null) __obj.updateDynamic("id")(id)
    if (installState != null) __obj.updateDynamic("installState")(installState)
    if (lastSyncDateTime != null) __obj.updateDynamic("lastSyncDateTime")(lastSyncDateTime)
    if (osDescription != null) __obj.updateDynamic("osDescription")(osDescription)
    if (osVersion != null) __obj.updateDynamic("osVersion")(osVersion)
    if (userName != null) __obj.updateDynamic("userName")(userName)
    __obj.asInstanceOf[DeviceInstallState]
  }
}

