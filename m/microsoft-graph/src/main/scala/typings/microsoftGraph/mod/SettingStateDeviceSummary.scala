package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingStateDeviceSummary extends Entity {
  // Device Compliant count for the setting
  var compliantDeviceCount: js.UndefOr[Double] = js.native
  // Device conflict error count for the setting
  var conflictDeviceCount: js.UndefOr[Double] = js.native
  // Device error count for the setting
  var errorDeviceCount: js.UndefOr[Double] = js.native
  // Name of the InstancePath for the setting
  var instancePath: js.UndefOr[String] = js.native
  // Device NonCompliant count for the setting
  var nonCompliantDeviceCount: js.UndefOr[Double] = js.native
  // Device Not Applicable count for the setting
  var notApplicableDeviceCount: js.UndefOr[Double] = js.native
  // Device Compliant count for the setting
  var remediatedDeviceCount: js.UndefOr[Double] = js.native
  // Name of the setting
  var settingName: js.UndefOr[String] = js.native
  // Device Unkown count for the setting
  var unknownDeviceCount: js.UndefOr[Double] = js.native
}

object SettingStateDeviceSummary {
  @scala.inline
  def apply(): SettingStateDeviceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingStateDeviceSummary]
  }
  @scala.inline
  implicit class SettingStateDeviceSummaryOps[Self <: SettingStateDeviceSummary] (val x: Self) extends AnyVal {
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
    def setCompliantDeviceCount(value: Double): Self = this.set("compliantDeviceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompliantDeviceCount: Self = this.set("compliantDeviceCount", js.undefined)
    @scala.inline
    def setConflictDeviceCount(value: Double): Self = this.set("conflictDeviceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConflictDeviceCount: Self = this.set("conflictDeviceCount", js.undefined)
    @scala.inline
    def setErrorDeviceCount(value: Double): Self = this.set("errorDeviceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorDeviceCount: Self = this.set("errorDeviceCount", js.undefined)
    @scala.inline
    def setInstancePath(value: String): Self = this.set("instancePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancePath: Self = this.set("instancePath", js.undefined)
    @scala.inline
    def setNonCompliantDeviceCount(value: Double): Self = this.set("nonCompliantDeviceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonCompliantDeviceCount: Self = this.set("nonCompliantDeviceCount", js.undefined)
    @scala.inline
    def setNotApplicableDeviceCount(value: Double): Self = this.set("notApplicableDeviceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotApplicableDeviceCount: Self = this.set("notApplicableDeviceCount", js.undefined)
    @scala.inline
    def setRemediatedDeviceCount(value: Double): Self = this.set("remediatedDeviceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemediatedDeviceCount: Self = this.set("remediatedDeviceCount", js.undefined)
    @scala.inline
    def setSettingName(value: String): Self = this.set("settingName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingName: Self = this.set("settingName", js.undefined)
    @scala.inline
    def setUnknownDeviceCount(value: Double): Self = this.set("unknownDeviceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnknownDeviceCount: Self = this.set("unknownDeviceCount", js.undefined)
  }
  
}

