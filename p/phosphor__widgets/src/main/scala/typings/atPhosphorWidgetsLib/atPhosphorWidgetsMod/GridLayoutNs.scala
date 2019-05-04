package typings
package atPhosphorWidgetsLib.atPhosphorWidgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "GridLayout")
@js.native
object GridLayoutNs extends js.Object {
  /**
    * Get the cell config for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The cell config for the widget.
    */
  def getCellConfig(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): atPhosphorWidgetsLib.libGridlayoutMod.GridLayoutNs.ICellConfig = js.native
  /**
    * Set the cell config for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the cell config.
    */
  def setCellConfig(
    widget: atPhosphorWidgetsLib.libWidgetMod.Widget,
    value: stdLib.Partial[atPhosphorWidgetsLib.libGridlayoutMod.GridLayoutNs.ICellConfig]
  ): scala.Unit = js.native
}

