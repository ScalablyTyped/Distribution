package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.DocumentTaskCollectionData
import typings.officeJsPreview.Excel.Interfaces.DocumentTaskCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of tasks.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait DocumentTaskCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_DocumentTaskCollection: RequestContext = js.native
  
  /**
    * Gets the number of tasks in the collection.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a task using its ID.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param key The ID of the task.
    * @returns The task with the given ID. If there is no task with the given ID, then an `ItemNotFound` exception is thrown.
    */
  def getItem(key: String): DocumentTask = js.native
  
  /**
    * Gets a task by its index in the collection.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param index The index of the task in the collection.
    * @returns The task with the given index.
    */
  def getItemAt(index: Double): DocumentTask = js.native
  
  /**
    * Gets a task using its ID.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param key The ID of the task.
    * @returns The task with the given ID. If there is no task with the given ID, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    */
  def getItemOrNullObject(key: String): DocumentTask = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[DocumentTask] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): DocumentTaskCollection = js.native
  def load(options: DocumentTaskCollectionLoadOptions & CollectionLoadOptions): DocumentTaskCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): DocumentTaskCollection = js.native
  def load(propertyNames: String): DocumentTaskCollection = js.native
  def load(propertyNames: js.Array[String]): DocumentTaskCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.DocumentTaskCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.DocumentTaskCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): DocumentTaskCollectionData = js.native
}
