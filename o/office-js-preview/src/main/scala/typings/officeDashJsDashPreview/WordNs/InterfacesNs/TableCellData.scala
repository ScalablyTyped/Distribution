package typings.officeDashJsDashPreview.WordNs.InterfacesNs

import typings.officeDashJsDashPreview.WordNs.Alignment
import typings.officeDashJsDashPreview.WordNs.VerticalAlignment
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Bottom
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Center
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Centered
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Justified
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Left
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Mixed
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Right
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Top
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "tableCell.toJSON()". */
trait TableCellData extends js.Object {
  /**
    *
    * Gets the body object of the cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var body: js.UndefOr[BodyData] = js.undefined
  /**
    *
    * Gets the index of the cell in its row. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var cellIndex: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets and sets the width of the cell's column in points. This is applicable to uniform tables.
    *
    * [Api set: WordApi 1.3]
    */
  var columnWidth: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets and sets the horizontal alignment of the cell. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[Alignment | Mixed | Unknown | Left | Centered | Right | Justified] = js.undefined
  /**
    *
    * Gets the index of the cell's row in the table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets or sets the shading color of the cell. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets and sets the text of the cell.
    *
    * [Api set: WordApi 1.3]
    */
  var value: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets and sets the vertical alignment of the cell. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | Mixed | Top | Center | Bottom] = js.undefined
  /**
    *
    * Gets the width of the cell in points. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[Double] = js.undefined
}

object TableCellData {
  @scala.inline
  def apply(
    body: BodyData = null,
    cellIndex: Int | Double = null,
    columnWidth: Int | Double = null,
    horizontalAlignment: Alignment | Mixed | Unknown | Left | Centered | Right | Justified = null,
    rowIndex: Int | Double = null,
    shadingColor: String = null,
    value: String = null,
    verticalAlignment: VerticalAlignment | Mixed | Top | Center | Bottom = null,
    width: Int | Double = null
  ): TableCellData = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (shadingColor != null) __obj.updateDynamic("shadingColor")(shadingColor)
    if (value != null) __obj.updateDynamic("value")(value)
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellData]
  }
}

