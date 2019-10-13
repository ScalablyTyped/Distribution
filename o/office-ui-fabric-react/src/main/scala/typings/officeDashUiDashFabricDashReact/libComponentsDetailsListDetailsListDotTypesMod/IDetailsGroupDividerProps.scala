package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.ISelection
import typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod.ICellStyleProps
import typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupHeaderDotTypesMod.IGroupHeaderProps
import typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.IGroup
import typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.IGroupDividerProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithViewportMod.IViewport
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsItemProps because var conflicts: indentWidth, selectionMode, viewport. Inlined columns, groupNestingDepth, selection, checkboxVisibility, cellStyleProps, rowWidth */ trait IDetailsGroupDividerProps extends IGroupDividerProps {
  /**
    * Rules for rendering column cells.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
  /**
    * Checkbox visibility
    */
  var checkboxVisibility: js.UndefOr[CheckboxVisibility] = js.undefined
  /**
    * Column metadata
    */
  var columns: js.UndefOr[js.Array[IColumn]] = js.undefined
  /**
    * Nesting depth of a grouping
    */
  var groupNestingDepth: js.UndefOr[Double] = js.undefined
  /**
    * Minimum width of the row.
    *
    * @defaultvalue 0
    */
  var rowWidth: js.UndefOr[Double] = js.undefined
  /**
    * Selection from utilities
    */
  var selection: js.UndefOr[ISelection] = js.undefined
}

object IDetailsGroupDividerProps {
  @scala.inline
  def apply(
    cellStyleProps: ICellStyleProps = null,
    checkboxVisibility: CheckboxVisibility = null,
    className: String = null,
    columns: js.Array[IColumn] = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    componentRef: IRefObject[js.Object] = null,
    expandButtonProps: HTMLAttributes[HTMLButtonElement] = null,
    footerText: String = null,
    group: IGroup = null,
    groupIndex: Int | Double = null,
    groupLevel: Int | Double = null,
    groupNestingDepth: Int | Double = null,
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
    rowWidth: Int | Double = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    selection: ISelection = null,
    selectionMode: SelectionMode = null,
    showAllLinkText: String = null,
    theme: ITheme = null,
    viewport: IViewport = null
  ): IDetailsGroupDividerProps = {
    val __obj = js.Dynamic.literal()
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps)
    if (checkboxVisibility != null) __obj.updateDynamic("checkboxVisibility")(checkboxVisibility)
    if (className != null) __obj.updateDynamic("className")(className)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (expandButtonProps != null) __obj.updateDynamic("expandButtonProps")(expandButtonProps)
    if (footerText != null) __obj.updateDynamic("footerText")(footerText)
    if (group != null) __obj.updateDynamic("group")(group)
    if (groupIndex != null) __obj.updateDynamic("groupIndex")(groupIndex.asInstanceOf[js.Any])
    if (groupLevel != null) __obj.updateDynamic("groupLevel")(groupLevel.asInstanceOf[js.Any])
    if (groupNestingDepth != null) __obj.updateDynamic("groupNestingDepth")(groupNestingDepth.asInstanceOf[js.Any])
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
    if (rowWidth != null) __obj.updateDynamic("rowWidth")(rowWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (selection != null) __obj.updateDynamic("selection")(selection)
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    if (showAllLinkText != null) __obj.updateDynamic("showAllLinkText")(showAllLinkText)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[IDetailsGroupDividerProps]
  }
}

