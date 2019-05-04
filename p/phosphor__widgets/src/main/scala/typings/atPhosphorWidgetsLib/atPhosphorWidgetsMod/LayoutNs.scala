package typings
package atPhosphorWidgetsLib.atPhosphorWidgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "Layout")
@js.native
object LayoutNs extends js.Object {
  /**
    * Get the horizontal alignment for a widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The horizontal alignment for the widget.
    *
    * #### Notes
    * If the layout width allocated to a widget is larger than its max
    * width, the horizontal alignment controls how the widget is placed
    * within the extra horizontal space.
    *
    * If the allocated width is less than the widget's max width, the
    * horizontal alignment has no effect.
    *
    * Some layout implementations may ignore horizontal alignment.
    */
  def getHorizontalAlignment(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): atPhosphorWidgetsLib.libLayoutMod.LayoutNs.HorizontalAlignment = js.native
  /**
    * Get the vertical alignment for a widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The vertical alignment for the widget.
    *
    * #### Notes
    * If the layout height allocated to a widget is larger than its max
    * height, the vertical alignment controls how the widget is placed
    * within the extra vertical space.
    *
    * If the allocated height is less than the widget's max height, the
    * vertical alignment has no effect.
    *
    * Some layout implementations may ignore vertical alignment.
    */
  def getVerticalAlignment(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): atPhosphorWidgetsLib.libLayoutMod.LayoutNs.VerticalAlignment = js.native
  /**
    * Set the horizontal alignment for a widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the horizontal alignment.
    *
    * #### Notes
    * If the layout width allocated to a widget is larger than its max
    * width, the horizontal alignment controls how the widget is placed
    * within the extra horizontal space.
    *
    * If the allocated width is less than the widget's max width, the
    * horizontal alignment has no effect.
    *
    * Some layout implementations may ignore horizontal alignment.
    *
    * Changing the horizontal alignment will post an `update-request`
    * message to widget's parent, provided the parent has a layout
    * installed.
    */
  def setHorizontalAlignment(
    widget: atPhosphorWidgetsLib.libWidgetMod.Widget,
    value: atPhosphorWidgetsLib.libLayoutMod.LayoutNs.HorizontalAlignment
  ): scala.Unit = js.native
  /**
    * Set the vertical alignment for a widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the vertical alignment.
    *
    * #### Notes
    * If the layout height allocated to a widget is larger than its max
    * height, the vertical alignment controls how the widget is placed
    * within the extra vertical space.
    *
    * If the allocated height is less than the widget's max height, the
    * vertical alignment has no effect.
    *
    * Some layout implementations may ignore vertical alignment.
    *
    * Changing the horizontal alignment will post an `update-request`
    * message to widget's parent, provided the parent has a layout
    * installed.
    */
  def setVerticalAlignment(
    widget: atPhosphorWidgetsLib.libWidgetMod.Widget,
    value: atPhosphorWidgetsLib.libLayoutMod.LayoutNs.VerticalAlignment
  ): scala.Unit = js.native
}

