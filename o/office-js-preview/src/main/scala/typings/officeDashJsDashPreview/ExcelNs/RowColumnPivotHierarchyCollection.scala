package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.CollectionLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.RowColumnPivotHierarchyCollectionData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.RowColumnPivotHierarchyCollectionLoadOptions
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientResult
import typings.officeDashJsDashPreview.OfficeExtensionNs.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of RowColumnPivotHierarchy items associated with the PivotTable.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.RowColumnPivotHierarchyCollection")
@js.native
class RowColumnPivotHierarchyCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RowColumnPivotHierarchyCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[RowColumnPivotHierarchy] = js.native
  /**
    *
    * Adds the PivotHierarchy to the current axis. If the hierarchy is present elsewhere on the row, column,
    or filter axis, it will be removed from that location.
    *
    * [Api set: ExcelApi 1.8]
    */
  def add(pivotHierarchy: PivotHierarchy): RowColumnPivotHierarchy = js.native
  /**
    *
    * Gets the number of pivot hierarchies in the collection.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Gets a RowColumnPivotHierarchy by its name or id.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param name Name of the PivotTable to be retrieved.
    */
  def getItem(name: String): RowColumnPivotHierarchy = js.native
  /**
    *
    * Gets a RowColumnPivotHierarchy by name. If the RowColumnPivotHierarchy does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param name Name of the RowColumnPivotHierarchy to be retrieved.
    */
  def getItemOrNullObject(name: String): RowColumnPivotHierarchy = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.RowColumnPivotHierarchyCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.RowColumnPivotHierarchyCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.RowColumnPivotHierarchyCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RowColumnPivotHierarchyCollection = js.native
  def load(option: RowColumnPivotHierarchyCollectionLoadOptions with CollectionLoadOptions): RowColumnPivotHierarchyCollection = js.native
  def load(option: String): RowColumnPivotHierarchyCollection = js.native
  def load(option: js.Array[String]): RowColumnPivotHierarchyCollection = js.native
  def load(option: LoadOption): RowColumnPivotHierarchyCollection = js.native
  /**
    *
    * Removes the PivotHierarchy from the current axis.
    *
    * [Api set: ExcelApi 1.8]
    */
  def remove(rowColumnPivotHierarchy: RowColumnPivotHierarchy): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.RowColumnPivotHierarchyCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RowColumnPivotHierarchyCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): RowColumnPivotHierarchyCollectionData = js.native
}

