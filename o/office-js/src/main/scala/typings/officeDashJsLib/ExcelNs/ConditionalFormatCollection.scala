package typings
package officeDashJsLib.ExcelNs

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
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
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
  /**
           *
           * Adds a new conditional format to the collection at the first/top priority.
           *
           * [Api set: ExcelApi 1.6]
           *
           * @param type The type of conditional format being added. See Excel.ConditionalFormatType for details.
           */
  @JSName("add")
  def add_CellValue(`type`: officeDashJsLib.officeDashJsLibStrings.CellValue): ConditionalFormat = js.native
  /**
           *
           * Adds a new conditional format to the collection at the first/top priority.
           *
           * [Api set: ExcelApi 1.6]
           *
           * @param type The type of conditional format being added. See Excel.ConditionalFormatType for details.
           */
  @JSName("add")
  def add_ColorScale(`type`: officeDashJsLib.officeDashJsLibStrings.ColorScale): ConditionalFormat = js.native
  /**
           *
           * Adds a new conditional format to the collection at the first/top priority.
           *
           * [Api set: ExcelApi 1.6]
           *
           * @param type The type of conditional format being added. See Excel.ConditionalFormatType for details.
           */
  @JSName("add")
  def add_ContainsText(`type`: officeDashJsLib.officeDashJsLibStrings.ContainsText): ConditionalFormat = js.native
  /**
           *
           * Adds a new conditional format to the collection at the first/top priority.
           *
           * [Api set: ExcelApi 1.6]
           *
           * @param type The type of conditional format being added. See Excel.ConditionalFormatType for details.
           */
  @JSName("add")
  def add_Custom(`type`: officeDashJsLib.officeDashJsLibStrings.Custom): ConditionalFormat = js.native
  /**
           *
           * Adds a new conditional format to the collection at the first/top priority.
           *
           * [Api set: ExcelApi 1.6]
           *
           * @param type The type of conditional format being added. See Excel.ConditionalFormatType for details.
           */
  @JSName("add")
  def add_DataBar(`type`: officeDashJsLib.officeDashJsLibStrings.DataBar): ConditionalFormat = js.native
  /**
           *
           * Adds a new conditional format to the collection at the first/top priority.
           *
           * [Api set: ExcelApi 1.6]
           *
           * @param type The type of conditional format being added. See Excel.ConditionalFormatType for details.
           */
  @JSName("add")
  def add_IconSet(`type`: officeDashJsLib.officeDashJsLibStrings.IconSet): ConditionalFormat = js.native
  /**
           *
           * Adds a new conditional format to the collection at the first/top priority.
           *
           * [Api set: ExcelApi 1.6]
           *
           * @param type The type of conditional format being added. See Excel.ConditionalFormatType for details.
           */
  @JSName("add")
  def add_PresetCriteria(`type`: officeDashJsLib.officeDashJsLibStrings.PresetCriteria): ConditionalFormat = js.native
  /**
           *
           * Adds a new conditional format to the collection at the first/top priority.
           *
           * [Api set: ExcelApi 1.6]
           *
           * @param type The type of conditional format being added. See Excel.ConditionalFormatType for details.
           */
  @JSName("add")
  def add_TopBottom(`type`: officeDashJsLib.officeDashJsLibStrings.TopBottom): ConditionalFormat = js.native
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
  def getCount(): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
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
  def load(
    option: officeDashJsLib.ExcelNs.InterfacesNs.ConditionalFormatCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): ConditionalFormatCollection = js.native
  def load(option: java.lang.String): ConditionalFormatCollection = js.native
  def load(option: js.Array[java.lang.String]): ConditionalFormatCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): ConditionalFormatCollection = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.ConditionalFormatCollectionData = js.native
}

