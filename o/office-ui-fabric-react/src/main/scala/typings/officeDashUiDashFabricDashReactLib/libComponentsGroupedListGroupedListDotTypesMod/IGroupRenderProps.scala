package typings
package officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IGroupRenderProps extends js.Object {
  /**
       * Flag to indicate whether to ignore the collapsing icon on header.
       * @defaultvalue CheckboxVisibility.visible
       */
  var collapseAllVisibility: js.UndefOr[CollapseAllVisibility] = js.undefined
  /** Information to pass in to the group footer. */
  var footerProps: js.UndefOr[IGroupDividerProps] = js.undefined
  /** Grouping item limit. */
  var getGroupItemLimit: js.UndefOr[js.Function1[/* group */ IGroup, scala.Double]] = js.undefined
  /** Information to pass in to the group header. */
  var headerProps: js.UndefOr[IGroupDividerProps] = js.undefined
  /** Boolean indicating if all groups are in collapsed state. */
  var isAllGroupsCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Override which allows the caller to provide a custom footer.
       */
  var onRenderFooter: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IGroupDividerProps]] = js.undefined
  /**
       * Override which allows the caller to provide a custom header.
       */
  var onRenderHeader: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IGroupDividerProps]] = js.undefined
  /**
       * Override which allows the caller to provide a custom Show All link.
       */
  var onRenderShowAll: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IGroupDividerProps]] = js.undefined
  /** Callback for when all groups are expanded or collapsed. */
  var onToggleCollapseAll: js.UndefOr[js.Function1[/* isAllCollapsed */ scala.Boolean, scala.Unit]] = js.undefined
  /** Information to pass in to the group Show all footer. */
  var showAllProps: js.UndefOr[IGroupDividerProps] = js.undefined
  /**
       * Boolean indicating if empty groups are shown
       * @defaultvalue false
       */
  var showEmptyGroups: js.UndefOr[scala.Boolean] = js.undefined
}

