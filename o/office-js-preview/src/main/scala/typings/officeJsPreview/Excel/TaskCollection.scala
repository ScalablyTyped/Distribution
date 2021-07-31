package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.TaskCollectionData
import typings.officeJsPreview.Excel.Interfaces.TaskCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of tasks.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait TaskCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TaskCollection: RequestContext = js.native
  
  /**
    * Gets the number of tasks in the collection.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a task using its id.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param key The id of the task.
    * @returns The task with the given id. If there is no task with the given id, then an error is thrown.
    */
  def getItem(key: String): Task = js.native
  
  /**
    * Gets a task by its index in the collection.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param index The index of the task in the collection.
    * @returns The task with the given index.
    */
  def getItemAt(index: Double): Task = js.native
  
  /**
    * Gets a task using its id.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param key The id of the task.
    * @returns The task with the given id. If there is no task with the given id, an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    */
  def getItemOrNullObject(key: String): Task = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Task] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TaskCollection = js.native
  def load(options: TaskCollectionLoadOptions & CollectionLoadOptions): TaskCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): TaskCollection = js.native
  def load(propertyNames: String): TaskCollection = js.native
  def load(propertyNames: js.Array[String]): TaskCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.TaskCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TaskCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): TaskCollectionData = js.native
}
