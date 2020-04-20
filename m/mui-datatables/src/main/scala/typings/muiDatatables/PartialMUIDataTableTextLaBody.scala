package typings.muiDatatables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabels> */
trait PartialMUIDataTableTextLaBody extends js.Object {
  var body: js.UndefOr[PartialMUIDataTableTextLa] = js.undefined
  var filter: js.UndefOr[PartialMUIDataTableTextLaAll] = js.undefined
  var pagination: js.UndefOr[PartialMUIDataTableTextLaDisplayRows] = js.undefined
  var selectedRows: js.UndefOr[PartialMUIDataTableTextLaDelete] = js.undefined
  var toolbar: js.UndefOr[PartialMUIDataTableTextLaDownloadCsv] = js.undefined
  var viewColumns: js.UndefOr[PartialMUIDataTableTextLaTitle] = js.undefined
}

object PartialMUIDataTableTextLaBody {
  @scala.inline
  def apply(
    body: PartialMUIDataTableTextLa = null,
    filter: PartialMUIDataTableTextLaAll = null,
    pagination: PartialMUIDataTableTextLaDisplayRows = null,
    selectedRows: PartialMUIDataTableTextLaDelete = null,
    toolbar: PartialMUIDataTableTextLaDownloadCsv = null,
    viewColumns: PartialMUIDataTableTextLaTitle = null
  ): PartialMUIDataTableTextLaBody = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (selectedRows != null) __obj.updateDynamic("selectedRows")(selectedRows.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (viewColumns != null) __obj.updateDynamic("viewColumns")(viewColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMUIDataTableTextLaBody]
  }
}

