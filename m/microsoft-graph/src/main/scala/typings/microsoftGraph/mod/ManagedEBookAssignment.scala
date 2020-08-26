package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedEBookAssignment extends Entity {
  // The install intent for eBook. Possible values are: available, required, uninstall, availableWithoutEnrollment.
  var installIntent: js.UndefOr[InstallIntent] = js.native
  // The assignment target for eBook.
  var target: js.UndefOr[DeviceAndAppManagementAssignmentTarget] = js.native
}

object ManagedEBookAssignment {
  @scala.inline
  def apply(): ManagedEBookAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedEBookAssignment]
  }
  @scala.inline
  implicit class ManagedEBookAssignmentOps[Self <: ManagedEBookAssignment] (val x: Self) extends AnyVal {
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
    def setInstallIntent(value: InstallIntent): Self = this.set("installIntent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallIntent: Self = this.set("installIntent", js.undefined)
    @scala.inline
    def setTarget(value: DeviceAndAppManagementAssignmentTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

