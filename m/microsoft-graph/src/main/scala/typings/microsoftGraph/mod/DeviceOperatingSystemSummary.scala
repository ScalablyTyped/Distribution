package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceOperatingSystemSummary extends js.Object {
  // Number of android device count.
  var androidCount: js.UndefOr[Double] = js.native
  // Number of iOS device count.
  var iosCount: js.UndefOr[Double] = js.native
  // Number of Mac OS X device count.
  var macOSCount: js.UndefOr[Double] = js.native
  // Number of unknown device count.
  var unknownCount: js.UndefOr[Double] = js.native
  // Number of Windows device count.
  var windowsCount: js.UndefOr[Double] = js.native
  // Number of Windows mobile device count.
  var windowsMobileCount: js.UndefOr[Double] = js.native
}

object DeviceOperatingSystemSummary {
  @scala.inline
  def apply(): DeviceOperatingSystemSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceOperatingSystemSummary]
  }
  @scala.inline
  implicit class DeviceOperatingSystemSummaryOps[Self <: DeviceOperatingSystemSummary] (val x: Self) extends AnyVal {
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
    def setAndroidCount(value: Double): Self = this.set("androidCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidCount: Self = this.set("androidCount", js.undefined)
    @scala.inline
    def setIosCount(value: Double): Self = this.set("iosCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosCount: Self = this.set("iosCount", js.undefined)
    @scala.inline
    def setMacOSCount(value: Double): Self = this.set("macOSCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMacOSCount: Self = this.set("macOSCount", js.undefined)
    @scala.inline
    def setUnknownCount(value: Double): Self = this.set("unknownCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnknownCount: Self = this.set("unknownCount", js.undefined)
    @scala.inline
    def setWindowsCount(value: Double): Self = this.set("windowsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowsCount: Self = this.set("windowsCount", js.undefined)
    @scala.inline
    def setWindowsMobileCount(value: Double): Self = this.set("windowsMobileCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowsMobileCount: Self = this.set("windowsMobileCount", js.undefined)
  }
  
}

