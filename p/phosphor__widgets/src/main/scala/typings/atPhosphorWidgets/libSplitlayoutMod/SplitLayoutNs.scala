package typings.atPhosphorWidgets.libSplitlayoutMod

import typings.atPhosphorWidgets.libSplitlayoutMod.SplitLayoutNs.Alignment
import typings.atPhosphorWidgets.libSplitlayoutMod.SplitLayoutNs.IRenderer
import typings.atPhosphorWidgets.libSplitlayoutMod.SplitLayoutNs.Orientation
import typings.atPhosphorWidgets.libWidgetMod.Widget
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/splitlayout", "SplitLayout")
@js.native
object SplitLayoutNs extends js.Object {
  /**
    * A type alias for a split layout alignment.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.start
    - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.center
    - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.end
    - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.justify
  */
  trait Alignment extends js.Object
  
  /**
    * An options object for initializing a split layout.
    */
  trait IOptions extends js.Object {
    /**
      * The content alignment of the layout.
      *
      * The default is `'start'`.
      */
    var alignment: js.UndefOr[Alignment] = js.undefined
    /**
      * The orientation of the layout.
      *
      * The default is `'horizontal'`.
      */
    var orientation: js.UndefOr[Orientation] = js.undefined
    /**
      * The renderer to use for the split layout.
      */
    var renderer: IRenderer
    /**
      * The spacing between items in the layout.
      *
      * The default is `4`.
      */
    var spacing: js.UndefOr[Double] = js.undefined
  }
  
  /**
    * A renderer for use with a split layout.
    */
  trait IRenderer extends js.Object {
    /**
      * Create a new handle for use with a split layout.
      *
      * @returns A new handle element.
      */
    def createHandle(): HTMLDivElement
  }
  
  /**
    * A type alias for a split layout orientation.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.horizontal
    - typings.atPhosphorWidgets.atPhosphorWidgetsStrings.vertical
  */
  trait Orientation extends js.Object
  
  /**
    * Get the split layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The split layout stretch factor for the widget.
    */
  def getStretch(widget: Widget): Double = js.native
  /**
    * Set the split layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  def setStretch(widget: Widget, value: Double): Unit = js.native
}

