package typings.muiDashDatatables.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableResize extends js.Object {
  var classes: js.UndefOr[js.Object] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var rowSelected: js.UndefOr[Boolean] = js.undefined
  var setResizeable: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var updateDividers: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
}

object MUIDataTableResize {
  @scala.inline
  def apply(
    classes: js.Object = null,
    options: js.Object = null,
    rowSelected: js.UndefOr[Boolean] = js.undefined,
    setResizeable: /* args */ js.Any => _ = null,
    updateDividers: /* args */ js.Any => _ = null
  ): MUIDataTableResize = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(rowSelected)) __obj.updateDynamic("rowSelected")(rowSelected)
    if (setResizeable != null) __obj.updateDynamic("setResizeable")(js.Any.fromFunction1(setResizeable))
    if (updateDividers != null) __obj.updateDynamic("updateDividers")(js.Any.fromFunction1(updateDividers))
    __obj.asInstanceOf[MUIDataTableResize]
  }
}

