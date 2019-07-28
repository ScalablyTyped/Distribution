package typings.microsoftDashGraph.microsoftDashGraphMod

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
    failedDeviceCount: Int | Double = null,
    id: String = null,
    installedDeviceCount: Int | Double = null,
    notInstalledDeviceCount: Int | Double = null,
    userName: String = null
  ): UserInstallStateSummary = {
    val __obj = js.Dynamic.literal()
    if (deviceStates != null) __obj.updateDynamic("deviceStates")(deviceStates)
    if (failedDeviceCount != null) __obj.updateDynamic("failedDeviceCount")(failedDeviceCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (installedDeviceCount != null) __obj.updateDynamic("installedDeviceCount")(installedDeviceCount.asInstanceOf[js.Any])
    if (notInstalledDeviceCount != null) __obj.updateDynamic("notInstalledDeviceCount")(notInstalledDeviceCount.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName)
    __obj.asInstanceOf[UserInstallStateSummary]
  }
}

