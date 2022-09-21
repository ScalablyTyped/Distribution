package typings.officeJs.Word

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.Word.InsertLocation.after
import typings.officeJs.Word.InsertLocation.before
import typings.officeJs.Word.Interfaces.TableCellData
import typings.officeJs.Word.Interfaces.TableCellLoadOptions
import typings.officeJs.Word.Interfaces.TableCellUpdateData
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.After
import typings.officeJs.officeJsStrings.All
import typings.officeJs.officeJsStrings.Before
import typings.officeJs.officeJsStrings.Bottom
import typings.officeJs.officeJsStrings.Center
import typings.officeJs.officeJsStrings.Centered
import typings.officeJs.officeJsStrings.Inside
import typings.officeJs.officeJsStrings.InsideHorizontal
import typings.officeJs.officeJsStrings.InsideVertical
import typings.officeJs.officeJsStrings.Justified
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.Mixed
import typings.officeJs.officeJsStrings.Outside
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.Top
import typings.officeJs.officeJsStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a table cell in a Word document.
  *
  * @remarks
  * [Api set: WordApi 1.3]
  */
@js.native
trait TableCell
  extends StObject
     with ClientObject {
  
  /**
    * Gets the body object of the cell. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val body: Body = js.native
  
  /**
    * Gets the index of the cell in its row. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val cellIndex: Double = js.native
  
  /**
    * Gets and sets the width of the cell's column in points. This is applicable to uniform tables.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var columnWidth: Double = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableCell: RequestContext = js.native
  
  /**
    * Deletes the column containing this cell. This is applicable to uniform tables.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def deleteColumn(): Unit = js.native
  
  /**
    * Deletes the row containing this cell.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def deleteRow(): Unit = js.native
  
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
    * Gets the next cell. Throws an error if this cell is the last one.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getNext(): TableCell = js.native
  
  /**
    * Gets the next cell. Returns a null object if this cell is the last one.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getNextOrNullObject(): TableCell = js.native
  
  /**
    * Gets and sets the horizontal alignment of the cell. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified = js.native
  
  def insertColumns(insertLocation: Before | After, columnCount: Double): Unit = js.native
  def insertColumns(insertLocation: Before | After, columnCount: Double, values: js.Array[js.Array[String]]): Unit = js.native
  def insertColumns(insertLocation: after, columnCount: Double): Unit = js.native
  def insertColumns(insertLocation: after, columnCount: Double, values: js.Array[js.Array[String]]): Unit = js.native
  /**
    * Adds columns to the left or right of the cell, using the cell's column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param insertLocation Required. It must be 'Before' or 'After'.
    * @param columnCount Required. Number of columns to add.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  def insertColumns(insertLocation: before, columnCount: Double): Unit = js.native
  def insertColumns(insertLocation: before, columnCount: Double, values: js.Array[js.Array[String]]): Unit = js.native
  
  def insertRows(insertLocation: Before | After, rowCount: Double): TableRowCollection = js.native
  def insertRows(insertLocation: Before | After, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  def insertRows(insertLocation: after, rowCount: Double): TableRowCollection = js.native
  def insertRows(insertLocation: after, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  /**
    * Inserts rows above or below the cell, using the cell's row as a template. The string values, if specified, are set in the newly inserted rows.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param insertLocation Required. It must be 'Before' or 'After'.
    * @param rowCount Required. Number of rows to add.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  def insertRows(insertLocation: before, rowCount: Double): TableRowCollection = js.native
  def insertRows(insertLocation: before, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableCell = js.native
  def load(options: TableCellLoadOptions): TableCell = js.native
  def load(propertyNamesAndPaths: Expand): TableCell = js.native
  def load(propertyNames: String): TableCell = js.native
  def load(propertyNames: js.Array[String]): TableCell = js.native
  
  /**
    * Gets the parent row of the cell. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentRow: TableRow = js.native
  
  /**
    * Gets the parent table of the cell. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTable: Table = js.native
  
  /**
    * Gets the index of the cell's row in the table. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val rowIndex: Double = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: TableCellUpdateData): Unit = js.native
  def set(properties: TableCellUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TableCell): Unit = js.native
  
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
    * Gets or sets the shading color of the cell. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var shadingColor: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.TableCell object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.TableCellData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TableCellData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): TableCell = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): TableCell = js.native
  
  /**
    * Gets and sets the text of the cell.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var value: String = js.native
  
  /**
    * Gets and sets the vertical alignment of the cell. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: VerticalAlignment | Mixed | Top | Center | Bottom = js.native
  
  /**
    * Gets the width of the cell in points. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val width: Double = js.native
}
