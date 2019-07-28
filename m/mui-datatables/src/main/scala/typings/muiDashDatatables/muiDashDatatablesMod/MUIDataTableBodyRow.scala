package typings.muiDashDatatables.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableBodyRow extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[js.Object] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var options: js.Object
  var rowSelected: js.UndefOr[Boolean] = js.undefined
}

object MUIDataTableBodyRow {
  @scala.inline
  def apply(
    options: js.Object,
    className: String = null,
    classes: js.Object = null,
    onClick: /* args */ js.Any => _ = null,
    rowSelected: js.UndefOr[Boolean] = js.undefined
  ): MUIDataTableBodyRow = {
    val __obj = js.Dynamic.literal(options = options)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(rowSelected)) __obj.updateDynamic("rowSelected")(rowSelected)
    __obj.asInstanceOf[MUIDataTableBodyRow]
  }
}

