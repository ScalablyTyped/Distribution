package typings
package officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IGroup extends js.Object {
  /**
       * Optional accessibility label (aria-label) attribute that will be stamped on to the element.
       * If none is specified, the arai-label attribute will contain the group name
       */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Nested groups, if any.
       */
  var children: js.UndefOr[js.Array[IGroup]] = js.undefined
  /**
       * How many items should be rendered within the group.
       */
  var count: scala.Double
  /**
       * Arbitrary data required to be preserved by the caller.
       */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
       * Optional flag to indicate the group has more data to load than the current group count indicated.
       * This can be used to indicate that a plus should be rendered next to the group count in the header.
       */
  var hasMoreData: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If all the items in the group are collapsed.
       */
  var isCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If drag/drop is enabled for the group header.
       */
  var isDropEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Deprecated at 1.0.0, selection state will be controled by the selection store only.
       * @deprecated
       */
  var isSelected: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If the items within the group are summarized or showing all.
       */
  var isShowingAll: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Unique identifier for the group.
       */
  var key: java.lang.String
  /**
       * Number indicating the level of nested groups.
       */
  var level: js.UndefOr[scala.Double] = js.undefined
  /**
       * Display name for the group, rendered on the header.
       */
  var name: java.lang.String
  /**
       * Start index for the group within the given items.
       */
  var startIndex: scala.Double
}

