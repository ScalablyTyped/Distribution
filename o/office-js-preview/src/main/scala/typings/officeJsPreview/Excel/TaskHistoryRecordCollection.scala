package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.TaskHistoryRecordCollectionData
import typings.officeJsPreview.Excel.Interfaces.TaskHistoryRecordCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of history records for a task.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait TaskHistoryRecordCollection extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TaskHistoryRecordCollection: RequestContext = js.native
  
  /**
    * Gets the number of history records in the collection for the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a task history record by using its index in the collection.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param index The records are stored in chronological order of when the changes were recorded by Excel (not necessarily ordered by historyRecordCreatedDate). The "Create" record is always at index 0.
    * @returns The history record with the given index.
    */
  def getItemAt(index: Double): TaskHistoryRecord = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[TaskHistoryRecord] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TaskHistoryRecordCollection = js.native
  def load(options: TaskHistoryRecordCollectionLoadOptions with CollectionLoadOptions): TaskHistoryRecordCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): TaskHistoryRecordCollection = js.native
  def load(propertyNames: String): TaskHistoryRecordCollection = js.native
  def load(propertyNames: js.Array[String]): TaskHistoryRecordCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.TaskHistoryRecordCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TaskHistoryRecordCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): TaskHistoryRecordCollectionData = js.native
}
