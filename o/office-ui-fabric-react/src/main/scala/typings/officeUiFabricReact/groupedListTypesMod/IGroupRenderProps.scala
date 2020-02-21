package typings.officeUiFabricReact.groupedListTypesMod

import typings.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps
import typings.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typings.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps
import typings.react.mod._Global_.JSX.Element
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroupRenderProps extends js.Object {
  /**
    * Flag to indicate whether to ignore the collapsing icon on header.
    * @defaultvalue CollapseAllVisibility.visible
    */
  var collapseAllVisibility: js.UndefOr[CollapseAllVisibility] = js.undefined
  /** Information to pass in to the group footer. */
  var footerProps: js.UndefOr[IGroupFooterProps] = js.undefined
  /** Grouping item limit. */
  var getGroupItemLimit: js.UndefOr[js.Function1[/* group */ IGroup, Double]] = js.undefined
  /** Information to pass in to the group header. */
  var headerProps: js.UndefOr[IGroupHeaderProps] = js.undefined
  /** Boolean indicating if all groups are in collapsed state. */
  var isAllGroupsCollapsed: js.UndefOr[Boolean] = js.undefined
  /**
    * Override which allows the caller to provide a custom footer.
    */
  var onRenderFooter: js.UndefOr[IRenderFunction[IGroupFooterProps]] = js.undefined
  /**
    * Override which allows the caller to provide a custom header.
    */
  var onRenderHeader: js.UndefOr[IRenderFunction[IGroupHeaderProps]] = js.undefined
  /**
    * Override which allows the caller to provide a custom Show All link.
    */
  var onRenderShowAll: js.UndefOr[IRenderFunction[IGroupShowAllProps]] = js.undefined
  /** Callback for when all groups are expanded or collapsed. */
  var onToggleCollapseAll: js.UndefOr[js.Function1[/* isAllCollapsed */ Boolean, Unit]] = js.undefined
  /**
    * Override which allows the caller to provide a custom aria role
    */
  var role: js.UndefOr[String] = js.undefined
  /** Information to pass in to the group Show all footer. */
  var showAllProps: js.UndefOr[IGroupShowAllProps] = js.undefined
  /**
    * Boolean indicating if empty groups are shown
    * @defaultvalue false
    */
  var showEmptyGroups: js.UndefOr[Boolean] = js.undefined
}

object IGroupRenderProps {
  @scala.inline
  def apply(
    collapseAllVisibility: CollapseAllVisibility = null,
    footerProps: IGroupFooterProps = null,
    getGroupItemLimit: /* group */ IGroup => Double = null,
    headerProps: IGroupHeaderProps = null,
    isAllGroupsCollapsed: js.UndefOr[Boolean] = js.undefined,
    onRenderFooter: (/* props */ js.UndefOr[IGroupFooterProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupFooterProps], Element | Null]]) => Element | Null = null,
    onRenderHeader: (/* props */ js.UndefOr[IGroupHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderProps], Element | Null]]) => Element | Null = null,
    onRenderShowAll: (/* props */ js.UndefOr[IGroupShowAllProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupShowAllProps], Element | Null]]) => Element | Null = null,
    onToggleCollapseAll: /* isAllCollapsed */ Boolean => Unit = null,
    role: String = null,
    showAllProps: IGroupShowAllProps = null,
    showEmptyGroups: js.UndefOr[Boolean] = js.undefined
  ): IGroupRenderProps = {
    val __obj = js.Dynamic.literal()
    if (collapseAllVisibility != null) __obj.updateDynamic("collapseAllVisibility")(collapseAllVisibility.asInstanceOf[js.Any])
    if (footerProps != null) __obj.updateDynamic("footerProps")(footerProps.asInstanceOf[js.Any])
    if (getGroupItemLimit != null) __obj.updateDynamic("getGroupItemLimit")(js.Any.fromFunction1(getGroupItemLimit))
    if (headerProps != null) __obj.updateDynamic("headerProps")(headerProps.asInstanceOf[js.Any])
    if (!js.isUndefined(isAllGroupsCollapsed)) __obj.updateDynamic("isAllGroupsCollapsed")(isAllGroupsCollapsed.asInstanceOf[js.Any])
    if (onRenderFooter != null) __obj.updateDynamic("onRenderFooter")(js.Any.fromFunction2(onRenderFooter))
    if (onRenderHeader != null) __obj.updateDynamic("onRenderHeader")(js.Any.fromFunction2(onRenderHeader))
    if (onRenderShowAll != null) __obj.updateDynamic("onRenderShowAll")(js.Any.fromFunction2(onRenderShowAll))
    if (onToggleCollapseAll != null) __obj.updateDynamic("onToggleCollapseAll")(js.Any.fromFunction1(onToggleCollapseAll))
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (showAllProps != null) __obj.updateDynamic("showAllProps")(showAllProps.asInstanceOf[js.Any])
    if (!js.isUndefined(showEmptyGroups)) __obj.updateDynamic("showEmptyGroups")(showEmptyGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupRenderProps]
  }
}

