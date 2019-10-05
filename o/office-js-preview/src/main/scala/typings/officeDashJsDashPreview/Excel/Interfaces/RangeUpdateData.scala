package typings.officeDashJsDashPreview.Excel.Interfaces

import typings.officeDashJsDashPreview.Excel.RangeHyperlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Range object, for use in `range.set({ ... })`. */
trait RangeUpdateData extends js.Object {
  /**
    *
    * Represents if all columns of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var columnHidden: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns a data validation object.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataValidation: js.UndefOr[DataValidationUpdateData] = js.undefined
  /**
    *
    * Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[RangeFormatUpdateData] = js.undefined
  /**
    *
    * Represents the formula in A1-style notation.
    When setting formulas to a range, the value argument can be either a single value (a string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulas: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
    *
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German.
    When setting formulas to a range, the value argument can be either a single value (a string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulasLocal: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
    *
    * Represents the formula in R1C1-style notation.
    When setting formulas to a range, the value argument can be either a single value (a string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.2]
    */
  var formulasR1C1: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
    *
    * Represents the hyperlink for the current range.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hyperlink: js.UndefOr[RangeHyperlink] = js.undefined
  /**
    *
    * Represents Excel's number format code for the given range.
    When setting number format to a range, the value argument can be either a single value (string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var numberFormat: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
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
  var numberFormatLocal: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
    *
    * Represents if all rows of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var rowHidden: js.UndefOr[Boolean] = js.undefined
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
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    When setting values to a range, the value argument can be either a single value (string, number or boolean) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
}

object RangeUpdateData {
  @scala.inline
  def apply(
    columnHidden: js.UndefOr[Boolean] = js.undefined,
    dataValidation: DataValidationUpdateData = null,
    format: RangeFormatUpdateData = null,
    formulas: js.Array[js.Array[_]] = null,
    formulasLocal: js.Array[js.Array[_]] = null,
    formulasR1C1: js.Array[js.Array[_]] = null,
    hyperlink: RangeHyperlink = null,
    numberFormat: js.Array[js.Array[_]] = null,
    numberFormatLocal: js.Array[js.Array[_]] = null,
    rowHidden: js.UndefOr[Boolean] = js.undefined,
    style: String = null,
    values: js.Array[js.Array[_]] = null
  ): RangeUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnHidden)) __obj.updateDynamic("columnHidden")(columnHidden)
    if (dataValidation != null) __obj.updateDynamic("dataValidation")(dataValidation)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formulas != null) __obj.updateDynamic("formulas")(formulas)
    if (formulasLocal != null) __obj.updateDynamic("formulasLocal")(formulasLocal)
    if (formulasR1C1 != null) __obj.updateDynamic("formulasR1C1")(formulasR1C1)
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat)
    if (numberFormatLocal != null) __obj.updateDynamic("numberFormatLocal")(numberFormatLocal)
    if (!js.isUndefined(rowHidden)) __obj.updateDynamic("rowHidden")(rowHidden)
    if (style != null) __obj.updateDynamic("style")(style)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[RangeUpdateData]
  }
}

