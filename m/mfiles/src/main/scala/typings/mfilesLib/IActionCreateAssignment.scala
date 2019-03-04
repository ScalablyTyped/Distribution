package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionCreateAssignment extends js.Object {
  var AssignedTo: IUserOrUserGroupIDExs
  var Deadline: scala.Boolean
  var DeadlineInDays: scala.Double
  var Description: java.lang.String
  var MonitoredBy: IUserOrUserGroupIDExs
  var Title: java.lang.String
  def Clone(): IActionCreateAssignment
}

object IActionCreateAssignment {
  @scala.inline
  def apply(
    AssignedTo: IUserOrUserGroupIDExs,
    Clone: js.Function0[IActionCreateAssignment],
    Deadline: scala.Boolean,
    DeadlineInDays: scala.Double,
    Description: java.lang.String,
    MonitoredBy: IUserOrUserGroupIDExs,
    Title: java.lang.String
  ): IActionCreateAssignment = {
    val __obj = js.Dynamic.literal(AssignedTo = AssignedTo, Clone = Clone, Deadline = Deadline, DeadlineInDays = DeadlineInDays, Description = Description, MonitoredBy = MonitoredBy, Title = Title)
  
    __obj.asInstanceOf[IActionCreateAssignment]
  }
}

