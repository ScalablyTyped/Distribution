package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the conditional formats that are overlap the range.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatCollection")
@js.native
class ConditionalFormatCollection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ConditionalFormatCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[ConditionalFormat] = js.native
  /**
    *
    * Adds a new conditional format to the collection at the first/top priority.
    *
    * [Api set: ExcelApi 1.6]
    *
    * @param type The type of conditional format being added. See Excel.ConditionalFormatType for details.
    */
  def add(`type`: ConditionalFormatType): ConditionalFormat = js.native
  @JSName("add")
  def add_CellValue(`type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CellValue): ConditionalFormat = js.native
  @JSName("add")
  def add_ColorScale(`type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorScale): ConditionalFormat = js.native
  @JSName("add")
  def add_ContainsText(`type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ContainsText): ConditionalFormat = js.native
  /**
    *
    * Adds a new conditional format to the collection at the first/top priority.
    *
    * [Api set: ExcelApi 1.6]
    *
    * @param type The type of conditional format being added. See Excel.ConditionalFormatType for details.
    */
  @JSName("add")
  def add_Custom(`type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Custom): ConditionalFormat = js.native
  @JSName("add")
  def add_DataBar(`type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DataBar): ConditionalFormat = js.native
  @JSName("add")
  def add_IconSet(`type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.IconSet): ConditionalFormat = js.native
  @JSName("add")
  def add_PresetCriteria(`type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PresetCriteria): ConditionalFormat = js.native
  @JSName("add")
  def add_TopBottom(`type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TopBottom): ConditionalFormat = js.native
  /**
    *
    * Clears all conditional formats active on the current specified range.
    *
    * [Api set: ExcelApi 1.6]
    */
  def clearAll(): scala.Unit = js.native
  /**
    *
    * Returns the number of conditional formats in the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  def getCount(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Returns a conditional format for the given ID.
    *
    * [Api set: ExcelApi 1.6]
    *
    * @param id The id of the conditional format.
    * @returns Conditional Format object.
    */
  def getItem(id: java.lang.String): ConditionalFormat = js.native
  /**
    *
    * Returns a conditional format at the given index.
    *
    * [Api set: ExcelApi 1.6]
    *
    * @param index Index of the conditional formats to be retrieved.
    */
  def getItemAt(index: scala.Double): ConditionalFormat = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ConditionalFormatCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ConditionalFormatCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ConditionalFormatCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ConditionalFormatCollection = js.native
  def load(
    option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ConditionalFormatCollectionLoadOptions with officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): ConditionalFormatCollection = js.native
  def load(option: java.lang.String): ConditionalFormatCollection = js.native
  def load(option: js.Array[java.lang.String]): ConditionalFormatCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): ConditionalFormatCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.ConditionalFormatCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ConditionalFormatCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ConditionalFormatCollectionData = js.native
}

