package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.DataPivotHierarchyCollectionData
import typings.officeJsPreview.Excel.Interfaces.DataPivotHierarchyCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of DataPivotHierarchy items associated with the PivotTable.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait DataPivotHierarchyCollection extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_DataPivotHierarchyCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[DataPivotHierarchy] = js.native
  /**
    * Adds the PivotHierarchy to the current axis.
    *
    * [Api set: ExcelApi 1.8]
    */
  def add(pivotHierarchy: PivotHierarchy): DataPivotHierarchy = js.native
  /**
    * Gets the number of pivot hierarchies in the collection.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    * Gets a DataPivotHierarchy by its name or id.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param name Name of the DataPivotHierarchy to be retrieved.
    */
  def getItem(name: String): DataPivotHierarchy = js.native
  /**
    * Gets a DataPivotHierarchy by name. If the DataPivotHierarchy does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param name Name of the DataPivotHierarchy to be retrieved.
    */
  def getItemOrNullObject(name: String): DataPivotHierarchy = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): DataPivotHierarchyCollection = js.native
  def load(options: DataPivotHierarchyCollectionLoadOptions with CollectionLoadOptions): DataPivotHierarchyCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): DataPivotHierarchyCollection = js.native
  def load(propertyNames: String): DataPivotHierarchyCollection = js.native
  def load(propertyNames: js.Array[String]): DataPivotHierarchyCollection = js.native
  /**
    * Removes the PivotHierarchy from the current axis.
    *
    * [Api set: ExcelApi 1.8]
    */
  def remove(DataPivotHierarchy: DataPivotHierarchy): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.DataPivotHierarchyCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.DataPivotHierarchyCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): DataPivotHierarchyCollectionData = js.native
}

