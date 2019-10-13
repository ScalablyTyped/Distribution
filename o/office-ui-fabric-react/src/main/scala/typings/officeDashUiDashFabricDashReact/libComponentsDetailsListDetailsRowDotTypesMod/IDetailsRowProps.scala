package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.ISelection
import typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode
import typings.officeDashUiDashFabricDashReact.Anon_CallbackEvent
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.CheckboxVisibility
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IColumn
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowCheckDotTypesMod.IDetailsCheckboxProps
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowCheckDotTypesMod.IDetailsRowCheckProps
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotBaseMod.DetailsRowBase
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowFieldsDotTypesMod.IDetailsRowFieldsProps
import typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility
import typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithViewportMod.IViewport
import typings.officeDashUiDashFabricDashReact.libUtilitiesDragdropInterfacesMod.IDragDropEvents
import typings.officeDashUiDashFabricDashReact.libUtilitiesDragdropInterfacesMod.IDragDropHelper
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsRowProps extends IDetailsRowBaseProps {
  /**
    * Column metadata
    */
  @JSName("columns")
  var columns_IDetailsRowProps: js.Array[IColumn]
  /**
    * Selection mode
    */
  @JSName("selectionMode")
  var selectionMode_IDetailsRowProps: SelectionMode
  /**
    * Selection from utilities
    */
  @JSName("selection")
  var selection_IDetailsRowProps: ISelection
}

object IDetailsRowProps {
  @scala.inline
  def apply(
    columns: js.Array[IColumn],
    item: js.Any,
    itemIndex: Double,
    selection: ISelection,
    selectionMode: SelectionMode,
    cellStyleProps: ICellStyleProps = null,
    cellsByColumn: StringDictionary[ReactNode] = null,
    checkButtonAriaLabel: String = null,
    checkboxCellClassName: String = null,
    checkboxVisibility: CheckboxVisibility = null,
    className: String = null,
    collapseAllVisibility: CollapseAllVisibility = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    componentRef: IRefObject[IDetailsRow] = null,
    dragDropEvents: IDragDropEvents = null,
    dragDropHelper: IDragDropHelper = null,
    enableUpdateAnimations: js.UndefOr[Boolean] = js.undefined,
    eventsToRegister: js.Array[Anon_CallbackEvent] = null,
    getRowAriaDescribedBy: /* item */ js.Any => String = null,
    getRowAriaLabel: /* item */ js.Any => String = null,
    groupNestingDepth: Int | Double = null,
    indentWidth: Int | Double = null,
    onDidMount: /* row */ js.UndefOr[DetailsRowBase] => Unit = null,
    onRenderCheck: /* props */ IDetailsRowCheckProps => Element = null,
    onRenderDetailsCheckbox: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], Element | Null]]) => Element | Null = null,
    onWillUnmount: /* row */ js.UndefOr[DetailsRowBase] => Unit = null,
    rowFieldsAs: ComponentType[IDetailsRowFieldsProps] = null,
    rowWidth: Int | Double = null,
    styles: IStyleFunctionOrObject[IDetailsRowStyleProps, IDetailsRowStyles] = null,
    theme: ITheme = null,
    useFastIcons: js.UndefOr[Boolean] = js.undefined,
    useReducedRowRenderer: js.UndefOr[Boolean] = js.undefined,
    viewport: IViewport = null
  ): IDetailsRowProps = {
    val __obj = js.Dynamic.literal(columns = columns, item = item, itemIndex = itemIndex, selection = selection, selectionMode = selectionMode)
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps)
    if (cellsByColumn != null) __obj.updateDynamic("cellsByColumn")(cellsByColumn)
    if (checkButtonAriaLabel != null) __obj.updateDynamic("checkButtonAriaLabel")(checkButtonAriaLabel)
    if (checkboxCellClassName != null) __obj.updateDynamic("checkboxCellClassName")(checkboxCellClassName)
    if (checkboxVisibility != null) __obj.updateDynamic("checkboxVisibility")(checkboxVisibility)
    if (className != null) __obj.updateDynamic("className")(className)
    if (collapseAllVisibility != null) __obj.updateDynamic("collapseAllVisibility")(collapseAllVisibility)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (dragDropEvents != null) __obj.updateDynamic("dragDropEvents")(dragDropEvents)
    if (dragDropHelper != null) __obj.updateDynamic("dragDropHelper")(dragDropHelper)
    if (!js.isUndefined(enableUpdateAnimations)) __obj.updateDynamic("enableUpdateAnimations")(enableUpdateAnimations)
    if (eventsToRegister != null) __obj.updateDynamic("eventsToRegister")(eventsToRegister)
    if (getRowAriaDescribedBy != null) __obj.updateDynamic("getRowAriaDescribedBy")(js.Any.fromFunction1(getRowAriaDescribedBy))
    if (getRowAriaLabel != null) __obj.updateDynamic("getRowAriaLabel")(js.Any.fromFunction1(getRowAriaLabel))
    if (groupNestingDepth != null) __obj.updateDynamic("groupNestingDepth")(groupNestingDepth.asInstanceOf[js.Any])
    if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (onDidMount != null) __obj.updateDynamic("onDidMount")(js.Any.fromFunction1(onDidMount))
    if (onRenderCheck != null) __obj.updateDynamic("onRenderCheck")(js.Any.fromFunction1(onRenderCheck))
    if (onRenderDetailsCheckbox != null) __obj.updateDynamic("onRenderDetailsCheckbox")(js.Any.fromFunction2(onRenderDetailsCheckbox))
    if (onWillUnmount != null) __obj.updateDynamic("onWillUnmount")(js.Any.fromFunction1(onWillUnmount))
    if (rowFieldsAs != null) __obj.updateDynamic("rowFieldsAs")(rowFieldsAs.asInstanceOf[js.Any])
    if (rowWidth != null) __obj.updateDynamic("rowWidth")(rowWidth.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(useFastIcons)) __obj.updateDynamic("useFastIcons")(useFastIcons)
    if (!js.isUndefined(useReducedRowRenderer)) __obj.updateDynamic("useReducedRowRenderer")(useReducedRowRenderer)
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[IDetailsRowProps]
  }
}

