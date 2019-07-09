package typings
package atPhosphorWidgetsLib.libLayoutMod

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
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.`set-no-constraint`
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.`set-min-size`
  */
  trait FitPolicy extends js.Object
  
  /**
    * A type alias for the horizontal alignment of a widget.
    */
  /* Rewritten from type alias, can be one of: 
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.left
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.center
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.right
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
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.top
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.center
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.bottom
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
  def getHorizontalAlignment(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): HorizontalAlignment = js.native
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
  def getVerticalAlignment(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): VerticalAlignment = js.native
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
  def setHorizontalAlignment(widget: atPhosphorWidgetsLib.libWidgetMod.Widget, value: HorizontalAlignment): scala.Unit = js.native
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
  def setVerticalAlignment(widget: atPhosphorWidgetsLib.libWidgetMod.Widget, value: VerticalAlignment): scala.Unit = js.native
}

