package typings
package officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IGroupDividerProps extends js.Object {
  /** Boolean value to indicate if the component should render in compact mode. Set to false by default */
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[js.Object]] = js.undefined
  /** Props for expand/collapse button */
  var expandButtonProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLButtonElement]] = js.undefined
  /** Text to display for the group footer. */
  var footerText: js.UndefOr[java.lang.String] = js.undefined
  /** The group to be rendered by the header. */
  var group: js.UndefOr[IGroup] = js.undefined
  /** The index of the group. */
  var groupIndex: js.UndefOr[scala.Double] = js.undefined
  /** The indent level of the group. */
  var groupLevel: js.UndefOr[scala.Double] = js.undefined
  /** Stores parent group's children. */
  var groups: js.UndefOr[js.Array[IGroup]] = js.undefined
  /** Width corresponding to a single level. This is multiplied by the groupLevel to get the full spacer width for the group. */
  var indentWidth: js.UndefOr[scala.Double] = js.undefined
  /** Determines if the group selection check box is shown for collapsed groups. */
  var isCollapsedGroupSelectVisible: js.UndefOr[scala.Boolean] = js.undefined
  /** Callback to determine if a group has missing items and needs to load them from the server. */
  var isGroupLoading: js.UndefOr[js.Function1[/* group */ IGroup, scala.Boolean]] = js.undefined
  /**
       * Deprecated at v.65.1 and will be removed by v 1.0. Use `selected` instead.
       * @deprecated Use `selected` instead.
       */
  var isSelected: js.UndefOr[scala.Boolean] = js.undefined
  /** Text shown on group headers to indicate the group is being loaded. */
  var loadingText: js.UndefOr[java.lang.String] = js.undefined
  /** Callback for when the group header is clicked. */
  var onGroupHeaderClick: js.UndefOr[js.Function1[/* group */ IGroup, scala.Unit]] = js.undefined
  /** Override which allows the caller to provider a custom title. */
  var onRenderTitle: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IGroupDividerProps]] = js.undefined
  /** Callback for when the group is expanded or collapsed. */
  var onToggleCollapse: js.UndefOr[js.Function1[/* group */ IGroup, scala.Unit]] = js.undefined
  /** Callback for when the group is selected. */
  var onToggleSelectGroup: js.UndefOr[js.Function1[/* group */ IGroup, scala.Unit]] = js.undefined
  /** Callback for when the group "Show All" link is clicked */
  var onToggleSummarize: js.UndefOr[js.Function1[/* group */ IGroup, scala.Unit]] = js.undefined
  /** If all items in the group are selected. */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /** The selection mode of the list the group lives within. */
  var selectionMode: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.SelectionMode
  ] = js.undefined
  /** Text to display for the group "Show All" link. */
  var showAllLinkText: js.UndefOr[java.lang.String] = js.undefined
  /** A reference to the viewport in which the header is rendered. */
  var viewport: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesDecoratorsWithViewportMod.IViewport
  ] = js.undefined
}

