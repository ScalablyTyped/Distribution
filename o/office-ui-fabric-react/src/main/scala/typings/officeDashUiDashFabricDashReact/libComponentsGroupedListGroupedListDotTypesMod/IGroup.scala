package typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroup extends js.Object {
  /**
    * Optional accessibility label (aria-label) attribute that will be stamped on to the element.
    * If none is specified, the arai-label attribute will contain the group name
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Nested groups, if any.
    */
  var children: js.UndefOr[js.Array[IGroup]] = js.undefined
  /**
    * How many items should be rendered within the group.
    */
  var count: Double
  /**
    * Arbitrary data required to be preserved by the caller.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * Optional flag to indicate the group has more data to load than the current group count indicated.
    * This can be used to indicate that a plus should be rendered next to the group count in the header.
    */
  var hasMoreData: js.UndefOr[Boolean] = js.undefined
  /**
    * If all the items in the group are collapsed.
    */
  var isCollapsed: js.UndefOr[Boolean] = js.undefined
  /**
    * If drag/drop is enabled for the group header.
    */
  var isDropEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Deprecated at 1.0.0, selection state will be controled by the selection store only.
    * @deprecated At 1.0.0, selection state wil be controlled by the selection store only.
    */
  var isSelected: js.UndefOr[Boolean] = js.undefined
  /**
    * If the items within the group are summarized or showing all.
    */
  var isShowingAll: js.UndefOr[Boolean] = js.undefined
  /**
    * Unique identifier for the group.
    */
  var key: String
  /**
    * Number indicating the level of nested groups.
    */
  var level: js.UndefOr[Double] = js.undefined
  /**
    * Display name for the group, rendered on the header.
    */
  var name: String
  /**
    * Start index for the group within the given items.
    */
  var startIndex: Double
}

object IGroup {
  @scala.inline
  def apply(
    count: Double,
    key: String,
    name: String,
    startIndex: Double,
    ariaLabel: String = null,
    children: js.Array[IGroup] = null,
    data: js.Any = null,
    hasMoreData: js.UndefOr[Boolean] = js.undefined,
    isCollapsed: js.UndefOr[Boolean] = js.undefined,
    isDropEnabled: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    isShowingAll: js.UndefOr[Boolean] = js.undefined,
    level: Int | Double = null
  ): IGroup = {
    val __obj = js.Dynamic.literal(count = count, key = key, name = name, startIndex = startIndex)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (children != null) __obj.updateDynamic("children")(children)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(hasMoreData)) __obj.updateDynamic("hasMoreData")(hasMoreData)
    if (!js.isUndefined(isCollapsed)) __obj.updateDynamic("isCollapsed")(isCollapsed)
    if (!js.isUndefined(isDropEnabled)) __obj.updateDynamic("isDropEnabled")(isDropEnabled)
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    if (!js.isUndefined(isShowingAll)) __obj.updateDynamic("isShowingAll")(isShowingAll)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroup]
  }
}

