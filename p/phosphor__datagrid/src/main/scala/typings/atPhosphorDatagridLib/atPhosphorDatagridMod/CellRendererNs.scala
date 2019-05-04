package typings
package atPhosphorDatagridLib.atPhosphorDatagridMod

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
  def resolveOption[T](
    option: atPhosphorDatagridLib.libCellrendererMod.CellRendererNs.ConfigOption[T],
    config: atPhosphorDatagridLib.libCellrendererMod.CellRendererNs.ICellConfig
  ): T = js.native
}

