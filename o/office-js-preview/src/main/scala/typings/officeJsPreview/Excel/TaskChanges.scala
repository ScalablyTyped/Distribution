package typings.officeJsPreview.Excel

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a set of intended changes for a task.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait TaskChanges extends StObject {
  
  /**
    *
    * Sets a new due date for the task, in UTC time zone. Can be set to `null` to remove the due date. Should be set together with `startDate` to avoid conflicts.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dueDate: js.UndefOr[Date] = js.undefined
  
  /**
    *
    * Sets email addresses of the users to assign to the task. The specified emails will be added to the existing assignees of the task unless `removeAllPreviousAssignees` property is set to `true`.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var emailsToAssign: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    *
    * Sets email addresses of the users to unassign from the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var emailsToUnassign: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    *
    * Sets a new completion percentage for the task. This is a value between 0 and 100, where 100 represents a completed task. Changing this value to 100 also completes the associated comment. Changing the completion from 100 to a lower value reactivates the associated comment.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var percentComplete: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Sets a new priority for the task. This is a value between 0 and 10, where 0 represents the highest priority.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Sets if the change should remove all previous assignees from the task. When this property is set to true, `emailsToUnassign` property will have no effect and emails specified in `emailsToAssign` property will become the only assignees.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var removeAllPreviousAssignees: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Sets a new start date for the task, in UTC time zone. Can be set to `null` to remove the start date. Should be set together with `dueDate` to avoid conflicts.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var startDate: js.UndefOr[Date] = js.undefined
  
  /**
    *
    * Sets a new title for the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var title: js.UndefOr[String] = js.undefined
}
object TaskChanges {
  
  @scala.inline
  def apply(): TaskChanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskChanges]
  }
  
  @scala.inline
  implicit class TaskChangesMutableBuilder[Self <: TaskChanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDueDate(value: Date): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
    
    @scala.inline
    def setEmailsToAssign(value: js.Array[String]): Self = StObject.set(x, "emailsToAssign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsToAssignUndefined: Self = StObject.set(x, "emailsToAssign", js.undefined)
    
    @scala.inline
    def setEmailsToAssignVarargs(value: String*): Self = StObject.set(x, "emailsToAssign", js.Array(value :_*))
    
    @scala.inline
    def setEmailsToUnassign(value: js.Array[String]): Self = StObject.set(x, "emailsToUnassign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsToUnassignUndefined: Self = StObject.set(x, "emailsToUnassign", js.undefined)
    
    @scala.inline
    def setEmailsToUnassignVarargs(value: String*): Self = StObject.set(x, "emailsToUnassign", js.Array(value :_*))
    
    @scala.inline
    def setPercentComplete(value: Double): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setRemoveAllPreviousAssignees(value: Boolean): Self = StObject.set(x, "removeAllPreviousAssignees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAllPreviousAssigneesUndefined: Self = StObject.set(x, "removeAllPreviousAssignees", js.undefined)
    
    @scala.inline
    def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
