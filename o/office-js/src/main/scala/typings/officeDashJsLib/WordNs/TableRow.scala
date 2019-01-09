package typings
package officeDashJsLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a row in a Word document.
  *
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.TableRow")
@js.native
class TableRow ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Gets the number of cells in the row. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val cellCount: scala.Double = js.native
  /**
    *
    * Gets cells. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val cells: TableCellCollection = js.native
  /**
    *
    * Gets the font. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val font: Font = js.native
  /**
    *
    * Gets and sets the horizontal alignment of every cell in the row. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: Alignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Centered | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justified = js.native
  /**
    *
    * Checks whether the row is a header row. Read-only. To set the number of header rows, use HeaderRowCount on the Table object.
    *
    * [Api set: WordApi 1.3]
    */
  val isHeader: scala.Boolean = js.native
  /**
    *
    * Gets parent table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTable: Table = js.native
  /**
    *
    * Gets and sets the preferred height of the row in points.
    *
    * [Api set: WordApi 1.3]
    */
  var preferredHeight: scala.Double = js.native
  /**
    *
    * Gets the index of the row in its parent table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val rowIndex: scala.Double = js.native
  /**
    *
    * Gets and sets the shading color. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: java.lang.String = js.native
  /**
    *
    * Gets and sets the text values in the row, as a 2D Javascript array.
    *
    * [Api set: WordApi 1.3]
    */
  var values: js.Array[js.Array[java.lang.String]] = js.native
  /**
    *
    * Gets and sets the vertical alignment of the cells in the row. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: VerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Bottom = js.native
  /**
    *
    * Clears the contents of the row.
    *
    * [Api set: WordApi 1.3]
    */
  def clear(): scala.Unit = js.native
  /**
    *
    * Deletes the entire row.
    *
    * [Api set: WordApi 1.3]
    */
  def delete(): scala.Unit = js.native
  /**
    *
    * Gets the border style of the cells in the row.
    *
    * [Api set: WordApi 1.3]
    *
    * @param borderLocation Required. The border location.
    */
  def getBorder(borderLocation: BorderLocation): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_All(borderLocation: officeDashJsLib.officeDashJsLibStrings.All): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_Bottom(borderLocation: officeDashJsLib.officeDashJsLibStrings.Bottom): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_Inside(borderLocation: officeDashJsLib.officeDashJsLibStrings.Inside): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_InsideHorizontal(borderLocation: officeDashJsLib.officeDashJsLibStrings.InsideHorizontal): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_InsideVertical(borderLocation: officeDashJsLib.officeDashJsLibStrings.InsideVertical): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_Left(borderLocation: officeDashJsLib.officeDashJsLibStrings.Left): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_Outside(borderLocation: officeDashJsLib.officeDashJsLibStrings.Outside): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_Right(borderLocation: officeDashJsLib.officeDashJsLibStrings.Right): TableBorder = js.native
  /**
    *
    * Gets the border style of the cells in the row.
    *
    * [Api set: WordApi 1.3]
    *
    * @param borderLocation Required. The border location.
    */
  @JSName("getBorder")
  def getBorder_Top(borderLocation: officeDashJsLib.officeDashJsLibStrings.Top): TableBorder = js.native
  /**
    *
    * Gets cell padding in points.
    *
    * [Api set: WordApi 1.3]
    *
    * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
    */
  def getCellPadding(cellPaddingLocation: CellPaddingLocation): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  @JSName("getCellPadding")
  def getCellPadding_Bottom(cellPaddingLocation: officeDashJsLib.officeDashJsLibStrings.Bottom): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  @JSName("getCellPadding")
  def getCellPadding_Left(cellPaddingLocation: officeDashJsLib.officeDashJsLibStrings.Left): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  @JSName("getCellPadding")
  def getCellPadding_Right(cellPaddingLocation: officeDashJsLib.officeDashJsLibStrings.Right): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Gets cell padding in points.
    *
    * [Api set: WordApi 1.3]
    *
    * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
    */
  @JSName("getCellPadding")
  def getCellPadding_Top(cellPaddingLocation: officeDashJsLib.officeDashJsLibStrings.Top): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Gets the next row. Throws if this row is the last one.
    *
    * [Api set: WordApi 1.3]
    */
  def getNext(): TableRow = js.native
  /**
    *
    * Gets the next row. Returns a null object if this row is the last one.
    *
    * [Api set: WordApi 1.3]
    */
  def getNextOrNullObject(): TableRow = js.native
  /**
    *
    * Inserts rows using this row as a template. If values are specified, inserts the values into the new rows.
    *
    * [Api set: WordApi 1.3]
    *
    * @param insertLocation Required. Where the new rows should be inserted, relative to the current row. It can be 'Before' or 'After'.
    * @param rowCount Required. Number of rows to add
    * @param values Optional. Strings to insert in the new rows, specified as a 2D array. The number of cells in each row must not exceed the number of cells in the existing row.
    */
  def insertRows(insertLocation: InsertLocation, rowCount: scala.Double): TableRowCollection = js.native
  def insertRows(
    insertLocation: InsertLocation,
    rowCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): TableRowCollection = js.native
  @JSName("insertRows")
  def insertRows_After(insertLocation: officeDashJsLib.officeDashJsLibStrings.After, rowCount: scala.Double): TableRowCollection = js.native
  @JSName("insertRows")
  def insertRows_After(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.After,
    rowCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): TableRowCollection = js.native
  /**
    *
    * Inserts rows using this row as a template. If values are specified, inserts the values into the new rows.
    *
    * [Api set: WordApi 1.3]
    *
    * @param insertLocation Required. Where the new rows should be inserted, relative to the current row. It can be 'Before' or 'After'.
    * @param rowCount Required. Number of rows to add
    * @param values Optional. Strings to insert in the new rows, specified as a 2D array. The number of cells in each row must not exceed the number of cells in the existing row.
    */
  @JSName("insertRows")
  def insertRows_Before(insertLocation: officeDashJsLib.officeDashJsLibStrings.Before, rowCount: scala.Double): TableRowCollection = js.native
  @JSName("insertRows")
  def insertRows_Before(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Before,
    rowCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): TableRowCollection = js.native
  @JSName("insertRows")
  def insertRows_End(insertLocation: officeDashJsLib.officeDashJsLibStrings.End, rowCount: scala.Double): TableRowCollection = js.native
  @JSName("insertRows")
  def insertRows_End(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.End,
    rowCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): TableRowCollection = js.native
  @JSName("insertRows")
  def insertRows_Replace(insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace, rowCount: scala.Double): TableRowCollection = js.native
  @JSName("insertRows")
  def insertRows_Replace(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace,
    rowCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): TableRowCollection = js.native
  @JSName("insertRows")
  def insertRows_Start(insertLocation: officeDashJsLib.officeDashJsLibStrings.Start, rowCount: scala.Double): TableRowCollection = js.native
  @JSName("insertRows")
  def insertRows_Start(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Start,
    rowCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): TableRowCollection = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.TableRow` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.TableRow` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.TableRow` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableRow = js.native
  def load(option: java.lang.String): TableRow = js.native
  def load(option: js.Array[java.lang.String]): TableRow = js.native
  def load(option: officeDashJsLib.Anon_Expand): TableRow = js.native
  def load(option: officeDashJsLib.WordNs.InterfacesNs.TableRowLoadOptions): TableRow = js.native
  /**
    *
    * Performs a search with the specified SearchOptions on the scope of the row. The search results are a collection of range objects.
    *
    * [Api set: WordApi 1.3]
    *
    * @param searchText Required. The search text.
    * @param searchOptions Optional. Options for the search.
    */
  def search(searchText: java.lang.String): RangeCollection = js.native
  def search(searchText: java.lang.String, searchOptions: officeDashJsLib.Anon_IgnorePunct): RangeCollection = js.native
  def search(searchText: java.lang.String, searchOptions: SearchOptions): RangeCollection = js.native
  /**
    *
    * Selects the row and navigates the Word UI to it.
    *
    * [Api set: WordApi 1.3]
    *
    * @param selectionMode Optional. The selection mode can be 'Select', 'Start', or 'End'. 'Select' is the default.
    */
  def select(): scala.Unit = js.native
  def select(selectionMode: SelectionMode): scala.Unit = js.native
  @JSName("select")
  def select_End(selectionMode: officeDashJsLib.officeDashJsLibStrings.End): scala.Unit = js.native
  @JSName("select")
  def select_Select(selectionMode: officeDashJsLib.officeDashJsLibStrings.Select): scala.Unit = js.native
  @JSName("select")
  def select_Start(selectionMode: officeDashJsLib.officeDashJsLibStrings.Start): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.TableRow): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsLib.WordNs.InterfacesNs.TableRowUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsLib.WordNs.InterfacesNs.TableRowUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TableRow): scala.Unit = js.native
  /**
    *
    * Sets cell padding in points.
    *
    * [Api set: WordApi 1.3]
    *
    * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
    * @param cellPadding Required. The cell padding.
    */
  def setCellPadding(cellPaddingLocation: CellPaddingLocation, cellPadding: scala.Double): scala.Unit = js.native
  @JSName("setCellPadding")
  def setCellPadding_Bottom(cellPaddingLocation: officeDashJsLib.officeDashJsLibStrings.Bottom, cellPadding: scala.Double): scala.Unit = js.native
  @JSName("setCellPadding")
  def setCellPadding_Left(cellPaddingLocation: officeDashJsLib.officeDashJsLibStrings.Left, cellPadding: scala.Double): scala.Unit = js.native
  @JSName("setCellPadding")
  def setCellPadding_Right(cellPaddingLocation: officeDashJsLib.officeDashJsLibStrings.Right, cellPadding: scala.Double): scala.Unit = js.native
  /**
    *
    * Sets cell padding in points.
    *
    * [Api set: WordApi 1.3]
    *
    * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
    * @param cellPadding Required. The cell padding.
    */
  @JSName("setCellPadding")
  def setCellPadding_Top(cellPaddingLocation: officeDashJsLib.officeDashJsLibStrings.Top, cellPadding: scala.Double): scala.Unit = js.native
  def toJSON(): officeDashJsLib.WordNs.InterfacesNs.TableRowData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): TableRow = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): TableRow = js.native
}

