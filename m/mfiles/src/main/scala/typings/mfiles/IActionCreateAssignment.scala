package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionCreateAssignment extends js.Object {
  var AssignedTo: IUserOrUserGroupIDExs
  var Deadline: Boolean
  var DeadlineInDays: Double
  var Description: String
  var MonitoredBy: IUserOrUserGroupIDExs
  var Title: String
  def Clone(): IActionCreateAssignment
}

object IActionCreateAssignment {
  @scala.inline
  def apply(
    AssignedTo: IUserOrUserGroupIDExs,
    Clone: () => IActionCreateAssignment,
    Deadline: Boolean,
    DeadlineInDays: Double,
    Description: String,
    MonitoredBy: IUserOrUserGroupIDExs,
    Title: String
  ): IActionCreateAssignment = {
    val __obj = js.Dynamic.literal(AssignedTo = AssignedTo.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Deadline = Deadline.asInstanceOf[js.Any], DeadlineInDays = DeadlineInDays.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], MonitoredBy = MonitoredBy.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionCreateAssignment]
  }
}

