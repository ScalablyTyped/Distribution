package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookRange extends Entity {
  /**
    * Represents the range reference in A1-style. Address value will contain the Sheet reference (e.g. Sheet1!A1:B4).
    * Read-only.
    */
  var address: js.UndefOr[String] = js.undefined
  // Represents range reference for the specified range in the language of the user. Read-only.
  var addressLocal: js.UndefOr[String] = js.undefined
  // Number of cells in the range. Read-only.
  var cellCount: js.UndefOr[Double] = js.undefined
  // Represents the total number of columns in the range. Read-only.
  var columnCount: js.UndefOr[Double] = js.undefined
  // Represents if all columns of the current range are hidden.
  var columnHidden: js.UndefOr[Boolean] = js.undefined
  // Represents the column number of the first cell in the range. Zero-indexed. Read-only.
  var columnIndex: js.UndefOr[Double] = js.undefined
  // Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties. Read-only.
  var format: js.UndefOr[WorkbookRangeFormat] = js.undefined
  // Represents the formula in A1-style notation.
  var formulas: js.UndefOr[js.Any] = js.undefined
  /**
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the
    * English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
    */
  var formulasLocal: js.UndefOr[js.Any] = js.undefined
  // Represents the formula in R1C1-style notation.
  var formulasR1C1: js.UndefOr[js.Any] = js.undefined
  // Represents if all cells of the current range are hidden. Read-only.
  var hidden: js.UndefOr[Boolean] = js.undefined
  // Represents Excel's number format code for the given cell.
  var numberFormat: js.UndefOr[js.Any] = js.undefined
  // Returns the total number of rows in the range. Read-only.
  var rowCount: js.UndefOr[Double] = js.undefined
  // Represents if all rows of the current range are hidden.
  var rowHidden: js.UndefOr[Boolean] = js.undefined
  // Returns the row number of the first cell in the range. Zero-indexed. Read-only.
  var rowIndex: js.UndefOr[Double] = js.undefined
  // The worksheet containing the current range. Read-only.
  var sort: js.UndefOr[WorkbookRangeSort] = js.undefined
  /**
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that
    * happens in Excel UI will not affect the text value returned by the API. Read-only.
    */
  var text: js.UndefOr[js.Any] = js.undefined
  /**
    * Represents the type of data of each cell. The possible values are: Unknown, Empty, String, Integer, Double, Boolean,
    * Error. Read-only.
    */
  var valueTypes: js.UndefOr[js.Any] = js.undefined
  /**
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell
    * that contain an error will return the error string.
    */
  var values: js.UndefOr[js.Any] = js.undefined
  // The worksheet containing the current range. Read-only.
  var worksheet: js.UndefOr[WorkbookWorksheet] = js.undefined
}

object WorkbookRange {
  @scala.inline
  def apply(
    address: String = null,
    addressLocal: String = null,
    cellCount: js.UndefOr[Double] = js.undefined,
    columnCount: js.UndefOr[Double] = js.undefined,
    columnHidden: js.UndefOr[Boolean] = js.undefined,
    columnIndex: js.UndefOr[Double] = js.undefined,
    format: WorkbookRangeFormat = null,
    formulas: js.Any = null,
    formulasLocal: js.Any = null,
    formulasR1C1: js.Any = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    numberFormat: js.Any = null,
    rowCount: js.UndefOr[Double] = js.undefined,
    rowHidden: js.UndefOr[Boolean] = js.undefined,
    rowIndex: js.UndefOr[Double] = js.undefined,
    sort: WorkbookRangeSort = null,
    text: js.Any = null,
    valueTypes: js.Any = null,
    values: js.Any = null,
    worksheet: WorkbookWorksheet = null
  ): WorkbookRange = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (addressLocal != null) __obj.updateDynamic("addressLocal")(addressLocal.asInstanceOf[js.Any])
    if (!js.isUndefined(cellCount)) __obj.updateDynamic("cellCount")(cellCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnCount)) __obj.updateDynamic("columnCount")(columnCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnHidden)) __obj.updateDynamic("columnHidden")(columnHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formulas != null) __obj.updateDynamic("formulas")(formulas.asInstanceOf[js.Any])
    if (formulasLocal != null) __obj.updateDynamic("formulasLocal")(formulasLocal.asInstanceOf[js.Any])
    if (formulasR1C1 != null) __obj.updateDynamic("formulasR1C1")(formulasR1C1.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCount)) __obj.updateDynamic("rowCount")(rowCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowHidden)) __obj.updateDynamic("rowHidden")(rowHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (valueTypes != null) __obj.updateDynamic("valueTypes")(valueTypes.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (worksheet != null) __obj.updateDynamic("worksheet")(worksheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookRange]
  }
}

