package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.LinkedDataTypeState
import typings.officeJs.Excel.RangeHyperlink
import typings.officeJs.Excel.RangeValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `range.toJSON()`. */
trait RangeData extends js.Object {
  /**
    *
    * Specifies the range reference in A1-style. Address value will contain the Sheet reference (e.g., "Sheet1!A1:B4").
    *
    * [Api set: ExcelApi 1.1]
    */
  var address: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies the range reference for the specified range in the language of the user.
    *
    * [Api set: ExcelApi 1.1]
    */
  var addressLocal: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies the number of cells in the range. This API will return -1 if the cell count exceeds 2^31-1 (2,147,483,647).
    *
    * [Api set: ExcelApi 1.1]
    */
  var cellCount: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the total number of columns in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columnCount: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents if all columns of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var columnHidden: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the column number of the first cell in the range. Zero-indexed.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
    *
    * The collection of ConditionalFormats that intersect the range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var conditionalFormats: js.UndefOr[js.Array[ConditionalFormatData]] = js.undefined
  /**
    *
    * Returns a data validation object.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataValidation: js.UndefOr[DataValidationData] = js.undefined
  /**
    *
    * Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[RangeFormatData] = js.undefined
  /**
    *
    * Represents the formula in A1-style notation.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulas: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
    *
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulasLocal: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
    *
    * Represents the formula in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.2]
    */
  var formulasR1C1: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
    *
    * Returns the distance in points, for 100% zoom, from top edge of the range to bottom edge of the range.
    *
    * [Api set: ExcelApi 1.10]
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents if all cells of the current range are hidden.
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
  var hyperlink: js.UndefOr[RangeHyperlink] = js.undefined
  /**
    *
    * Represents if the current range is an entire column.
    *
    * [Api set: ExcelApi 1.7]
    */
  var isEntireColumn: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents if the current range is an entire row.
    *
    * [Api set: ExcelApi 1.7]
    */
  var isEntireRow: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the distance in points, for 100% zoom, from left edge of the worksheet to left edge of the range.
    *
    * [Api set: ExcelApi 1.10]
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the data type state of each cell.
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkedDataTypeState: js.UndefOr[js.Array[js.Array[LinkedDataTypeState]]] = js.undefined
  /**
    *
    * Represents Excel's number format code for the given range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var numberFormat: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
    *
    * Represents Excel's number format code for the given range, based on the language settings of the user.​
    Excel does not perform any language or format coercion when getting or setting the `numberFormatLocal` property.
    Any returned text uses the locally-formatted strings based on the language specified in the system settings.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormatLocal: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
    *
    * Returns the total number of rows in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents if all rows of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var rowHidden: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the row number of the first cell in the range. Zero-indexed.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the style of the current range.
    If the styles of the cells are inconsistent, null will be returned.
    For custom styles, the style name will be returned. For built-in styles, a string representing a value in the BuiltInStyle enum will be returned.
    *
    * [Api set: ExcelApi 1.7]
    */
  var style: js.UndefOr[String] = js.undefined
  /**
    *
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API.
    *
    * [Api set: ExcelApi 1.1]
    */
  var text: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  /**
    *
    * Returns the distance in points, for 100% zoom, from top edge of the worksheet to top edge of the range.
    *
    * [Api set: ExcelApi 1.10]
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the type of data in each cell.
    *
    * [Api set: ExcelApi 1.1]
    */
  var valueTypes: js.UndefOr[js.Array[js.Array[RangeValueType]]] = js.undefined
  /**
    *
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
    *
    * Returns the distance in points, for 100% zoom, from left edge of the range to right edge of the range.
    *
    * [Api set: ExcelApi 1.10]
    */
  var width: js.UndefOr[Double] = js.undefined
}

object RangeData {
  @scala.inline
  def apply(
    address: String = null,
    addressLocal: String = null,
    cellCount: js.UndefOr[Double] = js.undefined,
    columnCount: js.UndefOr[Double] = js.undefined,
    columnHidden: js.UndefOr[Boolean] = js.undefined,
    columnIndex: js.UndefOr[Double] = js.undefined,
    conditionalFormats: js.Array[ConditionalFormatData] = null,
    dataValidation: DataValidationData = null,
    format: RangeFormatData = null,
    formulas: js.Array[js.Array[_]] = null,
    formulasLocal: js.Array[js.Array[_]] = null,
    formulasR1C1: js.Array[js.Array[_]] = null,
    height: js.UndefOr[Double] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hyperlink: RangeHyperlink = null,
    isEntireColumn: js.UndefOr[Boolean] = js.undefined,
    isEntireRow: js.UndefOr[Boolean] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    linkedDataTypeState: js.Array[js.Array[LinkedDataTypeState]] = null,
    numberFormat: js.Array[js.Array[_]] = null,
    numberFormatLocal: js.Array[js.Array[_]] = null,
    rowCount: js.UndefOr[Double] = js.undefined,
    rowHidden: js.UndefOr[Boolean] = js.undefined,
    rowIndex: js.UndefOr[Double] = js.undefined,
    style: String = null,
    text: js.Array[js.Array[String]] = null,
    top: js.UndefOr[Double] = js.undefined,
    valueTypes: js.Array[js.Array[RangeValueType]] = null,
    values: js.Array[js.Array[_]] = null,
    width: js.UndefOr[Double] = js.undefined
  ): RangeData = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (addressLocal != null) __obj.updateDynamic("addressLocal")(addressLocal.asInstanceOf[js.Any])
    if (!js.isUndefined(cellCount)) __obj.updateDynamic("cellCount")(cellCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnCount)) __obj.updateDynamic("columnCount")(columnCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnHidden)) __obj.updateDynamic("columnHidden")(columnHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (conditionalFormats != null) __obj.updateDynamic("conditionalFormats")(conditionalFormats.asInstanceOf[js.Any])
    if (dataValidation != null) __obj.updateDynamic("dataValidation")(dataValidation.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formulas != null) __obj.updateDynamic("formulas")(formulas.asInstanceOf[js.Any])
    if (formulasLocal != null) __obj.updateDynamic("formulasLocal")(formulasLocal.asInstanceOf[js.Any])
    if (formulasR1C1 != null) __obj.updateDynamic("formulasR1C1")(formulasR1C1.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink.asInstanceOf[js.Any])
    if (!js.isUndefined(isEntireColumn)) __obj.updateDynamic("isEntireColumn")(isEntireColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isEntireRow)) __obj.updateDynamic("isEntireRow")(isEntireRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (linkedDataTypeState != null) __obj.updateDynamic("linkedDataTypeState")(linkedDataTypeState.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (numberFormatLocal != null) __obj.updateDynamic("numberFormatLocal")(numberFormatLocal.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCount)) __obj.updateDynamic("rowCount")(rowCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowHidden)) __obj.updateDynamic("rowHidden")(rowHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (valueTypes != null) __obj.updateDynamic("valueTypes")(valueTypes.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeData]
  }
}

