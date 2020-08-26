package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceEnrollmentPlatformRestrictionsConfiguration extends DeviceEnrollmentConfiguration {
  // Not yet documented
  var androidRestriction: js.UndefOr[DeviceEnrollmentPlatformRestriction] = js.native
  // Not yet documented
  var iosRestriction: js.UndefOr[DeviceEnrollmentPlatformRestriction] = js.native
  // Not yet documented
  var macOSRestriction: js.UndefOr[DeviceEnrollmentPlatformRestriction] = js.native
  // Not yet documented
  var windowsMobileRestriction: js.UndefOr[DeviceEnrollmentPlatformRestriction] = js.native
  // Not yet documented
  var windowsRestriction: js.UndefOr[DeviceEnrollmentPlatformRestriction] = js.native
}

object DeviceEnrollmentPlatformRestrictionsConfiguration {
  @scala.inline
  def apply(): DeviceEnrollmentPlatformRestrictionsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEnrollmentPlatformRestrictionsConfiguration]
  }
  @scala.inline
  implicit class DeviceEnrollmentPlatformRestrictionsConfigurationOps[Self <: DeviceEnrollmentPlatformRestrictionsConfiguration] (val x: Self) extends AnyVal {
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
    def setAndroidRestriction(value: DeviceEnrollmentPlatformRestriction): Self = this.set("androidRestriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidRestriction: Self = this.set("androidRestriction", js.undefined)
    @scala.inline
    def setIosRestriction(value: DeviceEnrollmentPlatformRestriction): Self = this.set("iosRestriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosRestriction: Self = this.set("iosRestriction", js.undefined)
    @scala.inline
    def setMacOSRestriction(value: DeviceEnrollmentPlatformRestriction): Self = this.set("macOSRestriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMacOSRestriction: Self = this.set("macOSRestriction", js.undefined)
    @scala.inline
    def setWindowsMobileRestriction(value: DeviceEnrollmentPlatformRestriction): Self = this.set("windowsMobileRestriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowsMobileRestriction: Self = this.set("windowsMobileRestriction", js.undefined)
    @scala.inline
    def setWindowsRestriction(value: DeviceEnrollmentPlatformRestriction): Self = this.set("windowsRestriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowsRestriction: Self = this.set("windowsRestriction", js.undefined)
  }
  
}

