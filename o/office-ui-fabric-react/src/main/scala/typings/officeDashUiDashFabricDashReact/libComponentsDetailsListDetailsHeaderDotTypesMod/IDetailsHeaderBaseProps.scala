package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.ISelection
import typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotBaseMod.DetailsHeaderBase
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.CheckboxVisibility
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.DetailsListLayoutMode
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IColumn
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IColumnReorderOptions
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowCheckDotTypesMod.IDetailsCheckboxProps
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod.ICellStyleProps
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsItemProps
import typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility
import typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod.ITooltipHostProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithViewportMod.IViewport
import typings.react.NativeMouseEvent
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.MouseEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsHeaderBaseProps
  extends ClassAttributes[DetailsHeaderBase]
     with IDetailsItemProps {
  /** ariaLabel for the entire header */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /** ariaLabel for the header checkbox that selects or deselects everything */
  var ariaLabelForSelectAllCheckbox: js.UndefOr[String] = js.undefined
  /** ariaLabel for the selection column */
  var ariaLabelForSelectionColumn: js.UndefOr[String] = js.undefined
  /** ariaLabel for expand/collapse group button */
  var ariaLabelForToggleAllGroupsButton: js.UndefOr[String] = js.undefined
  /** Overriding class name */
  var className: js.UndefOr[String] = js.undefined
  /** Whether to collapse for all visibility */
  var collapseAllVisibility: js.UndefOr[CollapseAllVisibility] = js.undefined
  /** Column reordering options */
  var columnReorderOptions: js.UndefOr[IColumnReorderOptions] = js.undefined
  /** Column reordering options */
  var columnReorderProps: js.UndefOr[IColumnReorderHeaderProps] = js.undefined
  /** Ref to the component itself */
  var componentRef: js.UndefOr[IRefObject[IDetailsHeader]] = js.undefined
  /** Whether or not all is collapsed */
  var isAllCollapsed: js.UndefOr[Boolean] = js.undefined
  /** Layout mode - fixedColumns or justified */
  var layoutMode: DetailsListLayoutMode
  /** Minimum pixels to be moved before dragging is registered */
  var minimumPixelsForDrag: js.UndefOr[Double] = js.undefined
  /** Callback for when column is automatically resized */
  var onColumnAutoResized: js.UndefOr[js.Function2[/* column */ IColumn, /* columnIndex */ Double, Unit]] = js.undefined
  /** Callback for when the column is clicked */
  var onColumnClick: js.UndefOr[
    js.Function2[/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn, Unit]
  ] = js.undefined
  /** Callback for when the column needs to show a context menu */
  var onColumnContextMenu: js.UndefOr[
    js.Function2[/* column */ IColumn, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  ] = js.undefined
  /** Callback for when column sizing has changed */
  var onColumnIsSizingChanged: js.UndefOr[js.Function2[/* column */ IColumn, /* isSizing */ Boolean, Unit]] = js.undefined
  /** Callback for when column is resized */
  var onColumnResized: js.UndefOr[
    js.Function3[/* column */ IColumn, /* newWidth */ Double, /* columnIndex */ Double, Unit]
  ] = js.undefined
  /** Callback to render a tooltip for the column header */
  var onRenderColumnHeaderTooltip: js.UndefOr[IRenderFunction[ITooltipHostProps]] = js.undefined
  /** If provided, can be used to render a custom checkbox */
  var onRenderDetailsCheckbox: js.UndefOr[IRenderFunction[IDetailsCheckboxProps]] = js.undefined
  /** Callback for when collapse all is toggled */
  var onToggleCollapseAll: js.UndefOr[js.Function1[/* isAllCollapsed */ Boolean, Unit]] = js.undefined
  /** Select all button visibility */
  var selectAllVisibility: js.UndefOr[SelectAllVisibility] = js.undefined
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsHeaderStyleProps, IDetailsHeaderStyles]] = js.undefined
  /** Theme from the Higher Order Component */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Whether to use fast icon and check components. The icons can't be targeted by customization
    * but are still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.undefined
}

object IDetailsHeaderBaseProps {
  @scala.inline
  def apply(
    layoutMode: DetailsListLayoutMode,
    ariaLabel: String = null,
    ariaLabelForSelectAllCheckbox: String = null,
    ariaLabelForSelectionColumn: String = null,
    ariaLabelForToggleAllGroupsButton: String = null,
    cellStyleProps: ICellStyleProps = null,
    checkboxVisibility: CheckboxVisibility = null,
    className: String = null,
    collapseAllVisibility: CollapseAllVisibility = null,
    columnReorderOptions: IColumnReorderOptions = null,
    columnReorderProps: IColumnReorderHeaderProps = null,
    columns: js.Array[IColumn] = null,
    componentRef: IRefObject[IDetailsHeader] = null,
    groupNestingDepth: Int | Double = null,
    indentWidth: Int | Double = null,
    isAllCollapsed: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    minimumPixelsForDrag: Int | Double = null,
    onColumnAutoResized: (/* column */ IColumn, /* columnIndex */ Double) => Unit = null,
    onColumnClick: (/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn) => Unit = null,
    onColumnContextMenu: (/* column */ IColumn, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onColumnIsSizingChanged: (/* column */ IColumn, /* isSizing */ Boolean) => Unit = null,
    onColumnResized: (/* column */ IColumn, /* newWidth */ Double, /* columnIndex */ Double) => Unit = null,
    onRenderColumnHeaderTooltip: (/* props */ js.UndefOr[ITooltipHostProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITooltipHostProps], Element | Null]]) => Element | Null = null,
    onRenderDetailsCheckbox: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], Element | Null]]) => Element | Null = null,
    onToggleCollapseAll: /* isAllCollapsed */ Boolean => Unit = null,
    ref: LegacyRef[DetailsHeaderBase] = null,
    rowWidth: Int | Double = null,
    selectAllVisibility: SelectAllVisibility = null,
    selection: ISelection = null,
    selectionMode: SelectionMode = null,
    styles: IStyleFunctionOrObject[IDetailsHeaderStyleProps, IDetailsHeaderStyles] = null,
    theme: ITheme = null,
    useFastIcons: js.UndefOr[Boolean] = js.undefined,
    viewport: IViewport = null
  ): IDetailsHeaderBaseProps = {
    val __obj = js.Dynamic.literal(layoutMode = layoutMode)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (ariaLabelForSelectAllCheckbox != null) __obj.updateDynamic("ariaLabelForSelectAllCheckbox")(ariaLabelForSelectAllCheckbox)
    if (ariaLabelForSelectionColumn != null) __obj.updateDynamic("ariaLabelForSelectionColumn")(ariaLabelForSelectionColumn)
    if (ariaLabelForToggleAllGroupsButton != null) __obj.updateDynamic("ariaLabelForToggleAllGroupsButton")(ariaLabelForToggleAllGroupsButton)
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps)
    if (checkboxVisibility != null) __obj.updateDynamic("checkboxVisibility")(checkboxVisibility)
    if (className != null) __obj.updateDynamic("className")(className)
    if (collapseAllVisibility != null) __obj.updateDynamic("collapseAllVisibility")(collapseAllVisibility)
    if (columnReorderOptions != null) __obj.updateDynamic("columnReorderOptions")(columnReorderOptions)
    if (columnReorderProps != null) __obj.updateDynamic("columnReorderProps")(columnReorderProps)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (groupNestingDepth != null) __obj.updateDynamic("groupNestingDepth")(groupNestingDepth.asInstanceOf[js.Any])
    if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isAllCollapsed)) __obj.updateDynamic("isAllCollapsed")(isAllCollapsed)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (minimumPixelsForDrag != null) __obj.updateDynamic("minimumPixelsForDrag")(minimumPixelsForDrag.asInstanceOf[js.Any])
    if (onColumnAutoResized != null) __obj.updateDynamic("onColumnAutoResized")(js.Any.fromFunction2(onColumnAutoResized))
    if (onColumnClick != null) __obj.updateDynamic("onColumnClick")(js.Any.fromFunction2(onColumnClick))
    if (onColumnContextMenu != null) __obj.updateDynamic("onColumnContextMenu")(js.Any.fromFunction2(onColumnContextMenu))
    if (onColumnIsSizingChanged != null) __obj.updateDynamic("onColumnIsSizingChanged")(js.Any.fromFunction2(onColumnIsSizingChanged))
    if (onColumnResized != null) __obj.updateDynamic("onColumnResized")(js.Any.fromFunction3(onColumnResized))
    if (onRenderColumnHeaderTooltip != null) __obj.updateDynamic("onRenderColumnHeaderTooltip")(js.Any.fromFunction2(onRenderColumnHeaderTooltip))
    if (onRenderDetailsCheckbox != null) __obj.updateDynamic("onRenderDetailsCheckbox")(js.Any.fromFunction2(onRenderDetailsCheckbox))
    if (onToggleCollapseAll != null) __obj.updateDynamic("onToggleCollapseAll")(js.Any.fromFunction1(onToggleCollapseAll))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (rowWidth != null) __obj.updateDynamic("rowWidth")(rowWidth.asInstanceOf[js.Any])
    if (selectAllVisibility != null) __obj.updateDynamic("selectAllVisibility")(selectAllVisibility)
    if (selection != null) __obj.updateDynamic("selection")(selection)
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(useFastIcons)) __obj.updateDynamic("useFastIcons")(useFastIcons)
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[IDetailsHeaderBaseProps]
  }
}

