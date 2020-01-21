package typings.officeUiFabricReact.detailsListBaseMod

import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsListState extends js.Object {
  var adjustedColumns: js.Array[IColumn]
  var focusedItemIndex: Double
  var isCollapsed: js.UndefOr[Boolean] = js.undefined
  var isDropping: js.UndefOr[Boolean] = js.undefined
  var isSizing: js.UndefOr[Boolean] = js.undefined
  var isSomeGroupExpanded: js.UndefOr[Boolean] = js.undefined
  var lastSelectionMode: js.UndefOr[SelectionMode] = js.undefined
  var lastWidth: js.UndefOr[Double] = js.undefined
}

object IDetailsListState {
  @scala.inline
  def apply(
    adjustedColumns: js.Array[IColumn],
    focusedItemIndex: Double,
    isCollapsed: js.UndefOr[Boolean] = js.undefined,
    isDropping: js.UndefOr[Boolean] = js.undefined,
    isSizing: js.UndefOr[Boolean] = js.undefined,
    isSomeGroupExpanded: js.UndefOr[Boolean] = js.undefined,
    lastSelectionMode: SelectionMode = null,
    lastWidth: Int | Double = null
  ): IDetailsListState = {
    val __obj = js.Dynamic.literal(adjustedColumns = adjustedColumns.asInstanceOf[js.Any], focusedItemIndex = focusedItemIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollapsed)) __obj.updateDynamic("isCollapsed")(isCollapsed.asInstanceOf[js.Any])
    if (!js.isUndefined(isDropping)) __obj.updateDynamic("isDropping")(isDropping.asInstanceOf[js.Any])
    if (!js.isUndefined(isSizing)) __obj.updateDynamic("isSizing")(isSizing.asInstanceOf[js.Any])
    if (!js.isUndefined(isSomeGroupExpanded)) __obj.updateDynamic("isSomeGroupExpanded")(isSomeGroupExpanded.asInstanceOf[js.Any])
    if (lastSelectionMode != null) __obj.updateDynamic("lastSelectionMode")(lastSelectionMode.asInstanceOf[js.Any])
    if (lastWidth != null) __obj.updateDynamic("lastWidth")(lastWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListState]
  }
}

