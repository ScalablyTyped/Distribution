package typings.muiDashDatatables.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableCustomHeadRenderer extends MUIDataTableColumn {
  var index: Double
}

object MUIDataTableCustomHeadRenderer {
  @scala.inline
  def apply(index: Double, name: String, label: String = null, options: MUIDataTableColumnOptions = null): MUIDataTableCustomHeadRenderer = {
    val __obj = js.Dynamic.literal(index = index, name = name)
    if (label != null) __obj.updateDynamic("label")(label)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[MUIDataTableCustomHeadRenderer]
  }
}

