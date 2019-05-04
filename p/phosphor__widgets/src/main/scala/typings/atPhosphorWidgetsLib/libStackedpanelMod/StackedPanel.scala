package typings
package atPhosphorWidgetsLib.libStackedpanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/stackedpanel", "StackedPanel")
@js.native
/**
  * Construct a new stacked panel.
  *
  * @param options - The options for initializing the panel.
  */
class StackedPanel ()
  extends atPhosphorWidgetsLib.libPanelMod.Panel {
  def this(options: atPhosphorWidgetsLib.libStackedpanelMod.StackedPanelNs.IOptions) = this()
  var _widgetRemoved: js.Any = js.native
  /**
    * A signal emitted when a widget is removed from a stacked panel.
    */
  val widgetRemoved: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atPhosphorWidgetsLib.libWidgetMod.Widget] = js.native
}

