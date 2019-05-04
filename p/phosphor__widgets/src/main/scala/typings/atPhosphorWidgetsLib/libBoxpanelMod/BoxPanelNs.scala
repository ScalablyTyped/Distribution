package typings
package atPhosphorWidgetsLib.libBoxpanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/boxpanel", "BoxPanel")
@js.native
object BoxPanelNs extends js.Object {
  /**
    * An options object for initializing a box panel.
    */
  trait IOptions extends js.Object {
    /**
      * The content alignment of the panel.
      *
      * The default is `'start'`.
      */
    var alignment: js.UndefOr[Alignment] = js.undefined
    /**
      * The layout direction of the panel.
      *
      * The default is `'top-to-bottom'`.
      */
    var direction: js.UndefOr[Direction] = js.undefined
    /**
      * The box layout to use for the box panel.
      *
      * If this is provided, the other options are ignored.
      *
      * The default is a new `BoxLayout`.
      */
    var layout: js.UndefOr[atPhosphorWidgetsLib.libBoxlayoutMod.BoxLayout] = js.undefined
    /**
      * The spacing between items in the panel.
      *
      * The default is `4`.
      */
    var spacing: js.UndefOr[scala.Double] = js.undefined
  }
  
  /**
    * Get the box panel size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box panel size basis for the widget.
    */
  def getSizeBasis(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): scala.Double = js.native
  /**
    * Get the box panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box panel stretch factor for the widget.
    */
  def getStretch(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): scala.Double = js.native
  /**
    * Set the box panel size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the size basis.
    */
  def setSizeBasis(widget: atPhosphorWidgetsLib.libWidgetMod.Widget, value: scala.Double): scala.Unit = js.native
  /**
    * Set the box panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  def setStretch(widget: atPhosphorWidgetsLib.libWidgetMod.Widget, value: scala.Double): scala.Unit = js.native
  /**
    * A type alias for a box panel alignment.
    */
  type Alignment = atPhosphorWidgetsLib.libBoxlayoutMod.BoxLayoutNs.Alignment
  /**
    * A type alias for a box panel direction.
    */
  type Direction = atPhosphorWidgetsLib.libBoxlayoutMod.BoxLayoutNs.Direction
}

