package typings.atPhosphorWidgets.libGridlayoutMod

import typings.atPhosphorWidgets.libGridlayoutMod.GridLayoutNs.ICellConfig
import typings.atPhosphorWidgets.libWidgetMod.Widget
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/gridlayout", "GridLayout")
@js.native
object GridLayoutNs extends js.Object {
  /**
    * An object which holds the cell configuration for a widget.
    */
  trait ICellConfig extends js.Object {
    /**
      * The column index for the widget.
      */
    val column: Double
    /**
      * The column span for the widget.
      */
    val columnSpan: Double
    /**
      * The row index for the widget.
      */
    val row: Double
    /**
      * The row span for the widget.
      */
    val rowSpan: Double
  }
  
  /**
    * An options object for initializing a grid layout.
    */
  trait IOptions
    extends typings.atPhosphorWidgets.libLayoutMod.LayoutNs.IOptions {
    /**
      * The initial column count for the layout.
      *
      * The default is `1`.
      */
    var columnCount: js.UndefOr[Double] = js.undefined
    /**
      * The spacing between columns in the layout.
      *
      * The default is `4`.
      */
    var columnSpacing: js.UndefOr[Double] = js.undefined
    /**
      * The initial row count for the layout.
      *
      * The default is `1`.
      */
    var rowCount: js.UndefOr[Double] = js.undefined
    /**
      * The spacing between rows in the layout.
      *
      * The default is `4`.
      */
    var rowSpacing: js.UndefOr[Double] = js.undefined
  }
  
  /**
    * Get the cell config for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The cell config for the widget.
    */
  def getCellConfig(widget: Widget): ICellConfig = js.native
  /**
    * Set the cell config for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the cell config.
    */
  def setCellConfig(widget: Widget, value: Partial[ICellConfig]): Unit = js.native
}

