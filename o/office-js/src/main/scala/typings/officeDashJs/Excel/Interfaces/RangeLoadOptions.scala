package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Range represents a set of one or more contiguous cells such as a cell, a row, a column, block of cells, etc.
  To learn more about how ranges are used throughout the API, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-ranges | Work with ranges using the Excel JavaScript API}
  and {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-ranges-advanced | Work with ranges using the Excel JavaScript API (advanced)}.
  *
  * [Api set: ExcelApi 1.1]
  */
trait RangeLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the range reference in A1-style. Address value will contain the Sheet reference (e.g. "Sheet1!A1:B4"). Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var address: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents range reference for the specified range in the language of the user. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var addressLocal: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Number of cells in the range. This API will return -1 if the cell count exceeds 2^31-1 (2,147,483,647). Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var cellCount: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the total number of columns in the range. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columnCount: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents if all columns of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var columnHidden: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the column number of the first cell in the range. Zero-indexed. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columnIndex: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns a data validation object.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataValidation: js.UndefOr[DataValidationLoadOptions] = js.undefined
  /**
    *
    * Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[RangeFormatLoadOptions] = js.undefined
  /**
    *
    * Represents the formula in A1-style notation.
    When setting formulas to a range, the value argument can be either a single value (a string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulas: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German.
    When setting formulas to a range, the value argument can be either a single value (a string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulasLocal: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the formula in R1C1-style notation.
    When setting formulas to a range, the value argument can be either a single value (a string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.2]
    */
  var formulasR1C1: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents if all cells of the current range are hidden. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the hyperlink for the current range.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hyperlink: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents if the current range is an entire column. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var isEntireColumn: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents if the current range is an entire row. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var isEntireRow: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the data type state of each cell. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkedDataTypeState: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents Excel's number format code for the given range.
    When setting number format to a range, the value argument can be either a single value (string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var numberFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents Excel's number format code for the given range, based on the language settings of the user.​
    When setting number format local to a range, the value argument can be either a single value (string) or a two-dimensional array.
    If the argument is a single value, it will be applied to all cells in the range.​
    Excel does not perform any language or format coercion when getting or setting the `numberFormatLocal` property.
    Any returned text uses the locally-formatted strings based on the language specified in the system settings.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormatLocal: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the total number of rows in the range. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rowCount: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents if all rows of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var rowHidden: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the row number of the first cell in the range. Zero-indexed. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rowIndex: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the style of the current range.
    If the styles of the cells are inconsistent, null will be returned.
    For custom styles, the style name will be returned. For built-in styles, a string representing a value in the BuiltInStyle enum will be returned.
    *
    * [Api set: ExcelApi 1.7]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the type of data of each cell. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var valueTypes: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    When setting values to a range, the value argument can be either a single value (string, number or boolean) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The worksheet containing the current range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
}

object RangeLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    address: js.UndefOr[Boolean] = js.undefined,
    addressLocal: js.UndefOr[Boolean] = js.undefined,
    cellCount: js.UndefOr[Boolean] = js.undefined,
    columnCount: js.UndefOr[Boolean] = js.undefined,
    columnHidden: js.UndefOr[Boolean] = js.undefined,
    columnIndex: js.UndefOr[Boolean] = js.undefined,
    dataValidation: DataValidationLoadOptions = null,
    format: RangeFormatLoadOptions = null,
    formulas: js.UndefOr[Boolean] = js.undefined,
    formulasLocal: js.UndefOr[Boolean] = js.undefined,
    formulasR1C1: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hyperlink: js.UndefOr[Boolean] = js.undefined,
    isEntireColumn: js.UndefOr[Boolean] = js.undefined,
    isEntireRow: js.UndefOr[Boolean] = js.undefined,
    linkedDataTypeState: js.UndefOr[Boolean] = js.undefined,
    numberFormat: js.UndefOr[Boolean] = js.undefined,
    numberFormatLocal: js.UndefOr[Boolean] = js.undefined,
    rowCount: js.UndefOr[Boolean] = js.undefined,
    rowHidden: js.UndefOr[Boolean] = js.undefined,
    rowIndex: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Boolean] = js.undefined,
    text: js.UndefOr[Boolean] = js.undefined,
    valueTypes: js.UndefOr[Boolean] = js.undefined,
    values: js.UndefOr[Boolean] = js.undefined,
    worksheet: WorksheetLoadOptions = null
  ): RangeLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address)
    if (!js.isUndefined(addressLocal)) __obj.updateDynamic("addressLocal")(addressLocal)
    if (!js.isUndefined(cellCount)) __obj.updateDynamic("cellCount")(cellCount)
    if (!js.isUndefined(columnCount)) __obj.updateDynamic("columnCount")(columnCount)
    if (!js.isUndefined(columnHidden)) __obj.updateDynamic("columnHidden")(columnHidden)
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex)
    if (dataValidation != null) __obj.updateDynamic("dataValidation")(dataValidation)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(formulas)) __obj.updateDynamic("formulas")(formulas)
    if (!js.isUndefined(formulasLocal)) __obj.updateDynamic("formulasLocal")(formulasLocal)
    if (!js.isUndefined(formulasR1C1)) __obj.updateDynamic("formulasR1C1")(formulasR1C1)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(hyperlink)) __obj.updateDynamic("hyperlink")(hyperlink)
    if (!js.isUndefined(isEntireColumn)) __obj.updateDynamic("isEntireColumn")(isEntireColumn)
    if (!js.isUndefined(isEntireRow)) __obj.updateDynamic("isEntireRow")(isEntireRow)
    if (!js.isUndefined(linkedDataTypeState)) __obj.updateDynamic("linkedDataTypeState")(linkedDataTypeState)
    if (!js.isUndefined(numberFormat)) __obj.updateDynamic("numberFormat")(numberFormat)
    if (!js.isUndefined(numberFormatLocal)) __obj.updateDynamic("numberFormatLocal")(numberFormatLocal)
    if (!js.isUndefined(rowCount)) __obj.updateDynamic("rowCount")(rowCount)
    if (!js.isUndefined(rowHidden)) __obj.updateDynamic("rowHidden")(rowHidden)
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex)
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(valueTypes)) __obj.updateDynamic("valueTypes")(valueTypes)
    if (!js.isUndefined(values)) __obj.updateDynamic("values")(values)
    if (worksheet != null) __obj.updateDynamic("worksheet")(worksheet)
    __obj.asInstanceOf[RangeLoadOptions]
  }
}

