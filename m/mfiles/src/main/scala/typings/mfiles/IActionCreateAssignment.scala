package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActionCreateAssignment extends js.Object {
  var AssignedTo: IUserOrUserGroupIDExs = js.native
  var Deadline: Boolean = js.native
  var DeadlineInDays: Double = js.native
  var Description: String = js.native
  var MonitoredBy: IUserOrUserGroupIDExs = js.native
  var Title: String = js.native
  def Clone(): IActionCreateAssignment = js.native
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
  @scala.inline
  implicit class IActionCreateAssignmentOps[Self <: IActionCreateAssignment] (val x: Self) extends AnyVal {
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
    def setAssignedTo(value: IUserOrUserGroupIDExs): Self = this.set("AssignedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setClone(value: () => IActionCreateAssignment): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setDeadline(value: Boolean): Self = this.set("Deadline", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeadlineInDays(value: Double): Self = this.set("DeadlineInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonitoredBy(value: IUserOrUserGroupIDExs): Self = this.set("MonitoredBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
  }
  
}

