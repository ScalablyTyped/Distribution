package typings.officeUiFabricReact.groupedListTypesMod

import typings.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps
import typings.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typings.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps
import typings.react.mod.global.JSX.Element
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupRenderProps extends js.Object {
  /**
    * Flag to indicate whether to ignore the collapsing icon on header.
    * @defaultvalue CollapseAllVisibility.visible
    */
  var collapseAllVisibility: js.UndefOr[CollapseAllVisibility] = js.native
  /** Information to pass in to the group footer. */
  var footerProps: js.UndefOr[IGroupFooterProps] = js.native
  /** Grouping item limit. */
  var getGroupItemLimit: js.UndefOr[js.Function1[/* group */ IGroup, Double]] = js.native
  /** Information to pass in to the group header. */
  var headerProps: js.UndefOr[IGroupHeaderProps] = js.native
  /** Boolean indicating if all groups are in collapsed state. */
  var isAllGroupsCollapsed: js.UndefOr[Boolean] = js.native
  /**
    * Override which allows the caller to provide a custom footer.
    */
  var onRenderFooter: js.UndefOr[IRenderFunction[IGroupFooterProps]] = js.native
  /**
    * Override which allows the caller to provide a custom header.
    */
  var onRenderHeader: js.UndefOr[IRenderFunction[IGroupHeaderProps]] = js.native
  /**
    * Override which allows the caller to provide a custom Show All link.
    */
  var onRenderShowAll: js.UndefOr[IRenderFunction[IGroupShowAllProps]] = js.native
  /** Callback for when all groups are expanded or collapsed. */
  var onToggleCollapseAll: js.UndefOr[js.Function1[/* isAllCollapsed */ Boolean, Unit]] = js.native
  /**
    * Override which allows the caller to provide a custom aria role
    */
  var role: js.UndefOr[String] = js.native
  /** Information to pass in to the group Show all footer. */
  var showAllProps: js.UndefOr[IGroupShowAllProps] = js.native
  /**
    * Boolean indicating if empty groups are shown
    * @defaultvalue false
    */
  var showEmptyGroups: js.UndefOr[Boolean] = js.native
}

object IGroupRenderProps {
  @scala.inline
  def apply(): IGroupRenderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupRenderProps]
  }
  @scala.inline
  implicit class IGroupRenderPropsOps[Self <: IGroupRenderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollapseAllVisibility(value: CollapseAllVisibility): Self = this.set("collapseAllVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseAllVisibility: Self = this.set("collapseAllVisibility", js.undefined)
    @scala.inline
    def setFooterProps(value: IGroupFooterProps): Self = this.set("footerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterProps: Self = this.set("footerProps", js.undefined)
    @scala.inline
    def setGetGroupItemLimit(value: /* group */ IGroup => Double): Self = this.set("getGroupItemLimit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetGroupItemLimit: Self = this.set("getGroupItemLimit", js.undefined)
    @scala.inline
    def setHeaderProps(value: IGroupHeaderProps): Self = this.set("headerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderProps: Self = this.set("headerProps", js.undefined)
    @scala.inline
    def setIsAllGroupsCollapsed(value: Boolean): Self = this.set("isAllGroupsCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAllGroupsCollapsed: Self = this.set("isAllGroupsCollapsed", js.undefined)
    @scala.inline
    def setOnRenderFooter(
      value: (/* props */ js.UndefOr[IGroupFooterProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupFooterProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderFooter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderFooter: Self = this.set("onRenderFooter", js.undefined)
    @scala.inline
    def setOnRenderHeader(
      value: (/* props */ js.UndefOr[IGroupHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderHeader", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderHeader: Self = this.set("onRenderHeader", js.undefined)
    @scala.inline
    def setOnRenderShowAll(
      value: (/* props */ js.UndefOr[IGroupShowAllProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupShowAllProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderShowAll", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderShowAll: Self = this.set("onRenderShowAll", js.undefined)
    @scala.inline
    def setOnToggleCollapseAll(value: /* isAllCollapsed */ Boolean => Unit): Self = this.set("onToggleCollapseAll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnToggleCollapseAll: Self = this.set("onToggleCollapseAll", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setShowAllProps(value: IGroupShowAllProps): Self = this.set("showAllProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAllProps: Self = this.set("showAllProps", js.undefined)
    @scala.inline
    def setShowEmptyGroups(value: Boolean): Self = this.set("showEmptyGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowEmptyGroups: Self = this.set("showEmptyGroups", js.undefined)
  }
  
}

