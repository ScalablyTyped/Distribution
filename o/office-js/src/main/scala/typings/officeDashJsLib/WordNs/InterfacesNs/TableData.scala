package typings
package officeDashJsLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "table.toJSON()". */
trait TableData extends js.Object {
  /**
    *
    * Gets or sets the alignment of the table against the page column. The value can be 'Left', 'Centered', or 'Right'.
    *
    * [Api set: WordApi 1.3]
    */
  var alignment: js.UndefOr[
    officeDashJsLib.WordNs.Alignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Centered | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justified
  ] = js.undefined
  /**
    *
    * Gets the font. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var font: js.UndefOr[FontData] = js.undefined
  /**
    *
    * Gets and sets the number of header rows.
    *
    * [Api set: WordApi 1.3]
    */
  var headerRowCount: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets and sets the horizontal alignment of every cell in the table. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[
    officeDashJsLib.WordNs.Alignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Centered | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justified
  ] = js.undefined
  /**
    *
    * Indicates whether all of the table rows are uniform. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var isUniform: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the nesting level of the table. Top-level tables have level 1. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var nestingLevel: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets the parent body of the table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyData] = js.undefined
  /**
    *
    * Gets the content control that contains the table. Throws if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControl: js.UndefOr[ContentControlData] = js.undefined
  /**
    *
    * Gets the content control that contains the table. Returns a null object if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlData] = js.undefined
  /**
    *
    * Gets the table that contains this table. Throws if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableData] = js.undefined
  /**
    *
    * Gets the table cell that contains this table. Throws if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCell: js.UndefOr[TableCellData] = js.undefined
  /**
    *
    * Gets the table cell that contains this table. Returns a null object if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellData] = js.undefined
  /**
    *
    * Gets the table that contains this table. Returns a null object if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableOrNullObject: js.UndefOr[TableData] = js.undefined
  /**
    *
    * Gets the number of rows in the table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var rowCount: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets all of the table rows. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var rows: js.UndefOr[js.Array[TableRowData]] = js.undefined
  /**
    *
    * Gets and sets the shading color. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the style name for the table. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.3]
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets and sets whether the table has banded columns.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBandedColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets and sets whether the table has banded rows.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBandedRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the built-in style name for the table. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 149 */ js.Any
  ] = js.undefined
  /**
    *
    * Gets and sets whether the table has a first column with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleFirstColumn: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets and sets whether the table has a last column with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleLastColumn: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets and sets whether the table has a total (last) row with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleTotalRow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the child tables nested one level deeper. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.undefined
  /**
    *
    * Gets and sets the text values in the table, as a 2D Javascript array.
    *
    * [Api set: WordApi 1.3]
    */
  var values: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
  /**
    *
    * Gets and sets the vertical alignment of every cell in the table. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[
    officeDashJsLib.WordNs.VerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Bottom
  ] = js.undefined
  /**
    *
    * Gets and sets the width of the table in points.
    *
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object TableData {
  @scala.inline
  def apply(
    alignment: officeDashJsLib.WordNs.Alignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Centered | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justified = null,
    font: FontData = null,
    headerRowCount: scala.Int | scala.Double = null,
    horizontalAlignment: officeDashJsLib.WordNs.Alignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Centered | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justified = null,
    isUniform: js.UndefOr[scala.Boolean] = js.undefined,
    nestingLevel: scala.Int | scala.Double = null,
    parentBody: BodyData = null,
    parentContentControl: ContentControlData = null,
    parentContentControlOrNullObject: ContentControlData = null,
    parentTable: TableData = null,
    parentTableCell: TableCellData = null,
    parentTableCellOrNullObject: TableCellData = null,
    parentTableOrNullObject: TableData = null,
    rowCount: scala.Int | scala.Double = null,
    rows: js.Array[TableRowData] = null,
    shadingColor: java.lang.String = null,
    style: java.lang.String = null,
    styleBandedColumns: js.UndefOr[scala.Boolean] = js.undefined,
    styleBandedRows: js.UndefOr[scala.Boolean] = js.undefined,
    styleBuiltIn: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 149 */ js.Any = null,
    styleFirstColumn: js.UndefOr[scala.Boolean] = js.undefined,
    styleLastColumn: js.UndefOr[scala.Boolean] = js.undefined,
    styleTotalRow: js.UndefOr[scala.Boolean] = js.undefined,
    tables: js.Array[TableData] = null,
    values: js.Array[js.Array[java.lang.String]] = null,
    verticalAlignment: officeDashJsLib.WordNs.VerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Bottom = null,
    width: scala.Int | scala.Double = null
  ): TableData = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (headerRowCount != null) __obj.updateDynamic("headerRowCount")(headerRowCount.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(isUniform)) __obj.updateDynamic("isUniform")(isUniform)
    if (nestingLevel != null) __obj.updateDynamic("nestingLevel")(nestingLevel.asInstanceOf[js.Any])
    if (parentBody != null) __obj.updateDynamic("parentBody")(parentBody)
    if (parentContentControl != null) __obj.updateDynamic("parentContentControl")(parentContentControl)
    if (parentContentControlOrNullObject != null) __obj.updateDynamic("parentContentControlOrNullObject")(parentContentControlOrNullObject)
    if (parentTable != null) __obj.updateDynamic("parentTable")(parentTable)
    if (parentTableCell != null) __obj.updateDynamic("parentTableCell")(parentTableCell)
    if (parentTableCellOrNullObject != null) __obj.updateDynamic("parentTableCellOrNullObject")(parentTableCellOrNullObject)
    if (parentTableOrNullObject != null) __obj.updateDynamic("parentTableOrNullObject")(parentTableOrNullObject)
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (shadingColor != null) __obj.updateDynamic("shadingColor")(shadingColor)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(styleBandedColumns)) __obj.updateDynamic("styleBandedColumns")(styleBandedColumns)
    if (!js.isUndefined(styleBandedRows)) __obj.updateDynamic("styleBandedRows")(styleBandedRows)
    if (styleBuiltIn != null) __obj.updateDynamic("styleBuiltIn")(styleBuiltIn)
    if (!js.isUndefined(styleFirstColumn)) __obj.updateDynamic("styleFirstColumn")(styleFirstColumn)
    if (!js.isUndefined(styleLastColumn)) __obj.updateDynamic("styleLastColumn")(styleLastColumn)
    if (!js.isUndefined(styleTotalRow)) __obj.updateDynamic("styleTotalRow")(styleTotalRow)
    if (tables != null) __obj.updateDynamic("tables")(tables)
    if (values != null) __obj.updateDynamic("values")(values)
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableData]
  }
}

