package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EBookInstallSummary extends Entity {
  // Number of Devices that have failed to install this book.
  var failedDeviceCount: js.UndefOr[Double] = js.undefined
  // Number of Users that have 1 or more device that failed to install this book.
  var failedUserCount: js.UndefOr[Double] = js.undefined
  // Number of Devices that have successfully installed this book.
  var installedDeviceCount: js.UndefOr[Double] = js.undefined
  // Number of Users whose devices have all succeeded to install this book.
  var installedUserCount: js.UndefOr[Double] = js.undefined
  // Number of Devices that does not have this book installed.
  var notInstalledDeviceCount: js.UndefOr[Double] = js.undefined
  // Number of Users that did not install this book.
  var notInstalledUserCount: js.UndefOr[Double] = js.undefined
}

object EBookInstallSummary {
  @scala.inline
  def apply(
    failedDeviceCount: Int | Double = null,
    failedUserCount: Int | Double = null,
    id: String = null,
    installedDeviceCount: Int | Double = null,
    installedUserCount: Int | Double = null,
    notInstalledDeviceCount: Int | Double = null,
    notInstalledUserCount: Int | Double = null
  ): EBookInstallSummary = {
    val __obj = js.Dynamic.literal()
    if (failedDeviceCount != null) __obj.updateDynamic("failedDeviceCount")(failedDeviceCount.asInstanceOf[js.Any])
    if (failedUserCount != null) __obj.updateDynamic("failedUserCount")(failedUserCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (installedDeviceCount != null) __obj.updateDynamic("installedDeviceCount")(installedDeviceCount.asInstanceOf[js.Any])
    if (installedUserCount != null) __obj.updateDynamic("installedUserCount")(installedUserCount.asInstanceOf[js.Any])
    if (notInstalledDeviceCount != null) __obj.updateDynamic("notInstalledDeviceCount")(notInstalledDeviceCount.asInstanceOf[js.Any])
    if (notInstalledUserCount != null) __obj.updateDynamic("notInstalledUserCount")(notInstalledUserCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBookInstallSummary]
  }
}

