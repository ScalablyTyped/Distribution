package typings
package officeDashJsDashPreviewLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a table cell in a Word document.
  *
  * [Api set: WordApi 1.3]
  */
trait TableCellLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the body object of the cell.
    *
    * [Api set: WordApi 1.3]
    */
  var body: js.UndefOr[BodyLoadOptions] = js.undefined
  /**
    *
    * Gets the index of the cell in its row. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var cellIndex: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets and sets the width of the cell's column in points. This is applicable to uniform tables.
    *
    * [Api set: WordApi 1.3]
    */
  var columnWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets and sets the horizontal alignment of the cell. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the parent row of the cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentRow: js.UndefOr[TableRowLoadOptions] = js.undefined
  /**
    *
    * Gets the parent table of the cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.undefined
  /**
    *
    * Gets the index of the cell's row in the table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var rowIndex: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the shading color of the cell. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets and sets the text of the cell.
    *
    * [Api set: WordApi 1.3]
    */
  var value: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets and sets the vertical alignment of the cell. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the width of the cell in points. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[scala.Boolean] = js.undefined
}

object TableCellLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    body: BodyLoadOptions = null,
    cellIndex: js.UndefOr[scala.Boolean] = js.undefined,
    columnWidth: js.UndefOr[scala.Boolean] = js.undefined,
    horizontalAlignment: js.UndefOr[scala.Boolean] = js.undefined,
    parentRow: TableRowLoadOptions = null,
    parentTable: TableLoadOptions = null,
    rowIndex: js.UndefOr[scala.Boolean] = js.undefined,
    shadingColor: js.UndefOr[scala.Boolean] = js.undefined,
    value: js.UndefOr[scala.Boolean] = js.undefined,
    verticalAlignment: js.UndefOr[scala.Boolean] = js.undefined,
    width: js.UndefOr[scala.Boolean] = js.undefined
  ): TableCellLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(cellIndex)) __obj.updateDynamic("cellIndex")(cellIndex)
    if (!js.isUndefined(columnWidth)) __obj.updateDynamic("columnWidth")(columnWidth)
    if (!js.isUndefined(horizontalAlignment)) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment)
    if (parentRow != null) __obj.updateDynamic("parentRow")(parentRow)
    if (parentTable != null) __obj.updateDynamic("parentTable")(parentTable)
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex)
    if (!js.isUndefined(shadingColor)) __obj.updateDynamic("shadingColor")(shadingColor)
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(verticalAlignment)) __obj.updateDynamic("verticalAlignment")(verticalAlignment)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[TableCellLoadOptions]
  }
}

