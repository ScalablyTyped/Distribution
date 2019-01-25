package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Range represents a set of one or more contiguous cells such as a cell, a row, a column, block of cells, etc.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.Range")
@js.native
class Range ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Represents the range reference in A1-style. Address value will contain the Sheet reference (e.g. "Sheet1!A1:B4"). Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val address: java.lang.String = js.native
  /**
    *
    * Represents range reference for the specified range in the language of the user. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val addressLocal: java.lang.String = js.native
  /**
    *
    * Number of cells in the range. This API will return -1 if the cell count exceeds 2^31-1 (2,147,483,647). Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val cellCount: scala.Double = js.native
  /**
    *
    * Represents the total number of columns in the range. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val columnCount: scala.Double = js.native
  /**
    *
    * Represents if all columns of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var columnHidden: scala.Boolean = js.native
  /**
    *
    * Represents the column number of the first cell in the range. Zero-indexed. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val columnIndex: scala.Double = js.native
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
  val hidden: scala.Boolean = js.native
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
  val isEntireColumn: scala.Boolean = js.native
  /**
    *
    * Represents if the current range is an entire row. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val isEntireRow: scala.Boolean = js.native
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
    * Represents Excel's number format code for the given range as a string in the language of the user.
    When setting number format local to a range, the value argument can be either a single value (string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
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
  val rowCount: scala.Double = js.native
  /**
    *
    * Represents if all rows of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var rowHidden: scala.Boolean = js.native
  /**
    *
    * Returns the row number of the first cell in the range. Zero-indexed. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val rowIndex: scala.Double = js.native
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
  var style: java.lang.String = js.native
  /**
    *
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val text: js.Array[js.Array[java.lang.String]] = js.native
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
  /**
    *
    * Calculates a range of cells on a worksheet.
    *
    * [Api set: ExcelApi 1.6]
    */
  def calculate(): scala.Unit = js.native
  /**
    *
    * Clear range values, format, fill, border, etc.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param applyTo Optional. Determines the type of clear action. See Excel.ClearApplyTo for details.
    */
  def clear(): scala.Unit = js.native
  def clear(applyTo: ClearApplyTo): scala.Unit = js.native
  @JSName("clear")
  def clear_All(applyTo: officeDashJsLib.officeDashJsLibStrings.All): scala.Unit = js.native
  @JSName("clear")
  def clear_Contents(applyTo: officeDashJsLib.officeDashJsLibStrings.Contents): scala.Unit = js.native
  @JSName("clear")
  def clear_Formats(applyTo: officeDashJsLib.officeDashJsLibStrings.Formats): scala.Unit = js.native
  @JSName("clear")
  def clear_Hyperlinks(applyTo: officeDashJsLib.officeDashJsLibStrings.Hyperlinks): scala.Unit = js.native
  @JSName("clear")
  def clear_RemoveHyperlinks(applyTo: officeDashJsLib.officeDashJsLibStrings.RemoveHyperlinks): scala.Unit = js.native
  /**
    *
    * Deletes the cells associated with the range.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param shift Specifies which way to shift the cells. See Excel.DeleteShiftDirection for details.
    */
  def delete(shift: DeleteShiftDirection): scala.Unit = js.native
  @JSName("delete")
  def delete_Left(shift: officeDashJsLib.officeDashJsLibStrings.Left): scala.Unit = js.native
  /**
    *
    * Deletes the cells associated with the range.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param shift Specifies which way to shift the cells. See Excel.DeleteShiftDirection for details.
    */
  @JSName("delete")
  def delete_Up(shift: officeDashJsLib.officeDashJsLibStrings.Up): scala.Unit = js.native
  /**
    *
    * Gets a Range object with the same top-left cell as the current Range object, but with the specified numbers of rows and columns.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param numRows The number of rows of the new range size.
    * @param numColumns The number of columns of the new range size.
    */
  def getAbsoluteResizedRange(numRows: scala.Double, numColumns: scala.Double): Range = js.native
  def getBoundingRect(anotherRange: java.lang.String): Range = js.native
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
  def getCell(row: scala.Double, column: scala.Double): Range = js.native
  /**
    *
    * Gets a column contained in the range.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param column Column number of the range to be retrieved. Zero-indexed.
    */
  def getColumn(column: scala.Double): Range = js.native
  /**
    *
    * Gets a certain number of columns to the right of the current Range object.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param count Optional. The number of columns to include in the resulting range. In general, use a positive number to create a range outside the current range. You can also use a negative number to create a range within the current range. The default value is 1.
    */
  def getColumnsAfter(): Range = js.native
  def getColumnsAfter(count: scala.Double): Range = js.native
  /**
    *
    * Gets a certain number of columns to the left of the current Range object.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param count Optional. The number of columns to include in the resulting range. In general, use a positive number to create a range outside the current range. You can also use a negative number to create a range within the current range. The default value is 1.
    */
  def getColumnsBefore(): Range = js.native
  def getColumnsBefore(count: scala.Double): Range = js.native
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
  def getImage(): officeDashJsLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  def getIntersection(anotherRange: java.lang.String): Range = js.native
  /**
    *
    * Gets the range object that represents the rectangular intersection of the given ranges.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param anotherRange The range object or range address that will be used to determine the intersection of ranges.
    */
  def getIntersection(anotherRange: Range): Range = js.native
  def getIntersectionOrNullObject(anotherRange: java.lang.String): Range = js.native
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
  def getOffsetRange(rowOffset: scala.Double, columnOffset: scala.Double): Range = js.native
  /**
    *
    * Gets a Range object similar to the current Range object, but with its bottom-right corner expanded (or contracted) by some number of rows and columns.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param deltaRows The number of rows by which to expand the bottom-right corner, relative to the current range. Use a positive number to expand the range, or a negative number to decrease it.
    * @param deltaColumns The number of columns by which to expand the bottom-right corner, relative to the current range. Use a positive number to expand the range, or a negative number to decrease it.
    */
  def getResizedRange(deltaRows: scala.Double, deltaColumns: scala.Double): Range = js.native
  /**
    *
    * Gets a row contained in the range.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param row Row number of the range to be retrieved. Zero-indexed.
    */
  def getRow(row: scala.Double): Range = js.native
  /**
    *
    * Gets a certain number of rows above the current Range object.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param count Optional. The number of rows to include in the resulting range. In general, use a positive number to create a range outside the current range. You can also use a negative number to create a range within the current range. The default value is 1.
    */
  def getRowsAbove(): Range = js.native
  def getRowsAbove(count: scala.Double): Range = js.native
  /**
    *
    * Gets a certain number of rows below the current Range object.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param count Optional. The number of rows to include in the resulting range. In general, use a positive number to create a range outside the current range. You can also use a negative number to create a range within the current range. The default value is 1.
    */
  def getRowsBelow(): Range = js.native
  def getRowsBelow(count: scala.Double): Range = js.native
  /**
    *
    * Returns a Range object that represents the surrounding region for the top-left cell in this range. A surrounding region is a range bounded by any combination of blank rows and blank columns relative to this range.
    *
    * [Api set: ExcelApi 1.7]
    */
  def getSurroundingRegion(): Range = js.native
  /**
    *
    * Returns the used range of the given range object. If there are no used cells within the range, this function will throw an ItemNotFound error.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param valuesOnly Considers only cells with values as used cells. [Api set: ExcelApi 1.2]
    */
  def getUsedRange(): Range = js.native
  def getUsedRange(valuesOnly: scala.Boolean): Range = js.native
  /**
    *
    * Returns the used range of the given range object. If there are no used cells within the range, this function will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param valuesOnly Considers only cells with values as used cells.
    */
  def getUsedRangeOrNullObject(): Range = js.native
  def getUsedRangeOrNullObject(valuesOnly: scala.Boolean): Range = js.native
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
  def insert_Down(shift: officeDashJsLib.officeDashJsLibStrings.Down): Range = js.native
  @JSName("insert")
  def insert_Right(shift: officeDashJsLib.officeDashJsLibStrings.Right): Range = js.native
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
  def load(option: java.lang.String): Range = js.native
  def load(option: js.Array[java.lang.String]): Range = js.native
  def load(option: officeDashJsLib.Anon_Expand): Range = js.native
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.RangeLoadOptions): Range = js.native
  /**
    *
    * Merge the range cells into one region in the worksheet.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param across Optional. Set true to merge cells in each row of the specified range as separate merged cells. The default value is false.
    */
  def merge(): scala.Unit = js.native
  def merge(across: scala.Boolean): scala.Unit = js.native
  /**
    *
    * Selects the specified range in the Excel UI.
    *
    * [Api set: ExcelApi 1.1]
    */
  def select(): scala.Unit = js.native
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
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.RangeUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.RangeUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Range): scala.Unit = js.native
  /**
    *
    * Displays the card for an active cell if it has rich value content.
    *
    * [Api set: ExcelApi 1.7]
    */
  def showCard(): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Range object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.RangeData = js.native
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
  def unmerge(): scala.Unit = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): Range = js.native
}

