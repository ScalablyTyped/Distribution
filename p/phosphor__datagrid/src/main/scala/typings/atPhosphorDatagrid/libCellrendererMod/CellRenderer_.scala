package typings.atPhosphorDatagrid.libCellrendererMod

import typings.atPhosphorDatagrid.libCellrendererMod.CellRenderer.ICellConfig
import typings.atPhosphorDatagrid.libCellrendererMod.CellRenderer.IColumnConfig
import typings.atPhosphorDatagrid.libGraphicscontextMod.GraphicsContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/cellrenderer", "CellRenderer")
@js.native
abstract class CellRenderer_ () extends js.Object {
  /**
    * Paint the content for a cell.
    *
    * @param gc - The graphics context to use for drawing.
    *
    * @param config - The configuration data for the cell.
    *
    * #### Notes
    * The grid will save/restore the `gc` state before/after invoking
    * the renderer.
    *
    * For performance, the cell content is efficiently clipped to the
    * width of the column, but *the height is not clipped*. If height
    * clipping is needed, the renderer must set up its own clip rect.
    *
    * The renderer **must not** draw outside the cell bounding height.
    */
  def paint(gc: GraphicsContext, config: ICellConfig): Unit = js.native
  /**
    * Prepare the graphics context for drawing a column of cells.
    *
    * @param gc - The graphics context to prepare.
    *
    * @param config - The configuration data for the column.
    *
    * #### Notes
    * This method is called just before the grid renders the cells in
    * a column. It allows the renderer an opportunity to set defaults
    * on the `gc` or pre-compute column render state. This can reduce
    * the need for costly `gc` state changes when painting each cell.
    *
    * The renderer **must not** draw to the `gc` in this method.
    *
    * The default implementation is a no-op.
    */
  def prepare(gc: GraphicsContext, config: IColumnConfig): Unit = js.native
}

