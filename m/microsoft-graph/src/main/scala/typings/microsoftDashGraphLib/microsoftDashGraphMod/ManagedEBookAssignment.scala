package typings
package microsoftDashGraphLib.microsoftDashGraphMod

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
    id: java.lang.String = null,
    installIntent: InstallIntent = null,
    target: DeviceAndAppManagementAssignmentTarget = null
  ): ManagedEBookAssignment = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (installIntent != null) __obj.updateDynamic("installIntent")(installIntent)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ManagedEBookAssignment]
  }
}

