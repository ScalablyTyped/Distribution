package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsInformationProtectionAppLearningSummary extends Entity {
  // Application Name
  var applicationName: js.UndefOr[String] = js.native
  // Application Type. Possible values are: universal, desktop.
  var applicationType: js.UndefOr[ApplicationType] = js.native
  // Device Count
  var deviceCount: js.UndefOr[Double] = js.native
}

object WindowsInformationProtectionAppLearningSummary {
  @scala.inline
  def apply(): WindowsInformationProtectionAppLearningSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionAppLearningSummary]
  }
  @scala.inline
  implicit class WindowsInformationProtectionAppLearningSummaryOps[Self <: WindowsInformationProtectionAppLearningSummary] (val x: Self) extends AnyVal {
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
    def setApplicationName(value: String): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationName: Self = this.set("applicationName", js.undefined)
    @scala.inline
    def setApplicationType(value: ApplicationType): Self = this.set("applicationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationType: Self = this.set("applicationType", js.undefined)
    @scala.inline
    def setDeviceCount(value: Double): Self = this.set("deviceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceCount: Self = this.set("deviceCount", js.undefined)
  }
  
}

