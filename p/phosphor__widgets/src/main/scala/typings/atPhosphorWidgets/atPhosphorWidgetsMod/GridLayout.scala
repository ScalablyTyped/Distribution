package typings.atPhosphorWidgets.atPhosphorWidgetsMod

import typings.atPhosphorWidgets.libGridlayoutMod.GridLayout.ICellConfig
import typings.atPhosphorWidgets.libGridlayoutMod.GridLayout.IOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "GridLayout")
@js.native
/**
  * Construct a new grid layout.
  *
  * @param options - The options for initializing the layout.
  */
class GridLayout ()
  extends typings.atPhosphorWidgets.libGridlayoutMod.GridLayout {
  def this(options: IOptions) = this()
}

@JSImport("@phosphor/widgets", "GridLayout")
@js.native
object GridLayout extends js.Object {
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

