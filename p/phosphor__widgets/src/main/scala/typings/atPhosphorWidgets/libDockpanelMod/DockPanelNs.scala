package typings.atPhosphorWidgets.libDockpanelMod

import typings.atPhosphorWidgets.libDockpanelMod.DockPanelNs.IEdges
import typings.atPhosphorWidgets.libDockpanelMod.DockPanelNs.IOverlay
import typings.atPhosphorWidgets.libDockpanelMod.DockPanelNs.IOverlayGeometry
import typings.atPhosphorWidgets.libDockpanelMod.DockPanelNs.IRenderer
import typings.atPhosphorWidgets.libDockpanelMod.DockPanelNs.Mode
import typings.atPhosphorWidgets.libDockpanelMod.DockPanelNs.Renderer
import typings.atPhosphorWidgets.libTabbarMod.TabBar
import typings.atPhosphorWidgets.libWidgetMod.Widget
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/dockpanel", "DockPanel")
@js.native
object DockPanelNs extends js.Object {
  /**
    * The sizes of the edge drop zones, in pixels.
    */
  trait IEdges extends js.Object {
    /**
      * The size of the bottom edge drop zone.
      */
    var bottom: Double
    /**
      * The size of the left edge drop zone.
      */
    var left: Double
    /**
      * The size of the right edge drop zone.
      */
    var right: Double
    /**
      * The size of the top edge drop zone.
      */
    var top: Double
  }
  
  /**
    * An options object for creating a dock panel.
    */
  trait IOptions extends js.Object {
    /**
      * The sizes of the edge drop zones, in pixels.
      * If not given, default values will be used.
      */
    var edges: js.UndefOr[IEdges] = js.undefined
    /**
      * The mode for the dock panel.
      *
      * The deafult is `'multiple-document'`.
      */
    var mode: js.UndefOr[Mode] = js.undefined
    /**
      * The overlay to use with the dock panel.
      *
      * The default is a new `Overlay` instance.
      */
    var overlay: js.UndefOr[IOverlay] = js.undefined
    /**
      * The renderer to use for the dock panel.
      *
      * The default is a shared renderer instance.
      */
    var renderer: js.UndefOr[IRenderer] = js.undefined
    /**
      * The spacing between the items in the panel.
      *
      * The default is `4`.
      */
    var spacing: js.UndefOr[Double] = js.undefined
  }
  
  /**
    * An object which manages the overlay node for a dock panel.
    */
  trait IOverlay extends js.Object {
    /**
      * The DOM node for the overlay.
      */
    val node: HTMLDivElement
    /**
      * Hide the overlay node.
      *
      * @param delay - The delay (in ms) before hiding the overlay.
      *   A delay value <= 0 should hide the overlay immediately.
      *
      * #### Notes
      * This is called whenever the overlay node should been hidden.
      */
    def hide(delay: Double): Unit
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
    def show(geo: IOverlayGeometry): Unit
  }
  
  /**
    * An object which holds the geometry for overlay positioning.
    */
  trait IOverlayGeometry extends js.Object {
    /**
      * The distance between the overlay and parent bottom edges.
      */
    var bottom: Double
    /**
      * The distance between the overlay and parent left edges.
      */
    var left: Double
    /**
      * The distance between the overlay and parent right edges.
      */
    var right: Double
    /**
      * The distance between the overlay and parent top edges.
      */
    var top: Double
  }
  
  /**
    * A type alias for the supported dock panel modes.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`single-document`
    - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`multiple-document`
  */
  trait Mode extends js.Object
  
  /**
    * A concrete implementation of `IOverlay`.
    *
    * This is the default overlay implementation for a dock panel.
    */
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
  
  /**
    * The default implementation of `IRenderer`.
    */
  @js.native
  class Renderer () extends IRenderer {
    /**
      * Create a new handle node for use with a dock layout.
      *
      * @returns A new handle node for a dock layout.
      */
    /* CompleteClass */
    override def createHandle(): HTMLDivElement = js.native
    /**
      * Create a new tab bar for use with a dock layout.
      *
      * @returns A new tab bar for a dock layout.
      */
    /* CompleteClass */
    override def createTabBar(): TabBar[Widget] = js.native
  }
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: Renderer = js.native
  /**
    * A type alias for the add widget options.
    */
  type IAddOptions = typings.atPhosphorWidgets.libDocklayoutMod.DockLayoutNs.IAddOptions
  /**
    * A type alias for a layout configuration object.
    */
  type ILayoutConfig = typings.atPhosphorWidgets.libDocklayoutMod.DockLayoutNs.ILayoutConfig
  /**
    * A type alias for a dock panel renderer;
    */
  type IRenderer = typings.atPhosphorWidgets.libDocklayoutMod.DockLayoutNs.IRenderer
  /**
    * A type alias for the supported insertion modes.
    */
  type InsertMode = typings.atPhosphorWidgets.libDocklayoutMod.DockLayoutNs.InsertMode
}

