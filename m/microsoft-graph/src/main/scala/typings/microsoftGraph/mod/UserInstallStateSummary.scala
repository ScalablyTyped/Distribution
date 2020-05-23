package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInstallStateSummary extends Entity {
  // The install state of the eBook.
  var deviceStates: js.UndefOr[js.Array[DeviceInstallState]] = js.undefined
  // Failed Device Count.
  var failedDeviceCount: js.UndefOr[Double] = js.undefined
  // Installed Device Count.
  var installedDeviceCount: js.UndefOr[Double] = js.undefined
  // Not installed device count.
  var notInstalledDeviceCount: js.UndefOr[Double] = js.undefined
  // User name.
  var userName: js.UndefOr[String] = js.undefined
}

object UserInstallStateSummary {
  @scala.inline
  def apply(
    deviceStates: js.Array[DeviceInstallState] = null,
    failedDeviceCount: js.UndefOr[Double] = js.undefined,
    id: String = null,
    installedDeviceCount: js.UndefOr[Double] = js.undefined,
    notInstalledDeviceCount: js.UndefOr[Double] = js.undefined,
    userName: String = null
  ): UserInstallStateSummary = {
    val __obj = js.Dynamic.literal()
    if (deviceStates != null) __obj.updateDynamic("deviceStates")(deviceStates.asInstanceOf[js.Any])
    if (!js.isUndefined(failedDeviceCount)) __obj.updateDynamic("failedDeviceCount")(failedDeviceCount.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(installedDeviceCount)) __obj.updateDynamic("installedDeviceCount")(installedDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notInstalledDeviceCount)) __obj.updateDynamic("notInstalledDeviceCount")(notInstalledDeviceCount.get.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInstallStateSummary]
  }
}

