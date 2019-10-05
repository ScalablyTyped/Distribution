package typings.atPhosphorDatagrid.atPhosphorDatagridMod

import typings.atPhosphorDatagrid.libDatagridMod.DataGrid.IOptions
import typings.atPhosphorDatagrid.libDatagridMod.DataGrid.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid", "DataGrid")
@js.native
/**
  * Construct a new data grid.
  *
  * @param options - The options for initializing the data grid.
  */
class DataGrid ()
  extends typings.atPhosphorDatagrid.libDatagridMod.DataGrid {
  def this(options: IOptions) = this()
}

@JSImport("@phosphor/datagrid", "DataGrid")
@js.native
object DataGrid extends js.Object {
  /**
    * The default theme for a data grid.
    */
  val defaultStyle: IStyle = js.native
}

