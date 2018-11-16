package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * A format object encapsulating the range's font, fill, borders, alignment, and other properties.
     *
     * [Api set: ExcelApi 1.1]
     */
@JSGlobal("Excel.RangeFormat")
@js.native
class RangeFormat ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Collection of border objects that apply to the overall range. Read-only.
           *
           * [Api set: ExcelApi 1.1]
           */
  val borders: RangeBorderCollection = js.native
  /**
           *
           * Gets or sets the width of all colums within the range. If the column widths are not uniform, null will be returned.
           *
           * [Api set: ExcelApi 1.2]
           */
  var columnWidth: scala.Double = js.native
  /**
           *
           * Returns the fill object defined on the overall range. Read-only.
           *
           * [Api set: ExcelApi 1.1]
           */
  val fill: RangeFill = js.native
  /**
           *
           * Returns the font object defined on the overall range. Read-only.
           *
           * [Api set: ExcelApi 1.1]
           */
  val font: RangeFont = js.native
  /**
           *
           * Represents the horizontal alignment for the specified object. See Excel.HorizontalAlignment for details.
           *
           * [Api set: ExcelApi 1.1]
           */
  var horizontalAlignment: HorizontalAlignment | officeDashJsLib.officeDashJsLibStrings.General | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Fill | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.CenterAcrossSelection | officeDashJsLib.officeDashJsLibStrings.Distributed = js.native
  /**
           *
           * Returns the format protection object for a range. Read-only.
           *
           * [Api set: ExcelApi 1.2]
           */
  val protection: FormatProtection = js.native
  /**
           *
           * Gets or sets the height of all rows in the range. If the row heights are not uniform, null will be returned.
           *
           * [Api set: ExcelApi 1.2]
           */
  var rowHeight: scala.Double = js.native
  /**
           *
           * Gets or sets the text orientation of all the cells within the range.
              The text orientation should be an integer either from -90 to 90, or 180 for vertically-oriented text.
              If the orientation within a range are not uniform, then null will be returned.
           *
           * [Api set: ExcelApi 1.7]
           */
  var textOrientation: scala.Double = js.native
  /**
           *
           * Determines if the row height of the Range object equals the standard height of the sheet.
              Returns True if the row height of the Range object equals the standard height of the sheet.
              Returns Null if the range contains more than one row and the rows aren't all the same height.
              Returns False otherwise.
           *
           * [Api set: ExcelApi 1.7]
           */
  var useStandardHeight: scala.Boolean = js.native
  /**
           *
           * Indicates whether the column width of the Range object equals the standard width of the sheet.
              Returns True if the column width of the Range object equals the standard width of the sheet.
              Returns Null if the range contains more than one column and the columns aren't all the same height.
              Returns False otherwise.
           *
           * [Api set: ExcelApi 1.7]
           */
  var useStandardWidth: scala.Boolean = js.native
  /**
           *
           * Represents the vertical alignment for the specified object. See Excel.VerticalAlignment for details.
           *
           * [Api set: ExcelApi 1.1]
           */
  var verticalAlignment: VerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Bottom | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.Distributed = js.native
  /**
           *
           * Indicates if Excel wraps the text in the object. A null value indicates that the entire range doesn't have uniform wrap setting
           *
           * [Api set: ExcelApi 1.1]
           */
  var wrapText: scala.Boolean = js.native
  /**
           *
           * Changes the width of the columns of the current range to achieve the best fit, based on the current data in the columns.
           *
           * [Api set: ExcelApi 1.2]
           */
  def autofitColumns(): scala.Unit = js.native
  /**
           *
           * Changes the height of the rows of the current range to achieve the best fit, based on the current data in the columns.
           *
           * [Api set: ExcelApi 1.2]
           */
  def autofitRows(): scala.Unit = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.RangeFormat` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.RangeFormat` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.RangeFormat` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): RangeFormat = js.native
  def load(option: java.lang.String): RangeFormat = js.native
  def load(option: js.Array[java.lang.String]): RangeFormat = js.native
  def load(option: officeDashJsLib.Anon_Select): RangeFormat = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.RangeFormat` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.RangeFormat` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.RangeFormat` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.RangeFormatLoadOptions): RangeFormat = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.RangeFormat): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.RangeFormatUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.RangeFormat): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.RangeFormatUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: RangeFormat): scala.Unit = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.RangeFormatData = js.native
}

