package typings
package officeDashJsDashPreviewLib.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents a table in a OneNote page.
     *
     * [Api set: OneNoteApi 1.1]
     */
@JSGlobal("OneNote.Table")
@js.native
class Table ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Gets or sets whether the borders are visible or not. True if they are visible, false if they are hidden.
           *
           * [Api set: OneNoteApi 1.1]
           */
  var borderVisible: scala.Boolean = js.native
  /**
           *
           * Gets the number of columns in the table.
           *
           * [Api set: OneNoteApi 1.1]
           */
  val columnCount: scala.Double = js.native
  /**
           *
           * Gets the ID of the table. Read-only.
           *
           * [Api set: OneNoteApi 1.1]
           */
  val id: java.lang.String = js.native
  /**
           *
           * Gets the Paragraph object that contains the Table object. Read-only.
           *
           * [Api set: OneNoteApi 1.1]
           */
  val paragraph: Paragraph = js.native
  /**
           *
           * Gets the number of rows in the table.
           *
           * [Api set: OneNoteApi 1.1]
           */
  val rowCount: scala.Double = js.native
  /**
           *
           * Gets all of the table rows. Read-only.
           *
           * [Api set: OneNoteApi 1.1]
           */
  val rows: TableRowCollection = js.native
  /**
           *
           * Adds a column to the end of the table. Values, if specified, are set in the new column. Otherwise the column is empty.
           *
           * [Api set: OneNoteApi 1.1]
           *
           * @param values Optional. Strings to insert in the new column, specified as an array. Must not have more values than rows in the table.
           */
  def appendColumn(): scala.Unit = js.native
  /**
           *
           * Adds a column to the end of the table. Values, if specified, are set in the new column. Otherwise the column is empty.
           *
           * [Api set: OneNoteApi 1.1]
           *
           * @param values Optional. Strings to insert in the new column, specified as an array. Must not have more values than rows in the table.
           */
  def appendColumn(values: js.Array[java.lang.String]): scala.Unit = js.native
  /**
           *
           * Adds a row to the end of the table. Values, if specified, are set in the new row. Otherwise the row is empty.
           *
           * [Api set: OneNoteApi 1.1]
           *
           * @param values Optional. Strings to insert in the new row, specified as an array. Must not have more values than columns in the table.
           */
  def appendRow(): TableRow = js.native
  /**
           *
           * Adds a row to the end of the table. Values, if specified, are set in the new row. Otherwise the row is empty.
           *
           * [Api set: OneNoteApi 1.1]
           *
           * @param values Optional. Strings to insert in the new row, specified as an array. Must not have more values than columns in the table.
           */
  def appendRow(values: js.Array[java.lang.String]): TableRow = js.native
  /**
           *
           * Clears the contents of the table.
           *
           * [Api set: OneNoteApi 1.1]
           */
  def clear(): scala.Unit = js.native
  /**
           *
           * Gets the table cell at a specified row and column.
           *
           * [Api set: OneNoteApi 1.1]
           *
           * @param rowIndex The index of the row.
           * @param cellIndex The index of the cell in the row.
           */
  def getCell(rowIndex: scala.Double, cellIndex: scala.Double): TableCell = js.native
  /**
           *
           * Inserts a column at the given index in the table. Values, if specified, are set in the new column. Otherwise the column is empty.
           *
           * [Api set: OneNoteApi 1.1]
           *
           * @param index Index where the column will be inserted in the table.
           * @param values Optional. Strings to insert in the new column, specified as an array. Must not have more values than rows in the table.
           */
  def insertColumn(index: scala.Double): scala.Unit = js.native
  /**
           *
           * Inserts a column at the given index in the table. Values, if specified, are set in the new column. Otherwise the column is empty.
           *
           * [Api set: OneNoteApi 1.1]
           *
           * @param index Index where the column will be inserted in the table.
           * @param values Optional. Strings to insert in the new column, specified as an array. Must not have more values than rows in the table.
           */
  def insertColumn(index: scala.Double, values: js.Array[java.lang.String]): scala.Unit = js.native
  /**
           *
           * Inserts a row at the given index in the table. Values, if specified, are set in the new row. Otherwise the row is empty.
           *
           * [Api set: OneNoteApi 1.1]
           *
           * @param index Index where the row will be inserted in the table.
           * @param values Optional. Strings to insert in the new row, specified as an array. Must not have more values than columns in the table.
           */
  def insertRow(index: scala.Double): TableRow = js.native
  /**
           *
           * Inserts a row at the given index in the table. Values, if specified, are set in the new row. Otherwise the row is empty.
           *
           * [Api set: OneNoteApi 1.1]
           *
           * @param index Index where the row will be inserted in the table.
           * @param values Optional. Strings to insert in the new row, specified as an array. Must not have more values than columns in the table.
           */
  def insertRow(index: scala.Double, values: js.Array[java.lang.String]): TableRow = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): OneNote.Table` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): OneNote.Table` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.Table` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): Table = js.native
  def load(option: java.lang.String): Table = js.native
  def load(option: js.Array[java.lang.String]): Table = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Select): Table = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): OneNote.Table` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): OneNote.Table` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.Table` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs.TableLoadOptions): Table = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: OneNote.Table): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs.TableUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: OneNote.Table): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs.TableUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Table): scala.Unit = js.native
  /**
           *
           * Sets the shading color of all cells in the table.
              The color code to set the cells to.
           *
           * [Api set: OneNoteApi 1.1]
           */
  def setShadingColor(colorCode: java.lang.String): scala.Unit = js.native
  def toJSON(): officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs.TableData = js.native
  /**
           * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
           */
  def track(): Table = js.native
  /**
           * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
           */
  def untrack(): Table = js.native
}

