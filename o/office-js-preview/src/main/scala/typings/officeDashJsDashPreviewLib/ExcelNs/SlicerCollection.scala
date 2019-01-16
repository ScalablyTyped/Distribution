package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the slicer objects on the workbook or a worksheet.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.SlicerCollection")
@js.native
class SlicerCollection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SlicerCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Slicer] = js.native
  /**
    *
    * Adds a new slicer to the workbook.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param slicerSource The data source that the new slicer will be based on. It can be a PivotTable object, a Table object or a string. When a PivotTable object is passed, the data source is the source of the PivotTable object. When a Table object is passed, the data source is the Table object. When a string is passed, it is interpreted as the name/id of a PivotTable/Table.
    * @param sourceField The field in the data source to filter by. It can be a PivotField object, a TableColumn object, the id of a PivotField or the id/name of TableColumn.
    * @param slicerDestination Optional. The worksheet where the new slicer will be created in. It can be a Worksheet object or the name/id of a worksheet. This parameter can be omitted if the slicer collection is retrieved from worksheet.
    * @returns The new slicer.
    */
  def add(
    slicerSource: java.lang.String | PivotTable | Table,
    sourceField: java.lang.String | PivotField | scala.Double | TableColumn
  ): Slicer = js.native
  def add(
    slicerSource: java.lang.String | PivotTable | Table,
    sourceField: java.lang.String | PivotField | scala.Double | TableColumn,
    slicerDestination: java.lang.String | Worksheet
  ): Slicer = js.native
  /**
    *
    * Returns the number of slicers in the collection.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getCount(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Gets a slicer object using its name or id.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param key The name or id of the slicer.
    */
  def getItem(key: java.lang.String): Slicer = js.native
  /**
    *
    * Gets a slicer based on its position in the collection.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: scala.Double): Slicer = js.native
  /**
    *
    * Gets a slicer using its name or id. If the slicer does not exist, will return a null object.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param key Name or Id of the slicer to be retrieved.
    */
  def getItemOrNullObject(key: java.lang.String): Slicer = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.SlicerCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.SlicerCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.SlicerCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SlicerCollection = js.native
  def load(
    option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.SlicerCollectionLoadOptions with officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): SlicerCollection = js.native
  def load(option: java.lang.String): SlicerCollection = js.native
  def load(option: js.Array[java.lang.String]): SlicerCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): SlicerCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.SlicerCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.SlicerCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.SlicerCollectionData = js.native
}

