package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.TaskHistoryRecordType
import typings.officeJsPreview.Excel.User
import typings.officeJsPreview.officeJsPreviewStrings.Assign
import typings.officeJsPreview.officeJsPreviewStrings.Create
import typings.officeJsPreview.officeJsPreviewStrings.Delete
import typings.officeJsPreview.officeJsPreviewStrings.Priority
import typings.officeJsPreview.officeJsPreviewStrings.Progress
import typings.officeJsPreview.officeJsPreviewStrings.Schedule
import typings.officeJsPreview.officeJsPreviewStrings.SetTitle
import typings.officeJsPreview.officeJsPreviewStrings.Unassign
import typings.officeJsPreview.officeJsPreviewStrings.UnassignAll
import typings.officeJsPreview.officeJsPreviewStrings.Undelete
import typings.officeJsPreview.officeJsPreviewStrings.Undo
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `taskHistoryRecord.toJSON()`. */
trait TaskHistoryRecordData extends StObject {
  
  /**
    *
    * Represents the ID of the object to which the task is anchored (e.g., commentId for tasks attached to comments).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var anchorId: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents the user assigned to the task for an "Assign" history record type, or the user to unassign from the task for an "Unassign" history record type.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var assignee: js.UndefOr[User] = js.undefined
  
  /**
    *
    * Represents the user who created or changed the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var attributionUser: js.UndefOr[User] = js.undefined
  
  /**
    *
    * Represents the task's due date. It is used for "Schedule" history record type.
    It is in UTC time zone. Can be set to `null` to remove the due date. It should be set together with `startDate` to avoid conflicts.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dueDate: js.UndefOr[Date] = js.undefined
  
  /**
    *
    * Represents creation date of the task history record. All dates are in UTC.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var historyRecordCreatedDate: js.UndefOr[Date] = js.undefined
  
  /**
    *
    * ID for the history record.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents the task's completion percentage. It is used for the "Progress" history record type.
    This is a value between 0 and 100, where 100 represents a completed task. Changing this value to 100 also completes the associated comment. Changing the completion from 100 to a lower value reactivates the associated comment.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var percentComplete: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents the task's priority. It is used for the "Priority" history record type.
    This is a value between 0 and 10 with 5 being the default priority if not set, where 0 represents the highest priority.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents the task's start date. It is used for the "Schedule" history record type.
    It is in UTC time zone. Can be set to `null` to remove the start date. It should be set together with `dueDate` to avoid conflicts.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var startDate: js.UndefOr[Date] = js.undefined
  
  /**
    *
    * Represents the task's title. It is used for "Title" history record type.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents task history record's type.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: js.UndefOr[
    TaskHistoryRecordType | Unknown_ | Create | Assign | Unassign | UnassignAll | Schedule | Progress | Priority | Delete | Undelete | SetTitle | Undo
  ] = js.undefined
  
  /**
    *
    * Represents the TaskHistoryRecord.id property that was undone for the "Undo" history record type.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var undoHistoryId: js.UndefOr[String] = js.undefined
}
object TaskHistoryRecordData {
  
  @scala.inline
  def apply(): TaskHistoryRecordData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskHistoryRecordData]
  }
  
  @scala.inline
  implicit class TaskHistoryRecordDataMutableBuilder[Self <: TaskHistoryRecordData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorId(value: String): Self = StObject.set(x, "anchorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorIdUndefined: Self = StObject.set(x, "anchorId", js.undefined)
    
    @scala.inline
    def setAssignee(value: User): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
    
    @scala.inline
    def setAttributionUser(value: User): Self = StObject.set(x, "attributionUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionUserUndefined: Self = StObject.set(x, "attributionUser", js.undefined)
    
    @scala.inline
    def setDueDate(value: Date): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
    
    @scala.inline
    def setHistoryRecordCreatedDate(value: Date): Self = StObject.set(x, "historyRecordCreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryRecordCreatedDateUndefined: Self = StObject.set(x, "historyRecordCreatedDate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPercentComplete(value: Double): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(
      value: TaskHistoryRecordType | Unknown_ | Create | Assign | Unassign | UnassignAll | Schedule | Progress | Priority | Delete | Undelete | SetTitle | Undo
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUndoHistoryId(value: String): Self = StObject.set(x, "undoHistoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndoHistoryIdUndefined: Self = StObject.set(x, "undoHistoryId", js.undefined)
  }
}
