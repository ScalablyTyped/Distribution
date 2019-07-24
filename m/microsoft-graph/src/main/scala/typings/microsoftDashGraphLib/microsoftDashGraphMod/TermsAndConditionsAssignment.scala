package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TermsAndConditionsAssignment extends Entity {
  // Assignment target that the T&amp;C policy is assigned to.
  var target: js.UndefOr[DeviceAndAppManagementAssignmentTarget] = js.undefined
}

object TermsAndConditionsAssignment {
  @scala.inline
  def apply(id: java.lang.String = null, target: DeviceAndAppManagementAssignmentTarget = null): TermsAndConditionsAssignment = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[TermsAndConditionsAssignment]
  }
}

