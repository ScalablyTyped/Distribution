package typings
package atPhosphorWidgetsLib.libGridlayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/gridlayout", "GridLayout")
@js.native
/**
  * Construct a new grid layout.
  *
  * @param options - The options for initializing the layout.
  */
class GridLayout ()
  extends atPhosphorWidgetsLib.libLayoutMod.Layout {
  def this(options: atPhosphorWidgetsLib.libGridlayoutMod.GridLayoutNs.IOptions) = this()
  var _box: js.Any = js.native
  var _columnSizers: js.Any = js.native
  var _columnSpacing: js.Any = js.native
  var _columnStarts: js.Any = js.native
  var _dirty: js.Any = js.native
  var _items: js.Any = js.native
  var _rowSizers: js.Any = js.native
  var _rowSpacing: js.Any = js.native
  var _rowStarts: js.Any = js.native
  /**
    * Get the number of columns in the layout.
    */
  /**
    * Set the number of columns in the layout.
    *
    * #### Notes
    * The minimum column count is `1`.
    */
  var columnCount: scala.Double = js.native
  /**
    * Get the column spacing for the layout.
    */
  /**
    * Set the col spacing for the layout.
    */
  var columnSpacing: scala.Double = js.native
  /**
    * Get the number of rows in the layout.
    */
  /**
    * Set the number of rows in the layout.
    *
    * #### Notes
    * The minimum row count is `1`.
    */
  var rowCount: scala.Double = js.native
  /**
    * Get the row spacing for the layout.
    */
  /**
    * Set the row spacing for the layout.
    */
  var rowSpacing: scala.Double = js.native
  /**
    * Fit the layout to the total size required by the widgets.
    */
  /* private */ def _fit(): js.Any = js.native
  /**
    * Update the layout position and size of the widgets.
    *
    * The parent offset dimensions should be `-1` if unknown.
    */
  /* private */ def _update(offsetWidth: js.Any, offsetHeight: js.Any): js.Any = js.native
  /**
    * Add a widget to the grid layout.
    *
    * @param widget - The widget to add to the layout.
    *
    * #### Notes
    * If the widget is already contained in the layout, this is no-op.
    */
  def addWidget(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): scala.Unit = js.native
  /**
    * Attach a widget to the parent's DOM node.
    *
    * @param widget - The widget to attach to the parent.
    */
  /* protected */ def attachWidget(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): scala.Unit = js.native
  /**
    * Get the stretch factor for a specific column.
    *
    * @param index - The column index of interest.
    *
    * @returns The stretch factor for the column.
    *
    * #### Notes
    * This returns `-1` if the index is out of range.
    */
  def columnStretch(index: scala.Double): scala.Double = js.native
  /**
    * Detach a widget from the parent's DOM node.
    *
    * @param widget - The widget to detach from the parent.
    */
  /* protected */ def detachWidget(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): scala.Unit = js.native
  /**
    * Get the stretch factor for a specific row.
    *
    * @param index - The row index of interest.
    *
    * @returns The stretch factor for the row.
    *
    * #### Notes
    * This returns `-1` if the index is out of range.
    */
  def rowStretch(index: scala.Double): scala.Double = js.native
  /**
    * Set the stretch factor for a specific column.
    *
    * @param index - The column index of interest.
    *
    * @param value - The stretch factor for the column.
    *
    * #### Notes
    * This is a no-op if the index is out of range.
    */
  def setColumnStretch(index: scala.Double, value: scala.Double): scala.Unit = js.native
  /**
    * Set the stretch factor for a specific row.
    *
    * @param index - The row index of interest.
    *
    * @param value - The stretch factor for the row.
    *
    * #### Notes
    * This is a no-op if the index is out of range.
    */
  def setRowStretch(index: scala.Double, value: scala.Double): scala.Unit = js.native
}

