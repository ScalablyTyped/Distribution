package typings.atPhosphorDatagrid.atPhosphorDatagridMod

import typings.atPhosphorDatagrid.libCellrendererMod.CellRendererNs.ConfigOption
import typings.atPhosphorDatagrid.libCellrendererMod.CellRendererNs.ICellConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid", "CellRenderer")
@js.native
object CellRendererNs extends js.Object {
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

