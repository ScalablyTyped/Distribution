package typings.atPhosphorWidgets.libLayoutMod.Layout

import typings.atPhosphorWidgets.libWidgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/layout", "Layout.getHorizontalAlignment")
@js.native
object getHorizontalAlignment extends js.Object {
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
  def apply(widget: Widget): HorizontalAlignment = js.native
}

