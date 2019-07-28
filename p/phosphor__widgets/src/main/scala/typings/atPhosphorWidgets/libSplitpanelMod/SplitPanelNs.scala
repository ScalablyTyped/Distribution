package typings.atPhosphorWidgets.libSplitpanelMod

import typings.atPhosphorWidgets.libSplitlayoutMod.SplitLayout
import typings.atPhosphorWidgets.libSplitpanelMod.SplitPanelNs.Alignment
import typings.atPhosphorWidgets.libSplitpanelMod.SplitPanelNs.IRenderer
import typings.atPhosphorWidgets.libSplitpanelMod.SplitPanelNs.Orientation
import typings.atPhosphorWidgets.libSplitpanelMod.SplitPanelNs.Renderer
import typings.atPhosphorWidgets.libWidgetMod.Widget
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/splitpanel", "SplitPanel")
@js.native
object SplitPanelNs extends js.Object {
  /**
    * An options object for initializing a split panel.
    */
  trait IOptions extends js.Object {
    /**
      * The content alignment of the panel.
      *
      * The default is `'start'`.
      */
    var alignment: js.UndefOr[Alignment] = js.undefined
    /**
      * The split layout to use for the split panel.
      *
      * If this is provided, the other options are ignored.
      *
      * The default is a new `SplitLayout`.
      */
    var layout: js.UndefOr[SplitLayout] = js.undefined
    /**
      * The layout orientation of the panel.
      *
      * The default is `'horizontal'`.
      */
    var orientation: js.UndefOr[Orientation] = js.undefined
    /**
      * The renderer to use for the split panel.
      *
      * The default is a shared renderer instance.
      */
    var renderer: js.UndefOr[IRenderer] = js.undefined
    /**
      * The spacing between items in the panel.
      *
      * The default is `4`.
      */
    var spacing: js.UndefOr[Double] = js.undefined
  }
  
  /**
    * The default implementation of `IRenderer`.
    */
  @js.native
  class Renderer () extends IRenderer {
    /**
      * Create a new handle for use with a split layout.
      *
      * @returns A new handle element.
      */
    /* CompleteClass */
    override def createHandle(): HTMLDivElement = js.native
  }
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: Renderer = js.native
  /**
    * Get the split panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The split panel stretch factor for the widget.
    */
  def getStretch(widget: Widget): Double = js.native
  /**
    * Set the split panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  def setStretch(widget: Widget, value: Double): Unit = js.native
  /**
    * A type alias for a split panel alignment.
    */
  type Alignment = typings.atPhosphorWidgets.libSplitlayoutMod.SplitLayoutNs.Alignment
  /**
    * A type alias for a split panel renderer.
    */
  type IRenderer = typings.atPhosphorWidgets.libSplitlayoutMod.SplitLayoutNs.IRenderer
  /**
    * A type alias for a split panel orientation.
    */
  type Orientation = typings.atPhosphorWidgets.libSplitlayoutMod.SplitLayoutNs.Orientation
}

