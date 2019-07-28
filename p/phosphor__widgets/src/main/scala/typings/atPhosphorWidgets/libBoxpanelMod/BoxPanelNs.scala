package typings.atPhosphorWidgets.libBoxpanelMod

import typings.atPhosphorWidgets.libBoxlayoutMod.BoxLayout
import typings.atPhosphorWidgets.libBoxpanelMod.BoxPanelNs.Alignment
import typings.atPhosphorWidgets.libBoxpanelMod.BoxPanelNs.Direction
import typings.atPhosphorWidgets.libWidgetMod.Widget
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
    var layout: js.UndefOr[BoxLayout] = js.undefined
    /**
      * The spacing between items in the panel.
      *
      * The default is `4`.
      */
    var spacing: js.UndefOr[Double] = js.undefined
  }
  
  /**
    * Get the box panel size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box panel size basis for the widget.
    */
  def getSizeBasis(widget: Widget): Double = js.native
  /**
    * Get the box panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box panel stretch factor for the widget.
    */
  def getStretch(widget: Widget): Double = js.native
  /**
    * Set the box panel size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the size basis.
    */
  def setSizeBasis(widget: Widget, value: Double): Unit = js.native
  /**
    * Set the box panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  def setStretch(widget: Widget, value: Double): Unit = js.native
  /**
    * A type alias for a box panel alignment.
    */
  type Alignment = typings.atPhosphorWidgets.libBoxlayoutMod.BoxLayoutNs.Alignment
  /**
    * A type alias for a box panel direction.
    */
  type Direction = typings.atPhosphorWidgets.libBoxlayoutMod.BoxLayoutNs.Direction
}

