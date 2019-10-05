package typings.atPhosphorWidgets.atPhosphorWidgetsMod

import typings.atPhosphorWidgets.libDockpanelMod.DockPanel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "DockPanel")
@js.native
/**
  * Construct a new dock panel.
  *
  * @param options - The options for initializing the panel.
  */
class DockPanel ()
  extends typings.atPhosphorWidgets.libDockpanelMod.DockPanel {
  def this(options: IOptions) = this()
}

@JSImport("@phosphor/widgets", "DockPanel")
@js.native
object DockPanel extends js.Object {
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
    extends typings.atPhosphorWidgets.libDockpanelMod.DockPanel.Overlay
  
  /**
    * The default implementation of `IRenderer`.
    */
  @js.native
  class Renderer ()
    extends typings.atPhosphorWidgets.libDockpanelMod.DockPanel.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: typings.atPhosphorWidgets.libDockpanelMod.DockPanel.Renderer = js.native
}

