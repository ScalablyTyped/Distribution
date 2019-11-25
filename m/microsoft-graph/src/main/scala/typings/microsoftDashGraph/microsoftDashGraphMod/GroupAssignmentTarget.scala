package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupAssignmentTarget extends DeviceAndAppManagementAssignmentTarget {
  // The group Id that is the target of the assignment.
  var groupId: js.UndefOr[String] = js.undefined
}

object GroupAssignmentTarget {
  @scala.inline
  def apply(groupId: String = null): GroupAssignmentTarget = {
    val __obj = js.Dynamic.literal()
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupAssignmentTarget]
  }
}

