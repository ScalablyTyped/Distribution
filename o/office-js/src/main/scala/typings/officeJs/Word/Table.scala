package typings.officeJs.Word

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.Word.Interfaces.TableData
import typings.officeJs.Word.Interfaces.TableLoadOptions
import typings.officeJs.Word.Interfaces.TableUpdateData
import typings.officeJs.anon.Expand
import typings.officeJs.anon.IgnorePunct
import typings.officeJs.officeJsStrings.After
import typings.officeJs.officeJsStrings.All
import typings.officeJs.officeJsStrings.Before
import typings.officeJs.officeJsStrings.Bottom
import typings.officeJs.officeJsStrings.Center
import typings.officeJs.officeJsStrings.Centered
import typings.officeJs.officeJsStrings.Content
import typings.officeJs.officeJsStrings.End
import typings.officeJs.officeJsStrings.Inside
import typings.officeJs.officeJsStrings.InsideHorizontal
import typings.officeJs.officeJsStrings.InsideVertical
import typings.officeJs.officeJsStrings.Justified
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.Mixed
import typings.officeJs.officeJsStrings.Outside
import typings.officeJs.officeJsStrings.Replace
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.Select
import typings.officeJs.officeJsStrings.Start
import typings.officeJs.officeJsStrings.Top
import typings.officeJs.officeJsStrings.Unknown_
import typings.officeJs.officeJsStrings.Whole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a table in a Word document.
  *
  * [Api set: WordApi 1.3]
  */
@js.native
trait Table
  extends StObject
     with ClientObject {
  
  /**
    * Adds columns to the start or end of the table, using the first or last existing column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
    *
    * [Api set: WordApi 1.3]
    *
    * @param insertLocation Required. It can be 'Start' or 'End', corresponding to the appropriate side of the table.
    * @param columnCount Required. Number of columns to add.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  def addColumns(insertLocation: InsertLocation, columnCount: Double): Unit = js.native
  def addColumns(insertLocation: InsertLocation, columnCount: Double, values: js.Array[js.Array[String]]): Unit = js.native
  @JSName("addColumns")
  def addColumns_After(insertLocation: After, columnCount: Double): Unit = js.native
  @JSName("addColumns")
  def addColumns_After(insertLocation: After, columnCount: Double, values: js.Array[js.Array[String]]): Unit = js.native
  /**
    * Adds columns to the start or end of the table, using the first or last existing column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
    *
    * [Api set: WordApi 1.3]
    *
    * @param insertLocation Required. It can be 'Start' or 'End', corresponding to the appropriate side of the table.
    * @param columnCount Required. Number of columns to add.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  @JSName("addColumns")
  def addColumns_Before(insertLocation: Before, columnCount: Double): Unit = js.native
  @JSName("addColumns")
  def addColumns_Before(insertLocation: Before, columnCount: Double, values: js.Array[js.Array[String]]): Unit = js.native
  @JSName("addColumns")
  def addColumns_End(insertLocation: End, columnCount: Double): Unit = js.native
  @JSName("addColumns")
  def addColumns_End(insertLocation: End, columnCount: Double, values: js.Array[js.Array[String]]): Unit = js.native
  @JSName("addColumns")
  def addColumns_Replace(insertLocation: Replace, columnCount: Double): Unit = js.native
  @JSName("addColumns")
  def addColumns_Replace(insertLocation: Replace, columnCount: Double, values: js.Array[js.Array[String]]): Unit = js.native
  @JSName("addColumns")
  def addColumns_Start(insertLocation: Start, columnCount: Double): Unit = js.native
  @JSName("addColumns")
  def addColumns_Start(insertLocation: Start, columnCount: Double, values: js.Array[js.Array[String]]): Unit = js.native
  
  /**
    * Adds rows to the start or end of the table, using the first or last existing row as a template. The string values, if specified, are set in the newly inserted rows.
    *
    * [Api set: WordApi 1.3]
    *
    * @param insertLocation Required. It can be 'Start' or 'End'.
    * @param rowCount Required. Number of rows to add.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  def addRows(insertLocation: InsertLocation, rowCount: Double): TableRowCollection = js.native
  def addRows(insertLocation: InsertLocation, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  @JSName("addRows")
  def addRows_After(insertLocation: After, rowCount: Double): TableRowCollection = js.native
  @JSName("addRows")
  def addRows_After(insertLocation: After, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  /**
    * Adds rows to the start or end of the table, using the first or last existing row as a template. The string values, if specified, are set in the newly inserted rows.
    *
    * [Api set: WordApi 1.3]
    *
    * @param insertLocation Required. It can be 'Start' or 'End'.
    * @param rowCount Required. Number of rows to add.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  @JSName("addRows")
  def addRows_Before(insertLocation: Before, rowCount: Double): TableRowCollection = js.native
  @JSName("addRows")
  def addRows_Before(insertLocation: Before, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  @JSName("addRows")
  def addRows_End(insertLocation: End, rowCount: Double): TableRowCollection = js.native
  @JSName("addRows")
  def addRows_End(insertLocation: End, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  @JSName("addRows")
  def addRows_Replace(insertLocation: Replace, rowCount: Double): TableRowCollection = js.native
  @JSName("addRows")
  def addRows_Replace(insertLocation: Replace, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  @JSName("addRows")
  def addRows_Start(insertLocation: Start, rowCount: Double): TableRowCollection = js.native
  @JSName("addRows")
  def addRows_Start(insertLocation: Start, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  
  /**
    *
    * Gets or sets the alignment of the table against the page column. The value can be 'Left', 'Centered', or 'Right'.
    *
    * [Api set: WordApi 1.3]
    */
  var alignment: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified = js.native
  
  /**
    * Autofits the table columns to the width of the window.
    *
    * [Api set: WordApi 1.3]
    */
  def autoFitWindow(): Unit = js.native
  
  /**
    * Clears the contents of the table.
    *
    * [Api set: WordApi 1.3]
    */
  def clear(): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Table: RequestContext = js.native
  
  /**
    * Deletes the entire table.
    *
    * [Api set: WordApi 1.3]
    */
  def delete(): Unit = js.native
  
  /**
    * Deletes specific columns. This is applicable to uniform tables.
    *
    * [Api set: WordApi 1.3]
    *
    * @param columnIndex Required. The first column to delete.
    * @param columnCount Optional. The number of columns to delete. Default 1.
    */
  def deleteColumns(columnIndex: Double): Unit = js.native
  def deleteColumns(columnIndex: Double, columnCount: Double): Unit = js.native
  
  /**
    * Deletes specific rows.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rowIndex Required. The first row to delete.
    * @param rowCount Optional. The number of rows to delete. Default 1.
    */
  def deleteRows(rowIndex: Double): Unit = js.native
  def deleteRows(rowIndex: Double, rowCount: Double): Unit = js.native
  
  /**
    * Distributes the column widths evenly. This is applicable to uniform tables.
    *
    * [Api set: WordApi 1.3]
    */
  def distributeColumns(): Unit = js.native
  
  /**
    *
    * Gets the font. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val font: Font = js.native
  
  /**
    * Gets the border style for the specified border.
    *
    * [Api set: WordApi 1.3]
    *
    * @param borderLocation Required. The border location.
    */
  def getBorder(borderLocation: BorderLocation): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_All(borderLocation: All): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_Bottom(borderLocation: Bottom): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_Inside(borderLocation: Inside): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_InsideHorizontal(borderLocation: InsideHorizontal): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_InsideVertical(borderLocation: InsideVertical): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_Left(borderLocation: Left): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_Outside(borderLocation: Outside): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_Right(borderLocation: Right): TableBorder = js.native
  /**
    * Gets the border style for the specified border.
    *
    * [Api set: WordApi 1.3]
    *
    * @param borderLocation Required. The border location.
    */
  @JSName("getBorder")
  def getBorder_Top(borderLocation: Top): TableBorder = js.native
  
  /**
    * Gets the table cell at a specified row and column. Throws an error if the specified table cell does not exist.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rowIndex Required. The index of the row.
    * @param cellIndex Required. The index of the cell in the row.
    */
  def getCell(rowIndex: Double, cellIndex: Double): TableCell = js.native
  
  /**
    * Gets the table cell at a specified row and column. Returns a null object if the specified table cell does not exist.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rowIndex Required. The index of the row.
    * @param cellIndex Required. The index of the cell in the row.
    */
  def getCellOrNullObject(rowIndex: Double, cellIndex: Double): TableCell = js.native
  
  /**
    * Gets cell padding in points.
    *
    * [Api set: WordApi 1.3]
    *
    * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
    */
  def getCellPadding(cellPaddingLocation: CellPaddingLocation): ClientResult[Double] = js.native
  @JSName("getCellPadding")
  def getCellPadding_Bottom(cellPaddingLocation: Bottom): ClientResult[Double] = js.native
  @JSName("getCellPadding")
  def getCellPadding_Left(cellPaddingLocation: Left): ClientResult[Double] = js.native
  @JSName("getCellPadding")
  def getCellPadding_Right(cellPaddingLocation: Right): ClientResult[Double] = js.native
  /**
    * Gets cell padding in points.
    *
    * [Api set: WordApi 1.3]
    *
    * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
    */
  @JSName("getCellPadding")
  def getCellPadding_Top(cellPaddingLocation: Top): ClientResult[Double] = js.native
  
  /**
    * Gets the next table. Throws an error if this table is the last one.
    *
    * [Api set: WordApi 1.3]
    */
  def getNext(): Table = js.native
  
  /**
    * Gets the next table. Returns a null object if this table is the last one.
    *
    * [Api set: WordApi 1.3]
    */
  def getNextOrNullObject(): Table = js.native
  
  /**
    * Gets the paragraph after the table. Throws an error if there isn't a paragraph after the table.
    *
    * [Api set: WordApi 1.3]
    */
  def getParagraphAfter(): Paragraph = js.native
  
  /**
    * Gets the paragraph after the table. Returns a null object if there isn't a paragraph after the table.
    *
    * [Api set: WordApi 1.3]
    */
  def getParagraphAfterOrNullObject(): Paragraph = js.native
  
  /**
    * Gets the paragraph before the table. Throws an error if there isn't a paragraph before the table.
    *
    * [Api set: WordApi 1.3]
    */
  def getParagraphBefore(): Paragraph = js.native
  
  /**
    * Gets the paragraph before the table. Returns a null object if there isn't a paragraph before the table.
    *
    * [Api set: WordApi 1.3]
    */
  def getParagraphBeforeOrNullObject(): Paragraph = js.native
  
  /**
    * Gets the range that contains this table, or the range at the start or end of the table.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rangeLocation Optional. The range location can be 'Whole', 'Start', 'End', or 'After'.
    */
  def getRange(): Range = js.native
  def getRange(rangeLocation: RangeLocation): Range = js.native
  @JSName("getRange")
  def getRange_After(rangeLocation: After): Range = js.native
  @JSName("getRange")
  def getRange_Before(rangeLocation: Before): Range = js.native
  @JSName("getRange")
  def getRange_Content(rangeLocation: Content): Range = js.native
  @JSName("getRange")
  def getRange_End(rangeLocation: End): Range = js.native
  @JSName("getRange")
  def getRange_Start(rangeLocation: Start): Range = js.native
  @JSName("getRange")
  def getRange_Whole(rangeLocation: Whole): Range = js.native
  
  /**
    *
    * Gets and sets the number of header rows.
    *
    * [Api set: WordApi 1.3]
    */
  var headerRowCount: Double = js.native
  
  /**
    *
    * Gets and sets the horizontal alignment of every cell in the table. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified = js.native
  
  /**
    * Inserts a content control on the table.
    *
    * [Api set: WordApi 1.3]
    */
  def insertContentControl(): ContentControl = js.native
  
  /**
    * Inserts a paragraph at the specified location.
    *
    * [Api set: WordApi 1.3]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertParagraph(paragraphText: String, insertLocation: InsertLocation): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_After(paragraphText: String, insertLocation: After): Paragraph = js.native
  /**
    * Inserts a paragraph at the specified location.
    *
    * [Api set: WordApi 1.3]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  @JSName("insertParagraph")
  def insertParagraph_Before(paragraphText: String, insertLocation: Before): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_End(paragraphText: String, insertLocation: End): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_Replace(paragraphText: String, insertLocation: Replace): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_Start(paragraphText: String, insertLocation: Start): Paragraph = js.native
  
  /**
    * Inserts a table with the specified number of rows and columns.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rowCount Required. The number of rows in the table.
    * @param columnCount Required. The number of columns in the table.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: InsertLocation): Table = js.native
  def insertTable(
    rowCount: Double,
    columnCount: Double,
    insertLocation: InsertLocation,
    values: js.Array[js.Array[String]]
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_After(rowCount: Double, columnCount: Double, insertLocation: After): Table = js.native
  @JSName("insertTable")
  def insertTable_After(rowCount: Double, columnCount: Double, insertLocation: After, values: js.Array[js.Array[String]]): Table = js.native
  /**
    * Inserts a table with the specified number of rows and columns.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rowCount Required. The number of rows in the table.
    * @param columnCount Required. The number of columns in the table.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  @JSName("insertTable")
  def insertTable_Before(rowCount: Double, columnCount: Double, insertLocation: Before): Table = js.native
  @JSName("insertTable")
  def insertTable_Before(rowCount: Double, columnCount: Double, insertLocation: Before, values: js.Array[js.Array[String]]): Table = js.native
  @JSName("insertTable")
  def insertTable_End(rowCount: Double, columnCount: Double, insertLocation: End): Table = js.native
  @JSName("insertTable")
  def insertTable_End(rowCount: Double, columnCount: Double, insertLocation: End, values: js.Array[js.Array[String]]): Table = js.native
  @JSName("insertTable")
  def insertTable_Replace(rowCount: Double, columnCount: Double, insertLocation: Replace): Table = js.native
  @JSName("insertTable")
  def insertTable_Replace(rowCount: Double, columnCount: Double, insertLocation: Replace, values: js.Array[js.Array[String]]): Table = js.native
  @JSName("insertTable")
  def insertTable_Start(rowCount: Double, columnCount: Double, insertLocation: Start): Table = js.native
  @JSName("insertTable")
  def insertTable_Start(rowCount: Double, columnCount: Double, insertLocation: Start, values: js.Array[js.Array[String]]): Table = js.native
  
  /**
    *
    * Indicates whether all of the table rows are uniform. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val isUniform: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Table = js.native
  def load(options: TableLoadOptions): Table = js.native
  def load(propertyNamesAndPaths: Expand): Table = js.native
  def load(propertyNames: String): Table = js.native
  def load(propertyNames: js.Array[String]): Table = js.native
  
  /**
    *
    * Gets the nesting level of the table. Top-level tables have level 1. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val nestingLevel: Double = js.native
  
  /**
    *
    * Gets the parent body of the table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentBody: Body = js.native
  
  /**
    *
    * Gets the content control that contains the table. Throws an error if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentContentControl: ContentControl = js.native
  
  /**
    *
    * Gets the content control that contains the table. Returns a null object if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentContentControlOrNullObject: ContentControl = js.native
  
  /**
    *
    * Gets the table that contains this table. Throws an error if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTable: Table = js.native
  
  /**
    *
    * Gets the table cell that contains this table. Throws an error if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableCell: TableCell = js.native
  
  /**
    *
    * Gets the table cell that contains this table. Returns a null object if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableCellOrNullObject: TableCell = js.native
  
  /**
    *
    * Gets the table that contains this table. Returns a null object if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableOrNullObject: Table = js.native
  
  /**
    *
    * Gets the number of rows in the table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val rowCount: Double = js.native
  
  /**
    *
    * Gets all of the table rows. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val rows: TableRowCollection = js.native
  
  /**
    * Performs a search with the specified SearchOptions on the scope of the table object. The search results are a collection of range objects.
    *
    * [Api set: WordApi 1.3]
    *
    * @param searchText Required. The search text.
    * @param searchOptions Optional. Options for the search.
    */
  def search(searchText: String): RangeCollection = js.native
  def search(searchText: String, searchOptions: SearchOptions): RangeCollection = js.native
  def search(searchText: String, searchOptions: IgnorePunct): RangeCollection = js.native
  
  /**
    * Selects the table, or the position at the start or end of the table, and navigates the Word UI to it.
    *
    * [Api set: WordApi 1.3]
    *
    * @param selectionMode Optional. The selection mode can be 'Select', 'Start', or 'End'. 'Select' is the default.
    */
  def select(): Unit = js.native
  def select(selectionMode: SelectionMode): Unit = js.native
  @JSName("select")
  def select_End(selectionMode: End): Unit = js.native
  @JSName("select")
  def select_Select(selectionMode: Select): Unit = js.native
  @JSName("select")
  def select_Start(selectionMode: Start): Unit = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.Table): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: TableUpdateData): Unit = js.native
  def set(properties: TableUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Table): Unit = js.native
  
  /**
    * Sets cell padding in points.
    *
    * [Api set: WordApi 1.3]
    *
    * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
    * @param cellPadding Required. The cell padding.
    */
  def setCellPadding(cellPaddingLocation: CellPaddingLocation, cellPadding: Double): Unit = js.native
  @JSName("setCellPadding")
  def setCellPadding_Bottom(cellPaddingLocation: Bottom, cellPadding: Double): Unit = js.native
  @JSName("setCellPadding")
  def setCellPadding_Left(cellPaddingLocation: Left, cellPadding: Double): Unit = js.native
  @JSName("setCellPadding")
  def setCellPadding_Right(cellPaddingLocation: Right, cellPadding: Double): Unit = js.native
  /**
    * Sets cell padding in points.
    *
    * [Api set: WordApi 1.3]
    *
    * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
    * @param cellPadding Required. The cell padding.
    */
  @JSName("setCellPadding")
  def setCellPadding_Top(cellPaddingLocation: Top, cellPadding: Double): Unit = js.native
  
  /**
    *
    * Gets and sets the shading color. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: String = js.native
  
  /**
    *
    * Gets or sets the style name for the table. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.3]
    */
  var style: String = js.native
  
  /**
    *
    * Gets and sets whether the table has banded columns.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBandedColumns: Boolean = js.native
  
  /**
    *
    * Gets and sets whether the table has banded rows.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBandedRows: Boolean = js.native
  
  /**
    *
    * Gets or sets the built-in style name for the table. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 149 */ js.Any = js.native
  
  /**
    *
    * Gets and sets whether the table has a first column with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleFirstColumn: Boolean = js.native
  
  /**
    *
    * Gets and sets whether the table has a last column with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleLastColumn: Boolean = js.native
  
  /**
    *
    * Gets and sets whether the table has a total (last) row with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleTotalRow: Boolean = js.native
  
  /**
    *
    * Gets the child tables nested one level deeper. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val tables: TableCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.Table object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.TableData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TableData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Table = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Table = js.native
  
  /**
    *
    * Gets and sets the text values in the table, as a 2D Javascript array.
    *
    * [Api set: WordApi 1.3]
    */
  var values: js.Array[js.Array[String]] = js.native
  
  /**
    *
    * Gets and sets the vertical alignment of every cell in the table. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: VerticalAlignment | Mixed | Top | Center | Bottom = js.native
  
  /**
    *
    * Gets and sets the width of the table in points.
    *
    * [Api set: WordApi 1.3]
    */
  var width: Double = js.native
}
