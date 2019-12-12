package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait RangeCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the range reference in A1-style. Address value will contain the Sheet reference (e.g. "Sheet1!A1:B4"). Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var address: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents range reference for the specified range in the language of the user. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var addressLocal: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Number of cells in the range. This API will return -1 if the cell count exceeds 2^31-1 (2,147,483,647). Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var cellCount: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the total number of columns in the range. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columnCount: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents if all columns of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var columnHidden: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the column number of the first cell in the range. Zero-indexed. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columnIndex: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns a data validation object.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataValidation: js.UndefOr[DataValidationLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[RangeFormatLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the formula in A1-style notation.
    When setting formulas to a range, the value argument can be either a single value (a string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulas: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German.
    When setting formulas to a range, the value argument can be either a single value (a string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulasLocal: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the formula in R1C1-style notation.
    When setting formulas to a range, the value argument can be either a single value (a string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.2]
    */
  var formulasR1C1: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents if all cells have a spill border.
    Returns true if all cells have a spill border, or false if all cells do not have a spill border.
    Returns null if there are cells both with and without spill borders within the range.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var hasSpill: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the distance in points, for 100% zoom, from top edge of the range to bottom edge of the range. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var height: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents if all cells of the current range are hidden. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the hyperlink for the current range.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hyperlink: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents if the current range is an entire column. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var isEntireColumn: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents if the current range is an entire row. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var isEntireRow: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the distance in points, for 100% zoom, from left edge of the worksheet to left edge of the range. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var left: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the data type state of each cell. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkedDataTypeState: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents Excel's number format code for the given range.
    When setting number format to a range, the value argument can be either a single value (string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var numberFormat: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents Excel's number format code for the given range, based on the language settings of the user.​
    When setting number format local to a range, the value argument can be either a single value (string) or a two-dimensional array.
    If the argument is a single value, it will be applied to all cells in the range.​
    Excel does not perform any language or format coercion when getting or setting the `numberFormatLocal` property.
    Any returned text uses the locally-formatted strings based on the language specified in the system settings.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormatLocal: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the total number of rows in the range. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rowCount: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents if all rows of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var rowHidden: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the row number of the first cell in the range. Zero-indexed. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rowIndex: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents if ALL the cells would be saved as an array formula.
    Returns true if ALL cells would be saved as an array formula, or false if ALL cells would NOT be saved as an array formula.
    Returns null if some cells would be saved as an array formula and some would not be.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var savedAsArray: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the style of the current range.
    If the styles of the cells are inconsistent, null will be returned.
    For custom styles, the style name will be returned. For built-in styles, a string representing a value in the BuiltInStyle enum will be returned.
    *
    * [Api set: ExcelApi 1.7]
    */
  var style: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the distance in points, for 100% zoom, from top edge of the worksheet to top edge of the range. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var top: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the type of data of each cell. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var valueTypes: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    When setting values to a range, the value argument can be either a single value (string, number or boolean) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the distance in points, for 100% zoom, from left edge of the range to right edge of the range. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var width: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: The worksheet containing the current range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.native
}

