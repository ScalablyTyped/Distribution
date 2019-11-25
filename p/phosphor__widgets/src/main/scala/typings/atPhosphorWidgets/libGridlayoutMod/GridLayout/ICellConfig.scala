package typings.atPhosphorWidgets.libGridlayoutMod.GridLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object ICellConfig {
  @scala.inline
  def apply(column: Double, columnSpan: Double, row: Double, rowSpan: Double): ICellConfig = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnSpan = columnSpan.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowSpan = rowSpan.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICellConfig]
  }
}

