package typings.phosphorWidgets.dockpanelMod.DockPanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object IOptions {
  @scala.inline
  def apply(
    edges: IEdges = null,
    mode: Mode = null,
    overlay: IOverlay = null,
    renderer: IRenderer = null,
    spacing: Int | Double = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (edges != null) __obj.updateDynamic("edges")(edges.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

