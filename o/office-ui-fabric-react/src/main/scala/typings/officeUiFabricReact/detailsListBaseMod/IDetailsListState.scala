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
    lastWidth: js.UndefOr[Double] = js.undefined
  ): IDetailsListState = {
    val __obj = js.Dynamic.literal(adjustedColumns = adjustedColumns.asInstanceOf[js.Any], focusedItemIndex = focusedItemIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollapsed)) __obj.updateDynamic("isCollapsed")(isCollapsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDropping)) __obj.updateDynamic("isDropping")(isDropping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSizing)) __obj.updateDynamic("isSizing")(isSizing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSomeGroupExpanded)) __obj.updateDynamic("isSomeGroupExpanded")(isSomeGroupExpanded.get.asInstanceOf[js.Any])
    if (lastSelectionMode != null) __obj.updateDynamic("lastSelectionMode")(lastSelectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(lastWidth)) __obj.updateDynamic("lastWidth")(lastWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListState]
  }
}

