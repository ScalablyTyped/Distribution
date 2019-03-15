package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTablePagination extends js.Object {
  var count: scala.Double
  var options: js.Object
  var page: scala.Double
  var rowsPerPage: scala.Double
  def changeRowsPerPage(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any
}

object MUIDataTablePagination {
  @scala.inline
  def apply(
    changeRowsPerPage: js.Any => js.Any,
    count: scala.Double,
    options: js.Object,
    page: scala.Double,
    rowsPerPage: scala.Double
  ): MUIDataTablePagination = {
    val __obj = js.Dynamic.literal(changeRowsPerPage = js.Any.fromFunction1(changeRowsPerPage), count = count, options = options, page = page, rowsPerPage = rowsPerPage)
  
    __obj.asInstanceOf[MUIDataTablePagination]
  }
}

