package typings.atPhosphorWidgets.atPhosphorWidgetsMod

import typings.atPhosphorWidgets.libGridlayoutMod.GridLayoutNs.ICellConfig
import typings.std.Partial
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
  def getCellConfig(widget: typings.atPhosphorWidgets.libWidgetMod.Widget): ICellConfig = js.native
  /**
    * Set the cell config for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the cell config.
    */
  def setCellConfig(widget: typings.atPhosphorWidgets.libWidgetMod.Widget, value: Partial[ICellConfig]): Unit = js.native
}

