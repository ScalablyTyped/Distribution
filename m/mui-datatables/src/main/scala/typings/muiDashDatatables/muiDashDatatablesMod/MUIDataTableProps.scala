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
    title: String | ReactNode,
    options: MUIDataTableOptions = null
  ): MUIDataTableProps = {
    val __obj = js.Dynamic.literal(columns = columns, data = data, title = title.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[MUIDataTableProps]
  }
}

