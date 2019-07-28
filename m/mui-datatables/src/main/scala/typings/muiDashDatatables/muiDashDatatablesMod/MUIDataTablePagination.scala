package typings.muiDashDatatables.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTablePagination extends js.Object {
  var count: Double
  var options: js.Object
  var page: Double
  var rowsPerPage: Double
  def changeRowsPerPage(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any
}

object MUIDataTablePagination {
  @scala.inline
  def apply(
    changeRowsPerPage: js.Any => js.Any,
    count: Double,
    options: js.Object,
    page: Double,
    rowsPerPage: Double
  ): MUIDataTablePagination = {
    val __obj = js.Dynamic.literal(changeRowsPerPage = js.Any.fromFunction1(changeRowsPerPage), count = count, options = options, page = page, rowsPerPage = rowsPerPage)
  
    __obj.asInstanceOf[MUIDataTablePagination]
  }
}

