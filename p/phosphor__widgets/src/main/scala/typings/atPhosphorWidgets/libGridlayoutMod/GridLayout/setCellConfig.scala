package typings.atPhosphorWidgets.libGridlayoutMod.GridLayout

import typings.atPhosphorWidgets.libWidgetMod.Widget
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/gridlayout", "GridLayout.setCellConfig")
@js.native
object setCellConfig extends js.Object {
  /**
    * Set the cell config for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the cell config.
    */
  def apply(widget: Widget, value: Partial[ICellConfig]): Unit = js.native
}

