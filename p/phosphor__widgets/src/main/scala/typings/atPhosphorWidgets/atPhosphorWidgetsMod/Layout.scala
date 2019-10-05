package typings.atPhosphorWidgets.atPhosphorWidgetsMod

import typings.atPhosphorWidgets.libLayoutMod.Layout.HorizontalAlignment
import typings.atPhosphorWidgets.libLayoutMod.Layout.IOptions
import typings.atPhosphorWidgets.libLayoutMod.Layout.VerticalAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "Layout")
@js.native
/**
  * Construct a new layout.
  *
  * @param options - The options for initializing the layout.
  */
abstract class Layout ()
  extends typings.atPhosphorWidgets.libLayoutMod.Layout {
  def this(options: IOptions) = this()
}

@JSImport("@phosphor/widgets", "Layout")
@js.native
object Layout extends js.Object {
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
  def getHorizontalAlignment(widget: typings.atPhosphorWidgets.libWidgetMod.Widget): HorizontalAlignment = js.native
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
  def getVerticalAlignment(widget: typings.atPhosphorWidgets.libWidgetMod.Widget): VerticalAlignment = js.native
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
  def setHorizontalAlignment(widget: typings.atPhosphorWidgets.libWidgetMod.Widget, value: HorizontalAlignment): Unit = js.native
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
  def setVerticalAlignment(widget: typings.atPhosphorWidgets.libWidgetMod.Widget, value: VerticalAlignment): Unit = js.native
}

