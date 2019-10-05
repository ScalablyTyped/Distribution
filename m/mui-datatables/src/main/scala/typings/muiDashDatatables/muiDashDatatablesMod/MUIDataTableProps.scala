package typings.muiDashDatatables.muiDashDatatablesMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableProps extends js.Object {
  var columns: js.Array[MUIDataTableColumnDef]
  var data: js.Array[js.Object | (js.Array[Double | String])]
  var options: js.UndefOr[MUIDataTableOptions] = js.undefined
  var title: String | ReactNode
}

object MUIDataTableProps {
  @scala.inline
  def apply(
    columns: js.Array[MUIDataTableColumnDef],
    data: js.Array[js.Object | (js.Array[Double | String])],
    options: MUIDataTableOptions = null,
    title: String | ReactNode = null
  ): MUIDataTableProps = {
    val __obj = js.Dynamic.literal(columns = columns, data = data)
    if (options != null) __obj.updateDynamic("options")(options)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableProps]
  }
}

