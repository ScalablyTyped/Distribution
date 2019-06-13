package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceInstallState extends Entity {
  /** Device Id. */
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /** Device name. */
  var deviceName: js.UndefOr[java.lang.String] = js.undefined
  /** The error code for install failures. */
  var errorCode: js.UndefOr[java.lang.String] = js.undefined
  /** The install state of the eBook. Possible values are: notApplicable, installed, failed, notInstalled, uninstallFailed, unknown. */
  var installState: js.UndefOr[InstallState] = js.undefined
  /** Last sync date and time. */
  var lastSyncDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** OS Description. */
  var osDescription: js.UndefOr[java.lang.String] = js.undefined
  /** OS Version. */
  var osVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Device User Name. */
  var userName: js.UndefOr[java.lang.String] = js.undefined
}

object DeviceInstallState {
  @scala.inline
  def apply(
    deviceId: java.lang.String = null,
    deviceName: java.lang.String = null,
    errorCode: java.lang.String = null,
    id: java.lang.String = null,
    installState: InstallState = null,
    lastSyncDateTime: java.lang.String = null,
    osDescription: java.lang.String = null,
    osVersion: java.lang.String = null,
    userName: java.lang.String = null
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

