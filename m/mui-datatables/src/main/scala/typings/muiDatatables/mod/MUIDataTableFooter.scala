package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableFooter extends js.Object {
  var changePage: js.UndefOr[js.Any] = js.native
  var changeRowsPerPage: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var options: js.UndefOr[js.Object] = js.native
  var page: js.UndefOr[Double] = js.native
  var rowCount: js.UndefOr[Double] = js.native
  var rowsPerPage: js.UndefOr[Double] = js.native
}

object MUIDataTableFooter {
  @scala.inline
  def apply(): MUIDataTableFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableFooter]
  }
  @scala.inline
  implicit class MUIDataTableFooterOps[Self <: MUIDataTableFooter] (val x: Self) extends AnyVal {
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
    def setChangePage(value: js.Any): Self = this.set("changePage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangePage: Self = this.set("changePage", js.undefined)
    @scala.inline
    def setChangeRowsPerPage(value: /* args */ js.Any => _): Self = this.set("changeRowsPerPage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChangeRowsPerPage: Self = this.set("changeRowsPerPage", js.undefined)
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    @scala.inline
    def setRowsPerPage(value: Double): Self = this.set("rowsPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowsPerPage: Self = this.set("rowsPerPage", js.undefined)
  }
  
}

