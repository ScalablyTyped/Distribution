package typings.officeUiFabricReact.detailsHeaderTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsHeaderState extends js.Object {
  var columnResizeDetails: js.UndefOr[IColumnResizeDetails] = js.undefined
  var isAllCollapsed: js.UndefOr[Boolean] = js.undefined
  var isAllSelected: js.UndefOr[Boolean] = js.undefined
  var isSizing: js.UndefOr[Boolean] = js.undefined
}

object IDetailsHeaderState {
  @scala.inline
  def apply(
    columnResizeDetails: IColumnResizeDetails = null,
    isAllCollapsed: js.UndefOr[Boolean] = js.undefined,
    isAllSelected: js.UndefOr[Boolean] = js.undefined,
    isSizing: js.UndefOr[Boolean] = js.undefined
  ): IDetailsHeaderState = {
    val __obj = js.Dynamic.literal()
    if (columnResizeDetails != null) __obj.updateDynamic("columnResizeDetails")(columnResizeDetails.asInstanceOf[js.Any])
    if (!js.isUndefined(isAllCollapsed)) __obj.updateDynamic("isAllCollapsed")(isAllCollapsed.asInstanceOf[js.Any])
    if (!js.isUndefined(isAllSelected)) __obj.updateDynamic("isAllSelected")(isAllSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(isSizing)) __obj.updateDynamic("isSizing")(isSizing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsHeaderState]
  }
}

