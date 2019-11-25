package typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotBaseMod

import typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode
import typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroupedListState extends js.Object {
  var groups: js.UndefOr[js.Array[IGroup]] = js.undefined
  var lastSelectionMode: js.UndefOr[SelectionMode] = js.undefined
  var lastWidth: js.UndefOr[Double] = js.undefined
}

object IGroupedListState {
  @scala.inline
  def apply(
    groups: js.Array[IGroup] = null,
    lastSelectionMode: SelectionMode = null,
    lastWidth: Int | Double = null
  ): IGroupedListState = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (lastSelectionMode != null) __obj.updateDynamic("lastSelectionMode")(lastSelectionMode.asInstanceOf[js.Any])
    if (lastWidth != null) __obj.updateDynamic("lastWidth")(lastWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupedListState]
  }
}

