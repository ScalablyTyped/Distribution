package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.RangeValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `rangeView.toJSON()`. */
trait RangeViewData extends StObject {
  
  /**
    *
    * Represents the cell addresses of the RangeView.
    *
    * [Api set: ExcelApi 1.3]
    */
  var cellAddresses: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
  
  /**
    *
    * The number of visible columns.
    *
    * [Api set: ExcelApi 1.3]
    */
  var columnCount: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents the formula in A1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulas: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
  
  /**
    *
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasLocal: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
  
  /**
    *
    * Represents the formula in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasR1C1: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
  
  /**
    *
    * Returns a value that represents the index of the RangeView.
    *
    * [Api set: ExcelApi 1.3]
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents Excel's number format code for the given cell.
    *
    * [Api set: ExcelApi 1.3]
    */
  var numberFormat: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
  
  /**
    *
    * The number of visible rows.
    *
    * [Api set: ExcelApi 1.3]
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents a collection of range views associated with the range.
    *
    * [Api set: ExcelApi 1.3]
    */
  var rows: js.UndefOr[js.Array[RangeViewData]] = js.undefined
  
  /**
    *
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API.
    *
    * [Api set: ExcelApi 1.3]
    */
  var text: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  /**
    *
    * Represents the type of data of each cell.
    *
    * [Api set: ExcelApi 1.3]
    */
  var valueTypes: js.UndefOr[js.Array[js.Array[RangeValueType]]] = js.undefined
  
  /**
    *
    * Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.3]
    */
  var values: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
}
object RangeViewData {
  
  @scala.inline
  def apply(): RangeViewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeViewData]
  }
  
  @scala.inline
  implicit class RangeViewDataMutableBuilder[Self <: RangeViewData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellAddresses(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "cellAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellAddressesUndefined: Self = StObject.set(x, "cellAddresses", js.undefined)
    
    @scala.inline
    def setCellAddressesVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "cellAddresses", js.Array(value :_*))
    
    @scala.inline
    def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    @scala.inline
    def setFormulas(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "formulas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulasLocal(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "formulasLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulasLocalUndefined: Self = StObject.set(x, "formulasLocal", js.undefined)
    
    @scala.inline
    def setFormulasLocalVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "formulasLocal", js.Array(value :_*))
    
    @scala.inline
    def setFormulasR1C1(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "formulasR1C1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulasR1C1Undefined: Self = StObject.set(x, "formulasR1C1", js.undefined)
    
    @scala.inline
    def setFormulasR1C1Varargs(value: js.Array[js.Any]*): Self = StObject.set(x, "formulasR1C1", js.Array(value :_*))
    
    @scala.inline
    def setFormulasUndefined: Self = StObject.set(x, "formulas", js.undefined)
    
    @scala.inline
    def setFormulasVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "formulas", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    @scala.inline
    def setNumberFormatVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "numberFormat", js.Array(value :_*))
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[RangeViewData]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: RangeViewData*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setText(value: js.Array[js.Array[String]]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTextVarargs(value: js.Array[String]*): Self = StObject.set(x, "text", js.Array(value :_*))
    
    @scala.inline
    def setValueTypes(value: js.Array[js.Array[RangeValueType]]): Self = StObject.set(x, "valueTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTypesUndefined: Self = StObject.set(x, "valueTypes", js.undefined)
    
    @scala.inline
    def setValueTypesVarargs(value: js.Array[RangeValueType]*): Self = StObject.set(x, "valueTypes", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
