package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Range represents a set of one or more contiguous cells such as a cell, a row, a column, block of cells, etc.
  To learn more about how ranges are used throughout the API, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-ranges | Work with ranges using the Excel JavaScript API}
  and {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-ranges-advanced | Work with ranges using the Excel JavaScript API (advanced)}.
  *
  * [Api set: ExcelApi 1.1]
  */
trait RangeLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the range reference in A1-style. Address value will contain the Sheet reference (e.g., "Sheet1!A1:B4").
    *
    * [Api set: ExcelApi 1.1]
    */
  var address: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the range reference for the specified range in the language of the user.
    *
    * [Api set: ExcelApi 1.1]
    */
  var addressLocal: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the number of cells in the range. This API will return -1 if the cell count exceeds 2^31-1 (2,147,483,647).
    *
    * [Api set: ExcelApi 1.1]
    */
  var cellCount: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the total number of columns in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columnCount: js.UndefOr[Boolean] = js.undefined
  
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
  var columnIndex: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns a data validation object.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataValidation: js.UndefOr[DataValidationLoadOptions] = js.undefined
  
  /**
    *
    * Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[RangeFormatLoadOptions] = js.undefined
  
  /**
    *
    * Represents the formula in A1-style notation. If a cell has no formula, its value is returned instead.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulas: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German. If a cell has no formula, its value is returned instead.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulasLocal: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the formula in R1C1-style notation. If a cell has no formula, its value is returned instead.
    *
    * [Api set: ExcelApi 1.2]
    */
  var formulasR1C1: js.UndefOr[Boolean] = js.undefined
  
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
  var height: js.UndefOr[Boolean] = js.undefined
  
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
  var hyperlink: js.UndefOr[Boolean] = js.undefined
  
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
  var left: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the data type state of each cell.
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkedDataTypeState: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents Excel's number format code for the given range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var numberFormat: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the category of number format of each cell.
    *
    * [Api set: ExcelApi 1.12]
    */
  var numberFormatCategories: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents Excel's number format code for the given range, based on the language settings of the user.​
    Excel does not perform any language or format coercion when getting or setting the `numberFormatLocal` property.
    Any returned text uses the locally-formatted strings based on the language specified in the system settings.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormatLocal: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the total number of rows in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rowCount: js.UndefOr[Boolean] = js.undefined
  
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
  var rowIndex: js.UndefOr[Boolean] = js.undefined
  
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
  var style: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API.
    *
    * [Api set: ExcelApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the distance in points, for 100% zoom, from top edge of the worksheet to top edge of the range.
    *
    * [Api set: ExcelApi 1.10]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the type of data in each cell.
    *
    * [Api set: ExcelApi 1.1]
    */
  var valueTypes: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the distance in points, for 100% zoom, from left edge of the range to right edge of the range.
    *
    * [Api set: ExcelApi 1.10]
    */
  var width: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The worksheet containing the current range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
}
object RangeLoadOptions {
  
  inline def apply(): RangeLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeLoadOptions]
  }
  
  extension [Self <: RangeLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAddress(value: Boolean): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressLocal(value: Boolean): Self = StObject.set(x, "addressLocal", value.asInstanceOf[js.Any])
    
    inline def setAddressLocalUndefined: Self = StObject.set(x, "addressLocal", js.undefined)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setCellCount(value: Boolean): Self = StObject.set(x, "cellCount", value.asInstanceOf[js.Any])
    
    inline def setCellCountUndefined: Self = StObject.set(x, "cellCount", js.undefined)
    
    inline def setColumnCount(value: Boolean): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    inline def setColumnHidden(value: Boolean): Self = StObject.set(x, "columnHidden", value.asInstanceOf[js.Any])
    
    inline def setColumnHiddenUndefined: Self = StObject.set(x, "columnHidden", js.undefined)
    
    inline def setColumnIndex(value: Boolean): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setDataValidation(value: DataValidationLoadOptions): Self = StObject.set(x, "dataValidation", value.asInstanceOf[js.Any])
    
    inline def setDataValidationUndefined: Self = StObject.set(x, "dataValidation", js.undefined)
    
    inline def setFormat(value: RangeFormatLoadOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormulas(value: Boolean): Self = StObject.set(x, "formulas", value.asInstanceOf[js.Any])
    
    inline def setFormulasLocal(value: Boolean): Self = StObject.set(x, "formulasLocal", value.asInstanceOf[js.Any])
    
    inline def setFormulasLocalUndefined: Self = StObject.set(x, "formulasLocal", js.undefined)
    
    inline def setFormulasR1C1(value: Boolean): Self = StObject.set(x, "formulasR1C1", value.asInstanceOf[js.Any])
    
    inline def setFormulasR1C1Undefined: Self = StObject.set(x, "formulasR1C1", js.undefined)
    
    inline def setFormulasUndefined: Self = StObject.set(x, "formulas", js.undefined)
    
    inline def setHasSpill(value: Boolean): Self = StObject.set(x, "hasSpill", value.asInstanceOf[js.Any])
    
    inline def setHasSpillUndefined: Self = StObject.set(x, "hasSpill", js.undefined)
    
    inline def setHeight(value: Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHyperlink(value: Boolean): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    inline def setIsEntireColumn(value: Boolean): Self = StObject.set(x, "isEntireColumn", value.asInstanceOf[js.Any])
    
    inline def setIsEntireColumnUndefined: Self = StObject.set(x, "isEntireColumn", js.undefined)
    
    inline def setIsEntireRow(value: Boolean): Self = StObject.set(x, "isEntireRow", value.asInstanceOf[js.Any])
    
    inline def setIsEntireRowUndefined: Self = StObject.set(x, "isEntireRow", js.undefined)
    
    inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLinkedDataTypeState(value: Boolean): Self = StObject.set(x, "linkedDataTypeState", value.asInstanceOf[js.Any])
    
    inline def setLinkedDataTypeStateUndefined: Self = StObject.set(x, "linkedDataTypeState", js.undefined)
    
    inline def setNumberFormat(value: Boolean): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatCategories(value: Boolean): Self = StObject.set(x, "numberFormatCategories", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatCategoriesUndefined: Self = StObject.set(x, "numberFormatCategories", js.undefined)
    
    inline def setNumberFormatLocal(value: Boolean): Self = StObject.set(x, "numberFormatLocal", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatLocalUndefined: Self = StObject.set(x, "numberFormatLocal", js.undefined)
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setRowCount(value: Boolean): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    inline def setRowHidden(value: Boolean): Self = StObject.set(x, "rowHidden", value.asInstanceOf[js.Any])
    
    inline def setRowHiddenUndefined: Self = StObject.set(x, "rowHidden", js.undefined)
    
    inline def setRowIndex(value: Boolean): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    inline def setSavedAsArray(value: Boolean): Self = StObject.set(x, "savedAsArray", value.asInstanceOf[js.Any])
    
    inline def setSavedAsArrayUndefined: Self = StObject.set(x, "savedAsArray", js.undefined)
    
    inline def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setValueTypes(value: Boolean): Self = StObject.set(x, "valueTypes", value.asInstanceOf[js.Any])
    
    inline def setValueTypesUndefined: Self = StObject.set(x, "valueTypes", js.undefined)
    
    inline def setValues(value: Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWorksheet(value: WorksheetLoadOptions): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
    
    inline def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
  }
}
