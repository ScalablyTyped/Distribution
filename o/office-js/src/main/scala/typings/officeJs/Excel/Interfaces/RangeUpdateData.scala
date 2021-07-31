package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.RangeHyperlink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Range object, for use in `range.set({ ... })`. */
trait RangeUpdateData extends StObject {
  
  /**
    *
    * Represents if all columns of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var columnHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns a data validation object.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataValidation: js.UndefOr[DataValidationUpdateData] = js.undefined
  
  /**
    *
    * Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[RangeFormatUpdateData] = js.undefined
  
  /**
    *
    * Represents the formula in A1-style notation. If a cell has no formula, its value is returned instead.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulas: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
  
  /**
    *
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German. If a cell has no formula, its value is returned instead.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulasLocal: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
  
  /**
    *
    * Represents the formula in R1C1-style notation. If a cell has no formula, its value is returned instead.
    *
    * [Api set: ExcelApi 1.2]
    */
  var formulasR1C1: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
  
  /**
    *
    * Represents the hyperlink for the current range.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hyperlink: js.UndefOr[RangeHyperlink] = js.undefined
  
  /**
    *
    * Represents Excel's number format code for the given range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var numberFormat: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
  
  /**
    *
    * Represents Excel's number format code for the given range, based on the language settings of the user.​
    Excel does not perform any language or format coercion when getting or setting the `numberFormatLocal` property.
    Any returned text uses the locally-formatted strings based on the language specified in the system settings.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormatLocal: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
  
  /**
    *
    * Represents if all rows of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var rowHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the style of the current range.
    If the styles of the cells are inconsistent, null will be returned.
    For custom styles, the style name will be returned. For built-in styles, a string representing a value in the BuiltInStyle enum will be returned.
    *
    * [Api set: ExcelApi 1.7]
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
}
object RangeUpdateData {
  
  @scala.inline
  def apply(): RangeUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeUpdateData]
  }
  
  @scala.inline
  implicit class RangeUpdateDataMutableBuilder[Self <: RangeUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnHidden(value: Boolean): Self = StObject.set(x, "columnHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnHiddenUndefined: Self = StObject.set(x, "columnHidden", js.undefined)
    
    @scala.inline
    def setDataValidation(value: DataValidationUpdateData): Self = StObject.set(x, "dataValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataValidationUndefined: Self = StObject.set(x, "dataValidation", js.undefined)
    
    @scala.inline
    def setFormat(value: RangeFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
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
    def setHyperlink(value: RangeHyperlink): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatLocal(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "numberFormatLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatLocalUndefined: Self = StObject.set(x, "numberFormatLocal", js.undefined)
    
    @scala.inline
    def setNumberFormatLocalVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "numberFormatLocal", js.Array(value :_*))
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    @scala.inline
    def setNumberFormatVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "numberFormat", js.Array(value :_*))
    
    @scala.inline
    def setRowHidden(value: Boolean): Self = StObject.set(x, "rowHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHiddenUndefined: Self = StObject.set(x, "rowHidden", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
