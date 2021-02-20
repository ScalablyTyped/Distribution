package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.RangeData
import typings.officeJs.Excel.Interfaces.RangeLoadOptions
import typings.officeJs.Excel.Interfaces.RangeUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.All
import typings.officeJs.officeJsStrings.Blanks
import typings.officeJs.officeJsStrings.ByColumns
import typings.officeJs.officeJsStrings.ByRows
import typings.officeJs.officeJsStrings.ConditionalFormats
import typings.officeJs.officeJsStrings.Constants
import typings.officeJs.officeJsStrings.Contents
import typings.officeJs.officeJsStrings.DataValidations
import typings.officeJs.officeJsStrings.Down
import typings.officeJs.officeJsStrings.Errors
import typings.officeJs.officeJsStrings.ErrorsLogical
import typings.officeJs.officeJsStrings.ErrorsLogicalNumber
import typings.officeJs.officeJsStrings.ErrorsLogicalText
import typings.officeJs.officeJsStrings.ErrorsNumberText
import typings.officeJs.officeJsStrings.ErrorsNumbers
import typings.officeJs.officeJsStrings.ErrorsText
import typings.officeJs.officeJsStrings.FillCopy
import typings.officeJs.officeJsStrings.FillDays
import typings.officeJs.officeJsStrings.FillDefault
import typings.officeJs.officeJsStrings.FillFormats
import typings.officeJs.officeJsStrings.FillMonths
import typings.officeJs.officeJsStrings.FillSeries
import typings.officeJs.officeJsStrings.FillValues
import typings.officeJs.officeJsStrings.FillWeekdays
import typings.officeJs.officeJsStrings.FillYears
import typings.officeJs.officeJsStrings.FlashFill
import typings.officeJs.officeJsStrings.Formats
import typings.officeJs.officeJsStrings.Formulas
import typings.officeJs.officeJsStrings.GrowthTrend
import typings.officeJs.officeJsStrings.Hyperlinks
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.LinearTrend
import typings.officeJs.officeJsStrings.Logical
import typings.officeJs.officeJsStrings.LogicalNumbers
import typings.officeJs.officeJsStrings.LogicalNumbersText
import typings.officeJs.officeJsStrings.LogicalText
import typings.officeJs.officeJsStrings.Numbers
import typings.officeJs.officeJsStrings.NumbersText
import typings.officeJs.officeJsStrings.RemoveHyperlinks
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.SameConditionalFormat
import typings.officeJs.officeJsStrings.SameDataValidation
import typings.officeJs.officeJsStrings.Text
import typings.officeJs.officeJsStrings.Up
import typings.officeJs.officeJsStrings.Values
import typings.officeJs.officeJsStrings.Visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Range represents a set of one or more contiguous cells such as a cell, a row, a column, block of cells, etc.
  To learn more about how ranges are used throughout the API, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-ranges | Work with ranges using the Excel JavaScript API}
  and {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-ranges-advanced | Work with ranges using the Excel JavaScript API (advanced)}.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait Range extends ClientObject {
  
  /**
    *
    * Specifies the range reference in A1-style. Address value will contain the Sheet reference (e.g., "Sheet1!A1:B4").
    *
    * [Api set: ExcelApi 1.1]
    */
  val address: String = js.native
  
  /**
    *
    * Specifies the range reference for the specified range in the language of the user.
    *
    * [Api set: ExcelApi 1.1]
    */
  val addressLocal: String = js.native
  
  /**
    * Fills range from the current range to the destination range using the specified AutoFill logic.
    The destination range can be null, or can extend the source either horizontally or vertically.
    Discontiguous ranges are not supported.
    
    For more information, read {@link https://support.office.com/article/video-use-autofill-and-flash-fill-2e79a709-c814-4b27-8bc2-c4dc84d49464 | Use AutoFill and Flash Fill}.
    *
    * [Api set: ExcelApi 1.9, ExcelApi Preview for null `destinationRange`]
    *
    * @param destinationRange The destination range to autofill. If the destination range is null, data is filled out based on the surrounding cells (which is the behavior when double-clicking the UI’s range fill handle).
    * @param autoFillType The type of autofill. Specifies how the destination range is to be filled, based on the contents of the current range. Default is "FillDefault".
    */
  def autoFill(): Unit = js.native
  def autoFill(destinationRange: js.UndefOr[scala.Nothing], autoFillType: AutoFillType): Unit = js.native
  def autoFill(destinationRange: String): Unit = js.native
  def autoFill(destinationRange: String, autoFillType: AutoFillType): Unit = js.native
  def autoFill(destinationRange: Range): Unit = js.native
  def autoFill(destinationRange: Range, autoFillType: AutoFillType): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillCopy(destinationRange: js.UndefOr[scala.Nothing], autoFillType: FillCopy): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillCopy(destinationRange: String, autoFillType: FillCopy): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillCopy(destinationRange: Range, autoFillType: FillCopy): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillDays(destinationRange: js.UndefOr[scala.Nothing], autoFillType: FillDays): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillDays(destinationRange: String, autoFillType: FillDays): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillDays(destinationRange: Range, autoFillType: FillDays): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillDefault(destinationRange: js.UndefOr[scala.Nothing], autoFillType: FillDefault): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillDefault(destinationRange: String, autoFillType: FillDefault): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillDefault(destinationRange: Range, autoFillType: FillDefault): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillFormats(destinationRange: js.UndefOr[scala.Nothing], autoFillType: FillFormats): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillFormats(destinationRange: String, autoFillType: FillFormats): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillFormats(destinationRange: Range, autoFillType: FillFormats): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillMonths(destinationRange: js.UndefOr[scala.Nothing], autoFillType: FillMonths): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillMonths(destinationRange: String, autoFillType: FillMonths): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillMonths(destinationRange: Range, autoFillType: FillMonths): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillSeries(destinationRange: js.UndefOr[scala.Nothing], autoFillType: FillSeries): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillSeries(destinationRange: String, autoFillType: FillSeries): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillSeries(destinationRange: Range, autoFillType: FillSeries): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillValues(destinationRange: js.UndefOr[scala.Nothing], autoFillType: FillValues): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillValues(destinationRange: String, autoFillType: FillValues): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillValues(destinationRange: Range, autoFillType: FillValues): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillWeekdays(destinationRange: js.UndefOr[scala.Nothing], autoFillType: FillWeekdays): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillWeekdays(destinationRange: String, autoFillType: FillWeekdays): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillWeekdays(destinationRange: Range, autoFillType: FillWeekdays): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillYears(destinationRange: js.UndefOr[scala.Nothing], autoFillType: FillYears): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillYears(destinationRange: String, autoFillType: FillYears): Unit = js.native
  @JSName("autoFill")
  def autoFill_FillYears(destinationRange: Range, autoFillType: FillYears): Unit = js.native
  @JSName("autoFill")
  def autoFill_FlashFill(destinationRange: js.UndefOr[scala.Nothing], autoFillType: FlashFill): Unit = js.native
  @JSName("autoFill")
  def autoFill_FlashFill(destinationRange: String, autoFillType: FlashFill): Unit = js.native
  @JSName("autoFill")
  def autoFill_FlashFill(destinationRange: Range, autoFillType: FlashFill): Unit = js.native
  @JSName("autoFill")
  def autoFill_GrowthTrend(destinationRange: js.UndefOr[scala.Nothing], autoFillType: GrowthTrend): Unit = js.native
  @JSName("autoFill")
  def autoFill_GrowthTrend(destinationRange: String, autoFillType: GrowthTrend): Unit = js.native
  @JSName("autoFill")
  def autoFill_GrowthTrend(destinationRange: Range, autoFillType: GrowthTrend): Unit = js.native
  @JSName("autoFill")
  def autoFill_LinearTrend(destinationRange: js.UndefOr[scala.Nothing], autoFillType: LinearTrend): Unit = js.native
  @JSName("autoFill")
  def autoFill_LinearTrend(destinationRange: String, autoFillType: LinearTrend): Unit = js.native
  @JSName("autoFill")
  def autoFill_LinearTrend(destinationRange: Range, autoFillType: LinearTrend): Unit = js.native
  
  /**
    * Calculates a range of cells on a worksheet.
    *
    * [Api set: ExcelApi 1.6]
    */
  def calculate(): Unit = js.native
  
  /**
    *
    * Specifies the number of cells in the range. This API will return -1 if the cell count exceeds 2^31-1 (2,147,483,647).
    *
    * [Api set: ExcelApi 1.1]
    */
  val cellCount: Double = js.native
  
  /**
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
    * Specifies the total number of columns in the range.
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
    * Specifies the column number of the first cell in the range. Zero-indexed.
    *
    * [Api set: ExcelApi 1.1]
    */
  val columnIndex: Double = js.native
  
  /**
    *
    * The collection of ConditionalFormats that intersect the range.
    *
    * [Api set: ExcelApi 1.6]
    */
  val conditionalFormats: ConditionalFormatCollection = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Range: RequestContext = js.native
  
  /**
    * Converts the range cells with datatypes into text.
    *
    * [Api set: ExcelApi 1.9]
    */
  def convertDataTypeToText(): Unit = js.native
  
  /**
    * Converts the range cells into linked datatype in the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param serviceID The Service ID which will be used to query the data.
    * @param languageCulture Language Culture to query the service for.
    */
  def convertToLinkedDataType(serviceID: Double, languageCulture: String): Unit = js.native
  
  /**
    * Copies cell data or formatting from the source range or RangeAreas to the current range.
    The destination range can be a different size than the source range or RangeAreas. The destination will be expanded automatically if it is smaller than the source.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param sourceRange The source range or RangeAreas to copy from. When the source RangeAreas has multiple ranges, their form must be able to be created by removing full rows or columns from a rectangular range.
    * @param copyType The type of cell data or formatting to copy over. Default is "All".
    * @param skipBlanks True if to skip blank cells in the source range. Default is false.
    * @param transpose True if to transpose the cells in the destination range. Default is false.
    */
  def copyFrom(
    sourceRange: Range | RangeAreas | String,
    copyType: js.UndefOr[All | Formulas | Values | Formats],
    skipBlanks: js.UndefOr[Boolean],
    transpose: js.UndefOr[Boolean]
  ): Unit = js.native
  def copyFrom(sourceRange: String): Unit = js.native
  def copyFrom(
    sourceRange: String,
    copyType: js.UndefOr[scala.Nothing],
    skipBlanks: js.UndefOr[scala.Nothing],
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(sourceRange: String, copyType: js.UndefOr[scala.Nothing], skipBlanks: Boolean): Unit = js.native
  def copyFrom(sourceRange: String, copyType: js.UndefOr[scala.Nothing], skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  def copyFrom(sourceRange: String, copyType: RangeCopyType): Unit = js.native
  def copyFrom(
    sourceRange: String,
    copyType: RangeCopyType,
    skipBlanks: js.UndefOr[scala.Nothing],
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(sourceRange: String, copyType: RangeCopyType, skipBlanks: Boolean): Unit = js.native
  def copyFrom(sourceRange: String, copyType: RangeCopyType, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  /**
    * Copies cell data or formatting from the source range or RangeAreas to the current range.
    The destination range can be a different size than the source range or RangeAreas. The destination will be expanded automatically if it is smaller than the source.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param sourceRange The source range or RangeAreas to copy from. When the source RangeAreas has multiple ranges, their form must be able to be created by removing full rows or columns from a rectangular range.
    * @param copyType The type of cell data or formatting to copy over. Default is "All".
    * @param skipBlanks True if to skip blank cells in the source range. Default is false.
    * @param transpose True if to transpose the cells in the destination range. Default is false.
    */
  def copyFrom(sourceRange: Range): Unit = js.native
  def copyFrom(sourceRange: RangeAreas): Unit = js.native
  def copyFrom(
    sourceRange: RangeAreas,
    copyType: js.UndefOr[scala.Nothing],
    skipBlanks: js.UndefOr[scala.Nothing],
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: js.UndefOr[scala.Nothing], skipBlanks: Boolean): Unit = js.native
  def copyFrom(
    sourceRange: RangeAreas,
    copyType: js.UndefOr[scala.Nothing],
    skipBlanks: Boolean,
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: RangeCopyType): Unit = js.native
  def copyFrom(
    sourceRange: RangeAreas,
    copyType: RangeCopyType,
    skipBlanks: js.UndefOr[scala.Nothing],
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: RangeCopyType, skipBlanks: Boolean): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: RangeCopyType, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  def copyFrom(
    sourceRange: Range,
    copyType: js.UndefOr[scala.Nothing],
    skipBlanks: js.UndefOr[scala.Nothing],
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: js.UndefOr[scala.Nothing], skipBlanks: Boolean): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: js.UndefOr[scala.Nothing], skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: RangeCopyType): Unit = js.native
  def copyFrom(
    sourceRange: Range,
    copyType: RangeCopyType,
    skipBlanks: js.UndefOr[scala.Nothing],
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: RangeCopyType, skipBlanks: Boolean): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: RangeCopyType, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  
  /**
    *
    * Returns a data validation object.
    *
    * [Api set: ExcelApi 1.8]
    */
  val dataValidation: DataValidation = js.native
  
  /**
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
    * Deletes the cells associated with the range.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param shift Specifies which way to shift the cells. See Excel.DeleteShiftDirection for details.
    */
  @JSName("delete")
  def delete_Up(shift: Up): Unit = js.native
  
  /**
    * Finds the given string based on the criteria specified.
    If the current range is larger than a single cell, then the search will be limited to that range, else the search will cover the entire sheet starting after that cell.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param text The string to find.
    * @param criteria Additional search criteria, including the search direction and whether the search needs to match the entire cell or be case sensitive.
    * @returns The Range object representing the first cell that contains a value matching the search text and criteria.
    */
  def find(text: String, criteria: SearchCriteria): Range = js.native
  
  /**
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
    * Does FlashFill to current range.Flash Fill will automatically fills data when it senses a pattern, so the range must be single column range and have data around in order to find pattern.
    *
    * [Api set: ExcelApi 1.9]
    */
  def flashFill(): Unit = js.native
  
  /**
    *
    * Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties.
    *
    * [Api set: ExcelApi 1.1]
    */
  val format: RangeFormat = js.native
  
  /**
    *
    * Represents the formula in A1-style notation. If a cell has no formula, its value is returned instead.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulas: js.Array[js.Array[_]] = js.native
  
  /**
    *
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German. If a cell has no formula, its value is returned instead.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulasLocal: js.Array[js.Array[_]] = js.native
  
  /**
    *
    * Represents the formula in R1C1-style notation. If a cell has no formula, its value is returned instead.
    *
    * [Api set: ExcelApi 1.2]
    */
  var formulasR1C1: js.Array[js.Array[_]] = js.native
  
  /**
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
    * Gets the smallest range object that encompasses the given ranges. For example, the GetBoundingRect of "B2:C5" and "D10:E15" is "B2:E15".
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param anotherRange The range object or address or range name.
    */
  def getBoundingRect(anotherRange: Range): Range = js.native
  
  /**
    * Gets the range object containing the single cell based on row and column numbers. The cell can be outside the bounds of its parent range, so long as it stays within the worksheet grid. The returned cell is located relative to the top left cell of the range.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param row Row number of the cell to be retrieved. Zero-indexed.
    * @param column Column number of the cell to be retrieved. Zero-indexed.
    */
  def getCell(row: Double, column: Double): Range = js.native
  
  /**
    * Returns a 2D array, encapsulating the data for each cell's font, fill, borders, alignment, and other properties.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cellPropertiesLoadOptions An object that represents which cell properties to load.
    * @returns A 2D array where each item represents the requested properties of the corresponding cell.
    */
  def getCellProperties(cellPropertiesLoadOptions: CellPropertiesLoadOptions): ClientResult[js.Array[js.Array[CellProperties]]] = js.native
  
  /**
    * Gets a column contained in the range.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param column Column number of the range to be retrieved. Zero-indexed.
    */
  def getColumn(column: Double): Range = js.native
  
  /**
    * Returns a single-dimensional array, encapsulating the data for each column's font, fill, borders, alignment, and other properties.  For properties that are not consistent across each cell within a given column, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param columnPropertiesLoadOptions An object that represents which column properties to load.
    * @returns An array where each item represents the requested properties of the corresponding column.
    */
  def getColumnProperties(columnPropertiesLoadOptions: ColumnPropertiesLoadOptions): ClientResult[js.Array[ColumnProperties]] = js.native
  
  /**
    * Gets a certain number of columns to the right of the current Range object.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param count Optional. The number of columns to include in the resulting range. In general, use a positive number to create a range outside the current range. You can also use a negative number to create a range within the current range. The default value is 1.
    */
  def getColumnsAfter(): Range = js.native
  def getColumnsAfter(count: Double): Range = js.native
  
  /**
    * Gets a certain number of columns to the left of the current Range object.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param count Optional. The number of columns to include in the resulting range. In general, use a positive number to create a range outside the current range. You can also use a negative number to create a range within the current range. The default value is 1.
    */
  def getColumnsBefore(): Range = js.native
  def getColumnsBefore(count: Double): Range = js.native
  
  /**
    * Returns a WorkbookRangeAreas object that represents the range containing all the direct precedents of a cell in same worksheet or in multiple worksheets.
    *
    * [Api set: ExcelApi 1.12]
    */
  def getDirectPrecedents(): WorkbookRangeAreas = js.native
  
  /**
    * Gets an object that represents the entire column of the range (for example, if the current range represents cells "B4:E11", its `getEntireColumn` is a range that represents columns "B:E").
    *
    * [Api set: ExcelApi 1.1]
    */
  def getEntireColumn(): Range = js.native
  
  /**
    * Gets an object that represents the entire row of the range (for example, if the current range represents cells "B4:E11", its `GetEntireRow` is a range that represents rows "4:11").
    *
    * [Api set: ExcelApi 1.1]
    */
  def getEntireRow(): Range = js.native
  
  /**
    * Renders the range as a base64-encoded png image.
    **Important**: This API is currently unsupported in Excel for Mac. Visit {@link https://github.com/OfficeDev/office-js/issues/235 | OfficeDev/office-js Issue #235} for the current status.
    *
    * [Api set: ExcelApi 1.7]
    */
  def getImage(): ClientResult[String] = js.native
  
  def getIntersection(anotherRange: String): Range = js.native
  /**
    * Gets the range object that represents the rectangular intersection of the given ranges.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param anotherRange The range object or range address that will be used to determine the intersection of ranges.
    */
  def getIntersection(anotherRange: Range): Range = js.native
  
  def getIntersectionOrNullObject(anotherRange: String): Range = js.native
  /**
    * Gets the range object that represents the rectangular intersection of the given ranges. If no intersection is found, will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param anotherRange The range object or range address that will be used to determine the intersection of ranges.
    */
  def getIntersectionOrNullObject(anotherRange: Range): Range = js.native
  
  /**
    * Gets the last cell within the range. For example, the last cell of "B2:D5" is "D5".
    *
    * [Api set: ExcelApi 1.1]
    */
  def getLastCell(): Range = js.native
  
  /**
    * Gets the last column within the range. For example, the last column of "B2:D5" is "D2:D5".
    *
    * [Api set: ExcelApi 1.1]
    */
  def getLastColumn(): Range = js.native
  
  /**
    * Gets the last row within the range. For example, the last row of "B2:D5" is "B5:D5".
    *
    * [Api set: ExcelApi 1.1]
    */
  def getLastRow(): Range = js.native
  
  /**
    * Returns a RangeAreas object that represents the merged areas in this range. Note that if the merged areas count in this range is more than 512, the API will fail to return the result.
    *
    * [Api set: ExcelApiOnline 1.1]
    */
  def getMergedAreas(): RangeAreas = js.native
  
  /**
    * Gets an object which represents a range that's offset from the specified range. The dimension of the returned range will match this range. If the resulting range is forced outside the bounds of the worksheet grid, an error will be thrown.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param rowOffset The number of rows (positive, negative, or 0) by which the range is to be offset. Positive values are offset downward, and negative values are offset upward.
    * @param columnOffset The number of columns (positive, negative, or 0) by which the range is to be offset. Positive values are offset to the right, and negative values are offset to the left.
    */
  def getOffsetRange(rowOffset: Double, columnOffset: Double): Range = js.native
  
  /**
    * Gets a scoped collection of PivotTables that overlap with the range.
    *
    * [Api set: ExcelApi 1.12]
    *
    * @param fullyContained If true, returns only PivotTables that are fully contained within the range bounds. The default value is false.
    * @returns
    */
  def getPivotTables(): PivotTableScopedCollection = js.native
  def getPivotTables(fullyContained: Boolean): PivotTableScopedCollection = js.native
  
  /**
    * Gets a Range object similar to the current Range object, but with its bottom-right corner expanded (or contracted) by some number of rows and columns.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param deltaRows The number of rows by which to expand the bottom-right corner, relative to the current range. Use a positive number to expand the range, or a negative number to decrease it.
    * @param deltaColumns The number of columns by which to expand the bottom-right corner, relative to the current range. Use a positive number to expand the range, or a negative number to decrease it.
    */
  def getResizedRange(deltaRows: Double, deltaColumns: Double): Range = js.native
  
  /**
    * Gets a row contained in the range.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param row Row number of the range to be retrieved. Zero-indexed.
    */
  def getRow(row: Double): Range = js.native
  
  /**
    * Returns a single-dimensional array, encapsulating the data for each row's font, fill, borders, alignment, and other properties.  For properties that are not consistent across each cell within a given row, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param rowPropertiesLoadOptions An object that represents which row properties to load.
    * @returns An array where each item represents the requested properties of the corresponding row.
    */
  def getRowProperties(rowPropertiesLoadOptions: RowPropertiesLoadOptions): ClientResult[js.Array[RowProperties]] = js.native
  
  /**
    * Gets a certain number of rows above the current Range object.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param count Optional. The number of rows to include in the resulting range. In general, use a positive number to create a range outside the current range. You can also use a negative number to create a range within the current range. The default value is 1.
    */
  def getRowsAbove(): Range = js.native
  def getRowsAbove(count: Double): Range = js.native
  
  /**
    * Gets a certain number of rows below the current Range object.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param count Optional. The number of rows to include in the resulting range. In general, use a positive number to create a range outside the current range. You can also use a negative number to create a range within the current range. The default value is 1.
    */
  def getRowsBelow(): Range = js.native
  def getRowsBelow(count: Double): Range = js.native
  
  /**
    * Gets the RangeAreas object, comprising one or more rectangular ranges, that represents all the cells that match the specified type and value.
    If no special cells are found, an ItemNotFound error will be thrown.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cellType The type of cells to include.
    * @param cellValueType If cellType is either Constants or Formulas, this argument is used to determine which types of cells to include in the result. These values can be combined together to return more than one type. The default is to select all constants or formulas, no matter what the type.
    */
  def getSpecialCells(
    cellType: ConditionalFormats | DataValidations | Blanks | Constants | Formulas | SameConditionalFormat | SameDataValidation | Visible,
    cellValueType: js.UndefOr[
      All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
    ]
  ): RangeAreas = js.native
  /**
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
  
  /**
    * Gets the RangeAreas object, comprising one or more ranges, that represents all the cells that match the specified type and value.
    If no special cells are found, a null object will be returned.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cellType The type of cells to include.
    * @param cellValueType If cellType is either Constants or Formulas, this argument is used to determine which types of cells to include in the result. These values can be combined together to return more than one type. The default is to select all constants or formulas, no matter what the type.
    */
  def getSpecialCellsOrNullObject(
    cellType: ConditionalFormats | DataValidations | Blanks | Constants | Formulas | SameConditionalFormat | SameDataValidation | Visible,
    cellValueType: js.UndefOr[
      All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
    ]
  ): RangeAreas = js.native
  /**
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
  
  /**
    * Gets the range object containing the anchor cell for a cell getting spilled into. Fails if applied to a range with more than one cell.
    *
    * [Api set: ExcelApi 1.12]
    */
  def getSpillParent(): Range = js.native
  
  /**
    * Gets the range object containing the anchor cell for a cell getting spilled into.
    If it is not a spill cell or more than once cells are give, a null object will be returned.
    *
    * [Api set: ExcelApi 1.12]
    */
  def getSpillParentOrNullObject(): Range = js.native
  
  /**
    * Gets the range object containing the spill range when called on an anchor cell. Fails if applied to a range with more than one cell.
    *
    * [Api set: ExcelApi 1.12]
    */
  def getSpillingToRange(): Range = js.native
  
  /**
    * Gets the range object containing the spill range when called on an anchor cell.
    If the range is not an anchor cell or spill range can't be found, a null object will be returned.
    *
    * [Api set: ExcelApi 1.12]
    */
  def getSpillingToRangeOrNullObject(): Range = js.native
  
  /**
    * Returns a Range object that represents the surrounding region for the top-left cell in this range. A surrounding region is a range bounded by any combination of blank rows and blank columns relative to this range.
    *
    * [Api set: ExcelApi 1.7]
    */
  def getSurroundingRegion(): Range = js.native
  
  /**
    * Gets a scoped collection of tables that overlap with the range.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param fullyContained If true, returns only tables that are fully contained within the range bounds. The default value is false.
    */
  def getTables(): TableScopedCollection = js.native
  def getTables(fullyContained: Boolean): TableScopedCollection = js.native
  
  /**
    * Returns the used range of the given range object. If there are no used cells within the range, this function will throw an ItemNotFound error.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param valuesOnly Considers only cells with values as used cells. [Api set: ExcelApi 1.2]
    */
  def getUsedRange(): Range = js.native
  def getUsedRange(valuesOnly: Boolean): Range = js.native
  
  /**
    * Returns the used range of the given range object. If there are no used cells within the range, this function will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param valuesOnly Considers only cells with values as used cells.
    */
  def getUsedRangeOrNullObject(): Range = js.native
  def getUsedRangeOrNullObject(valuesOnly: Boolean): Range = js.native
  
  /**
    * Represents the visible rows of the current range.
    *
    * [Api set: ExcelApi 1.3]
    */
  def getVisibleView(): RangeView = js.native
  
  /**
    * Groups columns and rows for an outline.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param groupOption Specifies how the range can be grouped by rows or columns.
    An `InvalidArgument` error is thrown when the group option differs from the range's
    `isEntireRow` or `isEntireColumn` property (i.e., `range.isEntireRow` is true and `groupOption` is "ByColumns"
    or `range.isEntireColumn` is true and `groupOption` is "ByRows").
    */
  def group(groupOption: GroupOption): Unit = js.native
  @JSName("group")
  def group_ByColumns(groupOption: ByColumns): Unit = js.native
  /**
    * Groups columns and rows for an outline.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param groupOption Specifies how the range can be grouped by rows or columns.
    An `InvalidArgument` error is thrown when the group option differs from the range's
    `isEntireRow` or `isEntireColumn` property (i.e., `range.isEntireRow` is true and `groupOption` is "ByColumns"
    or `range.isEntireColumn` is true and `groupOption` is "ByRows").
    */
  @JSName("group")
  def group_ByRows(groupOption: ByRows): Unit = js.native
  
  /**
    *
    * Represents if all cells have a spill border.
    Returns true if all cells have a spill border, or false if all cells do not have a spill border.
    Returns null if there are cells both with and without spill borders within the range.
    *
    * [Api set: ExcelApi 1.12]
    */
  val hasSpill: Boolean = js.native
  
  /**
    *
    * Returns the distance in points, for 100% zoom, from top edge of the range to bottom edge of the range.
    *
    * [Api set: ExcelApi 1.10]
    */
  val height: Double = js.native
  
  /**
    *
    * Represents if all cells of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  val hidden: Boolean = js.native
  
  /**
    * Hide details of the row or column group.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param groupOption Specifies whether to hide details of grouped rows or grouped columns.
    */
  def hideGroupDetails(groupOption: GroupOption): Unit = js.native
  @JSName("hideGroupDetails")
  def hideGroupDetails_ByColumns(groupOption: ByColumns): Unit = js.native
  /**
    * Hide details of the row or column group.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param groupOption Specifies whether to hide details of grouped rows or grouped columns.
    */
  @JSName("hideGroupDetails")
  def hideGroupDetails_ByRows(groupOption: ByRows): Unit = js.native
  
  /**
    *
    * Represents the hyperlink for the current range.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hyperlink: RangeHyperlink = js.native
  
  /**
    * Inserts a cell or a range of cells into the worksheet in place of this range, and shifts the other cells to make space. Returns a new Range object at the now blank space.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param shift Specifies which way to shift the cells. See Excel.InsertShiftDirection for details.
    */
  def insert(shift: InsertShiftDirection): Range = js.native
  /**
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
    *
    * Represents if the current range is an entire column.
    *
    * [Api set: ExcelApi 1.7]
    */
  val isEntireColumn: Boolean = js.native
  
  /**
    *
    * Represents if the current range is an entire row.
    *
    * [Api set: ExcelApi 1.7]
    */
  val isEntireRow: Boolean = js.native
  
  /**
    *
    * Returns the distance in points, for 100% zoom, from left edge of the worksheet to left edge of the range.
    *
    * [Api set: ExcelApi 1.10]
    */
  val left: Double = js.native
  
  /**
    *
    * Represents the data type state of each cell.
    *
    * [Api set: ExcelApi 1.9]
    */
  val linkedDataTypeState: js.Array[js.Array[LinkedDataTypeState]] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Range = js.native
  def load(options: RangeLoadOptions): Range = js.native
  def load(propertyNamesAndPaths: Expand): Range = js.native
  def load(propertyNames: String): Range = js.native
  def load(propertyNames: js.Array[String]): Range = js.native
  
  /**
    * Merge the range cells into one region in the worksheet.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param across Optional. Set true to merge cells in each row of the specified range as separate merged cells. The default value is false.
    */
  def merge(): Unit = js.native
  def merge(across: Boolean): Unit = js.native
  
  def moveTo(destinationRange: String): Unit = js.native
  /**
    * Moves cell values, formatting, and formulas from current range to the destination range, replacing the old information in those cells.
    The destination range will be expanded automatically if it is smaller than the current range. Any cells in the destination range that are outside of the original range's area are not changed.
    *
    * [Api set: ExcelApi 1.11]
    *
    * @param destinationRange destinationRange Specifies the range to where the information in this range will be moved.
    */
  def moveTo(destinationRange: Range): Unit = js.native
  
  /**
    *
    * Represents Excel's number format code for the given range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var numberFormat: js.Array[js.Array[_]] = js.native
  
  /**
    *
    * Represents the category of number format of each cell.
    *
    * [Api set: ExcelApi 1.12]
    */
  val numberFormatCategories: js.Array[js.Array[NumberFormatCategory]] = js.native
  
  /**
    *
    * Represents Excel's number format code for the given range, based on the language settings of the user.​
    Excel does not perform any language or format coercion when getting or setting the `numberFormatLocal` property.
    Any returned text uses the locally-formatted strings based on the language specified in the system settings.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormatLocal: js.Array[js.Array[_]] = js.native
  
  /**
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
    * Returns the total number of rows in the range.
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
    * Returns the row number of the first cell in the range. Zero-indexed.
    *
    * [Api set: ExcelApi 1.1]
    */
  val rowIndex: Double = js.native
  
  /**
    *
    * Represents if ALL the cells would be saved as an array formula.
    Returns true if ALL cells would be saved as an array formula, or false if ALL cells would NOT be saved as an array formula.
    Returns null if some cells would be saved as an array formula and some would not be.
    *
    * [Api set: ExcelApi 1.12]
    */
  val savedAsArray: Boolean = js.native
  
  /**
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
    * Updates the range based on a 2D array of cell properties , encapsulating things like font, fill, borders, alignment, and so forth.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cellPropertiesData A 2D array that represents which properties to set in each cell.
    */
  def setCellProperties(cellPropertiesData: js.Array[js.Array[SettableCellProperties]]): Unit = js.native
  
  /**
    * Updates the range based on a single-dimensional array of column properties, encapsulating things like font, fill, borders, alignment, and so forth.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param columnPropertiesData An array that represents which properties to set in each column.
    */
  def setColumnProperties(columnPropertiesData: js.Array[SettableColumnProperties]): Unit = js.native
  
  /**
    * Set a range to be recalculated when the next recalculation occurs.
    *
    * [Api set: ExcelApi 1.9]
    */
  def setDirty(): Unit = js.native
  
  /**
    * Updates the range based on a single-dimensional array of row properties, encapsulating things like font, fill, borders, alignment, and so forth.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param rowPropertiesData An array that represents which properties to set in each row.
    */
  def setRowProperties(rowPropertiesData: js.Array[SettableRowProperties]): Unit = js.native
  
  /**
    * Displays the card for an active cell if it has rich value content.
    *
    * [Api set: ExcelApi 1.7]
    */
  def showCard(): Unit = js.native
  
  /**
    * Show details of the row or column group.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param groupOption Specifies whether to show details of grouped rows or grouped columns.
    */
  def showGroupDetails(groupOption: GroupOption): Unit = js.native
  @JSName("showGroupDetails")
  def showGroupDetails_ByColumns(groupOption: ByColumns): Unit = js.native
  /**
    * Show details of the row or column group.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param groupOption Specifies whether to show details of grouped rows or grouped columns.
    */
  @JSName("showGroupDetails")
  def showGroupDetails_ByRows(groupOption: ByRows): Unit = js.native
  
  /**
    *
    * Represents the range sort of the current range.
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
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API.
    *
    * [Api set: ExcelApi 1.1]
    */
  val text: js.Array[js.Array[String]] = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Range object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): RangeData = js.native
  
  /**
    *
    * Returns the distance in points, for 100% zoom, from top edge of the worksheet to top edge of the range.
    *
    * [Api set: ExcelApi 1.10]
    */
  val top: Double = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Range = js.native
  
  /**
    * Ungroups columns and rows for an outline.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param groupOption Specifies how the range can be ungrouped by rows or columns.
    */
  def ungroup(groupOption: GroupOption): Unit = js.native
  @JSName("ungroup")
  def ungroup_ByColumns(groupOption: ByColumns): Unit = js.native
  /**
    * Ungroups columns and rows for an outline.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param groupOption Specifies how the range can be ungrouped by rows or columns.
    */
  @JSName("ungroup")
  def ungroup_ByRows(groupOption: ByRows): Unit = js.native
  
  /**
    * Unmerge the range cells into separate cells.
    *
    * [Api set: ExcelApi 1.2]
    */
  def unmerge(): Unit = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Range = js.native
  
  /**
    *
    * Specifies the type of data in each cell.
    *
    * [Api set: ExcelApi 1.1]
    */
  val valueTypes: js.Array[js.Array[RangeValueType]] = js.native
  
  /**
    *
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.Array[js.Array[_]] = js.native
  
  /**
    *
    * Returns the distance in points, for 100% zoom, from left edge of the range to right edge of the range.
    *
    * [Api set: ExcelApi 1.10]
    */
  val width: Double = js.native
  
  /**
    *
    * The worksheet containing the current range.
    *
    * [Api set: ExcelApi 1.1]
    */
  val worksheet: Worksheet = js.native
}
