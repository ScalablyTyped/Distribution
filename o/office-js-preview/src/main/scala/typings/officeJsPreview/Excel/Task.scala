package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.TaskData
import typings.officeJsPreview.Excel.Interfaces.TaskLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.anon.Expand
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a task.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait Task extends ClientObject {
  
  /**
    * Adds an assignee to the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param email Email address of the assignee.
    */
  def addAssignee(email: String): Unit = js.native
  
  /**
    * Applies the given changes to the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param taskChanges A set of changes to apply to the task as a single action.
    */
  def applyChanges(taskChanges: TaskChanges): Unit = js.native
  
  /**
    *
    * Gets the users to whom the task is assigned.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val assignees: js.Array[User] = js.native
  
  /**
    *
    * Gets the comment associated with the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val comment: Comment = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Task: RequestContext = js.native
  
  /**
    *
    * Gets the date and time the task is due. All dates are in UTC.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val dueDate: Date = js.native
  
  /**
    *
    * Gets the history records of the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val historyRecords: TaskHistoryRecordCollection = js.native
  
  /**
    *
    * Gets the id of the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val id: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Task = js.native
  def load(options: TaskLoadOptions): Task = js.native
  def load(propertyNamesAndPaths: Expand): Task = js.native
  def load(propertyNames: String): Task = js.native
  def load(propertyNames: js.Array[String]): Task = js.native
  
  /**
    *
    * Gets the completion percentage of the task. This is a value between 0 and 100, where 100 represents a completed task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val percentComplete: Double = js.native
  
  /**
    *
    * Gets the priority of the task. This is a value between 0 and 10, where 0 represents the highest priority.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val priority: Double = js.native
  
  /**
    * Removes all assignees from the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def removeAllAssignees(): Unit = js.native
  
  /**
    * Removes an assignee from the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param email Email address of the assignee.
    */
  def removeAssignee(email: String): Unit = js.native
  
  /**
    * Changes the completion of the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param percentComplete New percentage completion of the task. This is a value between 0 and 100, where 100 represents a completed task. Changing this value to 100 will also complete the associated comment, and changing to another value will reactivate the associated comment.
    */
  def setPercentComplete(percentComplete: Double): Unit = js.native
  
  /**
    * Changes the priority of the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param priority New priority of the task. This is a value between 0 and 10, where 0 represents the highest priority.
    */
  def setPriority(priority: Double): Unit = js.native
  
  /**
    * Changes the start and the due dates of the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param startDate Represents the start date of the task in UTC time zone. Can be set to null to remove the start date.
    * @param dueDate Represents the due date of the task in UTC time zone. Can be set to null to remove the due date.
    */
  def setStartDateAndDueDate(startDate: Date, dueDate: Date): Unit = js.native
  
  /**
    * Changes the title of the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param title New title of the task.
    */
  def setTitle(title: String): Unit = js.native
  
  /**
    *
    * Gets the date and time the task should start. All dates are in UTC.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val startDate: Date = js.native
  
  /**
    *
    * Gets title of the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val title: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Task object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TaskData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TaskData = js.native
}
