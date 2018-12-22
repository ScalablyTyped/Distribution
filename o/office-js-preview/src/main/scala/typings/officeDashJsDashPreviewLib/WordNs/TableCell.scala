package typings
package officeDashJsDashPreviewLib.WordNs

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
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
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
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableCell: RequestContext = js.native
  /**
           *
           * Gets and sets the horizontal alignment of the cell. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
           *
           * [Api set: WordApi 1.3]
           */
  var horizontalAlignment: Alignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Mixed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Centered | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justified = js.native
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
  var verticalAlignment: VerticalAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Mixed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Top | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bottom = js.native
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
  def getBorder_All(borderLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.All): TableBorder = js.native
  /**
           *
           * Gets the border style for the specified border.
           *
           * [Api set: WordApi 1.3]
           *
           * @param borderLocation Required. The border location.
           */
  @JSName("getBorder")
  def getBorder_Bottom(borderLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bottom): TableBorder = js.native
  /**
           *
           * Gets the border style for the specified border.
           *
           * [Api set: WordApi 1.3]
           *
           * @param borderLocation Required. The border location.
           */
  @JSName("getBorder")
  def getBorder_Inside(borderLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Inside): TableBorder = js.native
  /**
           *
           * Gets the border style for the specified border.
           *
           * [Api set: WordApi 1.3]
           *
           * @param borderLocation Required. The border location.
           */
  @JSName("getBorder")
  def getBorder_InsideHorizontal(borderLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.InsideHorizontal): TableBorder = js.native
  /**
           *
           * Gets the border style for the specified border.
           *
           * [Api set: WordApi 1.3]
           *
           * @param borderLocation Required. The border location.
           */
  @JSName("getBorder")
  def getBorder_InsideVertical(borderLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.InsideVertical): TableBorder = js.native
  /**
           *
           * Gets the border style for the specified border.
           *
           * [Api set: WordApi 1.3]
           *
           * @param borderLocation Required. The border location.
           */
  @JSName("getBorder")
  def getBorder_Left(borderLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left): TableBorder = js.native
  /**
           *
           * Gets the border style for the specified border.
           *
           * [Api set: WordApi 1.3]
           *
           * @param borderLocation Required. The border location.
           */
  @JSName("getBorder")
  def getBorder_Outside(borderLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Outside): TableBorder = js.native
  /**
           *
           * Gets the border style for the specified border.
           *
           * [Api set: WordApi 1.3]
           *
           * @param borderLocation Required. The border location.
           */
  @JSName("getBorder")
  def getBorder_Right(borderLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right): TableBorder = js.native
  /**
           *
           * Gets the border style for the specified border.
           *
           * [Api set: WordApi 1.3]
           *
           * @param borderLocation Required. The border location.
           */
  @JSName("getBorder")
  def getBorder_Top(borderLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Top): TableBorder = js.native
  /**
           *
           * Gets cell padding in points.
           *
           * [Api set: WordApi 1.3]
           *
           * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
           */
  def getCellPadding(cellPaddingLocation: CellPaddingLocation): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
           *
           * Gets cell padding in points.
           *
           * [Api set: WordApi 1.3]
           *
           * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
           */
  @JSName("getCellPadding")
  def getCellPadding_Bottom(cellPaddingLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bottom): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
           *
           * Gets cell padding in points.
           *
           * [Api set: WordApi 1.3]
           *
           * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
           */
  @JSName("getCellPadding")
  def getCellPadding_Left(cellPaddingLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
           *
           * Gets cell padding in points.
           *
           * [Api set: WordApi 1.3]
           *
           * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
           */
  @JSName("getCellPadding")
  def getCellPadding_Right(cellPaddingLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
           *
           * Gets cell padding in points.
           *
           * [Api set: WordApi 1.3]
           *
           * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
           */
  @JSName("getCellPadding")
  def getCellPadding_Top(cellPaddingLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Top): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
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
  def insertColumns_After(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After,
    columnCount: scala.Double
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
  def insertColumns_After(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After,
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
  def insertColumns_Before(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before,
    columnCount: scala.Double
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
  def insertColumns_Before(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before,
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
  def insertColumns_End(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End,
    columnCount: scala.Double
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
  def insertColumns_End(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End,
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
  def insertColumns_Replace(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace,
    columnCount: scala.Double
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
  def insertColumns_Replace(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace,
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
  def insertColumns_Start(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start,
    columnCount: scala.Double
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
  def insertColumns_Start(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start,
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
  def insertRows_After(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After,
    rowCount: scala.Double
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
  def insertRows_After(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After,
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
  def insertRows_Before(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before,
    rowCount: scala.Double
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
  def insertRows_Before(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before,
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
  def insertRows_End(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End,
    rowCount: scala.Double
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
  def insertRows_End(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End,
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
  def insertRows_Replace(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace,
    rowCount: scala.Double
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
  def insertRows_Replace(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace,
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
  def insertRows_Start(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start,
    rowCount: scala.Double
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
  def insertRows_Start(
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start,
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
  def load(option: officeDashJsDashPreviewLib.Anon_Select): TableCell = js.native
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
  def load(option: officeDashJsDashPreviewLib.WordNs.InterfacesNs.TableCellLoadOptions): TableCell = js.native
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
  def set(properties: officeDashJsDashPreviewLib.WordNs.InterfacesNs.TableCellUpdateData): scala.Unit = js.native
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
    properties: officeDashJsDashPreviewLib.WordNs.InterfacesNs.TableCellUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
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
  def setCellPadding_Bottom(
    cellPaddingLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bottom,
    cellPadding: scala.Double
  ): scala.Unit = js.native
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
  def setCellPadding_Left(
    cellPaddingLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left,
    cellPadding: scala.Double
  ): scala.Unit = js.native
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
  def setCellPadding_Right(
    cellPaddingLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right,
    cellPadding: scala.Double
  ): scala.Unit = js.native
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
  def setCellPadding_Top(
    cellPaddingLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Top,
    cellPadding: scala.Double
  ): scala.Unit = js.native
  /**
           *
           * Splits the cell into the specified number of rows and columns.
           *
           * [Api set: WordApi BETA (PREVIEW ONLY)]
           * @beta
           *
           * @param rowCount Required. The number of rows to split into. Must be a divisor of the number of underlying rows.
           * @param columnCount Required. The number of columns to split into.
           */
  def split(rowCount: scala.Double, columnCount: scala.Double): scala.Unit = js.native
  def toJSON(): officeDashJsDashPreviewLib.WordNs.InterfacesNs.TableCellData = js.native
  /**
           * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
           */
  def track(): TableCell = js.native
  /**
           * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
           */
  def untrack(): TableCell = js.native
}

