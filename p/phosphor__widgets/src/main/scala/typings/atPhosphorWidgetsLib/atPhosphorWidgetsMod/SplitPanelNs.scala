package typings
package atPhosphorWidgetsLib.atPhosphorWidgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "SplitPanel")
@js.native
object SplitPanelNs extends js.Object {
  /**
    * The default implementation of `IRenderer`.
    */
  @js.native
  class Renderer ()
    extends atPhosphorWidgetsLib.libSplitpanelMod.SplitPanelNs.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: atPhosphorWidgetsLib.libSplitpanelMod.SplitPanelNs.Renderer = js.native
  /**
    * Get the split panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The split panel stretch factor for the widget.
    */
  def getStretch(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): scala.Double = js.native
  /**
    * Set the split panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  def setStretch(widget: atPhosphorWidgetsLib.libWidgetMod.Widget, value: scala.Double): scala.Unit = js.native
}

