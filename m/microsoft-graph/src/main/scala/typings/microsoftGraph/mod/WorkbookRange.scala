package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookRange
  extends StObject
     with Entity {
  
  /**
    * Represents the range reference in A1-style. Address value will contain the Sheet reference (e.g. Sheet1!A1:B4).
    * Read-only.
    */
  var address: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Represents range reference for the specified range in the language of the user. Read-only.
  var addressLocal: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Number of cells in the range. Read-only.
  var cellCount: js.UndefOr[Double] = js.undefined
  
  // Represents the total number of columns in the range. Read-only.
  var columnCount: js.UndefOr[Double] = js.undefined
  
  // Represents if all columns of the current range are hidden.
  var columnHidden: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Represents the column number of the first cell in the range. Zero-indexed. Read-only.
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  // Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties. Read-only.
  var format: js.UndefOr[NullableOption[WorkbookRangeFormat]] = js.undefined
  
  // Represents the formula in A1-style notation.
  var formulas: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  /**
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the
    * English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
    */
  var formulasLocal: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  // Represents the formula in R1C1-style notation.
  var formulasR1C1: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  // Represents if all cells of the current range are hidden. Read-only.
  var hidden: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Represents Excel's number format code for the given cell.
  var numberFormat: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  // Returns the total number of rows in the range. Read-only.
  var rowCount: js.UndefOr[Double] = js.undefined
  
  // Represents if all rows of the current range are hidden.
  var rowHidden: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Returns the row number of the first cell in the range. Zero-indexed. Read-only.
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  // The worksheet containing the current range. Read-only.
  var sort: js.UndefOr[NullableOption[WorkbookRangeSort]] = js.undefined
  
  /**
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that
    * happens in Excel UI will not affect the text value returned by the API. Read-only.
    */
  var text: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  /**
    * Represents the type of data of each cell. The possible values are: Unknown, Empty, String, Integer, Double, Boolean,
    * Error. Read-only.
    */
  var valueTypes: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  /**
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell
    * that contain an error will return the error string.
    */
  var values: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  // The worksheet containing the current range. Read-only.
  var worksheet: js.UndefOr[NullableOption[WorkbookWorksheet]] = js.undefined
}
object WorkbookRange {
  
  @scala.inline
  def apply(): WorkbookRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRange]
  }
  
  @scala.inline
  implicit class WorkbookRangeMutableBuilder[Self <: WorkbookRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: NullableOption[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLocal(value: NullableOption[String]): Self = StObject.set(x, "addressLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLocalNull: Self = StObject.set(x, "addressLocal", null)
    
    @scala.inline
    def setAddressLocalUndefined: Self = StObject.set(x, "addressLocal", js.undefined)
    
    @scala.inline
    def setAddressNull: Self = StObject.set(x, "address", null)
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setCellCount(value: Double): Self = StObject.set(x, "cellCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellCountUndefined: Self = StObject.set(x, "cellCount", js.undefined)
    
    @scala.inline
    def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    @scala.inline
    def setColumnHidden(value: NullableOption[Boolean]): Self = StObject.set(x, "columnHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnHiddenNull: Self = StObject.set(x, "columnHidden", null)
    
    @scala.inline
    def setColumnHiddenUndefined: Self = StObject.set(x, "columnHidden", js.undefined)
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setFormat(value: NullableOption[WorkbookRangeFormat]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatNull: Self = StObject.set(x, "format", null)
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormulas(value: NullableOption[js.Any]): Self = StObject.set(x, "formulas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulasLocal(value: NullableOption[js.Any]): Self = StObject.set(x, "formulasLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulasLocalNull: Self = StObject.set(x, "formulasLocal", null)
    
    @scala.inline
    def setFormulasLocalUndefined: Self = StObject.set(x, "formulasLocal", js.undefined)
    
    @scala.inline
    def setFormulasNull: Self = StObject.set(x, "formulas", null)
    
    @scala.inline
    def setFormulasR1C1(value: NullableOption[js.Any]): Self = StObject.set(x, "formulasR1C1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulasR1C1Null: Self = StObject.set(x, "formulasR1C1", null)
    
    @scala.inline
    def setFormulasR1C1Undefined: Self = StObject.set(x, "formulasR1C1", js.undefined)
    
    @scala.inline
    def setFormulasUndefined: Self = StObject.set(x, "formulas", js.undefined)
    
    @scala.inline
    def setHidden(value: NullableOption[Boolean]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenNull: Self = StObject.set(x, "hidden", null)
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: NullableOption[js.Any]): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatNull: Self = StObject.set(x, "numberFormat", null)
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    @scala.inline
    def setRowHidden(value: NullableOption[Boolean]): Self = StObject.set(x, "rowHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHiddenNull: Self = StObject.set(x, "rowHidden", null)
    
    @scala.inline
    def setRowHiddenUndefined: Self = StObject.set(x, "rowHidden", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    @scala.inline
    def setSort(value: NullableOption[WorkbookRangeSort]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortNull: Self = StObject.set(x, "sort", null)
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setText(value: NullableOption[js.Any]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextNull: Self = StObject.set(x, "text", null)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setValueTypes(value: NullableOption[js.Any]): Self = StObject.set(x, "valueTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTypesNull: Self = StObject.set(x, "valueTypes", null)
    
    @scala.inline
    def setValueTypesUndefined: Self = StObject.set(x, "valueTypes", js.undefined)
    
    @scala.inline
    def setValues(value: NullableOption[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesNull: Self = StObject.set(x, "values", null)
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setWorksheet(value: NullableOption[WorkbookWorksheet]): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetNull: Self = StObject.set(x, "worksheet", null)
    
    @scala.inline
    def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
  }
}
