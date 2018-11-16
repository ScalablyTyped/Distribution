package typings
package officeDashJsLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents a table in a Word document.
     *
     * [Api set: WordApi 1.3]
     */
@JSGlobal("Word.Table")
@js.native
class Table ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Gets or sets the alignment of the table against the page column. The value can be 'Left', 'Centered', or 'Right'.
           *
           * [Api set: WordApi 1.3]
           */
  var alignment: Alignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Centered | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justified = js.native
  /**
           *
           * Gets the font. Use this to get and set font name, size, color, and other properties. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val font: Font = js.native
  /**
           *
           * Gets and sets the number of header rows.
           *
           * [Api set: WordApi 1.3]
           */
  var headerRowCount: scala.Double = js.native
  /**
           *
           * Gets and sets the horizontal alignment of every cell in the table. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
           *
           * [Api set: WordApi 1.3]
           */
  var horizontalAlignment: Alignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Centered | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justified = js.native
  /**
           *
           * Indicates whether all of the table rows are uniform. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val isUniform: scala.Boolean = js.native
  /**
           *
           * Gets the nesting level of the table. Top-level tables have level 1. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val nestingLevel: scala.Double = js.native
  /**
           *
           * Gets the parent body of the table. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val parentBody: Body = js.native
  /**
           *
           * Gets the content control that contains the table. Throws if there isn't a parent content control. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val parentContentControl: ContentControl = js.native
  /**
           *
           * Gets the content control that contains the table. Returns a null object if there isn't a parent content control. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val parentContentControlOrNullObject: ContentControl = js.native
  /**
           *
           * Gets the table that contains this table. Throws if it is not contained in a table. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val parentTable: Table = js.native
  /**
           *
           * Gets the table cell that contains this table. Throws if it is not contained in a table cell. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val parentTableCell: TableCell = js.native
  /**
           *
           * Gets the table cell that contains this table. Returns a null object if it is not contained in a table cell. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val parentTableCellOrNullObject: TableCell = js.native
  /**
           *
           * Gets the table that contains this table. Returns a null object if it is not contained in a table. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val parentTableOrNullObject: Table = js.native
  /**
           *
           * Gets the number of rows in the table. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val rowCount: scala.Double = js.native
  /**
           *
           * Gets all of the table rows. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val rows: TableRowCollection = js.native
  /**
           *
           * Gets and sets the shading color. Color is specified in "#RRGGBB" format or by using the color name.
           *
           * [Api set: WordApi 1.3]
           */
  var shadingColor: java.lang.String = js.native
  /**
           *
           * Gets or sets the style name for the table. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
           *
           * [Api set: WordApi 1.3]
           */
  var style: java.lang.String = js.native
  /**
           *
           * Gets and sets whether the table has banded columns.
           *
           * [Api set: WordApi 1.3]
           */
  var styleBandedColumns: scala.Boolean = js.native
  /**
           *
           * Gets and sets whether the table has banded rows.
           *
           * [Api set: WordApi 1.3]
           */
  var styleBandedRows: scala.Boolean = js.native
  /**
           *
           * Gets or sets the built-in style name for the table. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
           *
           * [Api set: WordApi 1.3]
           */
  var styleBuiltIn: /* LimitUnionLength: was union type with length 149 */js.Any = js.native
  /**
           *
           * Gets and sets whether the table has a first column with a special style.
           *
           * [Api set: WordApi 1.3]
           */
  var styleFirstColumn: scala.Boolean = js.native
  /**
           *
           * Gets and sets whether the table has a last column with a special style.
           *
           * [Api set: WordApi 1.3]
           */
  var styleLastColumn: scala.Boolean = js.native
  /**
           *
           * Gets and sets whether the table has a total (last) row with a special style.
           *
           * [Api set: WordApi 1.3]
           */
  var styleTotalRow: scala.Boolean = js.native
  /**
           *
           * Gets the child tables nested one level deeper. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val tables: TableCollection = js.native
  /**
           *
           * Gets and sets the text values in the table, as a 2D Javascript array.
           *
           * [Api set: WordApi 1.3]
           */
  var values: js.Array[js.Array[java.lang.String]] = js.native
  /**
           *
           * Gets and sets the vertical alignment of every cell in the table. The value can be 'Top', 'Center', or 'Bottom'.
           *
           * [Api set: WordApi 1.3]
           */
  var verticalAlignment: VerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Bottom = js.native
  /**
           *
           * Gets and sets the width of the table in points.
           *
           * [Api set: WordApi 1.3]
           */
  var width: scala.Double = js.native
  /**
           *
           * Adds columns to the start or end of the table, using the first or last existing column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End', corresponding to the appropriate side of the table.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  def addColumns(insertLocation: InsertLocation, columnCount: scala.Double): scala.Unit = js.native
  /**
           *
           * Adds columns to the start or end of the table, using the first or last existing column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End', corresponding to the appropriate side of the table.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  def addColumns(
    insertLocation: InsertLocation,
    columnCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): scala.Unit = js.native
  /**
           *
           * Adds columns to the start or end of the table, using the first or last existing column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End', corresponding to the appropriate side of the table.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addColumns")
  def addColumns_After(insertLocation: officeDashJsLib.officeDashJsLibStrings.After, columnCount: scala.Double): scala.Unit = js.native
  /**
           *
           * Adds columns to the start or end of the table, using the first or last existing column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End', corresponding to the appropriate side of the table.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addColumns")
  def addColumns_After(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.After,
    columnCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): scala.Unit = js.native
  /**
           *
           * Adds columns to the start or end of the table, using the first or last existing column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End', corresponding to the appropriate side of the table.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addColumns")
  def addColumns_Before(insertLocation: officeDashJsLib.officeDashJsLibStrings.Before, columnCount: scala.Double): scala.Unit = js.native
  /**
           *
           * Adds columns to the start or end of the table, using the first or last existing column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End', corresponding to the appropriate side of the table.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addColumns")
  def addColumns_Before(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Before,
    columnCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): scala.Unit = js.native
  /**
           *
           * Adds columns to the start or end of the table, using the first or last existing column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End', corresponding to the appropriate side of the table.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addColumns")
  def addColumns_End(insertLocation: officeDashJsLib.officeDashJsLibStrings.End, columnCount: scala.Double): scala.Unit = js.native
  /**
           *
           * Adds columns to the start or end of the table, using the first or last existing column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End', corresponding to the appropriate side of the table.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addColumns")
  def addColumns_End(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.End,
    columnCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): scala.Unit = js.native
  /**
           *
           * Adds columns to the start or end of the table, using the first or last existing column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End', corresponding to the appropriate side of the table.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addColumns")
  def addColumns_Replace(insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace, columnCount: scala.Double): scala.Unit = js.native
  /**
           *
           * Adds columns to the start or end of the table, using the first or last existing column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End', corresponding to the appropriate side of the table.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addColumns")
  def addColumns_Replace(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace,
    columnCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): scala.Unit = js.native
  /**
           *
           * Adds columns to the start or end of the table, using the first or last existing column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End', corresponding to the appropriate side of the table.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addColumns")
  def addColumns_Start(insertLocation: officeDashJsLib.officeDashJsLibStrings.Start, columnCount: scala.Double): scala.Unit = js.native
  /**
           *
           * Adds columns to the start or end of the table, using the first or last existing column as a template. This is applicable to uniform tables. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End', corresponding to the appropriate side of the table.
           * @param columnCount Required. Number of columns to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addColumns")
  def addColumns_Start(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Start,
    columnCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): scala.Unit = js.native
  /**
           *
           * Adds rows to the start or end of the table, using the first or last existing row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  def addRows(insertLocation: InsertLocation, rowCount: scala.Double): TableRowCollection = js.native
  /**
           *
           * Adds rows to the start or end of the table, using the first or last existing row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  def addRows(
    insertLocation: InsertLocation,
    rowCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): TableRowCollection = js.native
  /**
           *
           * Adds rows to the start or end of the table, using the first or last existing row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addRows")
  def addRows_After(insertLocation: officeDashJsLib.officeDashJsLibStrings.After, rowCount: scala.Double): TableRowCollection = js.native
  /**
           *
           * Adds rows to the start or end of the table, using the first or last existing row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addRows")
  def addRows_After(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.After,
    rowCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): TableRowCollection = js.native
  /**
           *
           * Adds rows to the start or end of the table, using the first or last existing row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addRows")
  def addRows_Before(insertLocation: officeDashJsLib.officeDashJsLibStrings.Before, rowCount: scala.Double): TableRowCollection = js.native
  /**
           *
           * Adds rows to the start or end of the table, using the first or last existing row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addRows")
  def addRows_Before(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Before,
    rowCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): TableRowCollection = js.native
  /**
           *
           * Adds rows to the start or end of the table, using the first or last existing row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addRows")
  def addRows_End(insertLocation: officeDashJsLib.officeDashJsLibStrings.End, rowCount: scala.Double): TableRowCollection = js.native
  /**
           *
           * Adds rows to the start or end of the table, using the first or last existing row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addRows")
  def addRows_End(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.End,
    rowCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): TableRowCollection = js.native
  /**
           *
           * Adds rows to the start or end of the table, using the first or last existing row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addRows")
  def addRows_Replace(insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace, rowCount: scala.Double): TableRowCollection = js.native
  /**
           *
           * Adds rows to the start or end of the table, using the first or last existing row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addRows")
  def addRows_Replace(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace,
    rowCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): TableRowCollection = js.native
  /**
           *
           * Adds rows to the start or end of the table, using the first or last existing row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addRows")
  def addRows_Start(insertLocation: officeDashJsLib.officeDashJsLibStrings.Start, rowCount: scala.Double): TableRowCollection = js.native
  /**
           *
           * Adds rows to the start or end of the table, using the first or last existing row as a template. The string values, if specified, are set in the newly inserted rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param insertLocation Required. It can be 'Start' or 'End'.
           * @param rowCount Required. Number of rows to add.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("addRows")
  def addRows_Start(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Start,
    rowCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): TableRowCollection = js.native
  /**
           *
           * Autofits the table columns to the width of the window.
           *
           * [Api set: WordApi 1.3]
           */
  def autoFitWindow(): scala.Unit = js.native
  /**
           *
           * Clears the contents of the table.
           *
           * [Api set: WordApi 1.3]
           */
  def clear(): scala.Unit = js.native
  /**
           *
           * Deletes the entire table.
           *
           * [Api set: WordApi 1.3]
           */
  def delete(): scala.Unit = js.native
  /**
           *
           * Deletes specific columns. This is applicable to uniform tables.
           *
           * [Api set: WordApi 1.3]
           *
           * @param columnIndex Required. The first column to delete.
           * @param columnCount Optional. The number of columns to delete. Default 1.
           */
  def deleteColumns(columnIndex: scala.Double): scala.Unit = js.native
  /**
           *
           * Deletes specific columns. This is applicable to uniform tables.
           *
           * [Api set: WordApi 1.3]
           *
           * @param columnIndex Required. The first column to delete.
           * @param columnCount Optional. The number of columns to delete. Default 1.
           */
  def deleteColumns(columnIndex: scala.Double, columnCount: scala.Double): scala.Unit = js.native
  /**
           *
           * Deletes specific rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowIndex Required. The first row to delete.
           * @param rowCount Optional. The number of rows to delete. Default 1.
           */
  def deleteRows(rowIndex: scala.Double): scala.Unit = js.native
  /**
           *
           * Deletes specific rows.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowIndex Required. The first row to delete.
           * @param rowCount Optional. The number of rows to delete. Default 1.
           */
  def deleteRows(rowIndex: scala.Double, rowCount: scala.Double): scala.Unit = js.native
  /**
           *
           * Distributes the column widths evenly. This is applicable to uniform tables.
           *
           * [Api set: WordApi 1.3]
           */
  def distributeColumns(): scala.Unit = js.native
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
           * Gets the table cell at a specified row and column. Throws if the specified table cell does not exist.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowIndex Required. The index of the row.
           * @param cellIndex Required. The index of the cell in the row.
           */
  def getCell(rowIndex: scala.Double, cellIndex: scala.Double): TableCell = js.native
  /**
           *
           * Gets the table cell at a specified row and column. Returns a null object if the specified table cell does not exist.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowIndex Required. The index of the row.
           * @param cellIndex Required. The index of the cell in the row.
           */
  def getCellOrNullObject(rowIndex: scala.Double, cellIndex: scala.Double): TableCell = js.native
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
           * Gets the next table. Throws if this table is the last one.
           *
           * [Api set: WordApi 1.3]
           */
  def getNext(): Table = js.native
  /**
           *
           * Gets the next table. Returns a null object if this table is the last one.
           *
           * [Api set: WordApi 1.3]
           */
  def getNextOrNullObject(): Table = js.native
  /**
           *
           * Gets the paragraph after the table. Throws if there isn't a paragraph after the table.
           *
           * [Api set: WordApi 1.3]
           */
  def getParagraphAfter(): Paragraph = js.native
  /**
           *
           * Gets the paragraph after the table. Returns a null object if there isn't a paragraph after the table.
           *
           * [Api set: WordApi 1.3]
           */
  def getParagraphAfterOrNullObject(): Paragraph = js.native
  /**
           *
           * Gets the paragraph before the table. Throws if there isn't a paragraph before the table.
           *
           * [Api set: WordApi 1.3]
           */
  def getParagraphBefore(): Paragraph = js.native
  /**
           *
           * Gets the paragraph before the table. Returns a null object if there isn't a paragraph before the table.
           *
           * [Api set: WordApi 1.3]
           */
  def getParagraphBeforeOrNullObject(): Paragraph = js.native
  /**
           *
           * Gets the range that contains this table, or the range at the start or end of the table.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rangeLocation Optional. The range location can be 'Whole', 'Start', 'End', or 'After'.
           */
  def getRange(): Range = js.native
  /**
           *
           * Gets the range that contains this table, or the range at the start or end of the table.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rangeLocation Optional. The range location can be 'Whole', 'Start', 'End', or 'After'.
           */
  def getRange(rangeLocation: RangeLocation): Range = js.native
  /**
           *
           * Gets the range that contains this table, or the range at the start or end of the table.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rangeLocation Optional. The range location can be 'Whole', 'Start', 'End', or 'After'.
           */
  @JSName("getRange")
  def getRange_After(rangeLocation: officeDashJsLib.officeDashJsLibStrings.After): Range = js.native
  /**
           *
           * Gets the range that contains this table, or the range at the start or end of the table.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rangeLocation Optional. The range location can be 'Whole', 'Start', 'End', or 'After'.
           */
  @JSName("getRange")
  def getRange_Before(rangeLocation: officeDashJsLib.officeDashJsLibStrings.Before): Range = js.native
  /**
           *
           * Gets the range that contains this table, or the range at the start or end of the table.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rangeLocation Optional. The range location can be 'Whole', 'Start', 'End', or 'After'.
           */
  @JSName("getRange")
  def getRange_Content(rangeLocation: officeDashJsLib.officeDashJsLibStrings.Content): Range = js.native
  /**
           *
           * Gets the range that contains this table, or the range at the start or end of the table.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rangeLocation Optional. The range location can be 'Whole', 'Start', 'End', or 'After'.
           */
  @JSName("getRange")
  def getRange_End(rangeLocation: officeDashJsLib.officeDashJsLibStrings.End): Range = js.native
  /**
           *
           * Gets the range that contains this table, or the range at the start or end of the table.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rangeLocation Optional. The range location can be 'Whole', 'Start', 'End', or 'After'.
           */
  @JSName("getRange")
  def getRange_Start(rangeLocation: officeDashJsLib.officeDashJsLibStrings.Start): Range = js.native
  /**
           *
           * Gets the range that contains this table, or the range at the start or end of the table.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rangeLocation Optional. The range location can be 'Whole', 'Start', 'End', or 'After'.
           */
  @JSName("getRange")
  def getRange_Whole(rangeLocation: officeDashJsLib.officeDashJsLibStrings.Whole): Range = js.native
  /**
           *
           * Inserts a content control on the table.
           *
           * [Api set: WordApi 1.3]
           */
  def insertContentControl(): ContentControl = js.native
  /**
           *
           * Inserts a paragraph at the specified location. The insertLocation value can be 'Before' or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param paragraphText Required. The paragraph text to be inserted.
           * @param insertLocation Required. The value can be 'Before' or 'After'.
           */
  def insertParagraph(paragraphText: java.lang.String, insertLocation: InsertLocation): Paragraph = js.native
  /**
           *
           * Inserts a paragraph at the specified location. The insertLocation value can be 'Before' or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param paragraphText Required. The paragraph text to be inserted.
           * @param insertLocation Required. The value can be 'Before' or 'After'.
           */
  @JSName("insertParagraph")
  def insertParagraph_After(paragraphText: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.After): Paragraph = js.native
  /**
           *
           * Inserts a paragraph at the specified location. The insertLocation value can be 'Before' or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param paragraphText Required. The paragraph text to be inserted.
           * @param insertLocation Required. The value can be 'Before' or 'After'.
           */
  @JSName("insertParagraph")
  def insertParagraph_Before(paragraphText: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Before): Paragraph = js.native
  /**
           *
           * Inserts a paragraph at the specified location. The insertLocation value can be 'Before' or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param paragraphText Required. The paragraph text to be inserted.
           * @param insertLocation Required. The value can be 'Before' or 'After'.
           */
  @JSName("insertParagraph")
  def insertParagraph_End(paragraphText: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.End): Paragraph = js.native
  /**
           *
           * Inserts a paragraph at the specified location. The insertLocation value can be 'Before' or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param paragraphText Required. The paragraph text to be inserted.
           * @param insertLocation Required. The value can be 'Before' or 'After'.
           */
  @JSName("insertParagraph")
  def insertParagraph_Replace(paragraphText: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace): Paragraph = js.native
  /**
           *
           * Inserts a paragraph at the specified location. The insertLocation value can be 'Before' or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param paragraphText Required. The paragraph text to be inserted.
           * @param insertLocation Required. The value can be 'Before' or 'After'.
           */
  @JSName("insertParagraph")
  def insertParagraph_Start(paragraphText: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Start): Paragraph = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns. The insertLocation value can be 'Before' or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Before' or 'After'.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  def insertTable(rowCount: scala.Double, columnCount: scala.Double, insertLocation: InsertLocation): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns. The insertLocation value can be 'Before' or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Before' or 'After'.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  def insertTable(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: InsertLocation,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns. The insertLocation value can be 'Before' or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Before' or 'After'.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_After(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsLib.officeDashJsLibStrings.After
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns. The insertLocation value can be 'Before' or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Before' or 'After'.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_After(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsLib.officeDashJsLibStrings.After,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns. The insertLocation value can be 'Before' or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Before' or 'After'.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_Before(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Before
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns. The insertLocation value can be 'Before' or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Before' or 'After'.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_Before(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Before,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns. The insertLocation value can be 'Before' or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Before' or 'After'.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_End(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsLib.officeDashJsLibStrings.End
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns. The insertLocation value can be 'Before' or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Before' or 'After'.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_End(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsLib.officeDashJsLibStrings.End,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns. The insertLocation value can be 'Before' or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Before' or 'After'.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_Replace(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns. The insertLocation value can be 'Before' or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Before' or 'After'.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_Replace(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns. The insertLocation value can be 'Before' or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Before' or 'After'.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_Start(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Start
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns. The insertLocation value can be 'Before' or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Before' or 'After'.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_Start(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Start,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Word.Table` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Word.Table` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.Table` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): Table = js.native
  def load(option: java.lang.String): Table = js.native
  def load(option: js.Array[java.lang.String]): Table = js.native
  def load(option: officeDashJsLib.Anon_Select): Table = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Word.Table` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Word.Table` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.Table` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.WordNs.InterfacesNs.TableLoadOptions): Table = js.native
  /**
           *
           * Performs a search with the specified SearchOptions on the scope of the table object. The search results are a collection of range objects.
           *
           * [Api set: WordApi 1.3]
           *
           * @param searchText Required. The search text.
           * @param searchOptions Optional. Options for the search.
           */
  def search(searchText: java.lang.String): RangeCollection = js.native
  /**
           *
           * Performs a search with the specified SearchOptions on the scope of the table object. The search results are a collection of range objects.
           *
           * [Api set: WordApi 1.3]
           *
           * @param searchText Required. The search text.
           * @param searchOptions Optional. Options for the search.
           */
  def search(searchText: java.lang.String, searchOptions: officeDashJsLib.Anon_MatchSuffix): RangeCollection = js.native
  /**
           *
           * Performs a search with the specified SearchOptions on the scope of the table object. The search results are a collection of range objects.
           *
           * [Api set: WordApi 1.3]
           *
           * @param searchText Required. The search text.
           * @param searchOptions Optional. Options for the search.
           */
  def search(searchText: java.lang.String, searchOptions: SearchOptions): RangeCollection = js.native
  /**
           *
           * Selects the table, or the position at the start or end of the table, and navigates the Word UI to it.
           *
           * [Api set: WordApi 1.3]
           *
           * @param selectionMode Optional. The selection mode can be 'Select', 'Start', or 'End'. 'Select' is the default.
           */
  def select(): scala.Unit = js.native
  /**
           *
           * Selects the table, or the position at the start or end of the table, and navigates the Word UI to it.
           *
           * [Api set: WordApi 1.3]
           *
           * @param selectionMode Optional. The selection mode can be 'Select', 'Start', or 'End'. 'Select' is the default.
           */
  def select(selectionMode: SelectionMode): scala.Unit = js.native
  /**
           *
           * Selects the table, or the position at the start or end of the table, and navigates the Word UI to it.
           *
           * [Api set: WordApi 1.3]
           *
           * @param selectionMode Optional. The selection mode can be 'Select', 'Start', or 'End'. 'Select' is the default.
           */
  @JSName("select")
  def select_End(selectionMode: officeDashJsLib.officeDashJsLibStrings.End): scala.Unit = js.native
  /**
           *
           * Selects the table, or the position at the start or end of the table, and navigates the Word UI to it.
           *
           * [Api set: WordApi 1.3]
           *
           * @param selectionMode Optional. The selection mode can be 'Select', 'Start', or 'End'. 'Select' is the default.
           */
  @JSName("select")
  def select_Select(selectionMode: officeDashJsLib.officeDashJsLibStrings.Select): scala.Unit = js.native
  /**
           *
           * Selects the table, or the position at the start or end of the table, and navigates the Word UI to it.
           *
           * [Api set: WordApi 1.3]
           *
           * @param selectionMode Optional. The selection mode can be 'Select', 'Start', or 'End'. 'Select' is the default.
           */
  @JSName("select")
  def select_Start(selectionMode: officeDashJsLib.officeDashJsLibStrings.Start): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Word.Table): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsLib.WordNs.InterfacesNs.TableUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Word.Table): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsLib.WordNs.InterfacesNs.TableUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Table): scala.Unit = js.native
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
  def toJSON(): officeDashJsLib.WordNs.InterfacesNs.TableData = js.native
  /**
           * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
           */
  def track(): Table = js.native
  /**
           * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
           */
  def untrack(): Table = js.native
}

