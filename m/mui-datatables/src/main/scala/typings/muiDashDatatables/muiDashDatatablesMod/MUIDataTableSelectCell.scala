package typings.muiDashDatatables.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableSelectCell extends js.Object {
  var checked: Boolean
  var classes: js.UndefOr[js.Object] = js.undefined
  var expandableOn: js.UndefOr[Boolean] = js.undefined
  var fixedHeader: Boolean
  var isHeaderCell: js.UndefOr[Boolean] = js.undefined
  var isRowExpanded: js.UndefOr[Boolean] = js.undefined
  var isRowSelectable: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var onExpand: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var otherProps: js.UndefOr[js.Any] = js.undefined
  var selectableOn: js.UndefOr[Boolean] = js.undefined
}

object MUIDataTableSelectCell {
  @scala.inline
  def apply(
    checked: Boolean,
    fixedHeader: Boolean,
    classes: js.Object = null,
    expandableOn: js.UndefOr[Boolean] = js.undefined,
    isHeaderCell: js.UndefOr[Boolean] = js.undefined,
    isRowExpanded: js.UndefOr[Boolean] = js.undefined,
    isRowSelectable: js.UndefOr[Boolean] = js.undefined,
    onChange: /* args */ js.Any => _ = null,
    onExpand: /* args */ js.Any => _ = null,
    otherProps: js.Any = null,
    selectableOn: js.UndefOr[Boolean] = js.undefined
  ): MUIDataTableSelectCell = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], fixedHeader = fixedHeader.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(expandableOn)) __obj.updateDynamic("expandableOn")(expandableOn.asInstanceOf[js.Any])
    if (!js.isUndefined(isHeaderCell)) __obj.updateDynamic("isHeaderCell")(isHeaderCell.asInstanceOf[js.Any])
    if (!js.isUndefined(isRowExpanded)) __obj.updateDynamic("isRowExpanded")(isRowExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(isRowSelectable)) __obj.updateDynamic("isRowSelectable")(isRowSelectable.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction1(onExpand))
    if (otherProps != null) __obj.updateDynamic("otherProps")(otherProps.asInstanceOf[js.Any])
    if (!js.isUndefined(selectableOn)) __obj.updateDynamic("selectableOn")(selectableOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableSelectCell]
  }
}

