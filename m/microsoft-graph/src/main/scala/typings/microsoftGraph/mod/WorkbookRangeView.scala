package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookRangeView extends Entity {
  // Represents the cell addresses
  var cellAddresses: js.UndefOr[js.Any] = js.native
  // Returns the number of visible columns. Read-only.
  var columnCount: js.UndefOr[Double] = js.native
  // Represents the formula in A1-style notation.
  var formulas: js.UndefOr[js.Any] = js.native
  /**
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the
    * English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
    */
  var formulasLocal: js.UndefOr[js.Any] = js.native
  // Represents the formula in R1C1-style notation.
  var formulasR1C1: js.UndefOr[js.Any] = js.native
  // Index of the range.
  var index: js.UndefOr[Double] = js.native
  // Represents Excel's number format code for the given cell. Read-only.
  var numberFormat: js.UndefOr[js.Any] = js.native
  // Returns the number of visible rows. Read-only.
  var rowCount: js.UndefOr[Double] = js.native
  // Represents a collection of range views associated with the range. Read-only. Read-only.
  var rows: js.UndefOr[js.Array[WorkbookRangeView]] = js.native
  /**
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that
    * happens in Excel UI will not affect the text value returned by the API. Read-only.
    */
  var text: js.UndefOr[js.Any] = js.native
  /**
    * Represents the type of data of each cell. Read-only. The possible values are: Unknown, Empty, String, Integer, Double,
    * Boolean, Error.
    */
  var valueTypes: js.UndefOr[js.Any] = js.native
  /**
    * Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean.
    * Cell that contain an error will return the error string.
    */
  var values: js.UndefOr[js.Any] = js.native
}

object WorkbookRangeView {
  @scala.inline
  def apply(): WorkbookRangeView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRangeView]
  }
  @scala.inline
  implicit class WorkbookRangeViewOps[Self <: WorkbookRangeView] (val x: Self) extends AnyVal {
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
    def setCellAddresses(value: js.Any): Self = this.set("cellAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellAddresses: Self = this.set("cellAddresses", js.undefined)
    @scala.inline
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
    @scala.inline
    def setFormulas(value: js.Any): Self = this.set("formulas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormulas: Self = this.set("formulas", js.undefined)
    @scala.inline
    def setFormulasLocal(value: js.Any): Self = this.set("formulasLocal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormulasLocal: Self = this.set("formulasLocal", js.undefined)
    @scala.inline
    def setFormulasR1C1(value: js.Any): Self = this.set("formulasR1C1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormulasR1C1: Self = this.set("formulasR1C1", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setNumberFormat(value: js.Any): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    @scala.inline
    def setRowsVarargs(value: WorkbookRangeView*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[WorkbookRangeView]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setText(value: js.Any): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setValueTypes(value: js.Any): Self = this.set("valueTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueTypes: Self = this.set("valueTypes", js.undefined)
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

