package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: ExcelApi 1.9]
  */
trait RangeCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the range reference in A1-style. Address value will contain the Sheet reference (e.g. "Sheet1!A1:B4"). Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var address: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents range reference for the specified range in the language of the user. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var addressLocal: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Number of cells in the range. This API will return -1 if the cell count exceeds 2^31-1 (2,147,483,647). Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var cellCount: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the total number of columns in the range. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columnCount: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents if all columns of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var columnHidden: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the column number of the first cell in the range. Zero-indexed. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columnIndex: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns a data validation object.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataValidation: js.UndefOr[DataValidationLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[RangeFormatLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the formula in A1-style notation.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulas: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulasLocal: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the formula in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.2]
    */
  var formulasR1C1: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents if all cells have a spill border.
    Returns true if all cells have a spill border, or false if all cells do not have a spill border.
    Returns null if there are cells both with and without spill borders within the range.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var hasSpill: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the distance in points, for 100% zoom, from top edge of the range to bottom edge of the range. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents if all cells of the current range are hidden. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the hyperlink for the current range.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hyperlink: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents if the current range is an entire column. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var isEntireColumn: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents if the current range is an entire row. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var isEntireRow: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the distance in points, for 100% zoom, from left edge of the worksheet to left edge of the range. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the data type state of each cell. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkedDataTypeState: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents Excel's number format code for the given range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var numberFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the category of number format of each cell. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberFormatCategories: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents Excel's number format code for the given range, based on the language settings of the user.​
    Excel does not perform any language or format coercion when getting or setting the `numberFormatLocal` property.
    Any returned text uses the locally-formatted strings based on the language specified in the system settings.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormatLocal: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the total number of rows in the range. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rowCount: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents if all rows of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var rowHidden: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the row number of the first cell in the range. Zero-indexed. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rowIndex: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents if ALL the cells would be saved as an array formula.
    Returns true if ALL cells would be saved as an array formula, or false if ALL cells would NOT be saved as an array formula.
    Returns null if some cells would be saved as an array formula and some would not be.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var savedAsArray: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the style of the current range.
    If the styles of the cells are inconsistent, null will be returned.
    For custom styles, the style name will be returned. For built-in styles, a string representing a value in the BuiltInStyle enum will be returned.
    *
    * [Api set: ExcelApi 1.7]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the distance in points, for 100% zoom, from top edge of the worksheet to top edge of the range. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the type of data of each cell. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var valueTypes: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the distance in points, for 100% zoom, from left edge of the range to right edge of the range. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var width: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The worksheet containing the current range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
}

object RangeCollectionLoadOptions {
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
    hasSpill: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hyperlink: js.UndefOr[Boolean] = js.undefined,
    isEntireColumn: js.UndefOr[Boolean] = js.undefined,
    isEntireRow: js.UndefOr[Boolean] = js.undefined,
    left: js.UndefOr[Boolean] = js.undefined,
    linkedDataTypeState: js.UndefOr[Boolean] = js.undefined,
    numberFormat: js.UndefOr[Boolean] = js.undefined,
    numberFormatCategories: js.UndefOr[Boolean] = js.undefined,
    numberFormatLocal: js.UndefOr[Boolean] = js.undefined,
    rowCount: js.UndefOr[Boolean] = js.undefined,
    rowHidden: js.UndefOr[Boolean] = js.undefined,
    rowIndex: js.UndefOr[Boolean] = js.undefined,
    savedAsArray: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Boolean] = js.undefined,
    text: js.UndefOr[Boolean] = js.undefined,
    top: js.UndefOr[Boolean] = js.undefined,
    valueTypes: js.UndefOr[Boolean] = js.undefined,
    values: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Boolean] = js.undefined,
    worksheet: WorksheetLoadOptions = null
  ): RangeCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(addressLocal)) __obj.updateDynamic("addressLocal")(addressLocal.asInstanceOf[js.Any])
    if (!js.isUndefined(cellCount)) __obj.updateDynamic("cellCount")(cellCount.asInstanceOf[js.Any])
    if (!js.isUndefined(columnCount)) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (!js.isUndefined(columnHidden)) __obj.updateDynamic("columnHidden")(columnHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (dataValidation != null) __obj.updateDynamic("dataValidation")(dataValidation.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(formulas)) __obj.updateDynamic("formulas")(formulas.asInstanceOf[js.Any])
    if (!js.isUndefined(formulasLocal)) __obj.updateDynamic("formulasLocal")(formulasLocal.asInstanceOf[js.Any])
    if (!js.isUndefined(formulasR1C1)) __obj.updateDynamic("formulasR1C1")(formulasR1C1.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSpill)) __obj.updateDynamic("hasSpill")(hasSpill.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(hyperlink)) __obj.updateDynamic("hyperlink")(hyperlink.asInstanceOf[js.Any])
    if (!js.isUndefined(isEntireColumn)) __obj.updateDynamic("isEntireColumn")(isEntireColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(isEntireRow)) __obj.updateDynamic("isEntireRow")(isEntireRow.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(linkedDataTypeState)) __obj.updateDynamic("linkedDataTypeState")(linkedDataTypeState.asInstanceOf[js.Any])
    if (!js.isUndefined(numberFormat)) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(numberFormatCategories)) __obj.updateDynamic("numberFormatCategories")(numberFormatCategories.asInstanceOf[js.Any])
    if (!js.isUndefined(numberFormatLocal)) __obj.updateDynamic("numberFormatLocal")(numberFormatLocal.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCount)) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (!js.isUndefined(rowHidden)) __obj.updateDynamic("rowHidden")(rowHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(savedAsArray)) __obj.updateDynamic("savedAsArray")(savedAsArray.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (!js.isUndefined(valueTypes)) __obj.updateDynamic("valueTypes")(valueTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(values)) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (worksheet != null) __obj.updateDynamic("worksheet")(worksheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeCollectionLoadOptions]
  }
}

