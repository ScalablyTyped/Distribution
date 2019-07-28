package typings.atPhosphorWidgets.libLayoutMod

import typings.atPhosphorWidgets.libLayoutMod.LayoutNs.FitPolicy
import typings.atPhosphorWidgets.libLayoutMod.LayoutNs.HorizontalAlignment
import typings.atPhosphorWidgets.libLayoutMod.LayoutNs.VerticalAlignment
import typings.atPhosphorWidgets.libWidgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/layout", "Layout")
@js.native
object LayoutNs extends js.Object {
  /**
    * A type alias for the layout fit policy.
    *
    * #### Notes
    * The fit policy controls the computed size constraints which are
    * applied to the parent widget by the layout.
    *
    * Some layout implementations may ignore the fit policy.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`set-no-constraint`
    - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`set-min-size`
  */
  trait FitPolicy extends js.Object
  
  /**
    * A type alias for the horizontal alignment of a widget.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.left
    - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.center
    - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.right
  */
  trait HorizontalAlignment extends js.Object
  
  /**
    * An options object for initializing a layout.
    */
  trait IOptions extends js.Object {
    /**
      * The fit policy for the layout.
      *
      * The default is `'set-min-size'`.
      */
    var fitPolicy: js.UndefOr[FitPolicy] = js.undefined
  }
  
  /**
    * A type alias for the vertical alignment of a widget.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.top
    - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.center
    - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.bottom
  */
  trait VerticalAlignment extends js.Object
  
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
  def getHorizontalAlignment(widget: Widget): HorizontalAlignment = js.native
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
  def getVerticalAlignment(widget: Widget): VerticalAlignment = js.native
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
  def setHorizontalAlignment(widget: Widget, value: HorizontalAlignment): Unit = js.native
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
  def setVerticalAlignment(widget: Widget, value: VerticalAlignment): Unit = js.native
}

