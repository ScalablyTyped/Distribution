package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class WorkbookRangeViewMutableBuilder[Self <: WorkbookRangeView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellAddresses(value: NullableOption[_]): Self = StObject.set(x, "cellAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellAddressesNull: Self = StObject.set(x, "cellAddresses", null)
    
    @scala.inline
    def setCellAddressesUndefined: Self = StObject.set(x, "cellAddresses", js.undefined)
    
    @scala.inline
    def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    @scala.inline
    def setFormulas(value: NullableOption[_]): Self = StObject.set(x, "formulas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulasLocal(value: NullableOption[_]): Self = StObject.set(x, "formulasLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulasLocalNull: Self = StObject.set(x, "formulasLocal", null)
    
    @scala.inline
    def setFormulasLocalUndefined: Self = StObject.set(x, "formulasLocal", js.undefined)
    
    @scala.inline
    def setFormulasNull: Self = StObject.set(x, "formulas", null)
    
    @scala.inline
    def setFormulasR1C1(value: NullableOption[_]): Self = StObject.set(x, "formulasR1C1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulasR1C1Null: Self = StObject.set(x, "formulasR1C1", null)
    
    @scala.inline
    def setFormulasR1C1Undefined: Self = StObject.set(x, "formulasR1C1", js.undefined)
    
    @scala.inline
    def setFormulasUndefined: Self = StObject.set(x, "formulas", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: NullableOption[_]): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatNull: Self = StObject.set(x, "numberFormat", null)
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    @scala.inline
    def setRows(value: NullableOption[js.Array[WorkbookRangeView]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsNull: Self = StObject.set(x, "rows", null)
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: WorkbookRangeView*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setText(value: NullableOption[_]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextNull: Self = StObject.set(x, "text", null)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setValueTypes(value: NullableOption[_]): Self = StObject.set(x, "valueTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTypesNull: Self = StObject.set(x, "valueTypes", null)
    
    @scala.inline
    def setValueTypesUndefined: Self = StObject.set(x, "valueTypes", js.undefined)
    
    @scala.inline
    def setValues(value: NullableOption[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesNull: Self = StObject.set(x, "values", null)
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
