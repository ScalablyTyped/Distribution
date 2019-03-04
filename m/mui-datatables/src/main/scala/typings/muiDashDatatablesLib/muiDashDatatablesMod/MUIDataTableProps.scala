package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableProps extends js.Object {
  var columns: js.Array[MUIDataTableColumnDef]
  var data: js.Array[_]
  var options: js.UndefOr[MUIDataTableOptions] = js.undefined
  var title: java.lang.String
}

object MUIDataTableProps {
  @scala.inline
  def apply(
    columns: js.Array[MUIDataTableColumnDef],
    data: js.Array[_],
    title: java.lang.String,
    options: MUIDataTableOptions = null
  ): MUIDataTableProps = {
    val __obj = js.Dynamic.literal(columns = columns, data = data, title = title)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[MUIDataTableProps]
  }
}

