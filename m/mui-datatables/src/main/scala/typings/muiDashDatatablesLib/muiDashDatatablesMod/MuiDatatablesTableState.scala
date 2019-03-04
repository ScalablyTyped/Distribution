package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MuiDatatablesTableState extends js.Object {
  var filterList: js.Array[_]
  var page: scala.Double
  var rowsPerPage: scala.Double
}

object MuiDatatablesTableState {
  @scala.inline
  def apply(filterList: js.Array[_], page: scala.Double, rowsPerPage: scala.Double): MuiDatatablesTableState = {
    val __obj = js.Dynamic.literal(filterList = filterList, page = page, rowsPerPage = rowsPerPage)
  
    __obj.asInstanceOf[MuiDatatablesTableState]
  }
}

