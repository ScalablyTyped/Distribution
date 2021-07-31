package typings.officeUiFabricReact

import typings.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.anon.Callback
import typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typings.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps
import typings.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typings.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps
import typings.officeUiFabricReact.groupedListBaseMod.GroupedListBase
import typings.officeUiFabricReact.listTypesMod.IList
import typings.officeUiFabricReact.listTypesMod.IListProps
import typings.officeUiFabricReact.withViewportMod.IViewport
import typings.react.mod.ClassAttributes
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupedListTypesMod {
  
  @js.native
  sealed trait CollapseAllVisibility extends StObject
  @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedList.types", "CollapseAllVisibility")
  @js.native
  object CollapseAllVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CollapseAllVisibility & Double] = js.native
    
    @js.native
    sealed trait hidden
      extends StObject
         with CollapseAllVisibility
    /* 0 */ val hidden: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.hidden & Double = js.native
    
    @js.native
    sealed trait visible
      extends StObject
         with CollapseAllVisibility
    /* 1 */ val visible: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.visible & Double = js.native
  }
  
  trait IGroup extends StObject {
    
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
    def apply(count: Double, key: String, name: String, startIndex: Double): IGroup = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGroup]
    }
    
    @scala.inline
    implicit class IGroupMutableBuilder[Self <: IGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[IGroup]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: IGroup*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHasMoreData(value: Boolean): Self = StObject.set(x, "hasMoreData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasMoreDataUndefined: Self = StObject.set(x, "hasMoreData", js.undefined)
      
      @scala.inline
      def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCollapsedUndefined: Self = StObject.set(x, "isCollapsed", js.undefined)
      
      @scala.inline
      def setIsDropEnabled(value: Boolean): Self = StObject.set(x, "isDropEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDropEnabledUndefined: Self = StObject.set(x, "isDropEnabled", js.undefined)
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      @scala.inline
      def setIsShowingAll(value: Boolean): Self = StObject.set(x, "isShowingAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsShowingAllUndefined: Self = StObject.set(x, "isShowingAll", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGroupDividerProps extends StObject {
    
    /** Defines the number of columns a group header needs to span in the case of a grid or treegrid */
    var ariaColSpan: js.UndefOr[Double] = js.undefined
    
    /** Custom className */
    var className: js.UndefOr[String] = js.undefined
    
    /** Boolean value to indicate if the component should render in compact mode. Set to false by default */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var componentRef: js.UndefOr[IRefObject[js.Object]] = js.undefined
    
    /** Props for expand/collapse button
      * @deprecated Use {@link IGroupHeaderProps.expandButtonProps} instead.
      */
    var expandButtonProps: js.UndefOr[HTMLAttributes[HTMLButtonElement]] = js.undefined
    
    /** Text to display for the group footer. */
    var footerText: js.UndefOr[String] = js.undefined
    
    /** The group to be rendered by the header. */
    var group: js.UndefOr[IGroup] = js.undefined
    
    /** The index of the group. */
    var groupIndex: js.UndefOr[Double] = js.undefined
    
    /** The indent level of the group. */
    var groupLevel: js.UndefOr[Double] = js.undefined
    
    /** Stores parent group's children. */
    var groups: js.UndefOr[js.Array[IGroup]] = js.undefined
    
    /**
      * Width corresponding to a single level.
      * This is multiplied by the groupLevel to get the full spacer width for the group.
      */
    var indentWidth: js.UndefOr[Double] = js.undefined
    
    /** Determines if the group selection check box is shown for collapsed groups. */
    var isCollapsedGroupSelectVisible: js.UndefOr[Boolean] = js.undefined
    
    /** Callback to determine if a group has missing items and needs to load them from the server. */
    var isGroupLoading: js.UndefOr[js.Function1[/* group */ IGroup, Boolean]] = js.undefined
    
    /**
      * Deprecated at v.65.1 and will be removed by v 1.0. Use `selected` instead.
      * @deprecated Use `selected` instead.
      */
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    /** Text shown on group headers to indicate the group is being loaded. */
    var loadingText: js.UndefOr[String] = js.undefined
    
    /** Callback for when the group header is clicked. */
    var onGroupHeaderClick: js.UndefOr[js.Function1[/* group */ IGroup, Unit]] = js.undefined
    
    /** Callback for when the "keyup" event is fired on the group header . */
    var onGroupHeaderKeyUp: js.UndefOr[js.Function2[/* ev */ KeyboardEvent[HTMLElement], /* group */ IGroup, Unit]] = js.undefined
    
    /** Override which allows the caller to provider a custom renderer for the GroupHeader title. */
    var onRenderTitle: js.UndefOr[IRenderFunction[IGroupHeaderProps]] = js.undefined
    
    /** Callback for when the group is expanded or collapsed. */
    var onToggleCollapse: js.UndefOr[js.Function1[/* group */ IGroup, Unit]] = js.undefined
    
    /** Callback for when the group is selected. */
    var onToggleSelectGroup: js.UndefOr[js.Function1[/* group */ IGroup, Unit]] = js.undefined
    
    /** Callback for when the group "Show All" link is clicked */
    var onToggleSummarize: js.UndefOr[js.Function1[/* group */ IGroup, Unit]] = js.undefined
    
    /** If all items in the group are selected. */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /** The selection mode of the list the group lives within. */
    var selectionMode: js.UndefOr[SelectionMode] = js.undefined
    
    /** Text to display for the group "Show All" link. */
    var showAllLinkText: js.UndefOr[String] = js.undefined
    
    /** Theme provided by the Higher Order Component */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /** A reference to the viewport in which the header is rendered. */
    var viewport: js.UndefOr[IViewport] = js.undefined
  }
  object IGroupDividerProps {
    
    @scala.inline
    def apply(): IGroupDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupDividerProps]
    }
    
    @scala.inline
    implicit class IGroupDividerPropsMutableBuilder[Self <: IGroupDividerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaColSpan(value: Double): Self = StObject.set(x, "ariaColSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaColSpanUndefined: Self = StObject.set(x, "ariaColSpan", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[js.Object]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ js.Object | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setExpandButtonProps(value: HTMLAttributes[HTMLButtonElement]): Self = StObject.set(x, "expandButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandButtonPropsUndefined: Self = StObject.set(x, "expandButtonProps", js.undefined)
      
      @scala.inline
      def setFooterText(value: String): Self = StObject.set(x, "footerText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterTextUndefined: Self = StObject.set(x, "footerText", js.undefined)
      
      @scala.inline
      def setGroup(value: IGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
      
      @scala.inline
      def setGroupLevel(value: Double): Self = StObject.set(x, "groupLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupLevelUndefined: Self = StObject.set(x, "groupLevel", js.undefined)
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setGroups(value: js.Array[IGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      @scala.inline
      def setGroupsVarargs(value: IGroup*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setIndentWidth(value: Double): Self = StObject.set(x, "indentWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentWidthUndefined: Self = StObject.set(x, "indentWidth", js.undefined)
      
      @scala.inline
      def setIsCollapsedGroupSelectVisible(value: Boolean): Self = StObject.set(x, "isCollapsedGroupSelectVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCollapsedGroupSelectVisibleUndefined: Self = StObject.set(x, "isCollapsedGroupSelectVisible", js.undefined)
      
      @scala.inline
      def setIsGroupLoading(value: /* group */ IGroup => Boolean): Self = StObject.set(x, "isGroupLoading", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsGroupLoadingUndefined: Self = StObject.set(x, "isGroupLoading", js.undefined)
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      @scala.inline
      def setLoadingText(value: String): Self = StObject.set(x, "loadingText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
      
      @scala.inline
      def setOnGroupHeaderClick(value: /* group */ IGroup => Unit): Self = StObject.set(x, "onGroupHeaderClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGroupHeaderClickUndefined: Self = StObject.set(x, "onGroupHeaderClick", js.undefined)
      
      @scala.inline
      def setOnGroupHeaderKeyUp(value: (/* ev */ KeyboardEvent[HTMLElement], /* group */ IGroup) => Unit): Self = StObject.set(x, "onGroupHeaderKeyUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnGroupHeaderKeyUpUndefined: Self = StObject.set(x, "onGroupHeaderKeyUp", js.undefined)
      
      @scala.inline
      def setOnRenderTitle(
        value: (/* props */ js.UndefOr[IGroupHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderTitle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderTitleUndefined: Self = StObject.set(x, "onRenderTitle", js.undefined)
      
      @scala.inline
      def setOnToggleCollapse(value: /* group */ IGroup => Unit): Self = StObject.set(x, "onToggleCollapse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnToggleCollapseUndefined: Self = StObject.set(x, "onToggleCollapse", js.undefined)
      
      @scala.inline
      def setOnToggleSelectGroup(value: /* group */ IGroup => Unit): Self = StObject.set(x, "onToggleSelectGroup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnToggleSelectGroupUndefined: Self = StObject.set(x, "onToggleSelectGroup", js.undefined)
      
      @scala.inline
      def setOnToggleSummarize(value: /* group */ IGroup => Unit): Self = StObject.set(x, "onToggleSummarize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnToggleSummarizeUndefined: Self = StObject.set(x, "onToggleSummarize", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      @scala.inline
      def setShowAllLinkText(value: String): Self = StObject.set(x, "showAllLinkText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAllLinkTextUndefined: Self = StObject.set(x, "showAllLinkText", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setViewport(value: IViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    }
  }
  
  trait IGroupRenderProps extends StObject {
    
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
    def apply(): IGroupRenderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupRenderProps]
    }
    
    @scala.inline
    implicit class IGroupRenderPropsMutableBuilder[Self <: IGroupRenderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapseAllVisibility(value: CollapseAllVisibility): Self = StObject.set(x, "collapseAllVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseAllVisibilityUndefined: Self = StObject.set(x, "collapseAllVisibility", js.undefined)
      
      @scala.inline
      def setFooterProps(value: IGroupFooterProps): Self = StObject.set(x, "footerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterPropsUndefined: Self = StObject.set(x, "footerProps", js.undefined)
      
      @scala.inline
      def setGetGroupItemLimit(value: /* group */ IGroup => Double): Self = StObject.set(x, "getGroupItemLimit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetGroupItemLimitUndefined: Self = StObject.set(x, "getGroupItemLimit", js.undefined)
      
      @scala.inline
      def setHeaderProps(value: IGroupHeaderProps): Self = StObject.set(x, "headerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderPropsUndefined: Self = StObject.set(x, "headerProps", js.undefined)
      
      @scala.inline
      def setIsAllGroupsCollapsed(value: Boolean): Self = StObject.set(x, "isAllGroupsCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAllGroupsCollapsedUndefined: Self = StObject.set(x, "isAllGroupsCollapsed", js.undefined)
      
      @scala.inline
      def setOnRenderFooter(
        value: (/* props */ js.UndefOr[IGroupFooterProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupFooterProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderFooter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderFooterUndefined: Self = StObject.set(x, "onRenderFooter", js.undefined)
      
      @scala.inline
      def setOnRenderHeader(
        value: (/* props */ js.UndefOr[IGroupHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderHeader", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderHeaderUndefined: Self = StObject.set(x, "onRenderHeader", js.undefined)
      
      @scala.inline
      def setOnRenderShowAll(
        value: (/* props */ js.UndefOr[IGroupShowAllProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupShowAllProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderShowAll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderShowAllUndefined: Self = StObject.set(x, "onRenderShowAll", js.undefined)
      
      @scala.inline
      def setOnToggleCollapseAll(value: /* isAllCollapsed */ Boolean => Unit): Self = StObject.set(x, "onToggleCollapseAll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnToggleCollapseAllUndefined: Self = StObject.set(x, "onToggleCollapseAll", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setShowAllProps(value: IGroupShowAllProps): Self = StObject.set(x, "showAllProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAllPropsUndefined: Self = StObject.set(x, "showAllProps", js.undefined)
      
      @scala.inline
      def setShowEmptyGroups(value: Boolean): Self = StObject.set(x, "showEmptyGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowEmptyGroupsUndefined: Self = StObject.set(x, "showEmptyGroups", js.undefined)
    }
  }
  
  @js.native
  trait IGroupedList
    extends StObject
       with IList {
    
    /**
      * Toggles the collapsed state of all the groups in the list.
      */
    def toggleCollapseAll(allCollapsed: Boolean): Unit = js.native
  }
  
  @js.native
  trait IGroupedListProps
    extends StObject
       with ClassAttributes[GroupedListBase] {
    
    /** Optional class name to add to the root element. */
    var className: js.UndefOr[String] = js.native
    
    /** Boolean value to indicate if the component should render in compact mode. Set to false by default */
    var compact: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional callback to access the IGroupedList interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IGroupedList]] = js.native
    
    /** Map of callback functions related to drag and drop functionality. */
    var dragDropEvents: js.UndefOr[IDragDropEvents] = js.native
    
    /** helper to manage drag/drop across item and groups */
    var dragDropHelper: js.UndefOr[IDragDropHelper] = js.native
    
    /** Event names and corresponding callbacks that will be registered to groups and rendered elements */
    var eventsToRegister: js.UndefOr[js.Array[Callback]] = js.native
    
    /** Optional properties to pass through to the FocusZone. */
    var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.native
    
    /**
      * Optional function to override default group height calculation used by list virtualization.
      */
    var getGroupHeight: js.UndefOr[js.Function2[/* group */ IGroup, /* groupIndex */ Double, Double]] = js.native
    
    /** Optional override properties to render groups. */
    var groupProps: js.UndefOr[IGroupRenderProps] = js.native
    
    /** Optional grouping instructions. */
    var groups: js.UndefOr[js.Array[IGroup]] = js.native
    
    /** List of items to render. */
    var items: js.Array[js.Any] = js.native
    
    /** Optional properties to pass through to the list components being rendered. */
    var listProps: js.UndefOr[IListProps[js.Any]] = js.native
    
    /** Optional callback when the group expand state changes between all collapsed and at least one group is expanded. */
    var onGroupExpandStateChanged: js.UndefOr[js.Function1[/* isSomeGroupExpanded */ Boolean, Unit]] = js.native
    
    /** Rendering callback to render the group items. */
    def onRenderCell(): ReactNode = js.native
    def onRenderCell(nestingDepth: Double): ReactNode = js.native
    def onRenderCell(nestingDepth: Double, item: js.Any): ReactNode = js.native
    def onRenderCell(nestingDepth: Double, item: js.Any, index: Double): ReactNode = js.native
    def onRenderCell(nestingDepth: Double, item: Unit, index: Double): ReactNode = js.native
    def onRenderCell(nestingDepth: Unit, item: js.Any): ReactNode = js.native
    def onRenderCell(nestingDepth: Unit, item: js.Any, index: Double): ReactNode = js.native
    def onRenderCell(nestingDepth: Unit, item: Unit, index: Double): ReactNode = js.native
    
    /**
      * Optional callback to determine whether the list should be rendered in full, or virtualized.
      * Virtualization will add and remove pages of items as the user scrolls them into the visible range.
      * This benefits larger list scenarios by reducing the DOM on the screen, but can negatively affect performance for
      * smaller lists.
      * The default implementation will virtualize when this callback is not provided.
      */
    var onShouldVirtualize: js.UndefOr[js.Function1[/* props */ IListProps[js.Any], Boolean]] = js.native
    
    /** Override the default role for GroupedList.  */
    var role: js.UndefOr[String] = js.native
    
    /** Optional selection model to track selection state.  */
    var selection: js.UndefOr[ISelection[IObjectWithKey]] = js.native
    
    /** Controls how/if the list manages selection. */
    var selectionMode: js.UndefOr[SelectionMode] = js.native
    
    /**
      * Style function to be passed in to override the themed or default styles
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IGroupedListStyleProps, IGroupedListStyles]] = js.native
    
    /**
      * Theme that is passed in from Higher Order Component
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * boolean to control if pages containing unchanged items should be cached, this is a perf optimization
      * The same property in List.Props
      */
    var usePageCache: js.UndefOr[Boolean] = js.native
    
    /** Optional Viewport, provided by the parent component. */
    var viewport: js.UndefOr[IViewport] = js.native
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupedList.types.IGroupedListProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupedList.types.IGroupedListProps, 'className'> & {  isCollapsed :boolean | undefined,   compact :boolean | undefined} */
  trait IGroupedListStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    /** Whether the group is in compact mode or not */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    /** whether or not the group is collapsed */
    var isCollapsed: js.UndefOr[Boolean] = js.undefined
    
    var theme: ITheme
  }
  object IGroupedListStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IGroupedListStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGroupedListStyleProps]
    }
    
    @scala.inline
    implicit class IGroupedListStylePropsMutableBuilder[Self <: IGroupedListStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCollapsedUndefined: Self = StObject.set(x, "isCollapsed", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGroupedListStyles extends StObject {
    
    var group: IStyle
    
    var groupIsDropping: IStyle
    
    var root: IStyle
  }
  object IGroupedListStyles {
    
    @scala.inline
    def apply(): IGroupedListStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupedListStyles]
    }
    
    @scala.inline
    implicit class IGroupedListStylesMutableBuilder[Self <: IGroupedListStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: IStyle): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupIsDropping(value: IStyle): Self = StObject.set(x, "groupIsDropping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupIsDroppingNull: Self = StObject.set(x, "groupIsDropping", null)
      
      @scala.inline
      def setGroupIsDroppingUndefined: Self = StObject.set(x, "groupIsDropping", js.undefined)
      
      @scala.inline
      def setGroupNull: Self = StObject.set(x, "group", null)
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
