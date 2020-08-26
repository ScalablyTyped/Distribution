package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTablePagination extends js.Object {
  var count: Double = js.native
  var options: js.Object = js.native
  var page: Double = js.native
  var rowsPerPage: Double = js.native
  def changeRowsPerPage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = js.native
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
    val __obj = js.Dynamic.literal(changeRowsPerPage = js.Any.fromFunction1(changeRowsPerPage), count = count.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], rowsPerPage = rowsPerPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTablePagination]
  }
  @scala.inline
  implicit class MUIDataTablePaginationOps[Self <: MUIDataTablePagination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChangeRowsPerPage(value: js.Any => js.Any): Self = this.set("changeRowsPerPage", js.Any.fromFunction1(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsPerPage(value: Double): Self = this.set("rowsPerPage", value.asInstanceOf[js.Any])
  }
  
}

