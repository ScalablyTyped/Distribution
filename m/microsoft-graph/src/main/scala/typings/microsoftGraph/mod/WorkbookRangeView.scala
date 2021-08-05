package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookRangeView
  extends StObject
     with Entity {
  
  // Represents the cell addresses
  var cellAddresses: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  // Returns the number of visible columns. Read-only.
  var columnCount: js.UndefOr[Double] = js.undefined
  
  // Represents the formula in A1-style notation.
  var formulas: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  /**
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the
    * English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
    */
  var formulasLocal: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  // Represents the formula in R1C1-style notation.
  var formulasR1C1: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  // Index of the range.
  var index: js.UndefOr[Double] = js.undefined
  
  // Represents Excel's number format code for the given cell. Read-only.
  var numberFormat: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  // Returns the number of visible rows. Read-only.
  var rowCount: js.UndefOr[Double] = js.undefined
  
  // Represents a collection of range views associated with the range. Read-only. Read-only.
  var rows: js.UndefOr[NullableOption[js.Array[WorkbookRangeView]]] = js.undefined
  
  /**
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that
    * happens in Excel UI will not affect the text value returned by the API. Read-only.
    */
  var text: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  /**
    * Represents the type of data of each cell. Read-only. The possible values are: Unknown, Empty, String, Integer, Double,
    * Boolean, Error.
    */
  var valueTypes: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  /**
    * Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean.
    * Cell that contain an error will return the error string.
    */
  var values: js.UndefOr[NullableOption[js.Any]] = js.undefined
}
object WorkbookRangeView {
  
  inline def apply(): WorkbookRangeView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRangeView]
  }
  
  extension [Self <: WorkbookRangeView](x: Self) {
    
    inline def setCellAddresses(value: NullableOption[js.Any]): Self = StObject.set(x, "cellAddresses", value.asInstanceOf[js.Any])
    
    inline def setCellAddressesNull: Self = StObject.set(x, "cellAddresses", null)
    
    inline def setCellAddressesUndefined: Self = StObject.set(x, "cellAddresses", js.undefined)
    
    inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    inline def setFormulas(value: NullableOption[js.Any]): Self = StObject.set(x, "formulas", value.asInstanceOf[js.Any])
    
    inline def setFormulasLocal(value: NullableOption[js.Any]): Self = StObject.set(x, "formulasLocal", value.asInstanceOf[js.Any])
    
    inline def setFormulasLocalNull: Self = StObject.set(x, "formulasLocal", null)
    
    inline def setFormulasLocalUndefined: Self = StObject.set(x, "formulasLocal", js.undefined)
    
    inline def setFormulasNull: Self = StObject.set(x, "formulas", null)
    
    inline def setFormulasR1C1(value: NullableOption[js.Any]): Self = StObject.set(x, "formulasR1C1", value.asInstanceOf[js.Any])
    
    inline def setFormulasR1C1Null: Self = StObject.set(x, "formulasR1C1", null)
    
    inline def setFormulasR1C1Undefined: Self = StObject.set(x, "formulasR1C1", js.undefined)
    
    inline def setFormulasUndefined: Self = StObject.set(x, "formulas", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setNumberFormat(value: NullableOption[js.Any]): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatNull: Self = StObject.set(x, "numberFormat", null)
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    inline def setRows(value: NullableOption[js.Array[WorkbookRangeView]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsNull: Self = StObject.set(x, "rows", null)
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: WorkbookRangeView*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    inline def setText(value: NullableOption[js.Any]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValueTypes(value: NullableOption[js.Any]): Self = StObject.set(x, "valueTypes", value.asInstanceOf[js.Any])
    
    inline def setValueTypesNull: Self = StObject.set(x, "valueTypes", null)
    
    inline def setValueTypesUndefined: Self = StObject.set(x, "valueTypes", js.undefined)
    
    inline def setValues(value: NullableOption[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
