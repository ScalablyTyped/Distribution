package typings.atPhosphorDatagrid.atPhosphorDatagridMod

import typings.atPhosphorDatagrid.libCellrendererMod.CellRenderer.ConfigOption
import typings.atPhosphorDatagrid.libCellrendererMod.CellRenderer.ICellConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid", "CellRenderer")
@js.native
abstract class CellRenderer ()
  extends typings.atPhosphorDatagrid.libCellrendererMod.CellRenderer

@JSImport("@phosphor/datagrid", "CellRenderer")
@js.native
object CellRenderer extends js.Object {
  /**
    * Resolve a config option for a cell renderer.
    *
    * @param option - The config option to resolve.
    *
    * @param config - The cell config object.
    *
    * @returns The resolved value for the option.
    */
  def resolveOption[T](option: ConfigOption[T], config: ICellConfig): T = js.native
}

