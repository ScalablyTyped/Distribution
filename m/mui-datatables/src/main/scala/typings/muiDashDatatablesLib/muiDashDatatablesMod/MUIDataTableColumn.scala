package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableColumn extends js.Object {
  var label: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var options: js.UndefOr[MUIDataTableColumnOptions] = js.undefined
}

object MUIDataTableColumn {
  @scala.inline
  def apply(name: java.lang.String, label: java.lang.String = null, options: MUIDataTableColumnOptions = null): MUIDataTableColumn = {
    val __obj = js.Dynamic.literal(name = name)
    if (label != null) __obj.updateDynamic("label")(label)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[MUIDataTableColumn]
  }
}

