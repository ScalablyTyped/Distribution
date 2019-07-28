package typings.officeDashJs.ExcelNs

import typings.officeDashJs.ExcelNs.InterfacesNs.CollectionLoadOptions
import typings.officeDashJs.ExcelNs.InterfacesNs.DataPivotHierarchyCollectionData
import typings.officeDashJs.ExcelNs.InterfacesNs.DataPivotHierarchyCollectionLoadOptions
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.ClientResult
import typings.officeDashJs.OfficeExtensionNs.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of DataPivotHierarchy items associated with the PivotTable.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataPivotHierarchyCollection")
@js.native
class DataPivotHierarchyCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_DataPivotHierarchyCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[DataPivotHierarchy] = js.native
  /**
    *
    * Adds the PivotHierarchy to the current axis.
    *
    * [Api set: ExcelApi 1.8]
    */
  def add(pivotHierarchy: PivotHierarchy): DataPivotHierarchy = js.native
  /**
    *
    * Gets the number of pivot hierarchies in the collection.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Gets a DataPivotHierarchy by its name or id.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param name Name of the PivotTable to be retrieved.
    */
  def getItem(name: String): DataPivotHierarchy = js.native
  /**
    *
    * Gets a DataPivotHierarchy by name. If the DataPivotHierarchy does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param name Name of the DataPivotHierarchy to be retrieved.
    */
  def getItemOrNullObject(name: String): DataPivotHierarchy = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.DataPivotHierarchyCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.DataPivotHierarchyCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.DataPivotHierarchyCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): DataPivotHierarchyCollection = js.native
  def load(option: DataPivotHierarchyCollectionLoadOptions with CollectionLoadOptions): DataPivotHierarchyCollection = js.native
  def load(option: String): DataPivotHierarchyCollection = js.native
  def load(option: js.Array[String]): DataPivotHierarchyCollection = js.native
  def load(option: LoadOption): DataPivotHierarchyCollection = js.native
  /**
    *
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

