package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlannerAssignment extends js.Object {
  
  // The identity of the user that performed the assignment of the task, i.e. the assignor.
  var assignedBy: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  /**
    * The time at which the task was assigned. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var assignedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Hint used to order assignees in a task. The format is defined as outlined here.
  var orderHint: js.UndefOr[NullableOption[String]] = js.native
}
object PlannerAssignment {
  
  @scala.inline
  def apply(): PlannerAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerAssignment]
  }
  
  @scala.inline
  implicit class PlannerAssignmentOps[Self <: PlannerAssignment] (val x: Self) extends AnyVal {
    
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
    def setAssignedBy(value: NullableOption[IdentitySet]): Self = this.set("assignedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedBy: Self = this.set("assignedBy", js.undefined)
    
    @scala.inline
    def setAssignedByNull: Self = this.set("assignedBy", null)
    
    @scala.inline
    def setAssignedDateTime(value: NullableOption[String]): Self = this.set("assignedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedDateTime: Self = this.set("assignedDateTime", js.undefined)
    
    @scala.inline
    def setAssignedDateTimeNull: Self = this.set("assignedDateTime", null)
    
    @scala.inline
    def setOrderHint(value: NullableOption[String]): Self = this.set("orderHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderHint: Self = this.set("orderHint", js.undefined)
    
    @scala.inline
    def setOrderHintNull: Self = this.set("orderHint", null)
  }
}
