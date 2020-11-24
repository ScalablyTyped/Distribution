package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookRangeView extends Entity {
  
  // Represents the cell addresses
  var cellAddresses: js.UndefOr[NullableOption[_]] = js.native
  
  // Returns the number of visible columns. Read-only.
  var columnCount: js.UndefOr[Double] = js.native
  
  // Represents the formula in A1-style notation.
  var formulas: js.UndefOr[NullableOption[_]] = js.native
  
  /**
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the
    * English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
    */
  var formulasLocal: js.UndefOr[NullableOption[_]] = js.native
  
  // Represents the formula in R1C1-style notation.
  var formulasR1C1: js.UndefOr[NullableOption[_]] = js.native
  
  // Index of the range.
  var index: js.UndefOr[Double] = js.native
  
  // Represents Excel's number format code for the given cell. Read-only.
  var numberFormat: js.UndefOr[NullableOption[_]] = js.native
  
  // Returns the number of visible rows. Read-only.
  var rowCount: js.UndefOr[Double] = js.native
  
  // Represents a collection of range views associated with the range. Read-only. Read-only.
  var rows: js.UndefOr[NullableOption[js.Array[WorkbookRangeView]]] = js.native
  
  /**
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that
    * happens in Excel UI will not affect the text value returned by the API. Read-only.
    */
  var text: js.UndefOr[NullableOption[_]] = js.native
  
  /**
    * Represents the type of data of each cell. Read-only. The possible values are: Unknown, Empty, String, Integer, Double,
    * Boolean, Error.
    */
  var valueTypes: js.UndefOr[NullableOption[_]] = js.native
  
  /**
    * Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean.
    * Cell that contain an error will return the error string.
    */
  var values: js.UndefOr[NullableOption[_]] = js.native
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
    def setCellAddresses(value: NullableOption[_]): Self = this.set("cellAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellAddresses: Self = this.set("cellAddresses", js.undefined)
    
    @scala.inline
    def setCellAddressesNull: Self = this.set("cellAddresses", null)
    
    @scala.inline
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
    
    @scala.inline
    def setFormulas(value: NullableOption[_]): Self = this.set("formulas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormulas: Self = this.set("formulas", js.undefined)
    
    @scala.inline
    def setFormulasNull: Self = this.set("formulas", null)
    
    @scala.inline
    def setFormulasLocal(value: NullableOption[_]): Self = this.set("formulasLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormulasLocal: Self = this.set("formulasLocal", js.undefined)
    
    @scala.inline
    def setFormulasLocalNull: Self = this.set("formulasLocal", null)
    
    @scala.inline
    def setFormulasR1C1(value: NullableOption[_]): Self = this.set("formulasR1C1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormulasR1C1: Self = this.set("formulasR1C1", js.undefined)
    
    @scala.inline
    def setFormulasR1C1Null: Self = this.set("formulasR1C1", null)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: NullableOption[_]): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    
    @scala.inline
    def setNumberFormatNull: Self = this.set("numberFormat", null)
    
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: WorkbookRangeView*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: NullableOption[js.Array[WorkbookRangeView]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setRowsNull: Self = this.set("rows", null)
    
    @scala.inline
    def setText(value: NullableOption[_]): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextNull: Self = this.set("text", null)
    
    @scala.inline
    def setValueTypes(value: NullableOption[_]): Self = this.set("valueTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueTypes: Self = this.set("valueTypes", js.undefined)
    
    @scala.inline
    def setValueTypesNull: Self = this.set("valueTypes", null)
    
    @scala.inline
    def setValues(value: NullableOption[_]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    
    @scala.inline
    def setValuesNull: Self = this.set("values", null)
  }
}
