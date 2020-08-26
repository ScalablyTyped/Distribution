package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceManagementSettings extends js.Object {
  // The number of days a device is allowed to go without checking in to remain compliant. Valid values 0 to 120
  var deviceComplianceCheckinThresholdDays: js.UndefOr[Double] = js.native
  // Is feature enabled or not for scheduled action for rule.
  var isScheduledActionEnabled: js.UndefOr[Boolean] = js.native
  // Device should be noncompliant when there is no compliance policy targeted when this is true
  var secureByDefault: js.UndefOr[Boolean] = js.native
}

object DeviceManagementSettings {
  @scala.inline
  def apply(): DeviceManagementSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceManagementSettings]
  }
  @scala.inline
  implicit class DeviceManagementSettingsOps[Self <: DeviceManagementSettings] (val x: Self) extends AnyVal {
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
    def setDeviceComplianceCheckinThresholdDays(value: Double): Self = this.set("deviceComplianceCheckinThresholdDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceComplianceCheckinThresholdDays: Self = this.set("deviceComplianceCheckinThresholdDays", js.undefined)
    @scala.inline
    def setIsScheduledActionEnabled(value: Boolean): Self = this.set("isScheduledActionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsScheduledActionEnabled: Self = this.set("isScheduledActionEnabled", js.undefined)
    @scala.inline
    def setSecureByDefault(value: Boolean): Self = this.set("secureByDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureByDefault: Self = this.set("secureByDefault", js.undefined)
  }
  
}

