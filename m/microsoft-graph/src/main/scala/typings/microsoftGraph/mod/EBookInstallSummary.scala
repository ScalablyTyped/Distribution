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
    failedDeviceCount: js.UndefOr[Double] = js.undefined,
    failedUserCount: js.UndefOr[Double] = js.undefined,
    id: String = null,
    installedDeviceCount: js.UndefOr[Double] = js.undefined,
    installedUserCount: js.UndefOr[Double] = js.undefined,
    notInstalledDeviceCount: js.UndefOr[Double] = js.undefined,
    notInstalledUserCount: js.UndefOr[Double] = js.undefined
  ): EBookInstallSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failedDeviceCount)) __obj.updateDynamic("failedDeviceCount")(failedDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failedUserCount)) __obj.updateDynamic("failedUserCount")(failedUserCount.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(installedDeviceCount)) __obj.updateDynamic("installedDeviceCount")(installedDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(installedUserCount)) __obj.updateDynamic("installedUserCount")(installedUserCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notInstalledDeviceCount)) __obj.updateDynamic("notInstalledDeviceCount")(notInstalledDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notInstalledUserCount)) __obj.updateDynamic("notInstalledUserCount")(notInstalledUserCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBookInstallSummary]
  }
}

