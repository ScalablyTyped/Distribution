package typings.officeJsPreview.Excel

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a set of intended changes for a task.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait TaskChanges extends js.Object {
  
  /**
    *
    * Sets a new due date for the task, in UTC time zone. Can be set to `null` to remove the due date. Should be set together with `startDate` to avoid conflicts.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dueDate: js.UndefOr[Date] = js.native
  
  /**
    *
    * Sets email addresses of the users to assign to the task. The specified emails will be added to the existing assignees of the task unless `removeAllPreviousAssignees` property is set to `true`.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var emailsToAssign: js.UndefOr[js.Array[String]] = js.native
  
  /**
    *
    * Sets email addresses of the users to unassign from the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var emailsToUnassign: js.UndefOr[js.Array[String]] = js.native
  
  /**
    *
    * Sets a new completion percentage for the task. This is a value between 0 and 100, where 100 represents a completed task. Changing this value to 100 also completes the associated comment. Changing the completion from 100 to a lower value reactivates the associated comment.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var percentComplete: js.UndefOr[Double] = js.native
  
  /**
    *
    * Sets a new priority for the task. This is a value between 0 and 10, where 0 represents the highest priority.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var priority: js.UndefOr[Double] = js.native
  
  /**
    *
    * Sets if the change should remove all previous assignees from the task. When this property is set to true, `emailsToUnassign` property will have no effect and emails specified in `emailsToAssign` property will become the only assignees.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var removeAllPreviousAssignees: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Sets a new start date for the task, in UTC time zone. Can be set to `null` to remove the start date. Should be set together with `dueDate` to avoid conflicts.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var startDate: js.UndefOr[Date] = js.native
  
  /**
    *
    * Sets a new title for the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var title: js.UndefOr[String] = js.native
}
object TaskChanges {
  
  @scala.inline
  def apply(): TaskChanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskChanges]
  }
  
  @scala.inline
  implicit class TaskChangesOps[Self <: TaskChanges] (val x: Self) extends AnyVal {
    
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
    def setDueDate(value: Date): Self = this.set("dueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDueDate: Self = this.set("dueDate", js.undefined)
    
    @scala.inline
    def setEmailsToAssignVarargs(value: String*): Self = this.set("emailsToAssign", js.Array(value :_*))
    
    @scala.inline
    def setEmailsToAssign(value: js.Array[String]): Self = this.set("emailsToAssign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailsToAssign: Self = this.set("emailsToAssign", js.undefined)
    
    @scala.inline
    def setEmailsToUnassignVarargs(value: String*): Self = this.set("emailsToUnassign", js.Array(value :_*))
    
    @scala.inline
    def setEmailsToUnassign(value: js.Array[String]): Self = this.set("emailsToUnassign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailsToUnassign: Self = this.set("emailsToUnassign", js.undefined)
    
    @scala.inline
    def setPercentComplete(value: Double): Self = this.set("percentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentComplete: Self = this.set("percentComplete", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setRemoveAllPreviousAssignees(value: Boolean): Self = this.set("removeAllPreviousAssignees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveAllPreviousAssignees: Self = this.set("removeAllPreviousAssignees", js.undefined)
    
    @scala.inline
    def setStartDate(value: Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
