package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.DocumentTaskData
import typings.officeJsPreview.Excel.Interfaces.DocumentTaskLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a task.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait DocumentTask
  extends StObject
     with ClientObject {
  
  /**
    * Adds the given user to the list of assignees attached to the task.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param assignee The identity of the user to add to the assignee list.
    */
  def assign(assignee: EmailIdentity): Unit = js.native
  
  /**
    * Returns a collection of assignees of the task.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val assignees: js.Array[EmailIdentity] = js.native
  
  /**
    * Gets the change records of the task.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val changes: DocumentTaskChangeCollection = js.native
  
  /**
    * Gets the comment associated with the task.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val comment: Comment = js.native
  
  /**
    * Gets the most recent user to have completed the task.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val completedBy: EmailIdentity = js.native
  
  /**
    * Gets the date and time that the task was completed. All dates are in UTC.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val completedDateTime: js.Date = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_DocumentTask: RequestContext = js.native
  
  /**
    * Gets the user who created the task.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val createdBy: EmailIdentity = js.native
  
  /**
    * Gets the date and time that the task was created. All dates are in UTC.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val createdDateTime: js.Date = js.native
  
  /**
    * Gets the ID of the task.
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
  def load(): DocumentTask = js.native
  def load(options: DocumentTaskLoadOptions): DocumentTask = js.native
  def load(propertyNamesAndPaths: Expand): DocumentTask = js.native
  def load(propertyNames: String): DocumentTask = js.native
  def load(propertyNames: js.Array[String]): DocumentTask = js.native
  
  /**
    * Specifies the completion percentage of the task. This is a value between 0 and 100, where 100 represents a completed task.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var percentComplete: Double = js.native
  
  /**
    * Specifies the priority of the task. This is a value between 0 and 10, where 0 represents the highest priority.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var priority: Double = js.native
  
  /**
    * Gets or sets the date and time the task should start and is due.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var startAndDueDateTime: DocumentTaskSchedule = js.native
  
  /**
    * Specifies title of the task.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var title: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.DocumentTask object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.DocumentTaskData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): DocumentTaskData = js.native
  
  /**
    * Removes the given user from the list of assignees attached to the task.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param assignee The identity of the user to remove from the assignee list.
    */
  def unassign(assignee: EmailIdentity): Unit = js.native
  
  /**
    * Removes all users from the list of assignees attached to the task.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def unassignAll(): Unit = js.native
}
