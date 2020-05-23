package typings.officeJsPreview.Word.Interfaces

import typings.officeJsPreview.Word.Alignment
import typings.officeJsPreview.Word.VerticalAlignment
import typings.officeJsPreview.officeJsPreviewStrings.Bottom
import typings.officeJsPreview.officeJsPreviewStrings.Center
import typings.officeJsPreview.officeJsPreviewStrings.Centered
import typings.officeJsPreview.officeJsPreviewStrings.Justified
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.Mixed
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.Top
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
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
  var alignment: js.UndefOr[Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified] = js.undefined
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
  var headerRowCount: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets and sets the horizontal alignment of every cell in the table. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified] = js.undefined
  /**
    *
    * Indicates whether all of the table rows are uniform. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var isUniform: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the nesting level of the table. Top-level tables have level 1. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var nestingLevel: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets the number of rows in the table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var rowCount: js.UndefOr[Double] = js.undefined
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
  var shadingColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets the style name for the table. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.3]
    */
  var style: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets and sets whether the table has banded columns.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBandedColumns: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets and sets whether the table has banded rows.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBandedRows: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the built-in style name for the table. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any
  ] = js.undefined
  /**
    *
    * Gets and sets whether the table has a first column with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleFirstColumn: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets and sets whether the table has a last column with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleLastColumn: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets and sets whether the table has a total (last) row with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleTotalRow: js.UndefOr[Boolean] = js.undefined
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
  var values: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  /**
    *
    * Gets and sets the vertical alignment of every cell in the table. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | Mixed | Top | Center | Bottom] = js.undefined
  /**
    *
    * Gets and sets the width of the table in points.
    *
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[Double] = js.undefined
}

object TableData {
  @scala.inline
  def apply(
    alignment: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified = null,
    font: FontData = null,
    headerRowCount: js.UndefOr[Double] = js.undefined,
    horizontalAlignment: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified = null,
    isUniform: js.UndefOr[Boolean] = js.undefined,
    nestingLevel: js.UndefOr[Double] = js.undefined,
    rowCount: js.UndefOr[Double] = js.undefined,
    rows: js.Array[TableRowData] = null,
    shadingColor: String = null,
    style: String = null,
    styleBandedColumns: js.UndefOr[Boolean] = js.undefined,
    styleBandedRows: js.UndefOr[Boolean] = js.undefined,
    styleBuiltIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any = null,
    styleFirstColumn: js.UndefOr[Boolean] = js.undefined,
    styleLastColumn: js.UndefOr[Boolean] = js.undefined,
    styleTotalRow: js.UndefOr[Boolean] = js.undefined,
    tables: js.Array[TableData] = null,
    values: js.Array[js.Array[String]] = null,
    verticalAlignment: VerticalAlignment | Mixed | Top | Center | Bottom = null,
    width: js.UndefOr[Double] = js.undefined
  ): TableData = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(headerRowCount)) __obj.updateDynamic("headerRowCount")(headerRowCount.get.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(isUniform)) __obj.updateDynamic("isUniform")(isUniform.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nestingLevel)) __obj.updateDynamic("nestingLevel")(nestingLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCount)) __obj.updateDynamic("rowCount")(rowCount.get.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (shadingColor != null) __obj.updateDynamic("shadingColor")(shadingColor.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(styleBandedColumns)) __obj.updateDynamic("styleBandedColumns")(styleBandedColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(styleBandedRows)) __obj.updateDynamic("styleBandedRows")(styleBandedRows.get.asInstanceOf[js.Any])
    if (styleBuiltIn != null) __obj.updateDynamic("styleBuiltIn")(styleBuiltIn.asInstanceOf[js.Any])
    if (!js.isUndefined(styleFirstColumn)) __obj.updateDynamic("styleFirstColumn")(styleFirstColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(styleLastColumn)) __obj.updateDynamic("styleLastColumn")(styleLastColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(styleTotalRow)) __obj.updateDynamic("styleTotalRow")(styleTotalRow.get.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableData]
  }
}

