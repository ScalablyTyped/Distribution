package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EBookInstallSummary extends Entity {
  // Number of Devices that have failed to install this book.
  var failedDeviceCount: js.UndefOr[Double] = js.native
  // Number of Users that have 1 or more device that failed to install this book.
  var failedUserCount: js.UndefOr[Double] = js.native
  // Number of Devices that have successfully installed this book.
  var installedDeviceCount: js.UndefOr[Double] = js.native
  // Number of Users whose devices have all succeeded to install this book.
  var installedUserCount: js.UndefOr[Double] = js.native
  // Number of Devices that does not have this book installed.
  var notInstalledDeviceCount: js.UndefOr[Double] = js.native
  // Number of Users that did not install this book.
  var notInstalledUserCount: js.UndefOr[Double] = js.native
}

object EBookInstallSummary {
  @scala.inline
  def apply(): EBookInstallSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EBookInstallSummary]
  }
  @scala.inline
  implicit class EBookInstallSummaryOps[Self <: EBookInstallSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFailedDeviceCount(value: Double): Self = this.set("failedDeviceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedDeviceCount: Self = this.set("failedDeviceCount", js.undefined)
    @scala.inline
    def setFailedUserCount(value: Double): Self = this.set("failedUserCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedUserCount: Self = this.set("failedUserCount", js.undefined)
    @scala.inline
    def setInstalledDeviceCount(value: Double): Self = this.set("installedDeviceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstalledDeviceCount: Self = this.set("installedDeviceCount", js.undefined)
    @scala.inline
    def setInstalledUserCount(value: Double): Self = this.set("installedUserCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstalledUserCount: Self = this.set("installedUserCount", js.undefined)
    @scala.inline
    def setNotInstalledDeviceCount(value: Double): Self = this.set("notInstalledDeviceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotInstalledDeviceCount: Self = this.set("notInstalledDeviceCount", js.undefined)
    @scala.inline
    def setNotInstalledUserCount(value: Double): Self = this.set("notInstalledUserCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotInstalledUserCount: Self = this.set("notInstalledUserCount", js.undefined)
  }
  
}

