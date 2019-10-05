package typings.officeDashJsDashPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains the collection of the document's TableRow objects.
  *
  * [Api set: WordApi 1.3]
  */
trait TableRowCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the number of cells in the row. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var cellCount: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the font. Use this to get and set font name, size, color, and other properties.
    *
    * [Api set: WordApi 1.3]
    */
  var font: js.UndefOr[FontLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the horizontal alignment of every cell in the row. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Checks whether the row is a header row. Read-only. To set the number of header rows, use HeaderRowCount on the Table object.
    *
    * [Api set: WordApi 1.3]
    */
  var isHeader: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets parent table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the preferred height of the row in points.
    *
    * [Api set: WordApi 1.3]
    */
  var preferredHeight: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the index of the row in its parent table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var rowIndex: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the shading color. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the text values in the row, as a 2D Javascript array.
    *
    * [Api set: WordApi 1.3]
    */
  var values: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the vertical alignment of the cells in the row. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.undefined
}

object TableRowCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    cellCount: js.UndefOr[Boolean] = js.undefined,
    font: FontLoadOptions = null,
    horizontalAlignment: js.UndefOr[Boolean] = js.undefined,
    isHeader: js.UndefOr[Boolean] = js.undefined,
    parentTable: TableLoadOptions = null,
    preferredHeight: js.UndefOr[Boolean] = js.undefined,
    rowIndex: js.UndefOr[Boolean] = js.undefined,
    shadingColor: js.UndefOr[Boolean] = js.undefined,
    values: js.UndefOr[Boolean] = js.undefined,
    verticalAlignment: js.UndefOr[Boolean] = js.undefined
  ): TableRowCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(cellCount)) __obj.updateDynamic("cellCount")(cellCount)
    if (font != null) __obj.updateDynamic("font")(font)
    if (!js.isUndefined(horizontalAlignment)) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment)
    if (!js.isUndefined(isHeader)) __obj.updateDynamic("isHeader")(isHeader)
    if (parentTable != null) __obj.updateDynamic("parentTable")(parentTable)
    if (!js.isUndefined(preferredHeight)) __obj.updateDynamic("preferredHeight")(preferredHeight)
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex)
    if (!js.isUndefined(shadingColor)) __obj.updateDynamic("shadingColor")(shadingColor)
    if (!js.isUndefined(values)) __obj.updateDynamic("values")(values)
    if (!js.isUndefined(verticalAlignment)) __obj.updateDynamic("verticalAlignment")(verticalAlignment)
    __obj.asInstanceOf[TableRowCollectionLoadOptions]
  }
}

