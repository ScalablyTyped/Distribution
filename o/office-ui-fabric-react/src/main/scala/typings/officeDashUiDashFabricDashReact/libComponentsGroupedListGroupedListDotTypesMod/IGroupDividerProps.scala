package typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode
import typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupHeaderDotTypesMod.IGroupHeaderProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithViewportMod.IViewport
import typings.react.reactMod.Global.JSX.Element
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroupDividerProps extends js.Object {
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
  /** Width corresponding to a single level. This is multiplied by the groupLevel to get the full spacer width for the group. */
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
  def apply(
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    componentRef: IRefObject[js.Object] = null,
    expandButtonProps: HTMLAttributes[HTMLButtonElement] = null,
    footerText: String = null,
    group: IGroup = null,
    groupIndex: Int | Double = null,
    groupLevel: Int | Double = null,
    groups: js.Array[IGroup] = null,
    indentWidth: Int | Double = null,
    isCollapsedGroupSelectVisible: js.UndefOr[Boolean] = js.undefined,
    isGroupLoading: /* group */ IGroup => Boolean = null,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    loadingText: String = null,
    onGroupHeaderClick: /* group */ IGroup => Unit = null,
    onRenderTitle: (/* props */ js.UndefOr[IGroupHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderProps], Element | Null]]) => Element | Null = null,
    onToggleCollapse: /* group */ IGroup => Unit = null,
    onToggleSelectGroup: /* group */ IGroup => Unit = null,
    onToggleSummarize: /* group */ IGroup => Unit = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectionMode: SelectionMode = null,
    showAllLinkText: String = null,
    theme: ITheme = null,
    viewport: IViewport = null
  ): IGroupDividerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (expandButtonProps != null) __obj.updateDynamic("expandButtonProps")(expandButtonProps)
    if (footerText != null) __obj.updateDynamic("footerText")(footerText)
    if (group != null) __obj.updateDynamic("group")(group)
    if (groupIndex != null) __obj.updateDynamic("groupIndex")(groupIndex.asInstanceOf[js.Any])
    if (groupLevel != null) __obj.updateDynamic("groupLevel")(groupLevel.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollapsedGroupSelectVisible)) __obj.updateDynamic("isCollapsedGroupSelectVisible")(isCollapsedGroupSelectVisible)
    if (isGroupLoading != null) __obj.updateDynamic("isGroupLoading")(js.Any.fromFunction1(isGroupLoading))
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText)
    if (onGroupHeaderClick != null) __obj.updateDynamic("onGroupHeaderClick")(js.Any.fromFunction1(onGroupHeaderClick))
    if (onRenderTitle != null) __obj.updateDynamic("onRenderTitle")(js.Any.fromFunction2(onRenderTitle))
    if (onToggleCollapse != null) __obj.updateDynamic("onToggleCollapse")(js.Any.fromFunction1(onToggleCollapse))
    if (onToggleSelectGroup != null) __obj.updateDynamic("onToggleSelectGroup")(js.Any.fromFunction1(onToggleSelectGroup))
    if (onToggleSummarize != null) __obj.updateDynamic("onToggleSummarize")(js.Any.fromFunction1(onToggleSummarize))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    if (showAllLinkText != null) __obj.updateDynamic("showAllLinkText")(showAllLinkText)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[IGroupDividerProps]
  }
}

