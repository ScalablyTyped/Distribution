package typings.phosphorWidgets.mod

import typings.phosphorWidgets.splitpanelMod.SplitPanel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "SplitPanel")
@js.native
/**
  * Construct a new split panel.
  *
  * @param options - The options for initializing the split panel.
  */
class SplitPanel ()
  extends typings.phosphorWidgets.splitpanelMod.SplitPanel {
  def this(options: IOptions) = this()
}

@JSImport("@phosphor/widgets", "SplitPanel")
@js.native
object SplitPanel extends js.Object {
  /**
    * The default implementation of `IRenderer`.
    */
  @js.native
  class Renderer ()
    extends typings.phosphorWidgets.splitpanelMod.SplitPanel.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: typings.phosphorWidgets.splitpanelMod.SplitPanel.Renderer = js.native
  /**
    * Get the split panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The split panel stretch factor for the widget.
    */
  def getStretch(widget: typings.phosphorWidgets.widgetMod.Widget): Double = js.native
  /**
    * Set the split panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  def setStretch(widget: typings.phosphorWidgets.widgetMod.Widget, value: Double): Unit = js.native
}

