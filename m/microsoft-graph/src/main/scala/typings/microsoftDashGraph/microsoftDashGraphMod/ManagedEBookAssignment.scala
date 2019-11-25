package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedEBookAssignment extends Entity {
  // The install intent for eBook. Possible values are: available, required, uninstall, availableWithoutEnrollment.
  var installIntent: js.UndefOr[InstallIntent] = js.undefined
  // The assignment target for eBook.
  var target: js.UndefOr[DeviceAndAppManagementAssignmentTarget] = js.undefined
}

object ManagedEBookAssignment {
  @scala.inline
  def apply(
    id: String = null,
    installIntent: InstallIntent = null,
    target: DeviceAndAppManagementAssignmentTarget = null
  ): ManagedEBookAssignment = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (installIntent != null) __obj.updateDynamic("installIntent")(installIntent.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedEBookAssignment]
  }
}

