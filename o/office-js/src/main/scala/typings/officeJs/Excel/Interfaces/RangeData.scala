package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.LinkedDataTypeState
import typings.officeJs.Excel.NumberFormatCategory
import typings.officeJs.Excel.RangeHyperlink
import typings.officeJs.Excel.RangeValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `range.toJSON()`. */
trait RangeData extends StObject {
  
  /**
    *
    * Specifies the range reference in A1-style. Address value will contain the Sheet reference (e.g., "Sheet1!A1:B4").
    *
    * [Api set: ExcelApi 1.1]
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Specifies the range reference for the specified range in the language of the user.
    *
    * [Api set: ExcelApi 1.1]
    */
  var addressLocal: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Specifies the number of cells in the range. This API will return -1 if the cell count exceeds 2^31-1 (2,147,483,647).
    *
    * [Api set: ExcelApi 1.1]
    */
  var cellCount: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies the total number of columns in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columnCount: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents if all columns of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var columnHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the column number of the first cell in the range. Zero-indexed.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * The collection of ConditionalFormats that intersect the range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var conditionalFormats: js.UndefOr[js.Array[ConditionalFormatData]] = js.undefined
  
  /**
    *
    * Returns a data validation object.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataValidation: js.UndefOr[DataValidationData] = js.undefined
  
  /**
    *
    * Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[RangeFormatData] = js.undefined
  
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
    * Represents if all cells have a spill border.
    Returns true if all cells have a spill border, or false if all cells do not have a spill border.
    Returns null if there are cells both with and without spill borders within the range.
    *
    * [Api set: ExcelApi 1.12]
    */
  var hasSpill: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the distance in points, for 100% zoom, from top edge of the range to bottom edge of the range.
    *
    * [Api set: ExcelApi 1.10]
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents if all cells of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the hyperlink for the current range.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hyperlink: js.UndefOr[RangeHyperlink] = js.undefined
  
  /**
    *
    * Represents if the current range is an entire column.
    *
    * [Api set: ExcelApi 1.7]
    */
  var isEntireColumn: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents if the current range is an entire row.
    *
    * [Api set: ExcelApi 1.7]
    */
  var isEntireRow: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the distance in points, for 100% zoom, from left edge of the worksheet to left edge of the range.
    *
    * [Api set: ExcelApi 1.10]
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents the data type state of each cell.
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkedDataTypeState: js.UndefOr[js.Array[js.Array[LinkedDataTypeState]]] = js.undefined
  
  /**
    *
    * Represents Excel's number format code for the given range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var numberFormat: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
  
  /**
    *
    * Represents the category of number format of each cell.
    *
    * [Api set: ExcelApi 1.12]
    */
  var numberFormatCategories: js.UndefOr[js.Array[js.Array[NumberFormatCategory]]] = js.undefined
  
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
    * Returns the total number of rows in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents if all rows of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var rowHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the row number of the first cell in the range. Zero-indexed.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents if ALL the cells would be saved as an array formula.
    Returns true if ALL cells would be saved as an array formula, or false if ALL cells would NOT be saved as an array formula.
    Returns null if some cells would be saved as an array formula and some would not be.
    *
    * [Api set: ExcelApi 1.12]
    */
  var savedAsArray: js.UndefOr[Boolean] = js.undefined
  
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
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API.
    *
    * [Api set: ExcelApi 1.1]
    */
  var text: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  /**
    *
    * Returns the distance in points, for 100% zoom, from top edge of the worksheet to top edge of the range.
    *
    * [Api set: ExcelApi 1.10]
    */
  var top: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies the type of data in each cell.
    *
    * [Api set: ExcelApi 1.1]
    */
  var valueTypes: js.UndefOr[js.Array[js.Array[RangeValueType]]] = js.undefined
  
  /**
    *
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
  
  /**
    *
    * Returns the distance in points, for 100% zoom, from left edge of the range to right edge of the range.
    *
    * [Api set: ExcelApi 1.10]
    */
  var width: js.UndefOr[Double] = js.undefined
}
object RangeData {
  
  @scala.inline
  def apply(): RangeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeData]
  }
  
  @scala.inline
  implicit class RangeDataMutableBuilder[Self <: RangeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLocal(value: String): Self = StObject.set(x, "addressLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLocalUndefined: Self = StObject.set(x, "addressLocal", js.undefined)
    
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
    def setColumnHidden(value: Boolean): Self = StObject.set(x, "columnHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnHiddenUndefined: Self = StObject.set(x, "columnHidden", js.undefined)
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setConditionalFormats(value: js.Array[ConditionalFormatData]): Self = StObject.set(x, "conditionalFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalFormatsUndefined: Self = StObject.set(x, "conditionalFormats", js.undefined)
    
    @scala.inline
    def setConditionalFormatsVarargs(value: ConditionalFormatData*): Self = StObject.set(x, "conditionalFormats", js.Array(value :_*))
    
    @scala.inline
    def setDataValidation(value: DataValidationData): Self = StObject.set(x, "dataValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataValidationUndefined: Self = StObject.set(x, "dataValidation", js.undefined)
    
    @scala.inline
    def setFormat(value: RangeFormatData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
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
    def setHasSpill(value: Boolean): Self = StObject.set(x, "hasSpill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSpillUndefined: Self = StObject.set(x, "hasSpill", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setHyperlink(value: RangeHyperlink): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    @scala.inline
    def setIsEntireColumn(value: Boolean): Self = StObject.set(x, "isEntireColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEntireColumnUndefined: Self = StObject.set(x, "isEntireColumn", js.undefined)
    
    @scala.inline
    def setIsEntireRow(value: Boolean): Self = StObject.set(x, "isEntireRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEntireRowUndefined: Self = StObject.set(x, "isEntireRow", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setLinkedDataTypeState(value: js.Array[js.Array[LinkedDataTypeState]]): Self = StObject.set(x, "linkedDataTypeState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedDataTypeStateUndefined: Self = StObject.set(x, "linkedDataTypeState", js.undefined)
    
    @scala.inline
    def setLinkedDataTypeStateVarargs(value: js.Array[LinkedDataTypeState]*): Self = StObject.set(x, "linkedDataTypeState", js.Array(value :_*))
    
    @scala.inline
    def setNumberFormat(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatCategories(value: js.Array[js.Array[NumberFormatCategory]]): Self = StObject.set(x, "numberFormatCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatCategoriesUndefined: Self = StObject.set(x, "numberFormatCategories", js.undefined)
    
    @scala.inline
    def setNumberFormatCategoriesVarargs(value: js.Array[NumberFormatCategory]*): Self = StObject.set(x, "numberFormatCategories", js.Array(value :_*))
    
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
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    @scala.inline
    def setRowHidden(value: Boolean): Self = StObject.set(x, "rowHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHiddenUndefined: Self = StObject.set(x, "rowHidden", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    @scala.inline
    def setSavedAsArray(value: Boolean): Self = StObject.set(x, "savedAsArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavedAsArrayUndefined: Self = StObject.set(x, "savedAsArray", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: js.Array[js.Array[String]]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTextVarargs(value: js.Array[String]*): Self = StObject.set(x, "text", js.Array(value :_*))
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
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
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
