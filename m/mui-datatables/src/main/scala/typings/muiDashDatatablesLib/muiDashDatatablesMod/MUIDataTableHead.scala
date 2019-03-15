package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableHead extends js.Object {
  var classes: js.UndefOr[js.Object] = js.undefined
  var columns: js.UndefOr[js.Array[MUIDataTableColumnDef]] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var data: js.UndefOr[js.Array[_]] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var page: js.UndefOr[js.Any] = js.undefined
  var selectedRows: js.UndefOr[js.Any] = js.undefined
  var setCellRef: js.UndefOr[js.Any] = js.undefined
}

object MUIDataTableHead {
  @scala.inline
  def apply(
    classes: js.Object = null,
    columns: js.Array[MUIDataTableColumnDef] = null,
    count: scala.Int | scala.Double = null,
    data: js.Array[_] = null,
    options: js.Object = null,
    page: js.Any = null,
    selectedRows: js.Any = null,
    setCellRef: js.Any = null
  ): MUIDataTableHead = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (options != null) __obj.updateDynamic("options")(options)
    if (page != null) __obj.updateDynamic("page")(page)
    if (selectedRows != null) __obj.updateDynamic("selectedRows")(selectedRows)
    if (setCellRef != null) __obj.updateDynamic("setCellRef")(setCellRef)
    __obj.asInstanceOf[MUIDataTableHead]
  }
}

