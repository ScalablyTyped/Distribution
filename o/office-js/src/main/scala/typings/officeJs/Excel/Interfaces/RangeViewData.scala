package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.RangeValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `rangeView.toJSON()`. */
@js.native
trait RangeViewData extends js.Object {
  /**
    *
    * Represents the cell addresses of the RangeView.
    *
    * [Api set: ExcelApi 1.3]
    */
  var cellAddresses: js.UndefOr[js.Array[js.Array[_]]] = js.native
  /**
    *
    * The number of visible columns.
    *
    * [Api set: ExcelApi 1.3]
    */
  var columnCount: js.UndefOr[Double] = js.native
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
    * Returns a value that represents the index of the RangeView.
    *
    * [Api set: ExcelApi 1.3]
    */
  var index: js.UndefOr[Double] = js.native
  /**
    *
    * Represents Excel's number format code for the given cell.
    *
    * [Api set: ExcelApi 1.3]
    */
  var numberFormat: js.UndefOr[js.Array[js.Array[_]]] = js.native
  /**
    *
    * The number of visible rows.
    *
    * [Api set: ExcelApi 1.3]
    */
  var rowCount: js.UndefOr[Double] = js.native
  /**
    *
    * Represents a collection of range views associated with the range.
    *
    * [Api set: ExcelApi 1.3]
    */
  var rows: js.UndefOr[js.Array[RangeViewData]] = js.native
  /**
    *
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API.
    *
    * [Api set: ExcelApi 1.3]
    */
  var text: js.UndefOr[js.Array[js.Array[String]]] = js.native
  /**
    *
    * Represents the type of data of each cell.
    *
    * [Api set: ExcelApi 1.3]
    */
  var valueTypes: js.UndefOr[js.Array[js.Array[RangeValueType]]] = js.native
  /**
    *
    * Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.3]
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.native
}

object RangeViewData {
  @scala.inline
  def apply(): RangeViewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeViewData]
  }
  @scala.inline
  implicit class RangeViewDataOps[Self <: RangeViewData] (val x: Self) extends AnyVal {
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
    def setCellAddressesVarargs(value: js.Array[js.Any]*): Self = this.set("cellAddresses", js.Array(value :_*))
    @scala.inline
    def setCellAddresses(value: js.Array[js.Array[_]]): Self = this.set("cellAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellAddresses: Self = this.set("cellAddresses", js.undefined)
    @scala.inline
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setNumberFormatVarargs(value: js.Array[js.Any]*): Self = this.set("numberFormat", js.Array(value :_*))
    @scala.inline
    def setNumberFormat(value: js.Array[js.Array[_]]): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    @scala.inline
    def setRowsVarargs(value: RangeViewData*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[RangeViewData]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setTextVarargs(value: js.Array[String]*): Self = this.set("text", js.Array(value :_*))
    @scala.inline
    def setText(value: js.Array[js.Array[String]]): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setValueTypesVarargs(value: js.Array[RangeValueType]*): Self = this.set("valueTypes", js.Array(value :_*))
    @scala.inline
    def setValueTypes(value: js.Array[js.Array[RangeValueType]]): Self = this.set("valueTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueTypes: Self = this.set("valueTypes", js.undefined)
    @scala.inline
    def setValuesVarargs(value: js.Array[js.Any]*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[js.Array[_]]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

