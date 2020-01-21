package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableCustomHeadRenderer extends MUIDataTableColumn {
  var index: Double
}

object MUIDataTableCustomHeadRenderer {
  @scala.inline
  def apply(index: Double, name: String, label: String = null, options: MUIDataTableColumnOptions = null): MUIDataTableCustomHeadRenderer = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableCustomHeadRenderer]
  }
}

