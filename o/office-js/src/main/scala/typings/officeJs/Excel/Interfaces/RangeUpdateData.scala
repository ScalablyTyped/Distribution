package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.RangeHyperlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Range object, for use in `range.set({ ... })`. */
@js.native
trait RangeUpdateData extends js.Object {
  
  /**
    *
    * Represents if all columns of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var columnHidden: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Returns a data validation object.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataValidation: js.UndefOr[DataValidationUpdateData] = js.native
  
  /**
    *
    * Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[RangeFormatUpdateData] = js.native
  
  /**
    *
    * Represents the formula in A1-style notation. If a cell has no formula, its value is returned instead.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulas: js.UndefOr[js.Array[js.Array[_]]] = js.native
  
  /**
    *
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German. If a cell has no formula, its value is returned instead.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulasLocal: js.UndefOr[js.Array[js.Array[_]]] = js.native
  
  /**
    *
    * Represents the formula in R1C1-style notation. If a cell has no formula, its value is returned instead.
    *
    * [Api set: ExcelApi 1.2]
    */
  var formulasR1C1: js.UndefOr[js.Array[js.Array[_]]] = js.native
  
  /**
    *
    * Represents the hyperlink for the current range.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hyperlink: js.UndefOr[RangeHyperlink] = js.native
  
  /**
    *
    * Represents Excel's number format code for the given range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var numberFormat: js.UndefOr[js.Array[js.Array[_]]] = js.native
  
  /**
    *
    * Represents Excel's number format code for the given range, based on the language settings of the user.​
    Excel does not perform any language or format coercion when getting or setting the `numberFormatLocal` property.
    Any returned text uses the locally-formatted strings based on the language specified in the system settings.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormatLocal: js.UndefOr[js.Array[js.Array[_]]] = js.native
  
  /**
    *
    * Represents if all rows of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var rowHidden: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the style of the current range.
    If the styles of the cells are inconsistent, null will be returned.
    For custom styles, the style name will be returned. For built-in styles, a string representing a value in the BuiltInStyle enum will be returned.
    *
    * [Api set: ExcelApi 1.7]
    */
  var style: js.UndefOr[String] = js.native
  
  /**
    *
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.native
}
object RangeUpdateData {
  
  @scala.inline
  def apply(): RangeUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeUpdateData]
  }
  
  @scala.inline
  implicit class RangeUpdateDataOps[Self <: RangeUpdateData] (val x: Self) extends AnyVal {
    
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
    def setColumnHidden(value: Boolean): Self = this.set("columnHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnHidden: Self = this.set("columnHidden", js.undefined)
    
    @scala.inline
    def setDataValidation(value: DataValidationUpdateData): Self = this.set("dataValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataValidation: Self = this.set("dataValidation", js.undefined)
    
    @scala.inline
    def setFormat(value: RangeFormatUpdateData): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormulasVarargs(value: js.Array[js.Any]*): Self = this.set("formulas", js.Array(value :_*))
    
    @scala.inline
    def setFormulas(value: js.Array[js.Array[_]]): Self = this.set("formulas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormulas: Self = this.set("formulas", js.undefined)
    
    @scala.inline
    def setFormulasLocalVarargs(value: js.Array[js.Any]*): Self = this.set("formulasLocal", js.Array(value :_*))
    
    @scala.inline
    def setFormulasLocal(value: js.Array[js.Array[_]]): Self = this.set("formulasLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormulasLocal: Self = this.set("formulasLocal", js.undefined)
    
    @scala.inline
    def setFormulasR1C1Varargs(value: js.Array[js.Any]*): Self = this.set("formulasR1C1", js.Array(value :_*))
    
    @scala.inline
    def setFormulasR1C1(value: js.Array[js.Array[_]]): Self = this.set("formulasR1C1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormulasR1C1: Self = this.set("formulasR1C1", js.undefined)
    
    @scala.inline
    def setHyperlink(value: RangeHyperlink): Self = this.set("hyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyperlink: Self = this.set("hyperlink", js.undefined)
    
    @scala.inline
    def setNumberFormatVarargs(value: js.Array[js.Any]*): Self = this.set("numberFormat", js.Array(value :_*))
    
    @scala.inline
    def setNumberFormat(value: js.Array[js.Array[_]]): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    
    @scala.inline
    def setNumberFormatLocalVarargs(value: js.Array[js.Any]*): Self = this.set("numberFormatLocal", js.Array(value :_*))
    
    @scala.inline
    def setNumberFormatLocal(value: js.Array[js.Array[_]]): Self = this.set("numberFormatLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberFormatLocal: Self = this.set("numberFormatLocal", js.undefined)
    
    @scala.inline
    def setRowHidden(value: Boolean): Self = this.set("rowHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHidden: Self = this.set("rowHidden", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Array[js.Any]*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[js.Array[_]]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
