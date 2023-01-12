package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a recorded change to the task.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait DocumentTaskChangeLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the user assigned to the task for an `assign` change action, or the user unassigned from the task for an `unassign` change action.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var assignee: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the identity of the user who made the task change.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var changedBy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the ID of the `comment` or `commentReply` to which the task change is anchored.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var commentId: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the creation date and time of the task change record. All dates are in UTC.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var createdDateTime: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the task's due date and time. It is used for the `setSchedule` change action.
    It is in UTC time zone. It can be set to `null` to remove the due date and time. It should be set together with `startDateTime` to avoid conflicts.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dueDateTime: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The unique GUID of the task change.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the task's completion percentage. It is used for the `setPercentComplete` change action.
    This is a value between 0 and 100, where 100 represents a completed task. Changing this value to 100 also completes the associated comment. Changing the completion from 100 to a lower value reactivates the associated comment.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var percentComplete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the task's priority. It is used for the `setPriority` change action.
    This is a value between 0 and 10, with 5 being the default priority if not set, and where 0 represents the highest priority.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var priority: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the task's start date and time. It is used for the `setSchedule` change action.
    It is in UTC time zone. It can be set to `null` to remove the start date and time. It should be set together with `dueDateTime` to avoid conflicts.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var startDateTime: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the task's title. It is used for the `setTitle` change action.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var title: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the action type of the task change record. Some examples of action types are assign, undo, and setPriority.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the `DocumentTaskChange.id` property that was undone for the `undo` change action.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var undoChangeId: js.UndefOr[Boolean] = js.undefined
}
object DocumentTaskChangeLoadOptions {
  
  inline def apply(): DocumentTaskChangeLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTaskChangeLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentTaskChangeLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAssignee(value: Boolean): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    inline def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
    
    inline def setChangedBy(value: Boolean): Self = StObject.set(x, "changedBy", value.asInstanceOf[js.Any])
    
    inline def setChangedByUndefined: Self = StObject.set(x, "changedBy", js.undefined)
    
    inline def setCommentId(value: Boolean): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    inline def setCommentIdUndefined: Self = StObject.set(x, "commentId", js.undefined)
    
    inline def setCreatedDateTime(value: Boolean): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDueDateTime(value: Boolean): Self = StObject.set(x, "dueDateTime", value.asInstanceOf[js.Any])
    
    inline def setDueDateTimeUndefined: Self = StObject.set(x, "dueDateTime", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPercentComplete(value: Boolean): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    inline def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
    
    inline def setPriority(value: Boolean): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setStartDateTime(value: Boolean): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUndoChangeId(value: Boolean): Self = StObject.set(x, "undoChangeId", value.asInstanceOf[js.Any])
    
    inline def setUndoChangeIdUndefined: Self = StObject.set(x, "undoChangeId", js.undefined)
  }
}
