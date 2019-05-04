package typings
package atPhosphorWidgetsLib.atPhosphorWidgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "DockPanel")
@js.native
object DockPanelNs extends js.Object {
  /**
    * A concrete implementation of `IOverlay`.
    *
    * This is the default overlay implementation for a dock panel.
    */
  @js.native
  /**
    * Construct a new overlay.
    */
  class Overlay ()
    extends atPhosphorWidgetsLib.libDockpanelMod.DockPanelNs.Overlay
  
  /**
    * The default implementation of `IRenderer`.
    */
  @js.native
  class Renderer ()
    extends atPhosphorWidgetsLib.libDockpanelMod.DockPanelNs.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: atPhosphorWidgetsLib.libDockpanelMod.DockPanelNs.Renderer = js.native
}

