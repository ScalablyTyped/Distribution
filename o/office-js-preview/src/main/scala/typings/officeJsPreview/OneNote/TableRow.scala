package typings.officeJsPreview.OneNote

import typings.officeJsPreview.AnonExpand
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OneNote.Interfaces.TableRowData
import typings.officeJsPreview.OneNote.Interfaces.TableRowLoadOptions
import typings.officeJsPreview.officeJsPreviewStrings.After
import typings.officeJsPreview.officeJsPreviewStrings.Before
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a row in a table.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.TableRow")
@js.native
class TableRow () extends ClientObject {
  /**
    *
    * Gets the number of cells in the row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val cellCount: Double = js.native
  /**
    *
    * Gets the cells in the row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val cells: TableCellCollection = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableRow: RequestContext = js.native
  /**
    *
    * Gets the ID of the row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  /**
    *
    * Gets the parent table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val parentTable: Table = js.native
  /**
    *
    * Gets the index of the row in its parent table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val rowIndex: Double = js.native
  /**
    *
    * Clears the contents of the row.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def clear(): Unit = js.native
  /**
    *
    * Inserts a row before or after the current row.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param insertLocation Where the new rows should be inserted relative to the current row.
    * @param values Strings to insert in the new row, specified as an array. Must not have more cells than in the current row. Optional.
    */
  def insertRowAsSibling(insertLocation: InsertLocation): TableRow = js.native
  def insertRowAsSibling(insertLocation: InsertLocation, values: js.Array[String]): TableRow = js.native
  @JSName("insertRowAsSibling")
  def insertRowAsSibling_After(insertLocation: After): TableRow = js.native
  @JSName("insertRowAsSibling")
  def insertRowAsSibling_After(insertLocation: After, values: js.Array[String]): TableRow = js.native
  /**
    *
    * Inserts a row before or after the current row.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param insertLocation Where the new rows should be inserted relative to the current row.
    * @param values Strings to insert in the new row, specified as an array. Must not have more cells than in the current row. Optional.
    */
  @JSName("insertRowAsSibling")
  def insertRowAsSibling_Before(insertLocation: Before): TableRow = js.native
  @JSName("insertRowAsSibling")
  def insertRowAsSibling_Before(insertLocation: Before, values: js.Array[String]): TableRow = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): OneNote.TableRow` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): OneNote.TableRow` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.TableRow` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableRow = js.native
  def load(option: String): TableRow = js.native
  def load(option: js.Array[String]): TableRow = js.native
  def load(option: AnonExpand): TableRow = js.native
  def load(option: TableRowLoadOptions): TableRow = js.native
  /**
    *
    * Sets the shading color of all cells in the row.
    The color code to set the cells to.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def setShadingColor(colorCode: String): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.TableRow object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.TableRowData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TableRowData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): TableRow = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): TableRow = js.native
}

