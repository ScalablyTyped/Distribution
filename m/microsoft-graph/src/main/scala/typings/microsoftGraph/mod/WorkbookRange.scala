package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookRange extends Entity {
  
  /**
    * Represents the range reference in A1-style. Address value will contain the Sheet reference (e.g. Sheet1!A1:B4).
    * Read-only.
    */
  var address: js.UndefOr[NullableOption[String]] = js.native
  
  // Represents range reference for the specified range in the language of the user. Read-only.
  var addressLocal: js.UndefOr[NullableOption[String]] = js.native
  
  // Number of cells in the range. Read-only.
  var cellCount: js.UndefOr[Double] = js.native
  
  // Represents the total number of columns in the range. Read-only.
  var columnCount: js.UndefOr[Double] = js.native
  
  // Represents if all columns of the current range are hidden.
  var columnHidden: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Represents the column number of the first cell in the range. Zero-indexed. Read-only.
  var columnIndex: js.UndefOr[Double] = js.native
  
  // Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties. Read-only.
  var format: js.UndefOr[NullableOption[WorkbookRangeFormat]] = js.native
  
  // Represents the formula in A1-style notation.
  var formulas: js.UndefOr[NullableOption[_]] = js.native
  
  /**
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the
    * English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
    */
  var formulasLocal: js.UndefOr[NullableOption[_]] = js.native
  
  // Represents the formula in R1C1-style notation.
  var formulasR1C1: js.UndefOr[NullableOption[_]] = js.native
  
  // Represents if all cells of the current range are hidden. Read-only.
  var hidden: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Represents Excel's number format code for the given cell.
  var numberFormat: js.UndefOr[NullableOption[_]] = js.native
  
  // Returns the total number of rows in the range. Read-only.
  var rowCount: js.UndefOr[Double] = js.native
  
  // Represents if all rows of the current range are hidden.
  var rowHidden: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Returns the row number of the first cell in the range. Zero-indexed. Read-only.
  var rowIndex: js.UndefOr[Double] = js.native
  
  // The worksheet containing the current range. Read-only.
  var sort: js.UndefOr[NullableOption[WorkbookRangeSort]] = js.native
  
  /**
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that
    * happens in Excel UI will not affect the text value returned by the API. Read-only.
    */
  var text: js.UndefOr[NullableOption[_]] = js.native
  
  /**
    * Represents the type of data of each cell. The possible values are: Unknown, Empty, String, Integer, Double, Boolean,
    * Error. Read-only.
    */
  var valueTypes: js.UndefOr[NullableOption[_]] = js.native
  
  /**
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell
    * that contain an error will return the error string.
    */
  var values: js.UndefOr[NullableOption[_]] = js.native
  
  // The worksheet containing the current range. Read-only.
  var worksheet: js.UndefOr[NullableOption[WorkbookWorksheet]] = js.native
}
object WorkbookRange {
  
  @scala.inline
  def apply(): WorkbookRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRange]
  }
  
  @scala.inline
  implicit class WorkbookRangeOps[Self <: WorkbookRange] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: NullableOption[String]): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setAddressNull: Self = this.set("address", null)
    
    @scala.inline
    def setAddressLocal(value: NullableOption[String]): Self = this.set("addressLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressLocal: Self = this.set("addressLocal", js.undefined)
    
    @scala.inline
    def setAddressLocalNull: Self = this.set("addressLocal", null)
    
    @scala.inline
    def setCellCount(value: Double): Self = this.set("cellCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellCount: Self = this.set("cellCount", js.undefined)
    
    @scala.inline
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
    
    @scala.inline
    def setColumnHidden(value: NullableOption[Boolean]): Self = this.set("columnHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnHidden: Self = this.set("columnHidden", js.undefined)
    
    @scala.inline
    def setColumnHiddenNull: Self = this.set("columnHidden", null)
    
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    
    @scala.inline
    def setFormat(value: NullableOption[WorkbookRangeFormat]): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormatNull: Self = this.set("format", null)
    
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
    def setHidden(value: NullableOption[Boolean]): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHiddenNull: Self = this.set("hidden", null)
    
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
    def setRowHidden(value: NullableOption[Boolean]): Self = this.set("rowHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHidden: Self = this.set("rowHidden", js.undefined)
    
    @scala.inline
    def setRowHiddenNull: Self = this.set("rowHidden", null)
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    
    @scala.inline
    def setSort(value: NullableOption[WorkbookRangeSort]): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setSortNull: Self = this.set("sort", null)
    
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
    
    @scala.inline
    def setWorksheet(value: NullableOption[WorkbookWorksheet]): Self = this.set("worksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorksheet: Self = this.set("worksheet", js.undefined)
    
    @scala.inline
    def setWorksheetNull: Self = this.set("worksheet", null)
  }
}
