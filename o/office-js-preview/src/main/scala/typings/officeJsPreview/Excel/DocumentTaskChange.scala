package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.DocumentTaskChangeData
import typings.officeJsPreview.Excel.Interfaces.DocumentTaskChangeLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.anon.Expand
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
  * Represents a recorded change to the task.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait DocumentTaskChange
  extends StObject
     with ClientObject {
  
  /**
    * Represents the user assigned to the task for an `assign` change action, or the user unassigned from the task for an `unassign` change action.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val assignee: Identity = js.native
  
  /**
    * Represents the identity of the user who made the task change.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val changedBy: Identity = js.native
  
  /**
    * Represents the ID of the `comment` or `commentReply` to which the task change is anchored.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val commentId: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_DocumentTaskChange: RequestContext = js.native
  
  /**
    * Represents the creation date and time of the task change record. All dates are in UTC.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val createdDateTime: js.Date = js.native
  
  /**
    * Represents the task's due date and time. It is used for the `setSchedule` change action.
    It is in UTC time zone. It can be set to `null` to remove the due date and time. It should be set together with `startDateTime` to avoid conflicts.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val dueDateTime: js.Date = js.native
  
  /**
    * The unique GUID of the task change.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val id: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): DocumentTaskChange = js.native
  def load(options: DocumentTaskChangeLoadOptions): DocumentTaskChange = js.native
  def load(propertyNamesAndPaths: Expand): DocumentTaskChange = js.native
  def load(propertyNames: String): DocumentTaskChange = js.native
  def load(propertyNames: js.Array[String]): DocumentTaskChange = js.native
  
  /**
    * Represents the task's completion percentage. It is used for the `setPercentComplete` change action.
    This is a value between 0 and 100, where 100 represents a completed task. Changing this value to 100 also completes the associated comment. Changing the completion from 100 to a lower value reactivates the associated comment.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val percentComplete: Double = js.native
  
  /**
    * Represents the task's priority. It is used for the `setPriority` change action.
    This is a value between 0 and 10, with 5 being the default priority if not set, and where 0 represents the highest priority.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val priority: Double = js.native
  
  /**
    * Represents the task's start date and time. It is used for the `setSchedule` change action.
    It is in UTC time zone. It can be set to `null` to remove the start date and time. It should be set together with `dueDateTime` to avoid conflicts.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val startDateTime: js.Date = js.native
  
  /**
    * Represents the task's title. It is used for the `setTitle` change action.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val title: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.DocumentTaskChange object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.DocumentTaskChangeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): DocumentTaskChangeData = js.native
  
  /**
    * Represents the action type of the task change record. Some examples of action types are assign, undo, and setPriority.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val `type`: DocumentTaskChangeAction | unknown__ | create | assign | unassign | unassignAll | setSchedule | setPercentComplete | setPriority | remove | restore | setTitle | undo = js.native
  
  /**
    * Represents the `DocumentTaskChange.id` property that was undone for the `undo` change action.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val undoChangeId: String = js.native
}
