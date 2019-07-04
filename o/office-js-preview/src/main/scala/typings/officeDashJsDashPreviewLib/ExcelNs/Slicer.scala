package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a slicer object in the workbook.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.Slicer")
@js.native
class Slicer ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Represents the caption of slicer.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var caption: java.lang.String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Slicer: RequestContext = js.native
  /**
    *
    * Represents the height, in points, of the slicer.
    Throws an invalid argument exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var height: scala.Double = js.native
  /**
    *
    * Represents the unique id of slicer. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val id: java.lang.String = js.native
  /**
    *
    * True if all filters currently applied on the slicer are cleared.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val isFilterCleared: scala.Boolean = js.native
  /**
    *
    * Represents the distance, in points, from the left side of the slicer to the left of the worksheet.
    Throws an invalid argument exception when set with negative value as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var left: scala.Double = js.native
  /**
    *
    * Represents the name of slicer.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: java.lang.String = js.native
  /**
    *
    * Represents the slicer name used in the formula.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var nameInFormula: java.lang.String = js.native
  /**
    *
    * Represents the collection of SlicerItems that are part of the slicer. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val slicerItems: SlicerItemCollection = js.native
  /**
    *
    * Represents the sort order of the items in the slicer. Possible values are: DataSourceOrder, Ascending, Descending.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var sortBy: SlicerSortType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DataSourceOrder | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Ascending | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Descending = js.native
  /**
    *
    * Constant value that represents the Slicer style. Possible values are: "SlicerStyleLight1" through "SlicerStyleLight6", "TableStyleOther1" through "TableStyleOther2", "SlicerStyleDark1" through "SlicerStyleDark6". A custom user-defined style present in the workbook can also be specified.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var style: java.lang.String = js.native
  /**
    *
    * Represents the distance, in points, from the top edge of the slicer to the top of the worksheet.
    Throws an invalid argument exception when set with negative value as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var top: scala.Double = js.native
  /**
    *
    * Represents the width, in points, of the slicer.
    Throws an invalid argument exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var width: scala.Double = js.native
  /**
    *
    * Represents the worksheet containing the slicer. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val worksheet: Worksheet = js.native
  /**
    *
    * Clears all the filters currently applied on the slicer.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def clearFilters(): scala.Unit = js.native
  /**
    *
    * Deletes the slicer.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def delete(): scala.Unit = js.native
  /**
    *
    * Returns an array of selected items' keys. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getSelectedItems(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.Slicer` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.Slicer` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.Slicer` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Slicer = js.native
  def load(option: java.lang.String): Slicer = js.native
  def load(option: js.Array[java.lang.String]): Slicer = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): Slicer = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.SlicerLoadOptions): Slicer = js.native
  /**
    *
    * Select slicer items based on their keys. Previous selection will be cleared.
    All items will be selected by default if the array is empty.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param items Optional. The specified slicer item names to be selected.
    */
  def selectItems(): scala.Unit = js.native
  def selectItems(items: js.Array[java.lang.String]): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.Slicer): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.SlicerUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.SlicerUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Slicer): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Slicer object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.SlicerData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.SlicerData = js.native
}

