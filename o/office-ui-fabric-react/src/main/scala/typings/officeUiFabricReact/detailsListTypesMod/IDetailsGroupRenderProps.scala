package typings.officeUiFabricReact.detailsListTypesMod

import typings.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps
import typings.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typings.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps
import typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility
import typings.officeUiFabricReact.groupedListTypesMod.IGroup
import typings.officeUiFabricReact.groupedListTypesMod.IGroupRenderProps
import typings.react.mod._Global_.JSX.Element
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsGroupRenderProps extends IGroupRenderProps {
  @JSName("onRenderFooter")
  var onRenderFooter_IDetailsGroupRenderProps: js.UndefOr[IRenderFunction[IDetailsGroupDividerProps]] = js.undefined
  @JSName("onRenderHeader")
  var onRenderHeader_IDetailsGroupRenderProps: js.UndefOr[IRenderFunction[IDetailsGroupDividerProps]] = js.undefined
}

object IDetailsGroupRenderProps {
  @scala.inline
  def apply(
    collapseAllVisibility: CollapseAllVisibility = null,
    footerProps: IGroupFooterProps = null,
    getGroupItemLimit: /* group */ IGroup => Double = null,
    headerProps: IGroupHeaderProps = null,
    isAllGroupsCollapsed: js.UndefOr[Boolean] = js.undefined,
    onRenderFooter: (/* props */ js.UndefOr[IDetailsGroupDividerProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsGroupDividerProps], Element | Null]]) => Element | Null = null,
    onRenderHeader: (/* props */ js.UndefOr[IDetailsGroupDividerProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsGroupDividerProps], Element | Null]]) => Element | Null = null,
    onRenderShowAll: (/* props */ js.UndefOr[IGroupShowAllProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupShowAllProps], Element | Null]]) => Element | Null = null,
    onToggleCollapseAll: /* isAllCollapsed */ Boolean => Unit = null,
    role: String = null,
    showAllProps: IGroupShowAllProps = null,
    showEmptyGroups: js.UndefOr[Boolean] = js.undefined
  ): IDetailsGroupRenderProps = {
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
    __obj.asInstanceOf[IDetailsGroupRenderProps]
  }
}

