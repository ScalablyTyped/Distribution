package typings.officeJsPreview.Word

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.Word.InsertLocation.before
import typings.officeJsPreview.Word.InsertLocation.end
import typings.officeJsPreview.Word.InsertLocation.start
import typings.officeJsPreview.Word.Interfaces.TableData
import typings.officeJsPreview.Word.Interfaces.TableLoadOptions
import typings.officeJsPreview.Word.Interfaces.TableUpdateData
import typings.officeJsPreview.Word.RangeLocation.after
import typings.officeJsPreview.Word.RangeLocation.whole
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.anon.IgnorePunct
import typings.officeJsPreview.officeJsPreviewStrings.After
import typings.officeJsPreview.officeJsPreviewStrings.All
import typings.officeJsPreview.officeJsPreviewStrings.Before
import typings.officeJsPreview.officeJsPreviewStrings.Bottom
import typings.officeJsPreview.officeJsPreviewStrings.Center
import typings.officeJsPreview.officeJsPreviewStrings.Centered
import typings.officeJsPreview.officeJsPreviewStrings.End
import typings.officeJsPreview.officeJsPreviewStrings.Inside
import typings.officeJsPreview.officeJsPreviewStrings.InsideHorizontal
import typings.officeJsPreview.officeJsPreviewStrings.InsideVertical
import typings.officeJsPreview.officeJsPreviewStrings.Justified
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.Mixed
import typings.officeJsPreview.officeJsPreviewStrings.Outside
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.Select
import typings.officeJsPreview.officeJsPreviewStrings.Start
import typings.officeJsPreview.officeJsPreviewStrings.Top
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import typings.officeJsPreview.officeJsPreviewStrings.Whole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a table in a Word document.
  *
  * @remarks
  * [Api set: WordApi 1.3]
  */
@js.native
trait Table
  extends StObject
     with ClientObject {
  
  def addColumns(insertLocation: Start | End, columnCount: Double): Unit = js.native
  def addColumns(insertLocation: Start | End, columnCount: Double, values: js.Array[js.Array[String]]): Unit = js.native
  def addColumns(insertLocation: end, columnCount: Double): Unit = js.native
  def addColumns(insertLocation: end, columnCount: Double, values: js.Array[js.Array[String]]): Unit = js.native
  /**
    * Adds columns to the start or end of the table, using the first or last existing column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param insertLocation Required. It must be 'Start' or 'End', corresponding to the appropriate side of the table.
    * @param columnCount Required. Number of columns to add.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  def addColumns(insertLocation: start, columnCount: Double): Unit = js.native
  def addColumns(insertLocation: start, columnCount: Double, values: js.Array[js.Array[String]]): Unit = js.native
  
  def addRows(insertLocation: Start | End, rowCount: Double): TableRowCollection = js.native
  def addRows(insertLocation: Start | End, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  def addRows(insertLocation: end, rowCount: Double): TableRowCollection = js.native
  def addRows(insertLocation: end, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  /**
    * Adds rows to the start or end of the table, using the first or last existing row as a template. The string values, if specified, are set in the newly inserted rows.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param insertLocation Required. It must be 'Start' or 'End'.
    * @param rowCount Required. Number of rows to add.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  def addRows(insertLocation: start, rowCount: Double): TableRowCollection = js.native
  def addRows(insertLocation: start, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  
  /**
    * Specifies the alignment of the table against the page column. The value can be 'Left', 'Centered', or 'Right'.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var alignment: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified = js.native
  
  /**
    * Autofits the table columns to the width of the window.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def autoFitWindow(): Unit = js.native
  
  /**
    * Clears the contents of the table.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def clear(): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Table: RequestContext = js.native
  
  /**
    * Deletes the entire table.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def delete(): Unit = js.native
  
  /**
    * Deletes specific columns. This is applicable to uniform tables.
    *
    * @remarks
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
    * @remarks
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
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def distributeColumns(): Unit = js.native
  
  /**
    * Gets the collection of endnotes in the table.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  val endnotes: NoteItemCollection = js.native
  
  /**
    * Gets the collection of field objects in the table.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val fields: FieldCollection = js.native
  
  /**
    * Gets the font. Use this to get and set font name, size, color, and other properties.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val font: Font = js.native
  
  /**
    * Gets the collection of footnotes in the table.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  val footnotes: NoteItemCollection = js.native
  
  /**
    * Gets the border style for the specified border.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param borderLocation Required. The border location.
    */
  def getBorder(
    borderLocation: Top | Left | Bottom | Right | InsideHorizontal | InsideVertical | Inside | Outside | All
  ): TableBorder = js.native
  /**
    * Gets the border style for the specified border.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param borderLocation Required. The border location.
    */
  def getBorder(borderLocation: BorderLocation): TableBorder = js.native
  
  /**
    * Gets the table cell at a specified row and column. Throws an `ItemNotFound` error if the specified table cell does not exist.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param rowIndex Required. The index of the row.
    * @param cellIndex Required. The index of the cell in the row.
    */
  def getCell(rowIndex: Double, cellIndex: Double): TableCell = js.native
  
  /**
    * Gets the table cell at a specified row and column. If the specified table cell does not exist, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param rowIndex Required. The index of the row.
    * @param cellIndex Required. The index of the cell in the row.
    */
  def getCellOrNullObject(rowIndex: Double, cellIndex: Double): TableCell = js.native
  
  /**
    * Gets cell padding in points.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param cellPaddingLocation Required. The cell padding location must be 'Top', 'Left', 'Bottom', or 'Right'.
    */
  def getCellPadding(cellPaddingLocation: Top | Left | Bottom | Right): ClientResult[Double] = js.native
  /**
    * Gets cell padding in points.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param cellPaddingLocation Required. The cell padding location must be 'Top', 'Left', 'Bottom', or 'Right'.
    */
  def getCellPadding(cellPaddingLocation: CellPaddingLocation): ClientResult[Double] = js.native
  
  /**
    * Gets the next table. Throws an `ItemNotFound` error if this table is the last one.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getNext(): Table = js.native
  
  /**
    * Gets the next table. If this table is the last one, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getNextOrNullObject(): Table = js.native
  
  /**
    * Gets the paragraph after the table. Throws an `ItemNotFound` error if there isn't a paragraph after the table.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getParagraphAfter(): Paragraph = js.native
  
  /**
    * Gets the paragraph after the table. If there isn't a paragraph after the table, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getParagraphAfterOrNullObject(): Paragraph = js.native
  
  /**
    * Gets the paragraph before the table. Throws an `ItemNotFound` error if there isn't a paragraph before the table.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getParagraphBefore(): Paragraph = js.native
  
  /**
    * Gets the paragraph before the table. If there isn't a paragraph before the table, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getParagraphBeforeOrNullObject(): Paragraph = js.native
  
  /**
    * Gets the range that contains this table, or the range at the start or end of the table.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param rangeLocation Optional. The range location must be 'Whole', 'Start', 'End', or 'After'.
    */
  def getRange(): Range = js.native
  def getRange(rangeLocation: Whole | Start | End | After): Range = js.native
  def getRange(rangeLocation: after): Range = js.native
  def getRange(rangeLocation: typings.officeJsPreview.Word.RangeLocation.end): Range = js.native
  def getRange(rangeLocation: typings.officeJsPreview.Word.RangeLocation.start): Range = js.native
  def getRange(rangeLocation: whole): Range = js.native
  
  /**
    * Specifies the number of header rows.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var headerRowCount: Double = js.native
  
  /**
    * Specifies the horizontal alignment of every cell in the table. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified = js.native
  
  /**
    * Inserts a content control on the table.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def insertContentControl(): ContentControl = js.native
  
  def insertParagraph(paragraphText: String, insertLocation: Before | After): Paragraph = js.native
  def insertParagraph(paragraphText: String, insertLocation: typings.officeJsPreview.Word.InsertLocation.after): Paragraph = js.native
  /**
    * Inserts a paragraph at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value must be 'Before' or 'After'.
    */
  def insertParagraph(paragraphText: String, insertLocation: before): Paragraph = js.native
  
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: Before | After): Table = js.native
  def insertTable(
    rowCount: Double,
    columnCount: Double,
    insertLocation: Before | After,
    values: js.Array[js.Array[String]]
  ): Table = js.native
  def insertTable(
    rowCount: Double,
    columnCount: Double,
    insertLocation: typings.officeJsPreview.Word.InsertLocation.after
  ): Table = js.native
  def insertTable(
    rowCount: Double,
    columnCount: Double,
    insertLocation: typings.officeJsPreview.Word.InsertLocation.after,
    values: js.Array[js.Array[String]]
  ): Table = js.native
  /**
    * Inserts a table with the specified number of rows and columns.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param rowCount Required. The number of rows in the table.
    * @param columnCount Required. The number of columns in the table.
    * @param insertLocation Required. The value must be 'Before' or 'After'.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: before): Table = js.native
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: before, values: js.Array[js.Array[String]]): Table = js.native
  
  /**
    * Indicates whether all of the table rows are uniform.
    *
    * @remarks
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
    * Merges the cells bounded inclusively by a first and last cell.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * @param topRow Required. The row of the first cell
    * @param firstCell Required. The index of the first cell in its row
    * @param bottomRow Required. The row of the last cell
    * @param lastCell Required. The index of the last cell in its row
    */
  def mergeCells(topRow: Double, firstCell: Double, bottomRow: Double, lastCell: Double): TableCell = js.native
  
  /**
    * Gets the nesting level of the table. Top-level tables have level 1.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val nestingLevel: Double = js.native
  
  /**
    * Gets the parent body of the table.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentBody: Body = js.native
  
  /**
    * Gets the content control that contains the table. Throws an `ItemNotFound` error if there isn't a parent content control.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentContentControl: ContentControl = js.native
  
  /**
    * Gets the content control that contains the table. If there isn't a parent content control, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentContentControlOrNullObject: ContentControl = js.native
  
  /**
    * Gets the table that contains this table. Throws an `ItemNotFound` error if it is not contained in a table.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTable: Table = js.native
  
  /**
    * Gets the table cell that contains this table. Throws an `ItemNotFound` error if it is not contained in a table cell.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTableCell: TableCell = js.native
  
  /**
    * Gets the table cell that contains this table. If it is not contained in a table cell, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTableCellOrNullObject: TableCell = js.native
  
  /**
    * Gets the table that contains this table. If it is not contained in a table, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTableOrNullObject: Table = js.native
  
  /**
    * Gets the number of rows in the table.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val rowCount: Double = js.native
  
  /**
    * Gets all of the table rows.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val rows: TableRowCollection = js.native
  
  /**
    * Performs a search with the specified SearchOptions on the scope of the table object. The search results are a collection of range objects.
    *
    * @remarks
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
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param selectionMode Optional. The selection mode must be 'Select', 'Start', or 'End'. 'Select' is the default.
    */
  def select(): Unit = js.native
  def select(selectionMode: Select | Start | End): Unit = js.native
  def select(selectionMode: SelectionMode): Unit = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
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
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param cellPaddingLocation Required. The cell padding location must be 'Top', 'Left', 'Bottom', or 'Right'.
    * @param cellPadding Required. The cell padding.
    */
  def setCellPadding(cellPaddingLocation: Top | Left | Bottom | Right, cellPadding: Double): Unit = js.native
  /**
    * Sets cell padding in points.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param cellPaddingLocation Required. The cell padding location must be 'Top', 'Left', 'Bottom', or 'Right'.
    * @param cellPadding Required. The cell padding.
    */
  def setCellPadding(cellPaddingLocation: CellPaddingLocation, cellPadding: Double): Unit = js.native
  
  /**
    * Specifies the shading color. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var shadingColor: String = js.native
  
  /**
    * Specifies the style name for the table. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var style: String = js.native
  
  /**
    * Specifies whether the table has banded columns.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBandedColumns: Boolean = js.native
  
  /**
    * Specifies whether the table has banded rows.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBandedRows: Boolean = js.native
  
  /**
    * Specifies the built-in style name for the table. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 149, starting with typings.officeJsPreview.Word.BuiltInStyleName, typings.officeJsPreview.officeJsPreviewStrings.Other, typings.officeJsPreview.officeJsPreviewStrings.Normal */ Any = js.native
  
  /**
    * Specifies whether the table has a first column with a special style.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleFirstColumn: Boolean = js.native
  
  /**
    * Specifies whether the table has a last column with a special style.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleLastColumn: Boolean = js.native
  
  /**
    * Specifies whether the table has a total (last) row with a special style.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleTotalRow: Boolean = js.native
  
  /**
    * Gets the child tables nested one level deeper.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val tables: TableCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.Table object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.TableData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TableData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): Table = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Table = js.native
  
  /**
    * Specifies the text values in the table, as a 2D JavaScript array.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var values: js.Array[js.Array[String]] = js.native
  
  /**
    * Specifies the vertical alignment of every cell in the table. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: VerticalAlignment | Mixed | Top | Center | Bottom = js.native
  
  /**
    * Specifies the width of the table in points.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var width: Double = js.native
}
