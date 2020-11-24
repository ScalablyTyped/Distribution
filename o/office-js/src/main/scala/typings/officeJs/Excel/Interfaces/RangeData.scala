package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.LinkedDataTypeState
import typings.officeJs.Excel.NumberFormatCategory
import typings.officeJs.Excel.RangeHyperlink
import typings.officeJs.Excel.RangeValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `range.toJSON()`. */
@js.native
trait RangeData extends js.Object {
  
  /**
    *
    * Specifies the range reference in A1-style. Address value will contain the Sheet reference (e.g., "Sheet1!A1:B4").
    *
    * [Api set: ExcelApi 1.1]
    */
  var address: js.UndefOr[String] = js.native
  
  /**
    *
    * Specifies the range reference for the specified range in the language of the user.
    *
    * [Api set: ExcelApi 1.1]
    */
  var addressLocal: js.UndefOr[String] = js.native
  
  /**
    *
    * Specifies the number of cells in the range. This API will return -1 if the cell count exceeds 2^31-1 (2,147,483,647).
    *
    * [Api set: ExcelApi 1.1]
    */
  var cellCount: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the total number of columns in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columnCount: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents if all columns of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var columnHidden: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies the column number of the first cell in the range. Zero-indexed.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columnIndex: js.UndefOr[Double] = js.native
  
  /**
    *
    * The collection of ConditionalFormats that intersect the range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var conditionalFormats: js.UndefOr[js.Array[ConditionalFormatData]] = js.native
  
  /**
    *
    * Returns a data validation object.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataValidation: js.UndefOr[DataValidationData] = js.native
  
  /**
    *
    * Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[RangeFormatData] = js.native
  
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
    * Represents if all cells have a spill border.
    Returns true if all cells have a spill border, or false if all cells do not have a spill border.
    Returns null if there are cells both with and without spill borders within the range.
    *
    * [Api set: ExcelApi 1.12]
    */
  var hasSpill: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Returns the distance in points, for 100% zoom, from top edge of the range to bottom edge of the range.
    *
    * [Api set: ExcelApi 1.10]
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents if all cells of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the hyperlink for the current range.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hyperlink: js.UndefOr[RangeHyperlink] = js.native
  
  /**
    *
    * Represents if the current range is an entire column.
    *
    * [Api set: ExcelApi 1.7]
    */
  var isEntireColumn: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents if the current range is an entire row.
    *
    * [Api set: ExcelApi 1.7]
    */
  var isEntireRow: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Returns the distance in points, for 100% zoom, from left edge of the worksheet to left edge of the range.
    *
    * [Api set: ExcelApi 1.10]
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents the data type state of each cell.
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkedDataTypeState: js.UndefOr[js.Array[js.Array[LinkedDataTypeState]]] = js.native
  
  /**
    *
    * Represents Excel's number format code for the given range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var numberFormat: js.UndefOr[js.Array[js.Array[_]]] = js.native
  
  /**
    *
    * Represents the category of number format of each cell.
    *
    * [Api set: ExcelApi 1.12]
    */
  var numberFormatCategories: js.UndefOr[js.Array[js.Array[NumberFormatCategory]]] = js.native
  
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
    * Returns the total number of rows in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rowCount: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents if all rows of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var rowHidden: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Returns the row number of the first cell in the range. Zero-indexed.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rowIndex: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents if ALL the cells would be saved as an array formula.
    Returns true if ALL cells would be saved as an array formula, or false if ALL cells would NOT be saved as an array formula.
    Returns null if some cells would be saved as an array formula and some would not be.
    *
    * [Api set: ExcelApi 1.12]
    */
  var savedAsArray: js.UndefOr[Boolean] = js.native
  
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
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API.
    *
    * [Api set: ExcelApi 1.1]
    */
  var text: js.UndefOr[js.Array[js.Array[String]]] = js.native
  
  /**
    *
    * Returns the distance in points, for 100% zoom, from top edge of the worksheet to top edge of the range.
    *
    * [Api set: ExcelApi 1.10]
    */
  var top: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the type of data in each cell.
    *
    * [Api set: ExcelApi 1.1]
    */
  var valueTypes: js.UndefOr[js.Array[js.Array[RangeValueType]]] = js.native
  
  /**
    *
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.native
  
  /**
    *
    * Returns the distance in points, for 100% zoom, from left edge of the range to right edge of the range.
    *
    * [Api set: ExcelApi 1.10]
    */
  var width: js.UndefOr[Double] = js.native
}
object RangeData {
  
  @scala.inline
  def apply(): RangeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeData]
  }
  
  @scala.inline
  implicit class RangeDataOps[Self <: RangeData] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setAddressLocal(value: String): Self = this.set("addressLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressLocal: Self = this.set("addressLocal", js.undefined)
    
    @scala.inline
    def setCellCount(value: Double): Self = this.set("cellCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellCount: Self = this.set("cellCount", js.undefined)
    
    @scala.inline
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
    
    @scala.inline
    def setColumnHidden(value: Boolean): Self = this.set("columnHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnHidden: Self = this.set("columnHidden", js.undefined)
    
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    
    @scala.inline
    def setConditionalFormatsVarargs(value: ConditionalFormatData*): Self = this.set("conditionalFormats", js.Array(value :_*))
    
    @scala.inline
    def setConditionalFormats(value: js.Array[ConditionalFormatData]): Self = this.set("conditionalFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionalFormats: Self = this.set("conditionalFormats", js.undefined)
    
    @scala.inline
    def setDataValidation(value: DataValidationData): Self = this.set("dataValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataValidation: Self = this.set("dataValidation", js.undefined)
    
    @scala.inline
    def setFormat(value: RangeFormatData): Self = this.set("format", value.asInstanceOf[js.Any])
    
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
    def setHasSpill(value: Boolean): Self = this.set("hasSpill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasSpill: Self = this.set("hasSpill", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHyperlink(value: RangeHyperlink): Self = this.set("hyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyperlink: Self = this.set("hyperlink", js.undefined)
    
    @scala.inline
    def setIsEntireColumn(value: Boolean): Self = this.set("isEntireColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEntireColumn: Self = this.set("isEntireColumn", js.undefined)
    
    @scala.inline
    def setIsEntireRow(value: Boolean): Self = this.set("isEntireRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEntireRow: Self = this.set("isEntireRow", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setLinkedDataTypeStateVarargs(value: js.Array[LinkedDataTypeState]*): Self = this.set("linkedDataTypeState", js.Array(value :_*))
    
    @scala.inline
    def setLinkedDataTypeState(value: js.Array[js.Array[LinkedDataTypeState]]): Self = this.set("linkedDataTypeState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedDataTypeState: Self = this.set("linkedDataTypeState", js.undefined)
    
    @scala.inline
    def setNumberFormatVarargs(value: js.Array[js.Any]*): Self = this.set("numberFormat", js.Array(value :_*))
    
    @scala.inline
    def setNumberFormat(value: js.Array[js.Array[_]]): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    
    @scala.inline
    def setNumberFormatCategoriesVarargs(value: js.Array[NumberFormatCategory]*): Self = this.set("numberFormatCategories", js.Array(value :_*))
    
    @scala.inline
    def setNumberFormatCategories(value: js.Array[js.Array[NumberFormatCategory]]): Self = this.set("numberFormatCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberFormatCategories: Self = this.set("numberFormatCategories", js.undefined)
    
    @scala.inline
    def setNumberFormatLocalVarargs(value: js.Array[js.Any]*): Self = this.set("numberFormatLocal", js.Array(value :_*))
    
    @scala.inline
    def setNumberFormatLocal(value: js.Array[js.Array[_]]): Self = this.set("numberFormatLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberFormatLocal: Self = this.set("numberFormatLocal", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    
    @scala.inline
    def setRowHidden(value: Boolean): Self = this.set("rowHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHidden: Self = this.set("rowHidden", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    
    @scala.inline
    def setSavedAsArray(value: Boolean): Self = this.set("savedAsArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavedAsArray: Self = this.set("savedAsArray", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTextVarargs(value: js.Array[String]*): Self = this.set("text", js.Array(value :_*))
    
    @scala.inline
    def setText(value: js.Array[js.Array[String]]): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setValueTypesVarargs(value: js.Array[RangeValueType]*): Self = this.set("valueTypes", js.Array(value :_*))
    
    @scala.inline
    def setValueTypes(value: js.Array[js.Array[RangeValueType]]): Self = this.set("valueTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueTypes: Self = this.set("valueTypes", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Array[js.Any]*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[js.Array[_]]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
