package typings.officeDashJs.ExcelNs

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.ExcelNs.InterfacesNs.RangeData
import typings.officeDashJs.ExcelNs.InterfacesNs.RangeLoadOptions
import typings.officeDashJs.ExcelNs.InterfacesNs.RangeUpdateData
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.ClientResult
import typings.officeDashJs.OfficeExtensionNs.UpdateOptions
import typings.officeDashJs.officeDashJsStrings.All
import typings.officeDashJs.officeDashJsStrings.Blanks
import typings.officeDashJs.officeDashJsStrings.ConditionalFormats
import typings.officeDashJs.officeDashJsStrings.Constants
import typings.officeDashJs.officeDashJsStrings.Contents
import typings.officeDashJs.officeDashJsStrings.DataValidations
import typings.officeDashJs.officeDashJsStrings.Down
import typings.officeDashJs.officeDashJsStrings.Errors
import typings.officeDashJs.officeDashJsStrings.ErrorsLogical
import typings.officeDashJs.officeDashJsStrings.ErrorsLogicalNumber
import typings.officeDashJs.officeDashJsStrings.ErrorsLogicalText
import typings.officeDashJs.officeDashJsStrings.ErrorsNumberText
import typings.officeDashJs.officeDashJsStrings.ErrorsNumbers
import typings.officeDashJs.officeDashJsStrings.ErrorsText
import typings.officeDashJs.officeDashJsStrings.FillCopy
import typings.officeDashJs.officeDashJsStrings.FillDays
import typings.officeDashJs.officeDashJsStrings.FillDefault
import typings.officeDashJs.officeDashJsStrings.FillFormats
import typings.officeDashJs.officeDashJsStrings.FillMonths
import typings.officeDashJs.officeDashJsStrings.FillSeries
import typings.officeDashJs.officeDashJsStrings.FillValues
import typings.officeDashJs.officeDashJsStrings.FillWeekdays
import typings.officeDashJs.officeDashJsStrings.FillYears
import typings.officeDashJs.officeDashJsStrings.FlashFill
import typings.officeDashJs.officeDashJsStrings.Formats
import typings.officeDashJs.officeDashJsStrings.Formulas
import typings.officeDashJs.officeDashJsStrings.GrowthTrend
import typings.officeDashJs.officeDashJsStrings.Hyperlinks
import typings.officeDashJs.officeDashJsStrings.Left
import typings.officeDashJs.officeDashJsStrings.LinearTrend
import typings.officeDashJs.officeDashJsStrings.Logical
import typings.officeDashJs.officeDashJsStrings.LogicalNumbers
import typings.officeDashJs.officeDashJsStrings.LogicalNumbersText
import typings.officeDashJs.officeDashJsStrings.LogicalText
import typings.officeDashJs.officeDashJsStrings.Numbers
import typings.officeDashJs.officeDashJsStrings.NumbersText
import typings.officeDashJs.officeDashJsStrings.RemoveHyperlinks
import typings.officeDashJs.officeDashJsStrings.Right
import typings.officeDashJs.officeDashJsStrings.SameConditionalFormat
import typings.officeDashJs.officeDashJsStrings.SameDataValidation
import typings.officeDashJs.officeDashJsStrings.Text
import typings.officeDashJs.officeDashJsStrings.Up
import typings.officeDashJs.officeDashJsStrings.Values
import typings.officeDashJs.officeDashJsStrings.Visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Range represents a set of one or more contiguous cells such as a cell, a row, a column, block of cells, etc.
  * To learn more about how ranges are used throughout the API, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-ranges | Work with ranges using the Excel JavaScript API} and {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-ranges-advanced | Work with ranges using the Excel JavaScript API (advanced)}.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.Range")
@js.native
class Range () extends ClientObject {
  /**
    *
    * Represents the range reference in A1-style. Address value will contain the Sheet reference (e.g. "Sheet1!A1:B4"). Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val address: String = js.native
  /**
    *
    * Represents range reference for the specified range in the language of the user. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val addressLocal: String = js.native
  /**
    *
    * Number of cells in the range. This API will return -1 if the cell count exceeds 2^31-1 (2,147,483,647). Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val cellCount: Double = js.native
  /**
    *
    * Represents the total number of columns in the range. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val columnCount: Double = js.native
  /**
    *
    * Represents if all columns of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var columnHidden: Boolean = js.native
  /**
    *
    * Represents the column number of the first cell in the range. Zero-indexed. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val columnIndex: Double = js.native
  /**
    *
    * Collection of ConditionalFormats that intersect the range. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  val conditionalFormats: ConditionalFormatCollection = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Range: RequestContext = js.native
  /**
    *
    * Returns a data validation object.
    *
    * [Api set: ExcelApi 1.8]
    */
  val dataValidation: DataValidation = js.native
  /**
    *
    * Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val format: RangeFormat = js.native
  /**
    *
    * Represents the formula in A1-style notation.
    When setting formulas to a range, the value argument can be either a single value (a string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulas: js.Array[js.Array[_]] = js.native
  /**
    *
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German.
    When setting formulas to a range, the value argument can be either a single value (a string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulasLocal: js.Array[js.Array[_]] = js.native
  /**
    *
    * Represents the formula in R1C1-style notation.
    When setting formulas to a range, the value argument can be either a single value (a string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.2]
    */
  var formulasR1C1: js.Array[js.Array[_]] = js.native
  /**
    *
    * Represents if all cells of the current range are hidden. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  val hidden: Boolean = js.native
  /**
    *
    * Represents the hyperlink for the current range.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hyperlink: RangeHyperlink = js.native
  /**
    *
    * Represents if the current range is an entire column. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val isEntireColumn: Boolean = js.native
  /**
    *
    * Represents if the current range is an entire row. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val isEntireRow: Boolean = js.native
  /**
    *
    * Represents the data type state of each cell. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val linkedDataTypeState: js.Array[js.Array[LinkedDataTypeState]] = js.native
  /**
    *
    * Represents Excel's number format code for the given range.
    When setting number format to a range, the value argument can be either a single value (string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var numberFormat: js.Array[js.Array[_]] = js.native
  /**
    *
    * Represents Excel's number format code for the given range, based on the language settings of the user.
    When setting number format local to a range, the value argument can be either a single value (string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    Excel does not perform any language or format coercion when getting or setting the `numberFormatLocal` property. Any returned text uses the locally-formatted strings based on the language specified in the system settings.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormatLocal: js.Array[js.Array[_]] = js.native
  /**
    *
    * Returns the total number of rows in the range. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val rowCount: Double = js.native
  /**
    *
    * Represents if all rows of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var rowHidden: Boolean = js.native
  /**
    *
    * Returns the row number of the first cell in the range. Zero-indexed. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val rowIndex: Double = js.native
  /**
    *
    * Represents the range sort of the current range. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  val sort: RangeSort = js.native
  /**
    *
    * Represents the style of the current range.
    If the styles of the cells are inconsistent, null will be returned.
    For custom styles, the style name will be returned. For built-in styles, a string representing a value in the BuiltInStyle enum will be returned.
    *
    * [Api set: ExcelApi 1.7]
    */
  var style: String = js.native
  /**
    *
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val text: js.Array[js.Array[String]] = js.native
  /**
    *
    * Represents the type of data of each cell. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val valueTypes: js.Array[js.Array[RangeValueType]] = js.native
  /**
    *
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    When setting values to a range, the value argument can be either a single value (string, number or boolean) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.Array[js.Array[_]] = js.native
  /**
    *
    * The worksheet containing the current range. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val worksheet: Worksheet = js.native
  def autoFill(destinationRange: String): Unit = js.native
  def autoFill(
    destinationRange: String,
    autoFillType: FillDefault | FillCopy | FillSeries | FillFormats | FillValues | FillDays | FillWeekdays | FillMonths | FillYears | LinearTrend | GrowthTrend | FlashFill
  ): Unit = js.native
  def autoFill(destinationRange: String, autoFillType: AutoFillType): Unit = js.native
  /**
    *
    * Fills range from the current range to the destination range using the specified AutoFill logic. The destination range must extend the source either horizontally or vertically.
    * 
    * For more information, read {@link https://support.office.com/article/video-use-autofill-and-flash-fill-2e79a709-c814-4b27-8bc2-c4dc84d49464 | Use AutoFill and Flash Fill}.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param destinationRange The destination range to fill. Discontiguous ranges are not supported.
    * @param autoFillType The type of autofill. Specifies how the destination range is to be filled, based on the contents of the current range. Default is "FillDefault".
    */
  def autoFill(destinationRange: Range): Unit = js.native
  def autoFill(
    destinationRange: Range,
    autoFillType: FillDefault | FillCopy | FillSeries | FillFormats | FillValues | FillDays | FillWeekdays | FillMonths | FillYears | LinearTrend | GrowthTrend | FlashFill
  ): Unit = js.native
  def autoFill(destinationRange: Range, autoFillType: AutoFillType): Unit = js.native
  /**
    *
    * Calculates a range of cells on a worksheet.
    *
    * [Api set: ExcelApi 1.6]
    */
  def calculate(): Unit = js.native
  /**
    *
    * Clear range values, format, fill, border, etc.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param applyTo Optional. Determines the type of clear action. See Excel.ClearApplyTo for details.
    */
  def clear(): Unit = js.native
  def clear(applyTo: ClearApplyTo): Unit = js.native
  @JSName("clear")
  def clear_All(applyTo: All): Unit = js.native
  @JSName("clear")
  def clear_Contents(applyTo: Contents): Unit = js.native
  @JSName("clear")
  def clear_Formats(applyTo: Formats): Unit = js.native
  @JSName("clear")
  def clear_Hyperlinks(applyTo: Hyperlinks): Unit = js.native
  @JSName("clear")
  def clear_RemoveHyperlinks(applyTo: RemoveHyperlinks): Unit = js.native
  /**
    *
    * Converts the range cells with datatypes into text.
    *
    * [Api set: ExcelApi 1.9]
    */
  def convertDataTypeToText(): Unit = js.native
  /**
    *
    * Converts the range cells into linked datatype in the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param serviceID The Service ID which will be used to query the data.
    * @param languageCulture Language Culture to query the service for.
    */
  def convertToLinkedDataType(serviceID: Double, languageCulture: String): Unit = js.native
  def copyFrom(sourceRange: String): Unit = js.native
  def copyFrom(sourceRange: String, copyType: RangeCopyType): Unit = js.native
  def copyFrom(sourceRange: String, copyType: RangeCopyType, skipBlanks: Boolean): Unit = js.native
  def copyFrom(sourceRange: String, copyType: RangeCopyType, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  /**
    *
    * Copies cell data or formatting from the source range or RangeAreas to the current range.
    The destination range can be of different size than the source range or RangeAreas. The destination will be expanded automatically if it is smaller than the source.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param sourceRange The source range or RangeAreas to copy from. When the source RangeAreas has multiple ranges, it must in the outline form which can be created by removing full rows or columns from a rectangular range.
    * @param copyType The type of cell data or formatting to copy over. Default is "All".
    * @param skipBlanks True if to skip blank cells in the source range. Default is false.
    * @param transpose True if to transpose the cells in the destination range. Default is false.
    */
  def copyFrom(sourceRange: Range): Unit = js.native
  def copyFrom(sourceRange: RangeAreas): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: RangeCopyType): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: RangeCopyType, skipBlanks: Boolean): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: RangeCopyType, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: RangeCopyType): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: RangeCopyType, skipBlanks: Boolean): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: RangeCopyType, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_All(sourceRange: String, copyType: All): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_All(sourceRange: String, copyType: All, skipBlanks: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_All(sourceRange: String, copyType: All, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_All(sourceRange: RangeAreas, copyType: All): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_All(sourceRange: RangeAreas, copyType: All, skipBlanks: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_All(sourceRange: RangeAreas, copyType: All, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_All(sourceRange: Range, copyType: All): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_All(sourceRange: Range, copyType: All, skipBlanks: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_All(sourceRange: Range, copyType: All, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formats(sourceRange: String, copyType: Formats): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formats(sourceRange: String, copyType: Formats, skipBlanks: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formats(sourceRange: String, copyType: Formats, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formats(sourceRange: RangeAreas, copyType: Formats): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formats(sourceRange: RangeAreas, copyType: Formats, skipBlanks: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formats(sourceRange: RangeAreas, copyType: Formats, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formats(sourceRange: Range, copyType: Formats): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formats(sourceRange: Range, copyType: Formats, skipBlanks: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formats(sourceRange: Range, copyType: Formats, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formulas(sourceRange: String, copyType: Formulas): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formulas(sourceRange: String, copyType: Formulas, skipBlanks: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formulas(sourceRange: String, copyType: Formulas, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formulas(sourceRange: RangeAreas, copyType: Formulas): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formulas(sourceRange: RangeAreas, copyType: Formulas, skipBlanks: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formulas(sourceRange: RangeAreas, copyType: Formulas, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formulas(sourceRange: Range, copyType: Formulas): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formulas(sourceRange: Range, copyType: Formulas, skipBlanks: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formulas(sourceRange: Range, copyType: Formulas, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Values(sourceRange: String, copyType: Values): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Values(sourceRange: String, copyType: Values, skipBlanks: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Values(sourceRange: String, copyType: Values, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Values(sourceRange: RangeAreas, copyType: Values): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Values(sourceRange: RangeAreas, copyType: Values, skipBlanks: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Values(sourceRange: RangeAreas, copyType: Values, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Values(sourceRange: Range, copyType: Values): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Values(sourceRange: Range, copyType: Values, skipBlanks: Boolean): Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Values(sourceRange: Range, copyType: Values, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  /**
    *
    * Deletes the cells associated with the range.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param shift Specifies which way to shift the cells. See Excel.DeleteShiftDirection for details.
    */
  def delete(shift: DeleteShiftDirection): Unit = js.native
  @JSName("delete")
  def delete_Left(shift: Left): Unit = js.native
  /**
    *
    * Deletes the cells associated with the range.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param shift Specifies which way to shift the cells. See Excel.DeleteShiftDirection for details.
    */
  @JSName("delete")
  def delete_Up(shift: Up): Unit = js.native
  /**
    *
    * Finds the given string based on the criteria specified.
    If the current range is larger than a single cell, then the search will be limited to that range, else the search will cover the entire sheet starting after that cell.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param text The string to find.
    * @param criteria Additional search criteria, including the search direction and whether the search needs to match the entire cell or be case sensitive.
    * @returns The Range which matched the search criteria.
    */
  def find(text: String, criteria: SearchCriteria): Range = js.native
  /**
    *
    * Finds the given string based on the criteria specified.
    If the current range is larger than a single cell, then the search will be limited to that range, else the search will cover the entire sheet starting after that cell.
    If there are no matches, this function will return a null object.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param text The string to find.
    * @param criteria Additional search criteria, including the search direction and whether the search needs to match the entire cell or be case sensitive.
    * @returns The Range which matched the search criteria.
    */
  def findOrNullObject(text: String, criteria: SearchCriteria): Range = js.native
  /**
    *
    * Does FlashFill to current range.Flash Fill will automatically fills data when it senses a pattern, so the range must be single column range and have data around in order to find pattern.
    *
    * [Api set: ExcelApi 1.9]
    */
  def flashFill(): Unit = js.native
  /**
    *
    * Gets a Range object with the same top-left cell as the current Range object, but with the specified numbers of rows and columns.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param numRows The number of rows of the new range size.
    * @param numColumns The number of columns of the new range size.
    */
  def getAbsoluteResizedRange(numRows: Double, numColumns: Double): Range = js.native
  def getBoundingRect(anotherRange: String): Range = js.native
  /**
    *
    * Gets the smallest range object that encompasses the given ranges. For example, the GetBoundingRect of "B2:C5" and "D10:E15" is "B2:E15".
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param anotherRange The range object or address or range name.
    */
  def getBoundingRect(anotherRange: Range): Range = js.native
  /**
    *
    * Gets the range object containing the single cell based on row and column numbers. The cell can be outside the bounds of its parent range, so long as it stays within the worksheet grid. The returned cell is located relative to the top left cell of the range.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param row Row number of the cell to be retrieved. Zero-indexed.
    * @param column Column number of the cell to be retrieved. Zero-indexed.
    */
  def getCell(row: Double, column: Double): Range = js.native
  /**
    *
    * Returns a 2D array, encapsulating the data for each cell's font, fill, borders, alignment, and other properties.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cellPropertiesLoadOptions An object that represents which cell properties to load.
    * @returns A 2D array where each item represents the requested properties of the corresponding cell.
    */
  def getCellProperties(cellPropertiesLoadOptions: CellPropertiesLoadOptions): ClientResult[js.Array[js.Array[CellProperties]]] = js.native
  /**
    *
    * Gets a column contained in the range.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param column Column number of the range to be retrieved. Zero-indexed.
    */
  def getColumn(column: Double): Range = js.native
  /**
    *
    * Returns a single-dimensional array, encapsulating the data for each column's font, fill, borders, alignment, and other properties.  For properties that are not consistent across each cell within a given column, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param columnPropertiesLoadOptions An object that represents which column properties to load.
    * @returns An array where each item represents the requested properties of the corresponding column.
    */
  def getColumnProperties(columnPropertiesLoadOptions: ColumnPropertiesLoadOptions): ClientResult[js.Array[ColumnProperties]] = js.native
  /**
    *
    * Gets a certain number of columns to the right of the current Range object.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param count Optional. The number of columns to include in the resulting range. In general, use a positive number to create a range outside the current range. You can also use a negative number to create a range within the current range. The default value is 1.
    */
  def getColumnsAfter(): Range = js.native
  def getColumnsAfter(count: Double): Range = js.native
  /**
    *
    * Gets a certain number of columns to the left of the current Range object.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param count Optional. The number of columns to include in the resulting range. In general, use a positive number to create a range outside the current range. You can also use a negative number to create a range within the current range. The default value is 1.
    */
  def getColumnsBefore(): Range = js.native
  def getColumnsBefore(count: Double): Range = js.native
  /**
    *
    * Gets an object that represents the entire column of the range (for example, if the current range represents cells "B4:E11", its `getEntireColumn` is a range that represents columns "B:E").
    *
    * [Api set: ExcelApi 1.1]
    */
  def getEntireColumn(): Range = js.native
  /**
    *
    * Gets an object that represents the entire row of the range (for example, if the current range represents cells "B4:E11", its `GetEntireRow` is a range that represents rows "4:11").
    *
    * [Api set: ExcelApi 1.1]
    */
  def getEntireRow(): Range = js.native
  /**
    *
    * Renders the range as a base64-encoded png image.
    *
    * [Api set: ExcelApi 1.7]
    */
  def getImage(): ClientResult[String] = js.native
  def getIntersection(anotherRange: String): Range = js.native
  /**
    *
    * Gets the range object that represents the rectangular intersection of the given ranges.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param anotherRange The range object or range address that will be used to determine the intersection of ranges.
    */
  def getIntersection(anotherRange: Range): Range = js.native
  def getIntersectionOrNullObject(anotherRange: String): Range = js.native
  /**
    *
    * Gets the range object that represents the rectangular intersection of the given ranges. If no intersection is found, will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param anotherRange The range object or range address that will be used to determine the intersection of ranges.
    */
  def getIntersectionOrNullObject(anotherRange: Range): Range = js.native
  /**
    *
    * Gets the last cell within the range. For example, the last cell of "B2:D5" is "D5".
    *
    * [Api set: ExcelApi 1.1]
    */
  def getLastCell(): Range = js.native
  /**
    *
    * Gets the last column within the range. For example, the last column of "B2:D5" is "D2:D5".
    *
    * [Api set: ExcelApi 1.1]
    */
  def getLastColumn(): Range = js.native
  /**
    *
    * Gets the last row within the range. For example, the last row of "B2:D5" is "B5:D5".
    *
    * [Api set: ExcelApi 1.1]
    */
  def getLastRow(): Range = js.native
  /**
    *
    * Gets an object which represents a range that's offset from the specified range. The dimension of the returned range will match this range. If the resulting range is forced outside the bounds of the worksheet grid, an error will be thrown.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param rowOffset The number of rows (positive, negative, or 0) by which the range is to be offset. Positive values are offset downward, and negative values are offset upward.
    * @param columnOffset The number of columns (positive, negative, or 0) by which the range is to be offset. Positive values are offset to the right, and negative values are offset to the left.
    */
  def getOffsetRange(rowOffset: Double, columnOffset: Double): Range = js.native
  /**
    *
    * Gets a Range object similar to the current Range object, but with its bottom-right corner expanded (or contracted) by some number of rows and columns.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param deltaRows The number of rows by which to expand the bottom-right corner, relative to the current range. Use a positive number to expand the range, or a negative number to decrease it.
    * @param deltaColumns The number of columns by which to expand the bottom-right corner, relative to the current range. Use a positive number to expand the range, or a negative number to decrease it.
    */
  def getResizedRange(deltaRows: Double, deltaColumns: Double): Range = js.native
  /**
    *
    * Gets a row contained in the range.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param row Row number of the range to be retrieved. Zero-indexed.
    */
  def getRow(row: Double): Range = js.native
  /**
    *
    * Returns a single-dimensional array, encapsulating the data for each row's font, fill, borders, alignment, and other properties.  For properties that are not consistent across each cell within a given row, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param rowPropertiesLoadOptions An object that represents which row properties to load.
    * @returns An array where each item represents the requested properties of the corresponding row.
    */
  def getRowProperties(rowPropertiesLoadOptions: RowPropertiesLoadOptions): ClientResult[js.Array[RowProperties]] = js.native
  /**
    *
    * Gets a certain number of rows above the current Range object.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param count Optional. The number of rows to include in the resulting range. In general, use a positive number to create a range outside the current range. You can also use a negative number to create a range within the current range. The default value is 1.
    */
  def getRowsAbove(): Range = js.native
  def getRowsAbove(count: Double): Range = js.native
  /**
    *
    * Gets a certain number of rows below the current Range object.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param count Optional. The number of rows to include in the resulting range. In general, use a positive number to create a range outside the current range. You can also use a negative number to create a range within the current range. The default value is 1.
    */
  def getRowsBelow(): Range = js.native
  def getRowsBelow(count: Double): Range = js.native
  /**
    *
    * Gets the RangeAreas object, comprising one or more rectangular ranges, that represents all the cells that match the specified type and value.
    If no special cells are found, an ItemNotFound error will be thrown.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cellType The type of cells to include.
    * @param cellValueType If cellType is either Constants or Formulas, this argument is used to determine which types of cells to include in the result. These values can be combined together to return more than one type. The default is to select all constants or formulas, no matter what the type.
    */
  def getSpecialCells(cellType: SpecialCellType): RangeAreas = js.native
  def getSpecialCells(cellType: SpecialCellType, cellValueType: SpecialCellValueType): RangeAreas = js.native
  def getSpecialCells(
    cellType: Blanks,
    cellValueType: All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
  ): RangeAreas = js.native
  def getSpecialCells(
    cellType: ConditionalFormats,
    cellValueType: All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
  ): RangeAreas = js.native
  def getSpecialCells(
    cellType: Constants,
    cellValueType: All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
  ): RangeAreas = js.native
  def getSpecialCells(
    cellType: DataValidations,
    cellValueType: All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
  ): RangeAreas = js.native
  def getSpecialCells(
    cellType: Formulas,
    cellValueType: All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
  ): RangeAreas = js.native
  def getSpecialCells(
    cellType: SameConditionalFormat,
    cellValueType: All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
  ): RangeAreas = js.native
  def getSpecialCells(
    cellType: SameDataValidation,
    cellValueType: All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
  ): RangeAreas = js.native
  def getSpecialCells(
    cellType: Visible,
    cellValueType: All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
  ): RangeAreas = js.native
  /**
    *
    * Gets the RangeAreas object, comprising one or more ranges, that represents all the cells that match the specified type and value.
    If no special cells are found, a null object will be returned.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cellType The type of cells to include.
    * @param cellValueType If cellType is either Constants or Formulas, this argument is used to determine which types of cells to include in the result. These values can be combined together to return more than one type. The default is to select all constants or formulas, no matter what the type.
    */
  def getSpecialCellsOrNullObject(cellType: SpecialCellType): RangeAreas = js.native
  def getSpecialCellsOrNullObject(cellType: SpecialCellType, cellValueType: SpecialCellValueType): RangeAreas = js.native
  def getSpecialCellsOrNullObject(
    cellType: Blanks,
    cellValueType: All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
  ): RangeAreas = js.native
  def getSpecialCellsOrNullObject(
    cellType: ConditionalFormats,
    cellValueType: All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
  ): RangeAreas = js.native
  def getSpecialCellsOrNullObject(
    cellType: Constants,
    cellValueType: All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
  ): RangeAreas = js.native
  def getSpecialCellsOrNullObject(
    cellType: DataValidations,
    cellValueType: All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
  ): RangeAreas = js.native
  def getSpecialCellsOrNullObject(
    cellType: Formulas,
    cellValueType: All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
  ): RangeAreas = js.native
  def getSpecialCellsOrNullObject(
    cellType: SameConditionalFormat,
    cellValueType: All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
  ): RangeAreas = js.native
  def getSpecialCellsOrNullObject(
    cellType: SameDataValidation,
    cellValueType: All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
  ): RangeAreas = js.native
  def getSpecialCellsOrNullObject(
    cellType: Visible,
    cellValueType: All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
  ): RangeAreas = js.native
  @JSName("getSpecialCellsOrNullObject")
  def getSpecialCellsOrNullObject_Blanks(cellType: Blanks): RangeAreas = js.native
  /**
    *
    * Gets the RangeAreas object, comprising one or more ranges, that represents all the cells that match the specified type and value.
    If no special cells are found, a null object will be returned.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cellType The type of cells to include.
    * @param cellValueType If cellType is either Constants or Formulas, this argument is used to determine which types of cells to include in the result. These values can be combined together to return more than one type. The default is to select all constants or formulas, no matter what the type.
    */
  @JSName("getSpecialCellsOrNullObject")
  def getSpecialCellsOrNullObject_ConditionalFormats(cellType: ConditionalFormats): RangeAreas = js.native
  @JSName("getSpecialCellsOrNullObject")
  def getSpecialCellsOrNullObject_Constants(cellType: Constants): RangeAreas = js.native
  @JSName("getSpecialCellsOrNullObject")
  def getSpecialCellsOrNullObject_DataValidations(cellType: DataValidations): RangeAreas = js.native
  @JSName("getSpecialCellsOrNullObject")
  def getSpecialCellsOrNullObject_Formulas(cellType: Formulas): RangeAreas = js.native
  @JSName("getSpecialCellsOrNullObject")
  def getSpecialCellsOrNullObject_SameConditionalFormat(cellType: SameConditionalFormat): RangeAreas = js.native
  @JSName("getSpecialCellsOrNullObject")
  def getSpecialCellsOrNullObject_SameDataValidation(cellType: SameDataValidation): RangeAreas = js.native
  @JSName("getSpecialCellsOrNullObject")
  def getSpecialCellsOrNullObject_Visible(cellType: Visible): RangeAreas = js.native
  @JSName("getSpecialCells")
  def getSpecialCells_Blanks(cellType: Blanks): RangeAreas = js.native
  /**
    *
    * Gets the RangeAreas object, comprising one or more rectangular ranges, that represents all the cells that match the specified type and value.
    If no special cells are found, an ItemNotFound error will be thrown.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cellType The type of cells to include.
    * @param cellValueType If cellType is either Constants or Formulas, this argument is used to determine which types of cells to include in the result. These values can be combined together to return more than one type. The default is to select all constants or formulas, no matter what the type.
    */
  @JSName("getSpecialCells")
  def getSpecialCells_ConditionalFormats(cellType: ConditionalFormats): RangeAreas = js.native
  @JSName("getSpecialCells")
  def getSpecialCells_Constants(cellType: Constants): RangeAreas = js.native
  @JSName("getSpecialCells")
  def getSpecialCells_DataValidations(cellType: DataValidations): RangeAreas = js.native
  @JSName("getSpecialCells")
  def getSpecialCells_Formulas(cellType: Formulas): RangeAreas = js.native
  @JSName("getSpecialCells")
  def getSpecialCells_SameConditionalFormat(cellType: SameConditionalFormat): RangeAreas = js.native
  @JSName("getSpecialCells")
  def getSpecialCells_SameDataValidation(cellType: SameDataValidation): RangeAreas = js.native
  @JSName("getSpecialCells")
  def getSpecialCells_Visible(cellType: Visible): RangeAreas = js.native
  /**
    *
    * Returns a Range object that represents the surrounding region for the top-left cell in this range. A surrounding region is a range bounded by any combination of blank rows and blank columns relative to this range.
    *
    * [Api set: ExcelApi 1.7]
    */
  def getSurroundingRegion(): Range = js.native
  /**
    *
    * Gets a scoped collection of tables that overlap with the range.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param fullyContained If true, returns only tables that are fully contained within the range bounds. The default value is false.
    */
  def getTables(): TableScopedCollection = js.native
  def getTables(fullyContained: Boolean): TableScopedCollection = js.native
  /**
    *
    * Returns the used range of the given range object. If there are no used cells within the range, this function will throw an ItemNotFound error.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param valuesOnly Considers only cells with values as used cells. [Api set: ExcelApi 1.2]
    */
  def getUsedRange(): Range = js.native
  def getUsedRange(valuesOnly: Boolean): Range = js.native
  /**
    *
    * Returns the used range of the given range object. If there are no used cells within the range, this function will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param valuesOnly Considers only cells with values as used cells.
    */
  def getUsedRangeOrNullObject(): Range = js.native
  def getUsedRangeOrNullObject(valuesOnly: Boolean): Range = js.native
  /**
    *
    * Represents the visible rows of the current range.
    *
    * [Api set: ExcelApi 1.3]
    */
  def getVisibleView(): RangeView = js.native
  /**
    *
    * Inserts a cell or a range of cells into the worksheet in place of this range, and shifts the other cells to make space. Returns a new Range object at the now blank space.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param shift Specifies which way to shift the cells. See Excel.InsertShiftDirection for details.
    */
  def insert(shift: InsertShiftDirection): Range = js.native
  /**
    *
    * Inserts a cell or a range of cells into the worksheet in place of this range, and shifts the other cells to make space. Returns a new Range object at the now blank space.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param shift Specifies which way to shift the cells. See Excel.InsertShiftDirection for details.
    */
  @JSName("insert")
  def insert_Down(shift: Down): Range = js.native
  @JSName("insert")
  def insert_Right(shift: Right): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.Range` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.Range` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.Range` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Range = js.native
  def load(option: String): Range = js.native
  def load(option: js.Array[String]): Range = js.native
  def load(option: Anon_Expand): Range = js.native
  def load(option: RangeLoadOptions): Range = js.native
  /**
    *
    * Merge the range cells into one region in the worksheet.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param across Optional. Set true to merge cells in each row of the specified range as separate merged cells. The default value is false.
    */
  def merge(): Unit = js.native
  def merge(across: Boolean): Unit = js.native
  /**
    *
    * Removes duplicate values from the range specified by the columns.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param columns The columns inside the range that may contain duplicates. At least one column needs to be specified. Zero-indexed.
    * @param includesHeader True if the input data contains header. Default is false.
    * @returns The resulting object that contains the number of rows removed and the number of remaining unique rows.
    */
  def removeDuplicates(columns: js.Array[Double], includesHeader: Boolean): RemoveDuplicatesResult = js.native
  /**
    *
    * Finds and replaces the given string based on the criteria specified within the current range.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param text String to find.
    * @param replacement String to replace the original with.
    * @param criteria Additional Replace Criteria.
    * @returns The number of replacements performed.
    */
  def replaceAll(text: String, replacement: String, criteria: ReplaceCriteria): ClientResult[Double] = js.native
  /**
    *
    * Selects the specified range in the Excel UI.
    *
    * [Api set: ExcelApi 1.1]
    */
  def select(): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.Range): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: RangeUpdateData): Unit = js.native
  def set(properties: RangeUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Range): Unit = js.native
  /**
    *
    * Updates the range based on a 2D array of cell properties , encapsulating things like font, fill, borders, alignment, and so forth.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cellPropertiesData A 2D array that represents which properties to set in each cell.
    */
  def setCellProperties(cellPropertiesData: js.Array[js.Array[SettableCellProperties]]): Unit = js.native
  /**
    *
    * Updates the range based on a single-dimensional array of column properties, encapsulating things like font, fill, borders, alignment, and so forth.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param columnPropertiesData An array that represents which properties to set in each column.
    */
  def setColumnProperties(columnPropertiesData: js.Array[SettableColumnProperties]): Unit = js.native
  /**
    *
    * Set a range to be recalculated when the next recalculation occurs.
    *
    * [Api set: ExcelApi 1.9]
    */
  def setDirty(): Unit = js.native
  /**
    *
    * Updates the range based on a single-dimensional array of row properties, encapsulating things like font, fill, borders, alignment, and so forth.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param rowPropertiesData An array that represents which properties to set in each row.
    */
  def setRowProperties(rowPropertiesData: js.Array[SettableRowProperties]): Unit = js.native
  /**
    *
    * Displays the card for an active cell if it has rich value content.
    *
    * [Api set: ExcelApi 1.7]
    */
  def showCard(): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Range object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): RangeData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Range = js.native
  /**
    *
    * Unmerge the range cells into separate cells.
    *
    * [Api set: ExcelApi 1.2]
    */
  def unmerge(): Unit = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): Range = js.native
}

