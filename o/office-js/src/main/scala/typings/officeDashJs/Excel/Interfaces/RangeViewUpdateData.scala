package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the RangeView object, for use in `rangeView.set({ ... })`. */
trait RangeViewUpdateData extends js.Object {
  /**
    *
    * Represents the formula in A1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulas: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
    *
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasLocal: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
    *
    * Represents the formula in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasR1C1: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
    *
    * Represents Excel's number format code for the given cell.
    *
    * [Api set: ExcelApi 1.3]
    */
  var numberFormat: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
    *
    * Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.3]
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
}

object RangeViewUpdateData {
  @scala.inline
  def apply(
    formulas: js.Array[js.Array[_]] = null,
    formulasLocal: js.Array[js.Array[_]] = null,
    formulasR1C1: js.Array[js.Array[_]] = null,
    numberFormat: js.Array[js.Array[_]] = null,
    values: js.Array[js.Array[_]] = null
  ): RangeViewUpdateData = {
    val __obj = js.Dynamic.literal()
    if (formulas != null) __obj.updateDynamic("formulas")(formulas)
    if (formulasLocal != null) __obj.updateDynamic("formulasLocal")(formulasLocal)
    if (formulasR1C1 != null) __obj.updateDynamic("formulasR1C1")(formulasR1C1)
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[RangeViewUpdateData]
  }
}

