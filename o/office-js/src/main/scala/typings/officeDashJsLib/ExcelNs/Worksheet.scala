package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * An Excel worksheet is a grid of cells. It can contain data, tables, charts, etc.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.Worksheet")
@js.native
class Worksheet ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Represents the AutoFilter object of the worksheet. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val autoFilter: AutoFilter = js.native
  /**
    *
    * Returns collection of charts that are part of the worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val charts: ChartCollection = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Worksheet: RequestContext = js.native
  /**
    *
    * Gets or sets the enableCalculation property of the worksheet.
    True if Excel recalculates the worksheet when necessary. False if Excel doesn't recalculate the sheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enableCalculation: scala.Boolean = js.native
  /**
    *
    * Gets an object that can be used to manipulate frozen panes on the worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val freezePanes: WorksheetFreezePanes = js.native
  /**
    *
    * Gets the horizontal page break collection for the worksheet. This collection only contains manual page breaks.
    *
    * [Api set: ExcelApi 1.9]
    */
  val horizontalPageBreaks: PageBreakCollection = js.native
  /**
    *
    * Returns a value that uniquely identifies the worksheet in a given workbook. The value of the identifier remains the same even when the worksheet is renamed or moved. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val id: java.lang.String = js.native
  /**
    *
    * The display name of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: java.lang.String = js.native
  /**
    *
    * Collection of names scoped to the current worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.4]
    */
  val names: NamedItemCollection = js.native
  /**
    *
    * Occurs when the worksheet is activated.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onActivated: officeDashJsLib.OfficeExtensionNs.EventHandlers[WorksheetActivatedEventArgs] = js.native
  /**
    *
    * Occurs when the worksheet is calculated.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onCalculated: officeDashJsLib.OfficeExtensionNs.EventHandlers[WorksheetCalculatedEventArgs] = js.native
  /**
    *
    * Occurs when data changed on a specific worksheet.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onChanged: officeDashJsLib.OfficeExtensionNs.EventHandlers[WorksheetChangedEventArgs] = js.native
  /**
    *
    * Occurs when the worksheet is deactivated.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onDeactivated: officeDashJsLib.OfficeExtensionNs.EventHandlers[WorksheetDeactivatedEventArgs] = js.native
  /**
    *
    * Occurs when format changed on a specific worksheet.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @eventproperty
    */
  val onFormatChanged: officeDashJsLib.OfficeExtensionNs.EventHandlers[WorksheetFormatChangedEventArgs] = js.native
  /**
    *
    * Occurs when the selection changes on a specific worksheet.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onSelectionChanged: officeDashJsLib.OfficeExtensionNs.EventHandlers[WorksheetSelectionChangedEventArgs] = js.native
  /**
    *
    * Gets the PageLayout object of the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  val pageLayout: PageLayout = js.native
  /**
    *
    * Collection of PivotTables that are part of the worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  val pivotTables: PivotTableCollection = js.native
  /**
    *
    * The zero-based position of the worksheet within the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: scala.Double = js.native
  /**
    *
    * Returns sheet protection object for a worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  val protection: WorksheetProtection = js.native
  /**
    *
    * Returns the collection of all the Shape objects on the worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val shapes: ShapeCollection = js.native
  /**
    *
    * Gets or sets the worksheet's gridlines flag.
    This flag determines whether gridlines are visible to the user.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showGridlines: scala.Boolean = js.native
  /**
    *
    * Gets or sets the worksheet's headings flag.
    This flag determines whether headings are visible to the user.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showHeadings: scala.Boolean = js.native
  /**
    *
    * Returns the standard (default) height of all the rows in the worksheet, in points. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val standardHeight: scala.Double = js.native
  /**
    *
    * Returns or sets the standard (default) width of all the columns in the worksheet.
    One unit of column width is equal to the width of one character in the Normal style. For proportional fonts, the width of the character 0 (zero) is used.
    *
    * [Api set: ExcelApi 1.7]
    */
  var standardWidth: scala.Double = js.native
  /**
    *
    * Gets or sets the worksheet tab color.
    When retrieving the tab color, if the worksheet is invisible, the value will be null. If the worksheet is visible but the tab color is set to auto, an empty string will be returned. Otherwise, the property will be set to a color, in the form "#123456"
    When setting the color, use an empty-string to set an "auto" color, or a real color otherwise.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tabColor: java.lang.String = js.native
  /**
    *
    * Collection of tables that are part of the worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val tables: TableCollection = js.native
  /**
    *
    * Gets the vertical page break collection for the worksheet. This collection only contains manual page breaks.
    *
    * [Api set: ExcelApi 1.9]
    */
  val verticalPageBreaks: PageBreakCollection = js.native
  /**
    *
    * The Visibility of the worksheet.
    *
    * [Api set: ExcelApi 1.1 for reading visibility; 1.2 for setting it.]
    */
  var visibility: SheetVisibility | officeDashJsLib.officeDashJsLibStrings.Visible | officeDashJsLib.officeDashJsLibStrings.Hidden | officeDashJsLib.officeDashJsLibStrings.VeryHidden = js.native
  /**
    *
    * Activate the worksheet in the Excel UI.
    *
    * [Api set: ExcelApi 1.1]
    */
  def activate(): scala.Unit = js.native
  /**
    *
    * Calculates all cells on a worksheet.
    *
    * [Api set: ExcelApi 1.6]
    *
    * @param markAllDirty True, to mark all as dirty.
    */
  def calculate(markAllDirty: scala.Boolean): scala.Unit = js.native
  /**
    *
    * Copy a worksheet and place it at the specified position. Return the copied worksheet.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param positionType Optional.
    * @param relativeTo Optional.
    */
  def copy(): Worksheet = js.native
  def copy(positionType: WorksheetPositionType): Worksheet = js.native
  def copy(positionType: WorksheetPositionType, relativeTo: Worksheet): Worksheet = js.native
  @JSName("copy")
  def copy_After(positionType: officeDashJsLib.officeDashJsLibStrings.After): Worksheet = js.native
  @JSName("copy")
  def copy_After(positionType: officeDashJsLib.officeDashJsLibStrings.After, relativeTo: Worksheet): Worksheet = js.native
  @JSName("copy")
  def copy_Before(positionType: officeDashJsLib.officeDashJsLibStrings.Before): Worksheet = js.native
  @JSName("copy")
  def copy_Before(positionType: officeDashJsLib.officeDashJsLibStrings.Before, relativeTo: Worksheet): Worksheet = js.native
  @JSName("copy")
  def copy_Beginning(positionType: officeDashJsLib.officeDashJsLibStrings.Beginning): Worksheet = js.native
  @JSName("copy")
  def copy_Beginning(positionType: officeDashJsLib.officeDashJsLibStrings.Beginning, relativeTo: Worksheet): Worksheet = js.native
  @JSName("copy")
  def copy_End(positionType: officeDashJsLib.officeDashJsLibStrings.End): Worksheet = js.native
  @JSName("copy")
  def copy_End(positionType: officeDashJsLib.officeDashJsLibStrings.End, relativeTo: Worksheet): Worksheet = js.native
  @JSName("copy")
  def copy_None(positionType: officeDashJsLib.officeDashJsLibStrings.None): Worksheet = js.native
  @JSName("copy")
  def copy_None(positionType: officeDashJsLib.officeDashJsLibStrings.None, relativeTo: Worksheet): Worksheet = js.native
  /**
    *
    * Deletes the worksheet from the workbook. Note that if the worksheet's visibility is set to "VeryHidden", the delete operation will fail with a GeneralException.
    *
    * [Api set: ExcelApi 1.1]
    */
  def delete(): scala.Unit = js.native
  /**
    *
    * Finds all occurrences of the given string based on the criteria specified and returns them as a RangeAreas object, comprising one or more rectangular ranges.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param text String to find.
    * @param criteria Additional Criteria.
    * @returns A RangeArea object, comprising one or more rectangular ranges, that matches the search criteria. If no cells meet this criteria, an ItemNotFound error will be thrown.
    */
  def findAll(text: java.lang.String, criteria: WorksheetSearchCriteria): RangeAreas = js.native
  /**
    *
    * Finds all occurrences of the given string based on the criteria specified and returns them as a RangeAreas object, comprising one or more rectangular ranges.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param text String to find.
    * @param criteria Additional Criteria.
    * @returns A RangeArea object, comprising one or more rectangular ranges, that matches the search criteria. If there are no matches, this function will return a null object.
    */
  def findAllOrNullObject(text: java.lang.String, criteria: WorksheetSearchCriteria): RangeAreas = js.native
  /**
    *
    * Gets the range object containing the single cell based on row and column numbers. The cell can be outside the bounds of its parent range, so long as it stays within the worksheet grid.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param row The row number of the cell to be retrieved. Zero-indexed.
    * @param column the column number of the cell to be retrieved. Zero-indexed.
    */
  def getCell(row: scala.Double, column: scala.Double): Range = js.native
  /**
    *
    * Gets the worksheet that follows this one. If there are no worksheets following this one, this method will throw an error.
    *
    * [Api set: ExcelApi 1.5]
    *
    * @param visibleOnly Optional. If true, considers only visible worksheets, skipping over any hidden ones.
    */
  def getNext(): Worksheet = js.native
  def getNext(visibleOnly: scala.Boolean): Worksheet = js.native
  /**
    *
    * Gets the worksheet that follows this one. If there are no worksheets following this one, this method will return a null object.
    *
    * [Api set: ExcelApi 1.5]
    *
    * @param visibleOnly Optional. If true, considers only visible worksheets, skipping over any hidden ones.
    */
  def getNextOrNullObject(): Worksheet = js.native
  def getNextOrNullObject(visibleOnly: scala.Boolean): Worksheet = js.native
  /**
    *
    * Gets the worksheet that precedes this one. If there are no previous worksheets, this method will throw an error.
    *
    * [Api set: ExcelApi 1.5]
    *
    * @param visibleOnly Optional. If true, considers only visible worksheets, skipping over any hidden ones.
    */
  def getPrevious(): Worksheet = js.native
  def getPrevious(visibleOnly: scala.Boolean): Worksheet = js.native
  /**
    *
    * Gets the worksheet that precedes this one. If there are no previous worksheets, this method will return a null objet.
    *
    * [Api set: ExcelApi 1.5]
    *
    * @param visibleOnly Optional. If true, considers only visible worksheets, skipping over any hidden ones.
    */
  def getPreviousOrNullObject(): Worksheet = js.native
  def getPreviousOrNullObject(visibleOnly: scala.Boolean): Worksheet = js.native
  /**
    *
    * Gets the range object, representing a single rectangular block of cells, specified by the address or name.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param address Optional. The string representing the address or name of the range. For example, "A1:B2". If not specified, the entire worksheet range is returned.
    */
  def getRange(): Range = js.native
  def getRange(address: java.lang.String): Range = js.native
  /**
    *
    * Gets the range object beginning at a particular row index and column index, and spanning a certain number of rows and columns.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param startRow Start row (zero-indexed).
    * @param startColumn Start column (zero-indexed).
    * @param rowCount Number of rows to include in the range.
    * @param columnCount Number of columns to include in the range.
    */
  def getRangeByIndexes(
    startRow: scala.Double,
    startColumn: scala.Double,
    rowCount: scala.Double,
    columnCount: scala.Double
  ): Range = js.native
  /**
    *
    * Gets the RangeAreas object, representing one or more blocks of rectangular ranges, specified by the address or name.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param address Optional. A string containing the comma-separated addresses or names of the individual ranges. For example, "A1:B2, A5:B5". If not specified, an RangeArea object for the entire worksheet is returned.
    */
  def getRanges(): RangeAreas = js.native
  def getRanges(address: java.lang.String): RangeAreas = js.native
  /**
    *
    * The used range is the smallest range that encompasses any cells that have a value or formatting assigned to them. If the entire worksheet is blank, this function will return the top left cell (i.e. it will *not* throw an error).
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param valuesOnly Optional. If true, considers only cells with values as used cells (ignoring formatting). [Api set: ExcelApi 1.2]
    */
  def getUsedRange(): Range = js.native
  def getUsedRange(valuesOnly: scala.Boolean): Range = js.native
  /**
    *
    * The used range is the smallest range that encompasses any cells that have a value or formatting assigned to them. If the entire worksheet is blank, this function will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param valuesOnly Optional. Considers only cells with values as used cells.
    */
  def getUsedRangeOrNullObject(): Range = js.native
  def getUsedRangeOrNullObject(valuesOnly: scala.Boolean): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.Worksheet` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.Worksheet` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.Worksheet` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Worksheet = js.native
  def load(option: java.lang.String): Worksheet = js.native
  def load(option: js.Array[java.lang.String]): Worksheet = js.native
  def load(option: officeDashJsLib.Anon_Expand): Worksheet = js.native
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.WorksheetLoadOptions): Worksheet = js.native
  /**
    *
    * Finds and replaces the given string based on the criteria specified within the current worksheet.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param text String to find.
    * @param replacement String to replace the original with.
    * @param criteria Additional Replace Criteria.
    * @returns The number of replacements performed.
    */
  def replaceAll(text: java.lang.String, replacement: java.lang.String, criteria: ReplaceCriteria): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.Worksheet): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.WorksheetUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.WorksheetUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Worksheet): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Worksheet object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.WorksheetData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.WorksheetData = js.native
}

