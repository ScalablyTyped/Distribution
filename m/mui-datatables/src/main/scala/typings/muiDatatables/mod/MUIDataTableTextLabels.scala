package typings.muiDatatables.mod

import typings.muiDatatables.anon.PartialMUIDataTableTextLa
import typings.muiDatatables.anon.PartialMUIDataTableTextLaAll
import typings.muiDatatables.anon.PartialMUIDataTableTextLaDelete
import typings.muiDatatables.anon.PartialMUIDataTableTextLaDisplayRows
import typings.muiDatatables.anon.PartialMUIDataTableTextLaDownloadCsv
import typings.muiDatatables.anon.PartialMUIDataTableTextLaTitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableTextLabels extends js.Object {
  var body: PartialMUIDataTableTextLa = js.native
  var filter: PartialMUIDataTableTextLaAll = js.native
  var pagination: PartialMUIDataTableTextLaDisplayRows = js.native
  var selectedRows: PartialMUIDataTableTextLaDelete = js.native
  var toolbar: PartialMUIDataTableTextLaDownloadCsv = js.native
  var viewColumns: PartialMUIDataTableTextLaTitle = js.native
}

object MUIDataTableTextLabels {
  @scala.inline
  def apply(
    body: PartialMUIDataTableTextLa,
    filter: PartialMUIDataTableTextLaAll,
    pagination: PartialMUIDataTableTextLaDisplayRows,
    selectedRows: PartialMUIDataTableTextLaDelete,
    toolbar: PartialMUIDataTableTextLaDownloadCsv,
    viewColumns: PartialMUIDataTableTextLaTitle
  ): MUIDataTableTextLabels = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any], selectedRows = selectedRows.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any], viewColumns = viewColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabels]
  }
  @scala.inline
  implicit class MUIDataTableTextLabelsOps[Self <: MUIDataTableTextLabels] (val x: Self) extends AnyVal {
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
    def setBody(value: PartialMUIDataTableTextLa): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: PartialMUIDataTableTextLaAll): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagination(value: PartialMUIDataTableTextLaDisplayRows): Self = this.set("pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedRows(value: PartialMUIDataTableTextLaDelete): Self = this.set("selectedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolbar(value: PartialMUIDataTableTextLaDownloadCsv): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewColumns(value: PartialMUIDataTableTextLaTitle): Self = this.set("viewColumns", value.asInstanceOf[js.Any])
  }
  
}

