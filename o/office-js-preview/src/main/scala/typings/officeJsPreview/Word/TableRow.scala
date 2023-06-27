package typings.officeJsPreview.Word

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.Word.InsertLocation.after
import typings.officeJsPreview.Word.InsertLocation.before
import typings.officeJsPreview.Word.Interfaces.TableRowData
import typings.officeJsPreview.Word.Interfaces.TableRowLoadOptions
import typings.officeJsPreview.Word.Interfaces.TableRowUpdateData
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a row in a Word document.
  *
  * @remarks
  * [Api set: WordApi 1.3]
  */
@js.native
trait TableRow
  extends StObject
     with ClientObject {
  
  /**
    * Gets the number of cells in the row.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val cellCount: Double = js.native
  
  /**
    * Gets cells. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val cells: TableCellCollection = js.native
  
  /**
    * Clears the contents of the row.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def clear(): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableRow: RequestContext = js.native
  
  /**
    * Deletes the entire row.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def delete(): Unit = js.native
  
  /**
    * Gets the collection of endnotes in the table row.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  val endnotes: NoteItemCollection = js.native
  
  /**
    * Gets the collection of field objects in the table row.
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
    * Gets the collection of footnotes in the table row.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  val footnotes: NoteItemCollection = js.native
  
  /**
    * Gets the border style of the cells in the row.
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
    * Gets the border style of the cells in the row.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param borderLocation Required. The border location.
    */
  def getBorder(borderLocation: BorderLocation): TableBorder = js.native
  
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
    * Gets the next row. Throws an `ItemNotFound` error if this row is the last one.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getNext(): TableRow = js.native
  
  /**
    * Gets the next row. If this row is the last one, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getNextOrNullObject(): TableRow = js.native
  
  /**
    * Specifies the horizontal alignment of every cell in the row. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified = js.native
  
  /**
    * Inserts a content control on the row.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def insertContentControl(): ContentControl = js.native
  
  def insertRows(insertLocation: Before | After, rowCount: Double): TableRowCollection = js.native
  def insertRows(insertLocation: Before | After, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  def insertRows(insertLocation: after, rowCount: Double): TableRowCollection = js.native
  def insertRows(insertLocation: after, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  /**
    * Inserts rows using this row as a template. If values are specified, inserts the values into the new rows.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param insertLocation Required. Where the new rows should be inserted, relative to the current row. It must be 'Before' or 'After'.
    * @param rowCount Required. Number of rows to add
    * @param values Optional. Strings to insert in the new rows, specified as a 2D array. The number of cells in each row must not exceed the number of cells in the existing row.
    */
  def insertRows(insertLocation: before, rowCount: Double): TableRowCollection = js.native
  def insertRows(insertLocation: before, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  
  /**
    * Checks whether the row is a header row. To set the number of header rows, use `headerRowCount` on the Table object.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val isHeader: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableRow = js.native
  def load(options: TableRowLoadOptions): TableRow = js.native
  def load(propertyNamesAndPaths: Expand): TableRow = js.native
  def load(propertyNames: String): TableRow = js.native
  def load(propertyNames: js.Array[String]): TableRow = js.native
  
  /**
    * Merges the row into one cell.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  def merge(): TableCell = js.native
  
  /**
    * Gets parent table.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTable: Table = js.native
  
  /**
    * Specifies the preferred height of the row in points.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var preferredHeight: Double = js.native
  
  /**
    * Gets the index of the row in its parent table.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val rowIndex: Double = js.native
  
  /**
    * Performs a search with the specified SearchOptions on the scope of the row. The search results are a collection of range objects.
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
    * Selects the row and navigates the Word UI to it.
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
  def set(properties: TableRowUpdateData): Unit = js.native
  def set(properties: TableRowUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TableRow): Unit = js.native
  
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
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.TableRow object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.TableRowData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TableRowData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): TableRow = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): TableRow = js.native
  
  /**
    * Specifies the text values in the row, as a 2D JavaScript array.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var values: js.Array[js.Array[String]] = js.native
  
  /**
    * Specifies the vertical alignment of the cells in the row. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: VerticalAlignment | Mixed | Top | Center | Bottom = js.native
}
