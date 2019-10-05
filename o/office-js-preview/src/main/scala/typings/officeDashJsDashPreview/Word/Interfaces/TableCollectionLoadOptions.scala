package typings.officeDashJsDashPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains the collection of the document's Table objects.
  *
  * [Api set: WordApi 1.3]
  */
trait TableCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the alignment of the table against the page column. The value can be 'Left', 'Centered', or 'Right'.
    *
    * [Api set: WordApi 1.3]
    */
  var alignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the font. Use this to get and set font name, size, color, and other properties.
    *
    * [Api set: WordApi 1.3]
    */
  var font: js.UndefOr[FontLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the number of header rows.
    *
    * [Api set: WordApi 1.3]
    */
  var headerRowCount: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the horizontal alignment of every cell in the table. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates whether all of the table rows are uniform. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var isUniform: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the nesting level of the table. Top-level tables have level 1. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var nestingLevel: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the parent body of the table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the content control that contains the table. Throws an error if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the content control that contains the table. Returns a null object if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the table that contains this table. Throws an error if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the table cell that contains this table. Throws an error if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the table cell that contains this table. Returns a null object if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the table that contains this table. Returns a null object if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableOrNullObject: js.UndefOr[TableLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the number of rows in the table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var rowCount: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the shading color. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the style name for the table. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.3]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets and sets whether the table has banded columns.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBandedColumns: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets and sets whether the table has banded rows.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBandedRows: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the built-in style name for the table. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets and sets whether the table has a first column with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleFirstColumn: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets and sets whether the table has a last column with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleLastColumn: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets and sets whether the table has a total (last) row with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleTotalRow: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the text values in the table, as a 2D Javascript array.
    *
    * [Api set: WordApi 1.3]
    */
  var values: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the vertical alignment of every cell in the table. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the width of the table in points.
    *
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}

object TableCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    alignment: js.UndefOr[Boolean] = js.undefined,
    font: FontLoadOptions = null,
    headerRowCount: js.UndefOr[Boolean] = js.undefined,
    horizontalAlignment: js.UndefOr[Boolean] = js.undefined,
    isUniform: js.UndefOr[Boolean] = js.undefined,
    nestingLevel: js.UndefOr[Boolean] = js.undefined,
    parentBody: BodyLoadOptions = null,
    parentContentControl: ContentControlLoadOptions = null,
    parentContentControlOrNullObject: ContentControlLoadOptions = null,
    parentTable: TableLoadOptions = null,
    parentTableCell: TableCellLoadOptions = null,
    parentTableCellOrNullObject: TableCellLoadOptions = null,
    parentTableOrNullObject: TableLoadOptions = null,
    rowCount: js.UndefOr[Boolean] = js.undefined,
    shadingColor: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Boolean] = js.undefined,
    styleBandedColumns: js.UndefOr[Boolean] = js.undefined,
    styleBandedRows: js.UndefOr[Boolean] = js.undefined,
    styleBuiltIn: js.UndefOr[Boolean] = js.undefined,
    styleFirstColumn: js.UndefOr[Boolean] = js.undefined,
    styleLastColumn: js.UndefOr[Boolean] = js.undefined,
    styleTotalRow: js.UndefOr[Boolean] = js.undefined,
    values: js.UndefOr[Boolean] = js.undefined,
    verticalAlignment: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Boolean] = js.undefined
  ): TableCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(alignment)) __obj.updateDynamic("alignment")(alignment)
    if (font != null) __obj.updateDynamic("font")(font)
    if (!js.isUndefined(headerRowCount)) __obj.updateDynamic("headerRowCount")(headerRowCount)
    if (!js.isUndefined(horizontalAlignment)) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment)
    if (!js.isUndefined(isUniform)) __obj.updateDynamic("isUniform")(isUniform)
    if (!js.isUndefined(nestingLevel)) __obj.updateDynamic("nestingLevel")(nestingLevel)
    if (parentBody != null) __obj.updateDynamic("parentBody")(parentBody)
    if (parentContentControl != null) __obj.updateDynamic("parentContentControl")(parentContentControl)
    if (parentContentControlOrNullObject != null) __obj.updateDynamic("parentContentControlOrNullObject")(parentContentControlOrNullObject)
    if (parentTable != null) __obj.updateDynamic("parentTable")(parentTable)
    if (parentTableCell != null) __obj.updateDynamic("parentTableCell")(parentTableCell)
    if (parentTableCellOrNullObject != null) __obj.updateDynamic("parentTableCellOrNullObject")(parentTableCellOrNullObject)
    if (parentTableOrNullObject != null) __obj.updateDynamic("parentTableOrNullObject")(parentTableOrNullObject)
    if (!js.isUndefined(rowCount)) __obj.updateDynamic("rowCount")(rowCount)
    if (!js.isUndefined(shadingColor)) __obj.updateDynamic("shadingColor")(shadingColor)
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(styleBandedColumns)) __obj.updateDynamic("styleBandedColumns")(styleBandedColumns)
    if (!js.isUndefined(styleBandedRows)) __obj.updateDynamic("styleBandedRows")(styleBandedRows)
    if (!js.isUndefined(styleBuiltIn)) __obj.updateDynamic("styleBuiltIn")(styleBuiltIn)
    if (!js.isUndefined(styleFirstColumn)) __obj.updateDynamic("styleFirstColumn")(styleFirstColumn)
    if (!js.isUndefined(styleLastColumn)) __obj.updateDynamic("styleLastColumn")(styleLastColumn)
    if (!js.isUndefined(styleTotalRow)) __obj.updateDynamic("styleTotalRow")(styleTotalRow)
    if (!js.isUndefined(values)) __obj.updateDynamic("values")(values)
    if (!js.isUndefined(verticalAlignment)) __obj.updateDynamic("verticalAlignment")(verticalAlignment)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[TableCollectionLoadOptions]
  }
}

