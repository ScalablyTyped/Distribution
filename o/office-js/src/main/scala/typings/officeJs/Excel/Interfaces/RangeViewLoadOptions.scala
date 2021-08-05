package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * RangeView represents a set of visible cells of the parent range.
  *
  * [Api set: ExcelApi 1.3]
  */
trait RangeViewLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the cell addresses of the RangeView.
    *
    * [Api set: ExcelApi 1.3]
    */
  var cellAddresses: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The number of visible columns.
    *
    * [Api set: ExcelApi 1.3]
    */
  var columnCount: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the formula in A1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulas: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasLocal: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the formula in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasR1C1: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns a value that represents the index of the RangeView.
    *
    * [Api set: ExcelApi 1.3]
    */
  var index: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents Excel's number format code for the given cell.
    *
    * [Api set: ExcelApi 1.3]
    */
  var numberFormat: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The number of visible rows.
    *
    * [Api set: ExcelApi 1.3]
    */
  var rowCount: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API.
    *
    * [Api set: ExcelApi 1.3]
    */
  var text: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the type of data of each cell.
    *
    * [Api set: ExcelApi 1.3]
    */
  var valueTypes: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.3]
    */
  var values: js.UndefOr[Boolean] = js.undefined
}
object RangeViewLoadOptions {
  
  inline def apply(): RangeViewLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeViewLoadOptions]
  }
  
  extension [Self <: RangeViewLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setCellAddresses(value: Boolean): Self = StObject.set(x, "cellAddresses", value.asInstanceOf[js.Any])
    
    inline def setCellAddressesUndefined: Self = StObject.set(x, "cellAddresses", js.undefined)
    
    inline def setColumnCount(value: Boolean): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    inline def setFormulas(value: Boolean): Self = StObject.set(x, "formulas", value.asInstanceOf[js.Any])
    
    inline def setFormulasLocal(value: Boolean): Self = StObject.set(x, "formulasLocal", value.asInstanceOf[js.Any])
    
    inline def setFormulasLocalUndefined: Self = StObject.set(x, "formulasLocal", js.undefined)
    
    inline def setFormulasR1C1(value: Boolean): Self = StObject.set(x, "formulasR1C1", value.asInstanceOf[js.Any])
    
    inline def setFormulasR1C1Undefined: Self = StObject.set(x, "formulasR1C1", js.undefined)
    
    inline def setFormulasUndefined: Self = StObject.set(x, "formulas", js.undefined)
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setNumberFormat(value: Boolean): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setRowCount(value: Boolean): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValueTypes(value: Boolean): Self = StObject.set(x, "valueTypes", value.asInstanceOf[js.Any])
    
    inline def setValueTypesUndefined: Self = StObject.set(x, "valueTypes", js.undefined)
    
    inline def setValues(value: Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
