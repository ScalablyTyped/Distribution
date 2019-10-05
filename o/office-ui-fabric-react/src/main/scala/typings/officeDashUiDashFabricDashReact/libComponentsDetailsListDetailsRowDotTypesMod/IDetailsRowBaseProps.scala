package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libBaseComponentDotTypesMod.IBaseProps
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
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
import typings.react.reactMod.Global.JSX.Element
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'onRenderItemColumn' | 'getCellValueKey' ]: office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps[P]} */ trait IDetailsRowBaseProps
  extends IBaseProps[IDetailsRow]
     with IDetailsItemProps {
  /**
    * Optional pre-rendered content per column. Preferred over onRender or onRenderItemColumn if provided.
    */
  var cellsByColumn: js.UndefOr[StringDictionary[ReactNode]] = js.undefined
  /**
    * Check button's aria label
    */
  var checkButtonAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Class name for the checkbox cell
    */
  var checkboxCellClassName: js.UndefOr[String] = js.undefined
  /**
    * Overriding class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Collapse all visibility
    */
  var collapseAllVisibility: js.UndefOr[CollapseAllVisibility] = js.undefined
  /**
    * Whether to render in compact mode
    */
  var compact: js.UndefOr[Boolean] = js.undefined
  /**
    * Handling drag and drop events
    */
  var dragDropEvents: js.UndefOr[IDragDropEvents] = js.undefined
  /**
    * Helper for the drag and drop
    */
  var dragDropHelper: js.UndefOr[IDragDropHelper] = js.undefined
  /** Whether to animate updates */
  var enableUpdateAnimations: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of events to register
    */
  var eventsToRegister: js.UndefOr[js.Array[Anon_CallbackEvent]] = js.undefined
  /**
    * Callback for getting the row aria-describedby
    */
  var getRowAriaDescribedBy: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.undefined
  /**
    * Callback for getting the row aria label
    */
  var getRowAriaLabel: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.undefined
  /**
    * Data source for this component
    */
  var item: js.Any
  /**
    * Index of the collection of items of the DetailsList
    */
  var itemIndex: Double
  /**
    * Callback for did mount for parent
    */
  var onDidMount: js.UndefOr[js.Function1[/* row */ js.UndefOr[DetailsRowBase], Unit]] = js.undefined
  /**
    * Callback for rendering a checkbox
    */
  var onRenderCheck: js.UndefOr[js.Function1[/* props */ IDetailsRowCheckProps, Element]] = js.undefined
  /**
    * If provided, can be used to render a custom checkbox
    */
  var onRenderDetailsCheckbox: js.UndefOr[IRenderFunction[IDetailsCheckboxProps]] = js.undefined
  /**
    * Callback for will mount for parent
    */
  var onWillUnmount: js.UndefOr[js.Function1[/* row */ js.UndefOr[DetailsRowBase], Unit]] = js.undefined
  /**
    * DOM element into which to render row field
    */
  var rowFieldsAs: js.UndefOr[ComponentType[IDetailsRowFieldsProps]] = js.undefined
  /**
    * Overriding styles to this row
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsRowStyleProps, IDetailsRowStyles]] = js.undefined
  /**
    * Theme provided by styled() function
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Whether to use fast icon and check components. The icons can't be targeted by customization
    * but are still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.undefined
  /**
    * Rerender DetailsRow only when props changed. Might cause regression when depending on external updates.
    * @defaultvalue false
    */
  var useReducedRowRenderer: js.UndefOr[Boolean] = js.undefined
}

object IDetailsRowBaseProps {
  @scala.inline
  def apply(
    item: js.Any,
    itemIndex: Double,
    cellStyleProps: ICellStyleProps = null,
    cellsByColumn: StringDictionary[ReactNode] = null,
    checkButtonAriaLabel: String = null,
    checkboxCellClassName: String = null,
    checkboxVisibility: CheckboxVisibility = null,
    className: String = null,
    collapseAllVisibility: CollapseAllVisibility = null,
    columns: js.Array[IColumn] = null,
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
    selection: ISelection = null,
    selectionMode: SelectionMode = null,
    styles: IStyleFunctionOrObject[IDetailsRowStyleProps, IDetailsRowStyles] = null,
    theme: ITheme = null,
    useFastIcons: js.UndefOr[Boolean] = js.undefined,
    useReducedRowRenderer: js.UndefOr[Boolean] = js.undefined,
    viewport: IViewport = null
  ): IDetailsRowBaseProps = {
    val __obj = js.Dynamic.literal(item = item, itemIndex = itemIndex)
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps)
    if (cellsByColumn != null) __obj.updateDynamic("cellsByColumn")(cellsByColumn)
    if (checkButtonAriaLabel != null) __obj.updateDynamic("checkButtonAriaLabel")(checkButtonAriaLabel)
    if (checkboxCellClassName != null) __obj.updateDynamic("checkboxCellClassName")(checkboxCellClassName)
    if (checkboxVisibility != null) __obj.updateDynamic("checkboxVisibility")(checkboxVisibility)
    if (className != null) __obj.updateDynamic("className")(className)
    if (collapseAllVisibility != null) __obj.updateDynamic("collapseAllVisibility")(collapseAllVisibility)
    if (columns != null) __obj.updateDynamic("columns")(columns)
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
    if (selection != null) __obj.updateDynamic("selection")(selection)
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(useFastIcons)) __obj.updateDynamic("useFastIcons")(useFastIcons)
    if (!js.isUndefined(useReducedRowRenderer)) __obj.updateDynamic("useReducedRowRenderer")(useReducedRowRenderer)
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[IDetailsRowBaseProps]
  }
}

