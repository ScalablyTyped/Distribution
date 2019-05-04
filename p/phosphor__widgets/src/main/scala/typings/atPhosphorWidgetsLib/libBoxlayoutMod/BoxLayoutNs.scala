package typings
package atPhosphorWidgetsLib.libBoxlayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/boxlayout", "BoxLayout")
@js.native
object BoxLayoutNs extends js.Object {
  /**
    * A type alias for a box layout alignment.
    */
  /* Rewritten from type alias, can be one of: 
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.start
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.center
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.end
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.justify
  */
  trait Alignment extends js.Object
  
  /**
    * A type alias for a box layout direction.
    */
  /* Rewritten from type alias, can be one of: 
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.`left-to-right`
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.`right-to-left`
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.`top-to-bottom`
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.`bottom-to-top`
  */
  trait Direction extends js.Object
  
  /**
    * An options object for initializing a box layout.
    */
  trait IOptions extends js.Object {
    /**
      * The content alignment of the layout.
      *
      * The default is `'start'`.
      */
    var alignment: js.UndefOr[Alignment] = js.undefined
    /**
      * The direction of the layout.
      *
      * The default is `'top-to-bottom'`.
      */
    var direction: js.UndefOr[Direction] = js.undefined
    /**
      * The spacing between items in the layout.
      *
      * The default is `4`.
      */
    var spacing: js.UndefOr[scala.Double] = js.undefined
  }
  
  /**
    * Get the box layout size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box layout size basis for the widget.
    */
  def getSizeBasis(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): scala.Double = js.native
  /**
    * Get the box layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box layout stretch factor for the widget.
    */
  def getStretch(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): scala.Double = js.native
  /**
    * Set the box layout size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the size basis.
    */
  def setSizeBasis(widget: atPhosphorWidgetsLib.libWidgetMod.Widget, value: scala.Double): scala.Unit = js.native
  /**
    * Set the box layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  def setStretch(widget: atPhosphorWidgetsLib.libWidgetMod.Widget, value: scala.Double): scala.Unit = js.native
}

