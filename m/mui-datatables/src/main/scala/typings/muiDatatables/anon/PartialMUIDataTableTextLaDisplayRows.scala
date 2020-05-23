package typings.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsPagination> */
trait PartialMUIDataTableTextLaDisplayRows extends js.Object {
  var displayRows: js.UndefOr[String] = js.undefined
  var next: js.UndefOr[String] = js.undefined
  var previous: js.UndefOr[String] = js.undefined
  var rowsPerPage: js.UndefOr[String] = js.undefined
}

object PartialMUIDataTableTextLaDisplayRows {
  @scala.inline
  def apply(
    displayRows: String = null,
    next: String = null,
    previous: String = null,
    rowsPerPage: String = null
  ): PartialMUIDataTableTextLaDisplayRows = {
    val __obj = js.Dynamic.literal()
    if (displayRows != null) __obj.updateDynamic("displayRows")(displayRows.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    if (rowsPerPage != null) __obj.updateDynamic("rowsPerPage")(rowsPerPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMUIDataTableTextLaDisplayRows]
  }
}

