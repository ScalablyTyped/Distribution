package typings.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsToolbar> */
@js.native
trait PartialMUIDataTableTextLaDownloadCsv extends js.Object {
  var downloadCsv: js.UndefOr[String] = js.native
  var filterTable: js.UndefOr[String] = js.native
  var print: js.UndefOr[String] = js.native
  var search: js.UndefOr[String] = js.native
  var viewColumns: js.UndefOr[String] = js.native
}

object PartialMUIDataTableTextLaDownloadCsv {
  @scala.inline
  def apply(): PartialMUIDataTableTextLaDownloadCsv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLaDownloadCsv]
  }
  @scala.inline
  implicit class PartialMUIDataTableTextLaDownloadCsvOps[Self <: PartialMUIDataTableTextLaDownloadCsv] (val x: Self) extends AnyVal {
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
    def setDownloadCsv(value: String): Self = this.set("downloadCsv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadCsv: Self = this.set("downloadCsv", js.undefined)
    @scala.inline
    def setFilterTable(value: String): Self = this.set("filterTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterTable: Self = this.set("filterTable", js.undefined)
    @scala.inline
    def setPrint(value: String): Self = this.set("print", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setViewColumns(value: String): Self = this.set("viewColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewColumns: Self = this.set("viewColumns", js.undefined)
  }
  
}

