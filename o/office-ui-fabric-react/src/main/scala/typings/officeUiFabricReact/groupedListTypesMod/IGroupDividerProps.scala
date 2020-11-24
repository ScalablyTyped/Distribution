package typings.officeUiFabricReact.groupedListTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typings.officeUiFabricReact.withViewportMod.IViewport
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGroupDividerProps extends js.Object {
  
  /** Defines the number of columns a group header needs to span in the case of a grid or treegrid */
  var ariaColSpan: js.UndefOr[Double] = js.native
  
  /** Custom className */
  var className: js.UndefOr[String] = js.native
  
  /** Boolean value to indicate if the component should render in compact mode. Set to false by default */
  var compact: js.UndefOr[Boolean] = js.native
  
  var componentRef: js.UndefOr[IRefObject[js.Object]] = js.native
  
  /** Props for expand/collapse button
    * @deprecated Use {@link IGroupHeaderProps.expandButtonProps} instead.
    */
  var expandButtonProps: js.UndefOr[HTMLAttributes[HTMLButtonElement]] = js.native
  
  /** Text to display for the group footer. */
  var footerText: js.UndefOr[String] = js.native
  
  /** The group to be rendered by the header. */
  var group: js.UndefOr[IGroup] = js.native
  
  /** The index of the group. */
  var groupIndex: js.UndefOr[Double] = js.native
  
  /** The indent level of the group. */
  var groupLevel: js.UndefOr[Double] = js.native
  
  /** Stores parent group's children. */
  var groups: js.UndefOr[js.Array[IGroup]] = js.native
  
  /**
    * Width corresponding to a single level.
    * This is multiplied by the groupLevel to get the full spacer width for the group.
    */
  var indentWidth: js.UndefOr[Double] = js.native
  
  /** Determines if the group selection check box is shown for collapsed groups. */
  var isCollapsedGroupSelectVisible: js.UndefOr[Boolean] = js.native
  
  /** Callback to determine if a group has missing items and needs to load them from the server. */
  var isGroupLoading: js.UndefOr[js.Function1[/* group */ IGroup, Boolean]] = js.native
  
  /**
    * Deprecated at v.65.1 and will be removed by v 1.0. Use `selected` instead.
    * @deprecated Use `selected` instead.
    */
  var isSelected: js.UndefOr[Boolean] = js.native
  
  /** Text shown on group headers to indicate the group is being loaded. */
  var loadingText: js.UndefOr[String] = js.native
  
  /** Callback for when the group header is clicked. */
  var onGroupHeaderClick: js.UndefOr[js.Function1[/* group */ IGroup, Unit]] = js.native
  
  /** Callback for when the "keyup" event is fired on the group header . */
  var onGroupHeaderKeyUp: js.UndefOr[js.Function2[/* ev */ KeyboardEvent[HTMLElement], /* group */ IGroup, Unit]] = js.native
  
  /** Override which allows the caller to provider a custom renderer for the GroupHeader title. */
  var onRenderTitle: js.UndefOr[IRenderFunction[IGroupHeaderProps]] = js.native
  
  /** Callback for when the group is expanded or collapsed. */
  var onToggleCollapse: js.UndefOr[js.Function1[/* group */ IGroup, Unit]] = js.native
  
  /** Callback for when the group is selected. */
  var onToggleSelectGroup: js.UndefOr[js.Function1[/* group */ IGroup, Unit]] = js.native
  
  /** Callback for when the group "Show All" link is clicked */
  var onToggleSummarize: js.UndefOr[js.Function1[/* group */ IGroup, Unit]] = js.native
  
  /** If all items in the group are selected. */
  var selected: js.UndefOr[Boolean] = js.native
  
  /** The selection mode of the list the group lives within. */
  var selectionMode: js.UndefOr[SelectionMode] = js.native
  
  /** Text to display for the group "Show All" link. */
  var showAllLinkText: js.UndefOr[String] = js.native
  
  /** Theme provided by the Higher Order Component */
  var theme: js.UndefOr[ITheme] = js.native
  
  /** A reference to the viewport in which the header is rendered. */
  var viewport: js.UndefOr[IViewport] = js.native
}
object IGroupDividerProps {
  
  @scala.inline
  def apply(): IGroupDividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupDividerProps]
  }
  
  @scala.inline
  implicit class IGroupDividerPropsOps[Self <: IGroupDividerProps] (val x: Self) extends AnyVal {
    
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
    def setAriaColSpan(value: Double): Self = this.set("ariaColSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaColSpan: Self = this.set("ariaColSpan", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ js.Object | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[js.Object]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setExpandButtonProps(value: HTMLAttributes[HTMLButtonElement]): Self = this.set("expandButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandButtonProps: Self = this.set("expandButtonProps", js.undefined)
    
    @scala.inline
    def setFooterText(value: String): Self = this.set("footerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterText: Self = this.set("footerText", js.undefined)
    
    @scala.inline
    def setGroup(value: IGroup): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setGroupIndex(value: Double): Self = this.set("groupIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupIndex: Self = this.set("groupIndex", js.undefined)
    
    @scala.inline
    def setGroupLevel(value: Double): Self = this.set("groupLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupLevel: Self = this.set("groupLevel", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: IGroup*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[IGroup]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setIndentWidth(value: Double): Self = this.set("indentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentWidth: Self = this.set("indentWidth", js.undefined)
    
    @scala.inline
    def setIsCollapsedGroupSelectVisible(value: Boolean): Self = this.set("isCollapsedGroupSelectVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCollapsedGroupSelectVisible: Self = this.set("isCollapsedGroupSelectVisible", js.undefined)
    
    @scala.inline
    def setIsGroupLoading(value: /* group */ IGroup => Boolean): Self = this.set("isGroupLoading", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsGroupLoading: Self = this.set("isGroupLoading", js.undefined)
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
    
    @scala.inline
    def setLoadingText(value: String): Self = this.set("loadingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingText: Self = this.set("loadingText", js.undefined)
    
    @scala.inline
    def setOnGroupHeaderClick(value: /* group */ IGroup => Unit): Self = this.set("onGroupHeaderClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnGroupHeaderClick: Self = this.set("onGroupHeaderClick", js.undefined)
    
    @scala.inline
    def setOnGroupHeaderKeyUp(value: (/* ev */ KeyboardEvent[HTMLElement], /* group */ IGroup) => Unit): Self = this.set("onGroupHeaderKeyUp", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnGroupHeaderKeyUp: Self = this.set("onGroupHeaderKeyUp", js.undefined)
    
    @scala.inline
    def setOnRenderTitle(
      value: (/* props */ js.UndefOr[IGroupHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderTitle", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderTitle: Self = this.set("onRenderTitle", js.undefined)
    
    @scala.inline
    def setOnToggleCollapse(value: /* group */ IGroup => Unit): Self = this.set("onToggleCollapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnToggleCollapse: Self = this.set("onToggleCollapse", js.undefined)
    
    @scala.inline
    def setOnToggleSelectGroup(value: /* group */ IGroup => Unit): Self = this.set("onToggleSelectGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnToggleSelectGroup: Self = this.set("onToggleSelectGroup", js.undefined)
    
    @scala.inline
    def setOnToggleSummarize(value: /* group */ IGroup => Unit): Self = this.set("onToggleSummarize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnToggleSummarize: Self = this.set("onToggleSummarize", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: SelectionMode): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setShowAllLinkText(value: String): Self = this.set("showAllLinkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAllLinkText: Self = this.set("showAllLinkText", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setViewport(value: IViewport): Self = this.set("viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
  }
}
