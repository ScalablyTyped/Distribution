package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.CellValue
import typings.officeJsPreview.Excel.RangeValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `rangeView.toJSON()`. */
trait RangeViewData extends StObject {
  
  /**
    * Represents the cell addresses of the `RangeView`.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var cellAddresses: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  /**
    * The number of visible columns.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var columnCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the formula in A1-style notation. If a cell has no formula, its value is returned instead.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var formulas: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  /**
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German. If a cell has no formula, its value is returned instead.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var formulasLocal: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  /**
    * Represents the formula in R1C1-style notation. If a cell has no formula, its value is returned instead.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var formulasR1C1: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  /**
    * Returns a value that represents the index of the `RangeView`.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents Excel's number format code for the given cell.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var numberFormat: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  /**
    * The number of visible rows.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents a collection of range views associated with the range.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var rows: js.UndefOr[js.Array[RangeViewData]] = js.undefined
  
  /**
    * Text values of the specified range. The text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var text: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  /**
    * Represents the type of data of each cell.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var valueTypes: js.UndefOr[js.Array[js.Array[RangeValueType]]] = js.undefined
  
  /**
    * Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var values: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  /**
    * A JSON representation of the values in the cells in this range.
    Unlike `RangeView.values`, `RangeView.valuesAsJson` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the en-US locale.  To retrieve data in the user's display locale, use `RangeView.valuesAsJsonLocal`.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var valuesAsJson: js.UndefOr[js.Array[js.Array[CellValue]]] = js.undefined
  
  /**
    * A JSON representation of the values in the cells in this range.
    Unlike `RangeView.values`, `RangeView.valuesAsJsonLocal` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the user's display locale.  To retrieve data independent of locale, use `RangeView.valuesAsJson`.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var valuesAsJsonLocal: js.UndefOr[js.Array[js.Array[CellValue]]] = js.undefined
}
object RangeViewData {
  
  inline def apply(): RangeViewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeViewData]
  }
  
  extension [Self <: RangeViewData](x: Self) {
    
    inline def setCellAddresses(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "cellAddresses", value.asInstanceOf[js.Any])
    
    inline def setCellAddressesUndefined: Self = StObject.set(x, "cellAddresses", js.undefined)
    
    inline def setCellAddressesVarargs(value: js.Array[Any]*): Self = StObject.set(x, "cellAddresses", js.Array(value*))
    
    inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    inline def setFormulas(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "formulas", value.asInstanceOf[js.Any])
    
    inline def setFormulasLocal(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "formulasLocal", value.asInstanceOf[js.Any])
    
    inline def setFormulasLocalUndefined: Self = StObject.set(x, "formulasLocal", js.undefined)
    
    inline def setFormulasLocalVarargs(value: js.Array[Any]*): Self = StObject.set(x, "formulasLocal", js.Array(value*))
    
    inline def setFormulasR1C1(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "formulasR1C1", value.asInstanceOf[js.Any])
    
    inline def setFormulasR1C1Undefined: Self = StObject.set(x, "formulasR1C1", js.undefined)
    
    inline def setFormulasR1C1Varargs(value: js.Array[Any]*): Self = StObject.set(x, "formulasR1C1", js.Array(value*))
    
    inline def setFormulasUndefined: Self = StObject.set(x, "formulas", js.undefined)
    
    inline def setFormulasVarargs(value: js.Array[Any]*): Self = StObject.set(x, "formulas", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setNumberFormat(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setNumberFormatVarargs(value: js.Array[Any]*): Self = StObject.set(x, "numberFormat", js.Array(value*))
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    inline def setRows(value: js.Array[RangeViewData]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: RangeViewData*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setText(value: js.Array[js.Array[String]]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: js.Array[String]*): Self = StObject.set(x, "text", js.Array(value*))
    
    inline def setValueTypes(value: js.Array[js.Array[RangeValueType]]): Self = StObject.set(x, "valueTypes", value.asInstanceOf[js.Any])
    
    inline def setValueTypesUndefined: Self = StObject.set(x, "valueTypes", js.undefined)
    
    inline def setValueTypesVarargs(value: js.Array[RangeValueType]*): Self = StObject.set(x, "valueTypes", js.Array(value*))
    
    inline def setValues(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesAsJson(value: js.Array[js.Array[CellValue]]): Self = StObject.set(x, "valuesAsJson", value.asInstanceOf[js.Any])
    
    inline def setValuesAsJsonLocal(value: js.Array[js.Array[CellValue]]): Self = StObject.set(x, "valuesAsJsonLocal", value.asInstanceOf[js.Any])
    
    inline def setValuesAsJsonLocalUndefined: Self = StObject.set(x, "valuesAsJsonLocal", js.undefined)
    
    inline def setValuesAsJsonLocalVarargs(value: js.Array[CellValue]*): Self = StObject.set(x, "valuesAsJsonLocal", js.Array(value*))
    
    inline def setValuesAsJsonUndefined: Self = StObject.set(x, "valuesAsJson", js.undefined)
    
    inline def setValuesAsJsonVarargs(value: js.Array[CellValue]*): Self = StObject.set(x, "valuesAsJson", js.Array(value*))
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: js.Array[Any]*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
