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
    * Specifies the range reference in A1-style. Address value contains the sheet reference (e.g., "Sheet1!A1:B4").
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the range reference for the specified range in the language of the user.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var addressLocal: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the number of cells in the range. This API will return -1 if the cell count exceeds 2^31-1 (2,147,483,647).
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var cellCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the total number of columns in the range.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var columnCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents if all columns in the current range are hidden. Value is `true` when all columns in a range are hidden. Value is `false` when no columns in the range are hidden. Value is `null` when some columns in a range are hidden and other columns in the same range are not hidden.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var columnHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the column number of the first cell in the range. Zero-indexed.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The collection of `ConditionalFormats` that intersect the range.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var conditionalFormats: js.UndefOr[js.Array[ConditionalFormatData]] = js.undefined
  
  /**
    * Returns a data validation object.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var dataValidation: js.UndefOr[DataValidationData] = js.undefined
  
  /**
    * Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[RangeFormatData] = js.undefined
  
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
    * Represents if all cells have a spill border.
    Returns `true` if all cells have a spill border, or `false` if all cells do not have a spill border.
    Returns `null` if there are cells both with and without spill borders within the range.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var hasSpill: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns the distance in points, for 100% zoom, from the top edge of the range to the bottom edge of the range.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents if all cells in the current range are hidden. Value is `true` when all cells in a range are hidden. Value is `false` when no cells in the range are hidden. Value is `null` when some cells in a range are hidden and other cells in the same range are not hidden.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the hyperlink for the current range.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var hyperlink: js.UndefOr[RangeHyperlink] = js.undefined
  
  /**
    * Represents if the current range is an entire column.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var isEntireColumn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents if the current range is an entire row.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var isEntireRow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns the distance in points, for 100% zoom, from the left edge of the worksheet to the left edge of the range.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the data type state of each cell.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var linkedDataTypeState: js.UndefOr[js.Array[js.Array[LinkedDataTypeState]]] = js.undefined
  
  /**
    * Represents Excel's number format code for the given range. For more information about Excel number formatting, see {@link https://support.microsoft.com/office/number-format-codes-5026bbd6-04bc-48cd-bf33-80f18b4eae68 | Number format codes}.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var numberFormat: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  /**
    * Represents the category of number format of each cell.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var numberFormatCategories: js.UndefOr[js.Array[js.Array[NumberFormatCategory]]] = js.undefined
  
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
    * Returns the total number of rows in the range.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents if all rows in the current range are hidden. Value is `true` when all rows in a range are hidden. Value is `false` when no rows in the range are hidden. Value is `null` when some rows in a range are hidden and other rows in the same range are not hidden.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var rowHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns the row number of the first cell in the range. Zero-indexed.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents if all the cells would be saved as an array formula.
    Returns `true` if all cells would be saved as an array formula, or `false` if all cells would not be saved as an array formula.
    Returns `null` if some cells would be saved as an array formula and some would not be.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var savedAsArray: js.UndefOr[Boolean] = js.undefined
  
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
    * Text values of the specified range. The text value will not depend on the cell width. The number sign (#) substitution that happens in the Excel UI will not affect the text value returned by the API.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var text: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  /**
    * Returns the distance in points, for 100% zoom, from the top edge of the worksheet to the top edge of the range.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var top: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the type of data in each cell.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var valueTypes: js.UndefOr[js.Array[js.Array[RangeValueType]]] = js.undefined
  
  /**
    * Represents the raw values of the specified range. The data returned could be a string, number, or boolean. Cells that contain an error will return the error string.
    If the returned value starts with a plus ("+"), minus ("-"), or equal sign ("="), Excel interprets this value as a formula.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  /**
    * Returns the distance in points, for 100% zoom, from the left edge of the range to the right edge of the range.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var width: js.UndefOr[Double] = js.undefined
}
object RangeData {
  
  inline def apply(): RangeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeData]
  }
  
  extension [Self <: RangeData](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressLocal(value: String): Self = StObject.set(x, "addressLocal", value.asInstanceOf[js.Any])
    
    inline def setAddressLocalUndefined: Self = StObject.set(x, "addressLocal", js.undefined)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setCellCount(value: Double): Self = StObject.set(x, "cellCount", value.asInstanceOf[js.Any])
    
    inline def setCellCountUndefined: Self = StObject.set(x, "cellCount", js.undefined)
    
    inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    inline def setColumnHidden(value: Boolean): Self = StObject.set(x, "columnHidden", value.asInstanceOf[js.Any])
    
    inline def setColumnHiddenUndefined: Self = StObject.set(x, "columnHidden", js.undefined)
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setConditionalFormats(value: js.Array[ConditionalFormatData]): Self = StObject.set(x, "conditionalFormats", value.asInstanceOf[js.Any])
    
    inline def setConditionalFormatsUndefined: Self = StObject.set(x, "conditionalFormats", js.undefined)
    
    inline def setConditionalFormatsVarargs(value: ConditionalFormatData*): Self = StObject.set(x, "conditionalFormats", js.Array(value*))
    
    inline def setDataValidation(value: DataValidationData): Self = StObject.set(x, "dataValidation", value.asInstanceOf[js.Any])
    
    inline def setDataValidationUndefined: Self = StObject.set(x, "dataValidation", js.undefined)
    
    inline def setFormat(value: RangeFormatData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
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
    
    inline def setHasSpill(value: Boolean): Self = StObject.set(x, "hasSpill", value.asInstanceOf[js.Any])
    
    inline def setHasSpillUndefined: Self = StObject.set(x, "hasSpill", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHyperlink(value: RangeHyperlink): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    inline def setIsEntireColumn(value: Boolean): Self = StObject.set(x, "isEntireColumn", value.asInstanceOf[js.Any])
    
    inline def setIsEntireColumnUndefined: Self = StObject.set(x, "isEntireColumn", js.undefined)
    
    inline def setIsEntireRow(value: Boolean): Self = StObject.set(x, "isEntireRow", value.asInstanceOf[js.Any])
    
    inline def setIsEntireRowUndefined: Self = StObject.set(x, "isEntireRow", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLinkedDataTypeState(value: js.Array[js.Array[LinkedDataTypeState]]): Self = StObject.set(x, "linkedDataTypeState", value.asInstanceOf[js.Any])
    
    inline def setLinkedDataTypeStateUndefined: Self = StObject.set(x, "linkedDataTypeState", js.undefined)
    
    inline def setLinkedDataTypeStateVarargs(value: js.Array[LinkedDataTypeState]*): Self = StObject.set(x, "linkedDataTypeState", js.Array(value*))
    
    inline def setNumberFormat(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatCategories(value: js.Array[js.Array[NumberFormatCategory]]): Self = StObject.set(x, "numberFormatCategories", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatCategoriesUndefined: Self = StObject.set(x, "numberFormatCategories", js.undefined)
    
    inline def setNumberFormatCategoriesVarargs(value: js.Array[NumberFormatCategory]*): Self = StObject.set(x, "numberFormatCategories", js.Array(value*))
    
    inline def setNumberFormatLocal(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "numberFormatLocal", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatLocalUndefined: Self = StObject.set(x, "numberFormatLocal", js.undefined)
    
    inline def setNumberFormatLocalVarargs(value: js.Array[Any]*): Self = StObject.set(x, "numberFormatLocal", js.Array(value*))
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setNumberFormatVarargs(value: js.Array[Any]*): Self = StObject.set(x, "numberFormat", js.Array(value*))
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    inline def setRowHidden(value: Boolean): Self = StObject.set(x, "rowHidden", value.asInstanceOf[js.Any])
    
    inline def setRowHiddenUndefined: Self = StObject.set(x, "rowHidden", js.undefined)
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    inline def setSavedAsArray(value: Boolean): Self = StObject.set(x, "savedAsArray", value.asInstanceOf[js.Any])
    
    inline def setSavedAsArrayUndefined: Self = StObject.set(x, "savedAsArray", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: js.Array[js.Array[String]]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: js.Array[String]*): Self = StObject.set(x, "text", js.Array(value*))
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setValueTypes(value: js.Array[js.Array[RangeValueType]]): Self = StObject.set(x, "valueTypes", value.asInstanceOf[js.Any])
    
    inline def setValueTypesUndefined: Self = StObject.set(x, "valueTypes", js.undefined)
    
    inline def setValueTypesVarargs(value: js.Array[RangeValueType]*): Self = StObject.set(x, "valueTypes", js.Array(value*))
    
    inline def setValues(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: js.Array[Any]*): Self = StObject.set(x, "values", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
