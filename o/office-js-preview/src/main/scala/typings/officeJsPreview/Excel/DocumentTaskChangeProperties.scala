package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.assign
import typings.officeJsPreview.officeJsPreviewStrings.create
import typings.officeJsPreview.officeJsPreviewStrings.remove
import typings.officeJsPreview.officeJsPreviewStrings.restore
import typings.officeJsPreview.officeJsPreviewStrings.setPercentComplete
import typings.officeJsPreview.officeJsPreviewStrings.setPriority
import typings.officeJsPreview.officeJsPreviewStrings.setSchedule
import typings.officeJsPreview.officeJsPreviewStrings.setTitle
import typings.officeJsPreview.officeJsPreviewStrings.unassign
import typings.officeJsPreview.officeJsPreviewStrings.unassignAll
import typings.officeJsPreview.officeJsPreviewStrings.undo
import typings.officeJsPreview.officeJsPreviewStrings.unknown__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a recorded change to the task, to be used as an input parameter.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait DocumentTaskChangeProperties extends StObject {
  
  /**
    * Represents the user assigned to the task for an `assign` change action, or the user unassigned from the task for an `unassign` change action.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var assignee: js.UndefOr[EmailIdentity] = js.undefined
  
  /**
    * Represents the identity of the user who made the task change.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var changedBy: EmailIdentity
  
  /**
    * Represents the ID of the `comment` or `commentReply` to which the task change is anchored.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var commentId: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the creation date and time of the task change record. All dates are in UTC.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var createdDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Represents the task's due date and time. It is used for the `setSchedule` change action.
    It is in UTC time zone. It can be set to `null` to remove the due date and time. It should be set together with `startDateTime` to avoid conflicts.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dueDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique GUID of the task change.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: String
  
  /**
    * Represents the task's completion percentage. It is used for the `setPercentComplete` change action.
    This is a value betwen 0 and 100, where 100 represents a completed task. Changing this value to 100 also completes the associated comment. Changing the completion from 100 to a lower value reactivates the associated comment.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var percentComplete: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the task's priority. It is used for the `setPriority` change action.
    This is a value between 0 and 10, with 5 being the default priority if not set, and where 0 represents the highest priority.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the task's start date and time. It is used for the `setSchedule` change action.
    It is in UTC time zone. It can be set to `null` to remove the start date and time. It should be set together with `dueDateTime` to avoid conflicts.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var startDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Represents the task's title. It is used for the `setTitle` change action.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the action type of the task change record. Some examples of action types are assign, undo, and setPriority.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: DocumentTaskChangeAction | unknown__ | create | assign | unassign | unassignAll | setSchedule | setPercentComplete | setPriority | remove | restore | setTitle | undo
  
  /**
    * Represents the `DocumentTaskChange.id` property that was undone for the `undo` change action.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var undoChangeId: js.UndefOr[String] = js.undefined
}
object DocumentTaskChangeProperties {
  
  inline def apply(
    changedBy: EmailIdentity,
    id: String,
    `type`: DocumentTaskChangeAction | unknown__ | create | assign | unassign | unassignAll | setSchedule | setPercentComplete | setPriority | remove | restore | setTitle | undo
  ): DocumentTaskChangeProperties = {
    val __obj = js.Dynamic.literal(changedBy = changedBy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentTaskChangeProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentTaskChangeProperties] (val x: Self) extends AnyVal {
    
    inline def setAssignee(value: EmailIdentity): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    inline def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
    
    inline def setChangedBy(value: EmailIdentity): Self = StObject.set(x, "changedBy", value.asInstanceOf[js.Any])
    
    inline def setCommentId(value: String): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    inline def setCommentIdUndefined: Self = StObject.set(x, "commentId", js.undefined)
    
    inline def setCreatedDateTime(value: js.Date): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDueDateTime(value: js.Date): Self = StObject.set(x, "dueDateTime", value.asInstanceOf[js.Any])
    
    inline def setDueDateTimeUndefined: Self = StObject.set(x, "dueDateTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPercentComplete(value: Double): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    inline def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setStartDateTime(value: js.Date): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(
      value: DocumentTaskChangeAction | unknown__ | create | assign | unassign | unassignAll | setSchedule | setPercentComplete | setPriority | remove | restore | setTitle | undo
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUndoChangeId(value: String): Self = StObject.set(x, "undoChangeId", value.asInstanceOf[js.Any])
    
    inline def setUndoChangeIdUndefined: Self = StObject.set(x, "undoChangeId", js.undefined)
  }
}
