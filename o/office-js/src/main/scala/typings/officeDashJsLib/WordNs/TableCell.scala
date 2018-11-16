package typings
package officeDashJsLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents a table cell in a Word document.
     *
     * [Api set: WordApi 1.3]
     */
@JSGlobal("Word.TableCell")
@js.native
class TableCell ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Gets the body object of the cell. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val body: Body = js.native
  /**
           *
           * Gets the index of the cell in its row. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val cellIndex: scala.Double = js.native
  /**
           *
           * Gets and sets the width of the cell's column in points. This is applicable to uniform tables.
           *
           * [Api set: WordApi 1.3]
           */
  var columnWidth: scala.Double = js.native
  /**
           *
           * Gets and sets the horizontal alignment of the cell. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
           *
           * [Api set: WordApi 1.3]
           */
  var horizontalAlignment: Alignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Centered | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justified = js.native
  /**
           *
           * Gets the parent row of the cell. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val parentRow: TableRow = js.native
  /**
           *
           * Gets the parent table of the cell. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val parentTable: Table = js.native
  /**
           *
           * Gets the index of the cell's row in the table. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val rowIndex: scala.Double = js.native
  /**
           *
           * Gets or sets the shading color of the cell. Color is specified in "#RRGGBB" format or by using the color name.
           *
           * [Api set: WordApi 1.3]
           */
  var shadingColor: java.lang.String = js.native
  /**
           *
           * Gets and sets the text of the cell.
           *
           * [Api set: WordApi 1.3]
           */
  var value: java.lang.String = js.native
  /**
           *
           * Gets and sets the vertical alignment of the cell. The value can be 'Top', 'Center', or 'Bottom'.
           *
           * [Api set: WordApi 1.3]
           */
  var verticalAlignment: VerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Bottom = js.native
  /**
           *
           * Gets the width of the cell in points. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val width: scala.Double = js.native
  /**
           *
           * Deletes the column containing this cell. This is applicable to uniform tables.
           *
           * [Api set: WordApi 1.3]
           */
  def deleteColumn(): scala.Unit = js.native
  /**
           *
           * Deletes the row containing this cell.
           *
           * [Api set: WordApi 1.3]
           */
  def deleteRow(): scala.Unit = js.native
  /**
           *
           * Gets the border style for the specified border.
           *
           * [Api set: WordApi 1.3]
           *
           * @param borderLocation Required. The border location.
           */
  def getBorder(borderLocation: BorderLocation): TableBorder = js.native
  /**
           *
           * Gets the border style for the specified border.
           *
           * [Api set: WordApi 1.3]
           *
           * @param borderLocation Required. The border location.
           */
  @JSName("getBorder")
  def getBorder_All(borderLocation: officeDashJsLib.officeDashJsLibStrings.All): TableBorder = js.native
  /**
           *
           * Gets the border style for the specified border.
           *
           * [Api set: WordApi 1.3]
           *
           * @param borderLocation Required. The border location.
           */
  @JSName("getBorder")
  def getBorder_Bottom(borderLocation: officeDashJsLib.officeDashJsLibStrings.Bottom): TableBorder = js.native
  /**
           *
           * Gets the border style for the specified border.
           *
           * [Api set: WordApi 1.3]
           *
           * @param borderLocation Required. The border location.
           */
  @JSName("getBorder")
  def getBorder_Inside(borderLocation: officeDashJsLib.officeDashJsLibStrings.Inside): TableBorder = js.native
  /**
           *
           * Gets the border style for the specified border.
           *
           * [Api set: WordApi 1.3]
           *
           * @param borderLocation Required. The border location.
           */
  @JSName("getBorder")
  def getBorder_InsideHorizontal(borderLocation: officeDashJsLib.officeDashJsLibStrings.InsideHorizontal): TableBorder = js.native
  /**
           *
           * Gets the border style for the specified border.
           *
           * [Api set: WordApi 1.3]
           *
           * @param borderLocation Required. The border location.
           */
  @JSName("getBorder")
  def getBorder_InsideVertical(borderLocation: officeDashJsLib.officeDashJsLibStrings.InsideVertical): TableBorder = js.native
  /**
           *
           * Gets the border style for the specified border.
           *
           * [Api set: WordApi 1.3]
           *
           * @param borderLocation Required. The border location.
           */
  @JSName("getBorder")
  def getBorder_Left(borderLocation: officeDashJsLib.officeDashJsLibStrings.Left): TableBorder = js.native
  /**
           *
           * Gets the border style for the specified border.
           *
           * [Api set: WordApi 1.3]
           *
           * @param borderLocation Required. The border location.
           */
  @JSName("getBorder")
  def getBorder_Outside(borderLocation: officeDashJsLib.officeDashJsLibStrings.Outside): TableBorder = js.native
  /**
           *
           * Gets the border style for the specified border.
           *
           * [Api set: WordApi 1.3]
           *
           * @param borderLocation Required. The border location.
           */
  @JSName("getBorder")
  def getBorder_Right(borderLocation: officeDashJsLib.officeDashJsLibStrings.Right): TableBorder = js.native
  /**
           *
           * Gets the border style for the specified border.
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
  /**
           *
           * Gets cell padding in points.
           *
           * [Api set: WordApi 1.3]
           *
           * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
           */
  @JSName("getCellPadding")
  def getCellPadding_Bottom(cellPaddingLocation: officeDashJsLib.officeDashJsLibStrings.Bottom): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
           *
           * Gets cell padding in points.
           *
           * [Api set: WordApi 1.3]
           *
           * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
           */
  @JSName("getCellPadding")
  def getCellPadding_Left(cellPaddingLocation: officeDashJsLib.officeDashJsLibStrings.Left): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
           *
           * Gets cell padding in points.
           *
           * [Api set: WordApi 1.3]
           *
           * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
           */
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
           * Gets the next cell. Throws if this cell is the last one.
           *
           * [Api set: WordApi 1.3]
           */
  def getNext(): TableCell = js.native
  /**
           *
           * Gets the next cell. Returns a null object if this cell is the last one.
           *
           * [Api set: WordApi 1.3]
           */
  def getNextOrNullObject(): TableCell = js.native
  /**
           *
           * Adds columns to the left or right of the cell, using the cell's column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  def insertColumns(insertLocation: InsertLocation, columnCount: scala.Double): scala.Unit = js.native
  /**
           *
           * Adds columns to the left or right of the cell, using the cell's column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  def insertColumns(
    insertLocation: InsertLocation,
    columnCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): scala.Unit = js.native
  /**
           *
           * Adds columns to the left or right of the cell, using the cell's column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertColumns")
  def insertColumns_After(insertLocation: officeDashJsLib.officeDashJsLibStrings.After, columnCount: scala.Double): scala.Unit = js.native
  /**
           *
           * Adds columns to the left or right of the cell, using the cell's column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertColumns")
  def insertColumns_After(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.After,
    columnCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): scala.Unit = js.native
  /**
           *
           * Adds columns to the left or right of the cell, using the cell's column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertColumns")
  def insertColumns_Before(insertLocation: officeDashJsLib.officeDashJsLibStrings.Before, columnCount: scala.Double): scala.Unit = js.native
  /**
           *
           * Adds columns to the left or right of the cell, using the cell's column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertColumns")
  def insertColumns_Before(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Before,
    columnCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): scala.Unit = js.native
  /**
           *
           * Adds columns to the left or right of the cell, using the cell's column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertColumns")
  def insertColumns_End(insertLocation: officeDashJsLib.officeDashJsLibStrings.End, columnCount: scala.Double): scala.Unit = js.native
  /**
           *
           * Adds columns to the left or right of the cell, using the cell's column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertColumns")
  def insertColumns_End(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.End,
    columnCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): scala.Unit = js.native
  /**
           *
           * Adds columns to the left or right of the cell, using the cell's column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertColumns")
  def insertColumns_Replace(insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace, columnCount: scala.Double): scala.Unit = js.native
  /**
           *
           * Adds columns to the left or right of the cell, using the cell's column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertColumns")
  def insertColumns_Replace(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace,
    columnCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): scala.Unit = js.native
  /**
           *
           * Adds columns to the left or right of the cell, using the cell's column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertColumns")
  def insertColumns_Start(insertLocation: officeDashJsLib.officeDashJsLibStrings.Start, columnCount: scala.Double): scala.Unit = js.native
  /**
           *
           * Adds columns to the left or right of the cell, using the cell's column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertColumns")
  def insertColumns_Start(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Start,
    columnCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): scala.Unit = js.native
  /**
           *
           * Inserts rows above or below the cell, using the cell's row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  def insertRows(insertLocation: InsertLocation, rowCount: scala.Double): TableRowCollection = js.native
  /**
           *
           * Inserts rows above or below the cell, using the cell's row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  def insertRows(
    insertLocation: InsertLocation,
    rowCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): TableRowCollection = js.native
  /**
           *
           * Inserts rows above or below the cell, using the cell's row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertRows")
  def insertRows_After(insertLocation: officeDashJsLib.officeDashJsLibStrings.After, rowCount: scala.Double): TableRowCollection = js.native
  /**
           *
           * Inserts rows above or below the cell, using the cell's row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertRows")
  def insertRows_After(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.After,
    rowCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): TableRowCollection = js.native
  /**
           *
           * Inserts rows above or below the cell, using the cell's row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertRows")
  def insertRows_Before(insertLocation: officeDashJsLib.officeDashJsLibStrings.Before, rowCount: scala.Double): TableRowCollection = js.native
  /**
           *
           * Inserts rows above or below the cell, using the cell's row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertRows")
  def insertRows_Before(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Before,
    rowCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): TableRowCollection = js.native
  /**
           *
           * Inserts rows above or below the cell, using the cell's row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertRows")
  def insertRows_End(insertLocation: officeDashJsLib.officeDashJsLibStrings.End, rowCount: scala.Double): TableRowCollection = js.native
  /**
           *
           * Inserts rows above or below the cell, using the cell's row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertRows")
  def insertRows_End(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.End,
    rowCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): TableRowCollection = js.native
  /**
           *
           * Inserts rows above or below the cell, using the cell's row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertRows")
  def insertRows_Replace(insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace, rowCount: scala.Double): TableRowCollection = js.native
  /**
           *
           * Inserts rows above or below the cell, using the cell's row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertRows")
  def insertRows_Replace(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace,
    rowCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): TableRowCollection = js.native
  /**
           *
           * Inserts rows above or below the cell, using the cell's row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertRows")
  def insertRows_Start(insertLocation: officeDashJsLib.officeDashJsLibStrings.Start, rowCount: scala.Double): TableRowCollection = js.native
  /**
           *
           * Inserts rows above or below the cell, using the cell's row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Before' or 'After'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
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
           * `load(option?: string | string[]): Word.TableCell` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Word.TableCell` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.TableCell` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
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
           * `load(option?: string | string[]): Word.TableCell` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Word.TableCell` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.TableCell` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.WordNs.InterfacesNs.TableCellLoadOptions): TableCell = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Word.TableCell): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsLib.WordNs.InterfacesNs.TableCellUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Word.TableCell): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsLib.WordNs.InterfacesNs.TableCellUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TableCell): scala.Unit = js.native
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
  def setCellPadding_Bottom(cellPaddingLocation: officeDashJsLib.officeDashJsLibStrings.Bottom, cellPadding: scala.Double): scala.Unit = js.native
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
  def setCellPadding_Left(cellPaddingLocation: officeDashJsLib.officeDashJsLibStrings.Left, cellPadding: scala.Double): scala.Unit = js.native
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
  def toJSON(): officeDashJsLib.WordNs.InterfacesNs.TableCellData = js.native
  /**
           * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
           */
  def track(): TableCell = js.native
  /**
           * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
           */
  def untrack(): TableCell = js.native
}

