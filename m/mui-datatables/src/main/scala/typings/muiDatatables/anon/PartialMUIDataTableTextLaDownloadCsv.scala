package typings.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsToolbar> */
trait PartialMUIDataTableTextLaDownloadCsv extends js.Object {
  var downloadCsv: js.UndefOr[String] = js.undefined
  var filterTable: js.UndefOr[String] = js.undefined
  var print: js.UndefOr[String] = js.undefined
  var search: js.UndefOr[String] = js.undefined
  var viewColumns: js.UndefOr[String] = js.undefined
}

object PartialMUIDataTableTextLaDownloadCsv {
  @scala.inline
  def apply(
    downloadCsv: String = null,
    filterTable: String = null,
    print: String = null,
    search: String = null,
    viewColumns: String = null
  ): PartialMUIDataTableTextLaDownloadCsv = {
    val __obj = js.Dynamic.literal()
    if (downloadCsv != null) __obj.updateDynamic("downloadCsv")(downloadCsv.asInstanceOf[js.Any])
    if (filterTable != null) __obj.updateDynamic("filterTable")(filterTable.asInstanceOf[js.Any])
    if (print != null) __obj.updateDynamic("print")(print.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (viewColumns != null) __obj.updateDynamic("viewColumns")(viewColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMUIDataTableTextLaDownloadCsv]
  }
}

