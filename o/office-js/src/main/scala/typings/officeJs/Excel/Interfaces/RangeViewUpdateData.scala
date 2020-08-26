package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the RangeView object, for use in `rangeView.set({ ... })`. */
@js.native
trait RangeViewUpdateData extends js.Object {
  /**
    *
    * Represents the formula in A1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulas: js.UndefOr[js.Array[js.Array[_]]] = js.native
  /**
    *
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasLocal: js.UndefOr[js.Array[js.Array[_]]] = js.native
  /**
    *
    * Represents the formula in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasR1C1: js.UndefOr[js.Array[js.Array[_]]] = js.native
  /**
    *
    * Represents Excel's number format code for the given cell.
    *
    * [Api set: ExcelApi 1.3]
    */
  var numberFormat: js.UndefOr[js.Array[js.Array[_]]] = js.native
  /**
    *
    * Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.3]
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.native
}

object RangeViewUpdateData {
  @scala.inline
  def apply(): RangeViewUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeViewUpdateData]
  }
  @scala.inline
  implicit class RangeViewUpdateDataOps[Self <: RangeViewUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormulasVarargs(value: js.Array[js.Any]*): Self = this.set("formulas", js.Array(value :_*))
    @scala.inline
    def setFormulas(value: js.Array[js.Array[_]]): Self = this.set("formulas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormulas: Self = this.set("formulas", js.undefined)
    @scala.inline
    def setFormulasLocalVarargs(value: js.Array[js.Any]*): Self = this.set("formulasLocal", js.Array(value :_*))
    @scala.inline
    def setFormulasLocal(value: js.Array[js.Array[_]]): Self = this.set("formulasLocal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormulasLocal: Self = this.set("formulasLocal", js.undefined)
    @scala.inline
    def setFormulasR1C1Varargs(value: js.Array[js.Any]*): Self = this.set("formulasR1C1", js.Array(value :_*))
    @scala.inline
    def setFormulasR1C1(value: js.Array[js.Array[_]]): Self = this.set("formulasR1C1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormulasR1C1: Self = this.set("formulasR1C1", js.undefined)
    @scala.inline
    def setNumberFormatVarargs(value: js.Array[js.Any]*): Self = this.set("numberFormat", js.Array(value :_*))
    @scala.inline
    def setNumberFormat(value: js.Array[js.Array[_]]): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    @scala.inline
    def setValuesVarargs(value: js.Array[js.Any]*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[js.Array[_]]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

