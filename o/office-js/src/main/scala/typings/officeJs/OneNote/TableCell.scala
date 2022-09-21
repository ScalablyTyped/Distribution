package typings.officeJs.OneNote

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.OneNote.Interfaces.TableCellData
import typings.officeJs.OneNote.Interfaces.TableCellLoadOptions
import typings.officeJs.OneNote.Interfaces.TableCellUpdateData
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a cell in a OneNote table.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait TableCell
  extends StObject
     with ClientObject {
  
  /**
    * Adds the specified HTML to the bottom of the TableCell.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param html The HTML string to append. See {@link https://docs.microsoft.com/office/dev/add-ins/onenote/onenote-add-ins-page-content#supported-html | Supported HTML} for the OneNote add-ins JavaScript API.
    */
  def appendHtml(html: String): Unit = js.native
  
  /**
    * Adds the specified image to table cell.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param base64EncodedImage HTML string to append.
    * @param width Optional. Width in the unit of Points. The default value is null and image width will be respected.
    * @param height Optional. Height in the unit of Points. The default value is null and image height will be respected.
    */
  def appendImage(base64EncodedImage: String, width: Double, height: Double): Image = js.native
  
  /**
    * Adds the specified text to table cell.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param paragraphText HTML string to append.
    */
  def appendRichText(paragraphText: String): RichText = js.native
  
  /**
    * Adds a table with the specified number of rows and columns to table cell.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param rowCount Required. The number of rows in the table.
    * @param columnCount Required. The number of columns in the table.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  def appendTable(rowCount: Double, columnCount: Double): Table = js.native
  def appendTable(rowCount: Double, columnCount: Double, values: js.Array[js.Array[String]]): Table = js.native
  
  /**
    * Gets the index of the cell in its row. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val cellIndex: Double = js.native
  
  /**
    * Clears the contents of the cell.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def clear(): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableCell: RequestContext = js.native
  
  /**
    * Gets the ID of the cell. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  
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
    * Gets the collection of Paragraph objects in the TableCell. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val paragraphs: ParagraphCollection = js.native
  
  /**
    * Gets the parent row of the cell. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val parentRow: TableRow = js.native
  
  /**
    * Gets the index of the cell's row in the table. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
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
    * Gets and sets the shading color of the cell
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var shadingColor: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.TableCell object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.TableCellData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TableCellData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): TableCell = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): TableCell = js.native
}
