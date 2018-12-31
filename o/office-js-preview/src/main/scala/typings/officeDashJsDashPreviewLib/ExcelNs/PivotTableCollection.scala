package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the PivotTables that are part of the workbook or worksheet.
  *
  * [Api set: ExcelApi 1.3]
  */
@JSGlobal("Excel.PivotTableCollection")
@js.native
class PivotTableCollection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PivotTableCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[PivotTable] = js.native
  def add(name: java.lang.String, source: java.lang.String, destination: java.lang.String): PivotTable = js.native
  def add(name: java.lang.String, source: java.lang.String, destination: Range): PivotTable = js.native
  def add(name: java.lang.String, source: Range, destination: java.lang.String): PivotTable = js.native
  /**
    *
    * Add a Pivottable based on the specified source data and insert it at the top left cell of the destination range.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param name The name of the new PivotTable.
    * @param source The source data for the new PivotTable, this can either be a range (or string address including the worksheet name) or a table.
    * @param destination The cell in the upper-left corner of the PivotTable report's destination range (the range on the worksheet where the resulting report will be placed).
    * @returns Returns the newly inserted PivotTable.
    */
  def add(name: java.lang.String, source: Range, destination: Range): PivotTable = js.native
  def add(name: java.lang.String, source: Table, destination: java.lang.String): PivotTable = js.native
  def add(name: java.lang.String, source: Table, destination: Range): PivotTable = js.native
  /**
    *
    * Gets the number of pivot tables in the collection.
    *
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Gets a PivotTable by name.
    *
    * [Api set: ExcelApi 1.3]
    *
    * @param name Name of the PivotTable to be retrieved.
    */
  def getItem(name: java.lang.String): PivotTable = js.native
  /**
    *
    * Gets a PivotTable by name. If the PivotTable does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param name Name of the PivotTable to be retrieved.
    */
  def getItemOrNullObject(name: java.lang.String): PivotTable = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.PivotTableCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.PivotTableCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.PivotTableCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PivotTableCollection = js.native
  def load(
    option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.PivotTableCollectionLoadOptions with officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): PivotTableCollection = js.native
  def load(option: java.lang.String): PivotTableCollection = js.native
  def load(option: js.Array[java.lang.String]): PivotTableCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): PivotTableCollection = js.native
  /**
    *
    * Refreshes all the pivot tables in the collection.
    *
    * [Api set: ExcelApi 1.3]
    */
  def refreshAll(): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.PivotTableCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PivotTableCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.PivotTableCollectionData = js.native
}

