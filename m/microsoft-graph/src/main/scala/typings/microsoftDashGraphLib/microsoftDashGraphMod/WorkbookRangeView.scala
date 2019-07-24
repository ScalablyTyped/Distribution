package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookRangeView extends Entity {
  // Represents the cell addresses
  var cellAddresses: js.UndefOr[js.Any] = js.undefined
  // Returns the number of visible columns. Read-only.
  var columnCount: js.UndefOr[scala.Double] = js.undefined
  // Represents the formula in A1-style notation.
  var formulas: js.UndefOr[js.Any] = js.undefined
  /**
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the
    * English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
    */
  var formulasLocal: js.UndefOr[js.Any] = js.undefined
  // Represents the formula in R1C1-style notation.
  var formulasR1C1: js.UndefOr[js.Any] = js.undefined
  // Index of the range.
  var index: js.UndefOr[scala.Double] = js.undefined
  // Represents Excel's number format code for the given cell. Read-only.
  var numberFormat: js.UndefOr[js.Any] = js.undefined
  // Returns the number of visible rows. Read-only.
  var rowCount: js.UndefOr[scala.Double] = js.undefined
  // Represents a collection of range views associated with the range. Read-only. Read-only.
  var rows: js.UndefOr[js.Array[WorkbookRangeView]] = js.undefined
  /**
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that
    * happens in Excel UI will not affect the text value returned by the API. Read-only.
    */
  var text: js.UndefOr[js.Any] = js.undefined
  /**
    * Represents the type of data of each cell. Read-only. The possible values are: Unknown, Empty, String, Integer, Double,
    * Boolean, Error.
    */
  var valueTypes: js.UndefOr[js.Any] = js.undefined
  /**
    * Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean.
    * Cell that contain an error will return the error string.
    */
  var values: js.UndefOr[js.Any] = js.undefined
}

object WorkbookRangeView {
  @scala.inline
  def apply(
    cellAddresses: js.Any = null,
    columnCount: scala.Int | scala.Double = null,
    formulas: js.Any = null,
    formulasLocal: js.Any = null,
    formulasR1C1: js.Any = null,
    id: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    numberFormat: js.Any = null,
    rowCount: scala.Int | scala.Double = null,
    rows: js.Array[WorkbookRangeView] = null,
    text: js.Any = null,
    valueTypes: js.Any = null,
    values: js.Any = null
  ): WorkbookRangeView = {
    val __obj = js.Dynamic.literal()
    if (cellAddresses != null) __obj.updateDynamic("cellAddresses")(cellAddresses)
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (formulas != null) __obj.updateDynamic("formulas")(formulas)
    if (formulasLocal != null) __obj.updateDynamic("formulasLocal")(formulasLocal)
    if (formulasR1C1 != null) __obj.updateDynamic("formulasR1C1")(formulasR1C1)
    if (id != null) __obj.updateDynamic("id")(id)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat)
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (text != null) __obj.updateDynamic("text")(text)
    if (valueTypes != null) __obj.updateDynamic("valueTypes")(valueTypes)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[WorkbookRangeView]
  }
}

