package typings
package atPhosphorWidgetsLib.libDockpanelMod

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
    var bottom: scala.Double
    /**
      * The size of the left edge drop zone.
      */
    var left: scala.Double
    /**
      * The size of the right edge drop zone.
      */
    var right: scala.Double
    /**
      * The size of the top edge drop zone.
      */
    var top: scala.Double
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
    var spacing: js.UndefOr[scala.Double] = js.undefined
  }
  
  /**
    * An object which manages the overlay node for a dock panel.
    */
  trait IOverlay extends js.Object {
    /**
      * The DOM node for the overlay.
      */
    val node: stdLib.HTMLDivElement
    /**
      * Hide the overlay node.
      *
      * @param delay - The delay (in ms) before hiding the overlay.
      *   A delay value <= 0 should hide the overlay immediately.
      *
      * #### Notes
      * This is called whenever the overlay node should been hidden.
      */
    def hide(delay: scala.Double): scala.Unit
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
    def show(geo: IOverlayGeometry): scala.Unit
  }
  
  /**
    * An object which holds the geometry for overlay positioning.
    */
  trait IOverlayGeometry extends js.Object {
    /**
      * The distance between the overlay and parent bottom edges.
      */
    var bottom: scala.Double
    /**
      * The distance between the overlay and parent left edges.
      */
    var left: scala.Double
    /**
      * The distance between the overlay and parent right edges.
      */
    var right: scala.Double
    /**
      * The distance between the overlay and parent top edges.
      */
    var top: scala.Double
  }
  
  /**
    * A type alias for the supported dock panel modes.
    */
  /* Rewritten from type alias, can be one of: 
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.`single-document`
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.`multiple-document`
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
    override val node: stdLib.HTMLDivElement = js.native
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
    override def hide(delay: scala.Double): scala.Unit = js.native
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
    override def show(geo: IOverlayGeometry): scala.Unit = js.native
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
    override def createHandle(): stdLib.HTMLDivElement = js.native
    /**
      * Create a new tab bar for use with a dock layout.
      *
      * @returns A new tab bar for a dock layout.
      */
    /* CompleteClass */
    override def createTabBar(): atPhosphorWidgetsLib.libTabbarMod.TabBar[atPhosphorWidgetsLib.libWidgetMod.Widget] = js.native
  }
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: Renderer = js.native
  /**
    * A type alias for the add widget options.
    */
  type IAddOptions = atPhosphorWidgetsLib.libDocklayoutMod.DockLayoutNs.IAddOptions
  /**
    * A type alias for a layout configuration object.
    */
  type ILayoutConfig = atPhosphorWidgetsLib.libDocklayoutMod.DockLayoutNs.ILayoutConfig
  /**
    * A type alias for a dock panel renderer;
    */
  type IRenderer = atPhosphorWidgetsLib.libDocklayoutMod.DockLayoutNs.IRenderer
  /**
    * A type alias for the supported insertion modes.
    */
  type InsertMode = atPhosphorWidgetsLib.libDocklayoutMod.DockLayoutNs.InsertMode
}

