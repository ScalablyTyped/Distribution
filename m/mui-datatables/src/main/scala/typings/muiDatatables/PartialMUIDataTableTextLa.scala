package typings.muiDatatables

import typings.muiDatatables.mod.MUIDataTableTextLabelsBody
import typings.muiDatatables.mod.MUIDataTableTextLabelsFilter
import typings.muiDatatables.mod.MUIDataTableTextLabelsPagination
import typings.muiDatatables.mod.MUIDataTableTextLabelsSelectedRows
import typings.muiDatatables.mod.MUIDataTableTextLabelsToolbar
import typings.muiDatatables.mod.MUIDataTableTextLabelsViewColumns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabels> */
trait PartialMUIDataTableTextLa extends js.Object {
  var body: js.UndefOr[MUIDataTableTextLabelsBody] = js.undefined
  var filter: js.UndefOr[MUIDataTableTextLabelsFilter] = js.undefined
  var pagination: js.UndefOr[MUIDataTableTextLabelsPagination] = js.undefined
  var selectedRows: js.UndefOr[MUIDataTableTextLabelsSelectedRows] = js.undefined
  var toolbar: js.UndefOr[MUIDataTableTextLabelsToolbar] = js.undefined
  var viewColumns: js.UndefOr[MUIDataTableTextLabelsViewColumns] = js.undefined
}

object PartialMUIDataTableTextLa {
  @scala.inline
  def apply(
    body: MUIDataTableTextLabelsBody = null,
    filter: MUIDataTableTextLabelsFilter = null,
    pagination: MUIDataTableTextLabelsPagination = null,
    selectedRows: MUIDataTableTextLabelsSelectedRows = null,
    toolbar: MUIDataTableTextLabelsToolbar = null,
    viewColumns: MUIDataTableTextLabelsViewColumns = null
  ): PartialMUIDataTableTextLa = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (selectedRows != null) __obj.updateDynamic("selectedRows")(selectedRows.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (viewColumns != null) __obj.updateDynamic("viewColumns")(viewColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMUIDataTableTextLa]
  }
}

