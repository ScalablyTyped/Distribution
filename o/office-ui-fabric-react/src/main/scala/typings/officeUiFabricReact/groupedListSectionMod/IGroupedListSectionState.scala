package typings.officeUiFabricReact.groupedListSectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroupedListSectionState extends js.Object {
  var isDropping: js.UndefOr[Boolean] = js.undefined
  var isSelected: js.UndefOr[Boolean] = js.undefined
}

object IGroupedListSectionState {
  @scala.inline
  def apply(isDropping: js.UndefOr[Boolean] = js.undefined, isSelected: js.UndefOr[Boolean] = js.undefined): IGroupedListSectionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDropping)) __obj.updateDynamic("isDropping")(isDropping.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupedListSectionState]
  }
}

