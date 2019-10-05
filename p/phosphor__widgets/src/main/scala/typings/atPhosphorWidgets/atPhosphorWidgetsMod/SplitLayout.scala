package typings.atPhosphorWidgets.atPhosphorWidgetsMod

import typings.atPhosphorWidgets.libSplitlayoutMod.SplitLayout.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "SplitLayout")
@js.native
class SplitLayout protected ()
  extends typings.atPhosphorWidgets.libSplitlayoutMod.SplitLayout {
  /**
    * Construct a new split layout.
    *
    * @param options - The options for initializing the layout.
    */
  def this(options: IOptions) = this()
}

@JSImport("@phosphor/widgets", "SplitLayout")
@js.native
object SplitLayout extends js.Object {
  /**
    * Get the split layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The split layout stretch factor for the widget.
    */
  def getStretch(widget: typings.atPhosphorWidgets.libWidgetMod.Widget): Double = js.native
  /**
    * Set the split layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  def setStretch(widget: typings.atPhosphorWidgets.libWidgetMod.Widget, value: Double): Unit = js.native
}

