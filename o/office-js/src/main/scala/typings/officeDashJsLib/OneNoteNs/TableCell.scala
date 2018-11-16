package typings
package officeDashJsLib.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents a cell in a OneNote table.
     *
     * [Api set: OneNoteApi 1.1]
     */
@JSGlobal("OneNote.TableCell")
@js.native
class TableCell ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Gets the index of the cell in its row. Read-only.
           *
           * [Api set: OneNoteApi 1.1]
           */
  val cellIndex: scala.Double = js.native
  /**
           *
           * Gets the ID of the cell. Read-only.
           *
           * [Api set: OneNoteApi 1.1]
           */
  val id: java.lang.String = js.native
  /**
           *
           * Gets the collection of Paragraph objects in the TableCell. Read-only.
           *
           * [Api set: OneNoteApi 1.1]
           */
  val paragraphs: ParagraphCollection = js.native
  /**
           *
           * Gets the parent row of the cell. Read-only.
           *
           * [Api set: OneNoteApi 1.1]
           */
  val parentRow: TableRow = js.native
  /**
           *
           * Gets the index of the cell's row in the table. Read-only.
           *
           * [Api set: OneNoteApi 1.1]
           */
  val rowIndex: scala.Double = js.native
  /**
           *
           * Gets and sets the shading color of the cell
           *
           * [Api set: OneNoteApi 1.1]
           */
  var shadingColor: java.lang.String = js.native
  /**
           *
           * Adds the specified HTML to the bottom of the TableCell.
           *
           * [Api set: OneNoteApi 1.1]
           *
           * @param html The HTML string to append. See {@link https://docs.microsoft.com/office/dev/add-ins/onenote/onenote-add-ins-page-content#supported-html | Supported HTML} for the OneNote add-ins JavaScript API.
           */
  def appendHtml(html: java.lang.String): scala.Unit = js.native
  /**
           *
           * Adds the specified image to table cell.
           *
           * [Api set: OneNoteApi 1.1]
           *
           * @param base64EncodedImage HTML string to append.
           * @param width Optional. Width in the unit of Points. The default value is null and image width will be respected.
           * @param height Optional. Height in the unit of Points. The default value is null and image height will be respected.
           */
  def appendImage(base64EncodedImage: java.lang.String, width: scala.Double, height: scala.Double): Image = js.native
  /**
           *
           * Adds the specified text to table cell.
           *
           * [Api set: OneNoteApi 1.1]
           *
           * @param paragraphText HTML string to append.
           */
  def appendRichText(paragraphText: java.lang.String): RichText = js.native
  /**
           *
           * Adds a table with the specified number of rows and columns to table cell.
           *
           * [Api set: OneNoteApi 1.1]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  def appendTable(rowCount: scala.Double, columnCount: scala.Double): Table = js.native
  /**
           *
           * Adds a table with the specified number of rows and columns to table cell.
           *
           * [Api set: OneNoteApi 1.1]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  def appendTable(rowCount: scala.Double, columnCount: scala.Double, values: js.Array[js.Array[java.lang.String]]): Table = js.native
  /**
           *
           * Clears the contents of the cell.
           *
           * [Api set: OneNoteApi 1.1]
           */
  def clear(): scala.Unit = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): OneNote.TableCell` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): OneNote.TableCell` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.TableCell` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): TableCell = js.native
  def load(option: java.lang.String): TableCell = js.native
  def load(option: js.Array[java.lang.String]): TableCell = js.native
  def load(option: officeDashJsLib.Anon_Select): TableCell = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): OneNote.TableCell` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): OneNote.TableCell` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.TableCell` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.OneNoteNs.InterfacesNs.TableCellLoadOptions): TableCell = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: OneNote.TableCell): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsLib.OneNoteNs.InterfacesNs.TableCellUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: OneNote.TableCell): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsLib.OneNoteNs.InterfacesNs.TableCellUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TableCell): scala.Unit = js.native
  def toJSON(): officeDashJsLib.OneNoteNs.InterfacesNs.TableCellData = js.native
  /**
           * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
           */
  def track(): TableCell = js.native
  /**
           * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
           */
  def untrack(): TableCell = js.native
}

