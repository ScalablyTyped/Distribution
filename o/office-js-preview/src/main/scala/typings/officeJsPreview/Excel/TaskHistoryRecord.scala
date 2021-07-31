package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.TaskHistoryRecordData
import typings.officeJsPreview.Excel.Interfaces.TaskHistoryRecordLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.anon.Expand
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

/**
  *
  * Represents a recorded change to the task.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait TaskHistoryRecord
  extends StObject
     with ClientObject {
  
  /**
    *
    * Represents the ID of the object to which the task is anchored (e.g., commentId for tasks attached to comments).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var anchorId: String = js.native
  
  /**
    *
    * Represents the user assigned to the task for an "Assign" history record type, or the user to unassign from the task for an "Unassign" history record type.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var assignee: User = js.native
  
  /**
    *
    * Represents the user who created or changed the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var attributionUser: User = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TaskHistoryRecord: RequestContext = js.native
  
  /**
    *
    * Represents the task's due date. It is used for "Schedule" history record type.
    It is in UTC time zone. Can be set to `null` to remove the due date. It should be set together with `startDate` to avoid conflicts.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dueDate: Date = js.native
  
  /**
    *
    * Represents creation date of the task history record. All dates are in UTC.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var historyRecordCreatedDate: Date = js.native
  
  /**
    *
    * ID for the history record.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TaskHistoryRecord = js.native
  def load(options: TaskHistoryRecordLoadOptions): TaskHistoryRecord = js.native
  def load(propertyNamesAndPaths: Expand): TaskHistoryRecord = js.native
  def load(propertyNames: String): TaskHistoryRecord = js.native
  def load(propertyNames: js.Array[String]): TaskHistoryRecord = js.native
  
  /**
    *
    * Represents the task's completion percentage. It is used for the "Progress" history record type.
    This is a value between 0 and 100, where 100 represents a completed task. Changing this value to 100 also completes the associated comment. Changing the completion from 100 to a lower value reactivates the associated comment.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var percentComplete: Double = js.native
  
  /**
    *
    * Represents the task's priority. It is used for the "Priority" history record type.
    This is a value between 0 and 10 with 5 being the default priority if not set, where 0 represents the highest priority.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var priority: Double = js.native
  
  /**
    *
    * Represents the task's start date. It is used for the "Schedule" history record type.
    It is in UTC time zone. Can be set to `null` to remove the start date. It should be set together with `dueDate` to avoid conflicts.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var startDate: Date = js.native
  
  /**
    *
    * Represents the task's title. It is used for "Title" history record type.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var title: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.TaskHistoryRecord object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TaskHistoryRecordData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TaskHistoryRecordData = js.native
  
  /**
    *
    * Represents task history record's type.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: TaskHistoryRecordType | Unknown_ | Create | Assign | Unassign | UnassignAll | Schedule | Progress | Priority | Delete | Undelete | SetTitle | Undo = js.native
  
  /**
    *
    * Represents the TaskHistoryRecord.id property that was undone for the "Undo" history record type.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var undoHistoryId: String = js.native
}
