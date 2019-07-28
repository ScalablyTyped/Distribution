package typings.officeDashJs.WordNs.InterfacesNs

import typings.officeDashJs.WordNs.Alignment
import typings.officeDashJs.WordNs.VerticalAlignment
import typings.officeDashJs.officeDashJsStrings.Bottom
import typings.officeDashJs.officeDashJsStrings.Center
import typings.officeDashJs.officeDashJsStrings.Centered
import typings.officeDashJs.officeDashJsStrings.Justified
import typings.officeDashJs.officeDashJsStrings.Left
import typings.officeDashJs.officeDashJsStrings.Mixed
import typings.officeDashJs.officeDashJsStrings.Right
import typings.officeDashJs.officeDashJsStrings.Top
import typings.officeDashJs.officeDashJsStrings.Unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TableRow object, for use in "tableRow.set({ ... })". */
trait TableRowUpdateData extends js.Object {
  /**
    *
    * Gets the font. Use this to get and set font name, size, color, and other properties.
    *
    * [Api set: WordApi 1.3]
    */
  var font: js.UndefOr[FontUpdateData] = js.undefined
  /**
    *
    * Gets and sets the horizontal alignment of every cell in the row. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[Alignment | Mixed | Unknown | Left | Centered | Right | Justified] = js.undefined
  /**
    *
    * Gets and sets the preferred height of the row in points.
    *
    * [Api set: WordApi 1.3]
    */
  var preferredHeight: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets and sets the shading color. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets and sets the text values in the row, as a 2D Javascript array.
    *
    * [Api set: WordApi 1.3]
    */
  var values: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  /**
    *
    * Gets and sets the vertical alignment of the cells in the row. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | Mixed | Top | Center | Bottom] = js.undefined
}

object TableRowUpdateData {
  @scala.inline
  def apply(
    font: FontUpdateData = null,
    horizontalAlignment: Alignment | Mixed | Unknown | Left | Centered | Right | Justified = null,
    preferredHeight: Int | Double = null,
    shadingColor: String = null,
    values: js.Array[js.Array[String]] = null,
    verticalAlignment: VerticalAlignment | Mixed | Top | Center | Bottom = null
  ): TableRowUpdateData = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (preferredHeight != null) __obj.updateDynamic("preferredHeight")(preferredHeight.asInstanceOf[js.Any])
    if (shadingColor != null) __obj.updateDynamic("shadingColor")(shadingColor)
    if (values != null) __obj.updateDynamic("values")(values)
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowUpdateData]
  }
}

