package typings.atPhosphorWidgets.libDockpanelMod.DockPanel

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A concrete implementation of `IOverlay`.
  *
  * This is the default overlay implementation for a dock panel.
  */
@JSImport("@phosphor/widgets/lib/dockpanel", "DockPanel.Overlay")
@js.native
/**
  * Construct a new overlay.
  */
class Overlay () extends IOverlay {
  var _hidden: js.Any = js.native
  var _timer: js.Any = js.native
  /**
    * The DOM node for the overlay.
    */
  /* CompleteClass */
  override val node: HTMLDivElement = js.native
  /**
    * Hide the overlay node.
    *
    * @param delay - The delay (in ms) before hiding the overlay.
    *   A delay value <= 0 should hide the overlay immediately.
    *
    * #### Notes
    * This is called whenever the overlay node should been hidden.
    */
  /* CompleteClass */
  override def hide(delay: Double): Unit = js.native
  /**
    * Show the overlay using the given overlay geometry.
    *
    * @param geo - The desired geometry for the overlay.
    *
    * #### Notes
    * The given geometry values assume the node will use absolute
    * positioning.
    *
    * This is called on every mouse move event during a drag in order
    * to update the position of the overlay. It should be efficient.
    */
  /* CompleteClass */
  override def show(geo: IOverlayGeometry): Unit = js.native
}

