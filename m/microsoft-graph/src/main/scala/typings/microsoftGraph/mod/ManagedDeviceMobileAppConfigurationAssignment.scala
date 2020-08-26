package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedDeviceMobileAppConfigurationAssignment extends Entity {
  // Assignment target that the T&amp;C policy is assigned to.
  var target: js.UndefOr[DeviceAndAppManagementAssignmentTarget] = js.native
}

object ManagedDeviceMobileAppConfigurationAssignment {
  @scala.inline
  def apply(): ManagedDeviceMobileAppConfigurationAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedDeviceMobileAppConfigurationAssignment]
  }
  @scala.inline
  implicit class ManagedDeviceMobileAppConfigurationAssignmentOps[Self <: ManagedDeviceMobileAppConfigurationAssignment] (val x: Self) extends AnyVal {
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
    def setTarget(value: DeviceAndAppManagementAssignmentTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

