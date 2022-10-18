package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.CellValue
import typings.officeJsPreview.Excel.RangeHyperlink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Range object, for use in `range.set({ ... })`. */
trait RangeUpdateData extends StObject {
  
  /**
    * Represents if all columns in the current range are hidden. Value is `true` when all columns in a range are hidden. Value is `false` when no columns in the range are hidden. Value is `null` when some columns in a range are hidden and other columns in the same range are not hidden.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var columnHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns a data validation object.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var dataValidation: js.UndefOr[DataValidationUpdateData] = js.undefined
  
  /**
    * Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[RangeFormatUpdateData] = js.undefined
  
  /**
    * Represents the formula in A1-style notation. If a cell has no formula, its value is returned instead.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var formulas: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  /**
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German. If a cell has no formula, its value is returned instead.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var formulasLocal: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  /**
    * Represents the formula in R1C1-style notation. If a cell has no formula, its value is returned instead.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var formulasR1C1: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  /**
    * Represents the hyperlink for the current range.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var hyperlink: js.UndefOr[RangeHyperlink] = js.undefined
  
  /**
    * Represents Excel's number format code for the given range. For more information about Excel number formatting, see {@link https://support.microsoft.com/office/number-format-codes-5026bbd6-04bc-48cd-bf33-80f18b4eae68 | Number format codes}.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var numberFormat: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  /**
    * Represents Excel's number format code for the given range, based on the language settings of the user.
    Excel does not perform any language or format coercion when getting or setting the `numberFormatLocal` property.
    Any returned text uses the locally-formatted strings based on the language specified in the system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var numberFormatLocal: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  /**
    * Represents if all rows in the current range are hidden. Value is `true` when all rows in a range are hidden. Value is `false` when no rows in the range are hidden. Value is `null` when some rows in a range are hidden and other rows in the same range are not hidden.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var rowHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the style of the current range.
    If the styles of the cells are inconsistent, `null` will be returned.
    For custom styles, the style name will be returned. For built-in styles, a string representing a value in the `BuiltInStyle` enum will be returned.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the raw values of the specified range. The data returned could be a string, number, or boolean. Cells that contain an error will return the error string.
    If the returned value starts with a plus ("+"), minus ("-"), or equal sign ("="), Excel interprets this value as a formula.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  /**
    * A JSON representation of the values in the cells in this range.
    Unlike `Range.values`, `Range.valuesAsJson` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the en-US locale.  To retrieve data in the user's display locale, use `Range.valuesAsJsonLocal`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var valuesAsJson: js.UndefOr[js.Array[js.Array[CellValue]]] = js.undefined
  
  /**
    * A JSON representation of the values in the cells in this range.
    Unlike `Range.values`, `Range.valuesAsJsonLocal` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the user's display locale.  To retrieve data independent of locale, use `Range.valuesAsJson`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var valuesAsJsonLocal: js.UndefOr[js.Array[js.Array[CellValue]]] = js.undefined
}
object RangeUpdateData {
  
  inline def apply(): RangeUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeUpdateData]
  }
  
  extension [Self <: RangeUpdateData](x: Self) {
    
    inline def setColumnHidden(value: Boolean): Self = StObject.set(x, "columnHidden", value.asInstanceOf[js.Any])
    
    inline def setColumnHiddenUndefined: Self = StObject.set(x, "columnHidden", js.undefined)
    
    inline def setDataValidation(value: DataValidationUpdateData): Self = StObject.set(x, "dataValidation", value.asInstanceOf[js.Any])
    
    inline def setDataValidationUndefined: Self = StObject.set(x, "dataValidation", js.undefined)
    
    inline def setFormat(value: RangeFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormulas(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "formulas", value.asInstanceOf[js.Any])
    
    inline def setFormulasLocal(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "formulasLocal", value.asInstanceOf[js.Any])
    
    inline def setFormulasLocalUndefined: Self = StObject.set(x, "formulasLocal", js.undefined)
    
    inline def setFormulasLocalVarargs(value: js.Array[Any]*): Self = StObject.set(x, "formulasLocal", js.Array(value*))
    
    inline def setFormulasR1C1(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "formulasR1C1", value.asInstanceOf[js.Any])
    
    inline def setFormulasR1C1Undefined: Self = StObject.set(x, "formulasR1C1", js.undefined)
    
    inline def setFormulasR1C1Varargs(value: js.Array[Any]*): Self = StObject.set(x, "formulasR1C1", js.Array(value*))
    
    inline def setFormulasUndefined: Self = StObject.set(x, "formulas", js.undefined)
    
    inline def setFormulasVarargs(value: js.Array[Any]*): Self = StObject.set(x, "formulas", js.Array(value*))
    
    inline def setHyperlink(value: RangeHyperlink): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    inline def setNumberFormat(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatLocal(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "numberFormatLocal", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatLocalUndefined: Self = StObject.set(x, "numberFormatLocal", js.undefined)
    
    inline def setNumberFormatLocalVarargs(value: js.Array[Any]*): Self = StObject.set(x, "numberFormatLocal", js.Array(value*))
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setNumberFormatVarargs(value: js.Array[Any]*): Self = StObject.set(x, "numberFormat", js.Array(value*))
    
    inline def setRowHidden(value: Boolean): Self = StObject.set(x, "rowHidden", value.asInstanceOf[js.Any])
    
    inline def setRowHiddenUndefined: Self = StObject.set(x, "rowHidden", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
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
