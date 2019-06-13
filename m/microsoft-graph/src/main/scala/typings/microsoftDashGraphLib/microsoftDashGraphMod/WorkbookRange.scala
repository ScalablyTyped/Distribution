package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookRange extends Entity {
  /** Represents the range reference in A1-style. Address value will contain the Sheet reference (e.g. Sheet1!A1:B4). Read-only. */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /** Represents range reference for the specified range in the language of the user. Read-only. */
  var addressLocal: js.UndefOr[java.lang.String] = js.undefined
  /** Number of cells in the range. Read-only. */
  var cellCount: js.UndefOr[scala.Double] = js.undefined
  /** Represents the total number of columns in the range. Read-only. */
  var columnCount: js.UndefOr[scala.Double] = js.undefined
  /** Represents if all columns of the current range are hidden. */
  var columnHidden: js.UndefOr[scala.Boolean] = js.undefined
  /** Represents the column number of the first cell in the range. Zero-indexed. Read-only. */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties. Read-only. */
  var format: js.UndefOr[WorkbookRangeFormat] = js.undefined
  /** Represents the formula in A1-style notation. */
  var formulas: js.UndefOr[js.Any] = js.undefined
  /** Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German. */
  var formulasLocal: js.UndefOr[js.Any] = js.undefined
  /** Represents the formula in R1C1-style notation. */
  var formulasR1C1: js.UndefOr[js.Any] = js.undefined
  /** Represents if all cells of the current range are hidden. Read-only. */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** Represents Excel's number format code for the given cell. */
  var numberFormat: js.UndefOr[js.Any] = js.undefined
  /** Returns the total number of rows in the range. Read-only. */
  var rowCount: js.UndefOr[scala.Double] = js.undefined
  /** Represents if all rows of the current range are hidden. */
  var rowHidden: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the row number of the first cell in the range. Zero-indexed. Read-only. */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /** The worksheet containing the current range. Read-only. */
  var sort: js.UndefOr[WorkbookRangeSort] = js.undefined
  /**
    * Text values of the specified range. The Text value will not depend on the cell width.
    * The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only.
    */
  var text: js.UndefOr[js.Any] = js.undefined
  /** Represents the type of data of each cell. The possible values are: Unknown, Empty, String, Integer, Double, Boolean, Error. Read-only. */
  var valueTypes: js.UndefOr[js.Any] = js.undefined
  /** Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string. */
  var values: js.UndefOr[js.Any] = js.undefined
  /** The worksheet containing the current range. Read-only. */
  var worksheet: js.UndefOr[WorkbookWorksheet] = js.undefined
}

object WorkbookRange {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    addressLocal: java.lang.String = null,
    cellCount: scala.Int | scala.Double = null,
    columnCount: scala.Int | scala.Double = null,
    columnHidden: js.UndefOr[scala.Boolean] = js.undefined,
    columnIndex: scala.Int | scala.Double = null,
    format: WorkbookRangeFormat = null,
    formulas: js.Any = null,
    formulasLocal: js.Any = null,
    formulasR1C1: js.Any = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    numberFormat: js.Any = null,
    rowCount: scala.Int | scala.Double = null,
    rowHidden: js.UndefOr[scala.Boolean] = js.undefined,
    rowIndex: scala.Int | scala.Double = null,
    sort: WorkbookRangeSort = null,
    text: js.Any = null,
    valueTypes: js.Any = null,
    values: js.Any = null,
    worksheet: WorkbookWorksheet = null
  ): WorkbookRange = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (addressLocal != null) __obj.updateDynamic("addressLocal")(addressLocal)
    if (cellCount != null) __obj.updateDynamic("cellCount")(cellCount.asInstanceOf[js.Any])
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (!js.isUndefined(columnHidden)) __obj.updateDynamic("columnHidden")(columnHidden)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (formulas != null) __obj.updateDynamic("formulas")(formulas)
    if (formulasLocal != null) __obj.updateDynamic("formulasLocal")(formulasLocal)
    if (formulasR1C1 != null) __obj.updateDynamic("formulasR1C1")(formulasR1C1)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id)
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat)
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (!js.isUndefined(rowHidden)) __obj.updateDynamic("rowHidden")(rowHidden)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (text != null) __obj.updateDynamic("text")(text)
    if (valueTypes != null) __obj.updateDynamic("valueTypes")(valueTypes)
    if (values != null) __obj.updateDynamic("values")(values)
    if (worksheet != null) __obj.updateDynamic("worksheet")(worksheet)
    __obj.asInstanceOf[WorkbookRange]
  }
}

