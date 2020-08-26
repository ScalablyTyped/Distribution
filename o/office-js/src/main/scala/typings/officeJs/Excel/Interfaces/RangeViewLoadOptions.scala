package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * RangeView represents a set of visible cells of the parent range.
  *
  * [Api set: ExcelApi 1.3]
  */
@js.native
trait RangeViewLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the cell addresses of the RangeView.
    *
    * [Api set: ExcelApi 1.3]
    */
  var cellAddresses: js.UndefOr[Boolean] = js.native
  /**
    *
    * The number of visible columns.
    *
    * [Api set: ExcelApi 1.3]
    */
  var columnCount: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the formula in A1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulas: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasLocal: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the formula in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasR1C1: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns a value that represents the index of the RangeView.
    *
    * [Api set: ExcelApi 1.3]
    */
  var index: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents Excel's number format code for the given cell.
    *
    * [Api set: ExcelApi 1.3]
    */
  var numberFormat: js.UndefOr[Boolean] = js.native
  /**
    *
    * The number of visible rows.
    *
    * [Api set: ExcelApi 1.3]
    */
  var rowCount: js.UndefOr[Boolean] = js.native
  /**
    *
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API.
    *
    * [Api set: ExcelApi 1.3]
    */
  var text: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the type of data of each cell.
    *
    * [Api set: ExcelApi 1.3]
    */
  var valueTypes: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.3]
    */
  var values: js.UndefOr[Boolean] = js.native
}

object RangeViewLoadOptions {
  @scala.inline
  def apply(): RangeViewLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeViewLoadOptions]
  }
  @scala.inline
  implicit class RangeViewLoadOptionsOps[Self <: RangeViewLoadOptions] (val x: Self) extends AnyVal {
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setCellAddresses(value: Boolean): Self = this.set("cellAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellAddresses: Self = this.set("cellAddresses", js.undefined)
    @scala.inline
    def setColumnCount(value: Boolean): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
    @scala.inline
    def setFormulas(value: Boolean): Self = this.set("formulas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormulas: Self = this.set("formulas", js.undefined)
    @scala.inline
    def setFormulasLocal(value: Boolean): Self = this.set("formulasLocal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormulasLocal: Self = this.set("formulasLocal", js.undefined)
    @scala.inline
    def setFormulasR1C1(value: Boolean): Self = this.set("formulasR1C1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormulasR1C1: Self = this.set("formulasR1C1", js.undefined)
    @scala.inline
    def setIndex(value: Boolean): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setNumberFormat(value: Boolean): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    @scala.inline
    def setRowCount(value: Boolean): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    @scala.inline
    def setText(value: Boolean): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setValueTypes(value: Boolean): Self = this.set("valueTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueTypes: Self = this.set("valueTypes", js.undefined)
    @scala.inline
    def setValues(value: Boolean): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

