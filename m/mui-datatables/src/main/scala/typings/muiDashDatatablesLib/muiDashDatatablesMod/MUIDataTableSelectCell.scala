package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableSelectCell extends js.Object {
  var checked: scala.Boolean
  var classes: js.UndefOr[js.Object] = js.undefined
  var expandableOn: js.UndefOr[scala.Boolean] = js.undefined
  var fixedHeader: scala.Boolean
  var isHeaderCell: js.UndefOr[scala.Boolean] = js.undefined
  var isRowExpanded: js.UndefOr[scala.Boolean] = js.undefined
  var isRowSelectable: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var onExpand: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var otherProps: js.UndefOr[js.Any] = js.undefined
  var selectableOn: js.UndefOr[scala.Boolean] = js.undefined
}

object MUIDataTableSelectCell {
  @scala.inline
  def apply(
    checked: scala.Boolean,
    fixedHeader: scala.Boolean,
    classes: js.Object = null,
    expandableOn: js.UndefOr[scala.Boolean] = js.undefined,
    isHeaderCell: js.UndefOr[scala.Boolean] = js.undefined,
    isRowExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    isRowSelectable: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* args */ js.Any => _ = null,
    onExpand: /* args */ js.Any => _ = null,
    otherProps: js.Any = null,
    selectableOn: js.UndefOr[scala.Boolean] = js.undefined
  ): MUIDataTableSelectCell = {
    val __obj = js.Dynamic.literal(checked = checked, fixedHeader = fixedHeader)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(expandableOn)) __obj.updateDynamic("expandableOn")(expandableOn)
    if (!js.isUndefined(isHeaderCell)) __obj.updateDynamic("isHeaderCell")(isHeaderCell)
    if (!js.isUndefined(isRowExpanded)) __obj.updateDynamic("isRowExpanded")(isRowExpanded)
    if (!js.isUndefined(isRowSelectable)) __obj.updateDynamic("isRowSelectable")(isRowSelectable)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction1(onExpand))
    if (otherProps != null) __obj.updateDynamic("otherProps")(otherProps)
    if (!js.isUndefined(selectableOn)) __obj.updateDynamic("selectableOn")(selectableOn)
    __obj.asInstanceOf[MUIDataTableSelectCell]
  }
}

