package typings.officeUiFabricReact.detailsListTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.anon.Callback
import typings.officeUiFabricReact.detailsFooterTypesMod.IDetailsFooterProps
import typings.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderProps
import typings.officeUiFabricReact.detailsListBaseMod.DetailsListBase
import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typings.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps
import typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typings.officeUiFabricReact.groupedListTypesMod.IGroup
import typings.officeUiFabricReact.listTypesMod.IListProps
import typings.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typings.officeUiFabricReact.withViewportMod.IViewport
import typings.officeUiFabricReact.withViewportMod.IWithViewportProps
import typings.react.mod.FocusEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDetailsListProps
  extends IBaseProps[IDetailsList]
     with IWithViewportProps {
  
  /** Accessible label describing or summarizing the list. */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /** Accessible label for the grid within the list. */
  var ariaLabelForGrid: js.UndefOr[String] = js.native
  
  /** Accessible label for the list header. */
  var ariaLabelForListHeader: js.UndefOr[String] = js.native
  
  /** Accessible label for the select all checkbox. */
  var ariaLabelForSelectAllCheckbox: js.UndefOr[String] = js.native
  
  /** Accessible label for the name of the selection column. */
  var ariaLabelForSelectionColumn: js.UndefOr[String] = js.native
  
  /**
    * Props impacting the render style of cells. Since these have an impact on calculated column widths, they are
    * handled separately from normal theme styling, but they are passed to the styling system.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.native
  
  /** Accessible label for the check button. */
  var checkButtonAriaLabel: js.UndefOr[String] = js.native
  
  /** Class name to add to the cell of a checkbox. */
  var checkboxCellClassName: js.UndefOr[String] = js.native
  
  /**
    * Controls the visibility of selection check box.
    * @defaultvalue CheckboxVisibility.onHover
    */
  var checkboxVisibility: js.UndefOr[CheckboxVisibility] = js.native
  
  /** Class name to add to the root element. */
  var className: js.UndefOr[String] = js.native
  
  /** Options for column reordering using drag and drop. */
  var columnReorderOptions: js.UndefOr[IColumnReorderOptions] = js.native
  
  /** column defitions. If none are provided, default columns will be created based on the items' properties. */
  var columns: js.UndefOr[js.Array[IColumn]] = js.native
  
  /**
    * Whether to render in compact mode.
    * @defaultvalue false
    */
  var compact: js.UndefOr[Boolean] = js.native
  
  /** Controls how the list contrains overflow. */
  var constrainMode: js.UndefOr[ConstrainMode] = js.native
  
  /** Whether to disable the built-in SelectionZone, so the host component can provide its own. */
  var disableSelectionZone: js.UndefOr[Boolean] = js.native
  
  /** Map of callback functions related to row drag and drop functionality. */
  var dragDropEvents: js.UndefOr[IDragDropEvents] = js.native
  
  /** Whether to animate updates */
  var enableUpdateAnimations: js.UndefOr[Boolean] = js.native
  
  /** Whether the selection zone should enter modal state on touch. */
  var enterModalSelectionOnTouch: js.UndefOr[Boolean] = js.native
  
  /**
    * If provided, will be the "default" item column cell value return.
    * A column's `getValueKey` can override `getCellValueKey`.
    */
  var getCellValueKey: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      String
    ]
  ] = js.native
  
  /** Callback to override default group height calculation used by list virtualization. */
  var getGroupHeight: js.UndefOr[js.Function2[/* group */ IGroup, /* groupIndex */ Double, Double]] = js.native
  
  /**
    * Callback to get the item key, to be used in the selection and on render.
    * Must be provided if sorting or filtering is enabled.
    */
  var getKey: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String]] = js.native
  
  /** Callback to get the aria-describedby IDs (space-separated strings) of elements that describe the item. */
  var getRowAriaDescribedBy: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.native
  
  /** Callback to get the aria-label string for a given item. */
  var getRowAriaLabel: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.native
  
  /** Override properties to render groups. */
  var groupProps: js.UndefOr[IDetailsGroupRenderProps] = js.native
  
  /** Grouping instructions. */
  var groups: js.UndefOr[js.Array[IGroup]] = js.native
  
  /** Override for the indent width used for group nesting. */
  var indentWidth: js.UndefOr[Double] = js.native
  
  /** Default index to set focus to once the items have rendered and the index exists. */
  var initialFocusedIndex: js.UndefOr[Double] = js.native
  
  /**
    * Controls the visibility of the header.
    * @defaultvalue true
    */
  var isHeaderVisible: js.UndefOr[Boolean] = js.native
  
  /** Set this to true to indicate that the items being displayed are placeholder data. */
  var isPlaceholderData: js.UndefOr[Boolean] = js.native
  
  /** The items to render. */
  var items: js.Array[_] = js.native
  
  /** Controls how the columns are adjusted. */
  var layoutMode: js.UndefOr[DetailsListLayoutMode] = js.native
  
  /** Properties to pass through to the List components being rendered. */
  var listProps: js.UndefOr[IListProps[_]] = js.native
  
  /**
    * The minimum mouse move distance to interpret the action as drag event.
    * @defaultvalue 5
    */
  var minimumPixelsForDrag: js.UndefOr[Double] = js.native
  
  /**
    * Callback for when an item in the list becomes active by clicking anywhere inside the row or navigating to it
    * with the keyboard.
    */
  var onActiveItemChanged: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[FocusEvent[HTMLElement]], 
      Unit
    ]
  ] = js.native
  
  /** Callback for when the user clicks on the column header. */
  var onColumnHeaderClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      /* column */ js.UndefOr[IColumn], 
      Unit
    ]
  ] = js.native
  
  /** Callback for when the user asks for a contextual menu (usually via right click) from a column header. */
  var onColumnHeaderContextMenu: js.UndefOr[
    js.Function2[
      /* column */ js.UndefOr[IColumn], 
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      Unit
    ]
  ] = js.native
  
  /** Callback fired on column resize */
  var onColumnResize: js.UndefOr[
    js.Function3[
      /* column */ js.UndefOr[IColumn], 
      /* newWidth */ js.UndefOr[Double], 
      /* columnIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  
  /** Callback for when the list has been updated. Useful for telemetry tracking externally. */
  var onDidUpdate: js.UndefOr[js.Function1[/* detailsList */ js.UndefOr[DetailsListBase], Unit]] = js.native
  
  /**
    * Callback for when the context menu of an item has been accessed.
    * If undefined or false is returned, `ev.preventDefault()` will be called.
    */
  var onItemContextMenu: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[Event], 
      Unit | Boolean
    ]
  ] = js.native
  
  /** Callback for when a given row has been invoked (by pressing enter while it is selected.) */
  var onItemInvoked: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[Event], 
      Unit
    ]
  ] = js.native
  
  /**  If provided, can be used to render a custom checkbox. */
  var onRenderCheckbox: js.UndefOr[IRenderFunction[IDetailsListCheckboxProps]] = js.native
  
  /** An override to render the details footer. */
  var onRenderDetailsFooter: js.UndefOr[IRenderFunction[IDetailsFooterProps]] = js.native
  
  /** An override to render the details header. */
  var onRenderDetailsHeader: js.UndefOr[IRenderFunction[IDetailsHeaderProps]] = js.native
  
  /**
    * If provided, will be the "default" item column renderer method.
    * This affects cells within the rows, not the rows themselves.
    * If a column definition provides its own `onRender` method, that will be used instead of this.
    */
  var onRenderItemColumn: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      ReactNode
    ]
  ] = js.native
  
  /** Callback for what to render when the item is missing. */
  var onRenderMissingItem: js.UndefOr[
    js.Function2[
      /* index */ js.UndefOr[Double], 
      /* rowProps */ js.UndefOr[IDetailsRowProps], 
      ReactNode
    ]
  ] = js.native
  
  /**
    * Callback to override the default row rendering.
    */
  var onRenderRow: js.UndefOr[IRenderFunction[IDetailsRowProps]] = js.native
  
  /**
    * Callback for when a given row has been mounted. Useful for identifying when a row has been rendered on the page.
    */
  var onRowDidMount: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], Unit]
  ] = js.native
  
  /**
    * Callback for when a given row has been unmounted.
    * Useful for identifying when a row has been removed from the page.
    */
  var onRowWillUnmount: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], Unit]
  ] = js.native
  
  /**
    * Callback to determine whether the list should be rendered in full, or virtualized.
    *
    * Virtualization will add and remove pages of items as the user scrolls them into the visible range.
    * This benefits larger list scenarios by reducing the DOM on the screen, but can negatively affect performance
    * for smaller lists.
    *
    * The default implementation will virtualize when this callback is not provided.
    */
  var onShouldVirtualize: js.UndefOr[js.Function1[/* props */ IListProps[_], Boolean]] = js.native
  
  /** Event names and corresponding callbacks that will be registered to rendered row elements. */
  var rowElementEventMap: js.UndefOr[js.Array[Callback]] = js.native
  
  /** Selection model to track selection state.  */
  var selection: js.UndefOr[ISelection[IObjectWithKey]] = js.native
  
  /** Controls how/if the details list manages selection. Options include none, single, multiple */
  var selectionMode: js.UndefOr[SelectionMode] = js.native
  
  /**
    * By default, selection is cleared when clicking on an empty (non-focusable) section of the screen.
    * Setting this value to true overrides that behavior and maintains selection.
    * @defaultvalue false
    **/
  var selectionPreservedOnEmptyClick: js.UndefOr[Boolean] = js.native
  
  /**
    * Additional props to pass through to the SelectionZone created by default.
    */
  var selectionZoneProps: js.UndefOr[ISelectionZoneProps] = js.native
  
  /** A key that uniquely identifies the given items. If provided, the selection will be reset when the key changes. */
  var setKey: js.UndefOr[String] = js.native
  
  /**
    * Whether the role `application` should be applied to the list.
    * @defaultvalue false
    */
  var shouldApplyApplicationRole: js.UndefOr[Boolean] = js.native
  
  /** Custom overrides to the themed or default styles. */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]] = js.native
  
  /** Theme provided by a higher-order component. */
  var theme: js.UndefOr[ITheme] = js.native
  
  /**
    * Whether to use fast icon and check components. The icons can't be targeted by customization
    * but are still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to enable render page caching. This is an experimental performance optimization that is off by default.
    * @defaultvalue false
    */
  var usePageCache: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to re-render a row only when props changed. Might cause regression when depending on external updates.
    * @defaultvalue false
    */
  var useReducedRowRenderer: js.UndefOr[Boolean] = js.native
  
  /** Viewport info, provided by the `withViewport` decorator. */
  var viewport: js.UndefOr[IViewport] = js.native
}
object IDetailsListProps {
  
  @scala.inline
  def apply(items: js.Array[_]): IDetailsListProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListProps]
  }
  
  @scala.inline
  implicit class IDetailsListPropsOps[Self <: IDetailsListProps] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setAriaLabelForGrid(value: String): Self = this.set("ariaLabelForGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelForGrid: Self = this.set("ariaLabelForGrid", js.undefined)
    
    @scala.inline
    def setAriaLabelForListHeader(value: String): Self = this.set("ariaLabelForListHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelForListHeader: Self = this.set("ariaLabelForListHeader", js.undefined)
    
    @scala.inline
    def setAriaLabelForSelectAllCheckbox(value: String): Self = this.set("ariaLabelForSelectAllCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelForSelectAllCheckbox: Self = this.set("ariaLabelForSelectAllCheckbox", js.undefined)
    
    @scala.inline
    def setAriaLabelForSelectionColumn(value: String): Self = this.set("ariaLabelForSelectionColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelForSelectionColumn: Self = this.set("ariaLabelForSelectionColumn", js.undefined)
    
    @scala.inline
    def setCellStyleProps(value: ICellStyleProps): Self = this.set("cellStyleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellStyleProps: Self = this.set("cellStyleProps", js.undefined)
    
    @scala.inline
    def setCheckButtonAriaLabel(value: String): Self = this.set("checkButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckButtonAriaLabel: Self = this.set("checkButtonAriaLabel", js.undefined)
    
    @scala.inline
    def setCheckboxCellClassName(value: String): Self = this.set("checkboxCellClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckboxCellClassName: Self = this.set("checkboxCellClassName", js.undefined)
    
    @scala.inline
    def setCheckboxVisibility(value: CheckboxVisibility): Self = this.set("checkboxVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckboxVisibility: Self = this.set("checkboxVisibility", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColumnReorderOptions(value: IColumnReorderOptions): Self = this.set("columnReorderOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnReorderOptions: Self = this.set("columnReorderOptions", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: IColumn*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[IColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setConstrainMode(value: ConstrainMode): Self = this.set("constrainMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstrainMode: Self = this.set("constrainMode", js.undefined)
    
    @scala.inline
    def setDisableSelectionZone(value: Boolean): Self = this.set("disableSelectionZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSelectionZone: Self = this.set("disableSelectionZone", js.undefined)
    
    @scala.inline
    def setDragDropEvents(value: IDragDropEvents): Self = this.set("dragDropEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragDropEvents: Self = this.set("dragDropEvents", js.undefined)
    
    @scala.inline
    def setEnableUpdateAnimations(value: Boolean): Self = this.set("enableUpdateAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableUpdateAnimations: Self = this.set("enableUpdateAnimations", js.undefined)
    
    @scala.inline
    def setEnterModalSelectionOnTouch(value: Boolean): Self = this.set("enterModalSelectionOnTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterModalSelectionOnTouch: Self = this.set("enterModalSelectionOnTouch", js.undefined)
    
    @scala.inline
    def setGetCellValueKey(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
    ): Self = this.set("getCellValueKey", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteGetCellValueKey: Self = this.set("getCellValueKey", js.undefined)
    
    @scala.inline
    def setGetGroupHeight(value: (/* group */ IGroup, /* groupIndex */ Double) => Double): Self = this.set("getGroupHeight", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetGroupHeight: Self = this.set("getGroupHeight", js.undefined)
    
    @scala.inline
    def setGetKey(value: (/* item */ js.Any, /* index */ js.UndefOr[Double]) => String): Self = this.set("getKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetKey: Self = this.set("getKey", js.undefined)
    
    @scala.inline
    def setGetRowAriaDescribedBy(value: /* item */ js.Any => String): Self = this.set("getRowAriaDescribedBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetRowAriaDescribedBy: Self = this.set("getRowAriaDescribedBy", js.undefined)
    
    @scala.inline
    def setGetRowAriaLabel(value: /* item */ js.Any => String): Self = this.set("getRowAriaLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetRowAriaLabel: Self = this.set("getRowAriaLabel", js.undefined)
    
    @scala.inline
    def setGroupProps(value: IDetailsGroupRenderProps): Self = this.set("groupProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupProps: Self = this.set("groupProps", js.undefined)
    
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
    def setInitialFocusedIndex(value: Double): Self = this.set("initialFocusedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialFocusedIndex: Self = this.set("initialFocusedIndex", js.undefined)
    
    @scala.inline
    def setIsHeaderVisible(value: Boolean): Self = this.set("isHeaderVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHeaderVisible: Self = this.set("isHeaderVisible", js.undefined)
    
    @scala.inline
    def setIsPlaceholderData(value: Boolean): Self = this.set("isPlaceholderData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPlaceholderData: Self = this.set("isPlaceholderData", js.undefined)
    
    @scala.inline
    def setLayoutMode(value: DetailsListLayoutMode): Self = this.set("layoutMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayoutMode: Self = this.set("layoutMode", js.undefined)
    
    @scala.inline
    def setListProps(value: IListProps[_]): Self = this.set("listProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListProps: Self = this.set("listProps", js.undefined)
    
    @scala.inline
    def setMinimumPixelsForDrag(value: Double): Self = this.set("minimumPixelsForDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumPixelsForDrag: Self = this.set("minimumPixelsForDrag", js.undefined)
    
    @scala.inline
    def setOnActiveItemChanged(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[FocusEvent[HTMLElement]]) => Unit
    ): Self = this.set("onActiveItemChanged", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnActiveItemChanged: Self = this.set("onActiveItemChanged", js.undefined)
    
    @scala.inline
    def setOnColumnHeaderClick(
      value: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* column */ js.UndefOr[IColumn]) => Unit
    ): Self = this.set("onColumnHeaderClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnColumnHeaderClick: Self = this.set("onColumnHeaderClick", js.undefined)
    
    @scala.inline
    def setOnColumnHeaderContextMenu(
      value: (/* column */ js.UndefOr[IColumn], /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]]) => Unit
    ): Self = this.set("onColumnHeaderContextMenu", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnColumnHeaderContextMenu: Self = this.set("onColumnHeaderContextMenu", js.undefined)
    
    @scala.inline
    def setOnColumnResize(
      value: (/* column */ js.UndefOr[IColumn], /* newWidth */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Unit
    ): Self = this.set("onColumnResize", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnColumnResize: Self = this.set("onColumnResize", js.undefined)
    
    @scala.inline
    def setOnDidUpdate(value: /* detailsList */ js.UndefOr[DetailsListBase] => Unit): Self = this.set("onDidUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDidUpdate: Self = this.set("onDidUpdate", js.undefined)
    
    @scala.inline
    def setOnItemContextMenu(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit | Boolean
    ): Self = this.set("onItemContextMenu", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnItemContextMenu: Self = this.set("onItemContextMenu", js.undefined)
    
    @scala.inline
    def setOnItemInvoked(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit
    ): Self = this.set("onItemInvoked", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnItemInvoked: Self = this.set("onItemInvoked", js.undefined)
    
    @scala.inline
    def setOnRenderCheckbox(
      value: (/* props */ js.UndefOr[IDetailsListCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsListCheckboxProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderCheckbox", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderCheckbox: Self = this.set("onRenderCheckbox", js.undefined)
    
    @scala.inline
    def setOnRenderDetailsFooter(
      value: (/* props */ js.UndefOr[IDetailsFooterProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsFooterProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderDetailsFooter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderDetailsFooter: Self = this.set("onRenderDetailsFooter", js.undefined)
    
    @scala.inline
    def setOnRenderDetailsHeader(
      value: (/* props */ js.UndefOr[IDetailsHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsHeaderProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderDetailsHeader", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderDetailsHeader: Self = this.set("onRenderDetailsHeader", js.undefined)
    
    @scala.inline
    def setOnRenderItemColumn(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => ReactNode
    ): Self = this.set("onRenderItemColumn", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnRenderItemColumn: Self = this.set("onRenderItemColumn", js.undefined)
    
    @scala.inline
    def setOnRenderMissingItem(value: (/* index */ js.UndefOr[Double], /* rowProps */ js.UndefOr[IDetailsRowProps]) => ReactNode): Self = this.set("onRenderMissingItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderMissingItem: Self = this.set("onRenderMissingItem", js.undefined)
    
    @scala.inline
    def setOnRenderRow(
      value: (/* props */ js.UndefOr[IDetailsRowProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsRowProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderRow: Self = this.set("onRenderRow", js.undefined)
    
    @scala.inline
    def setOnRowDidMount(value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => Unit): Self = this.set("onRowDidMount", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRowDidMount: Self = this.set("onRowDidMount", js.undefined)
    
    @scala.inline
    def setOnRowWillUnmount(value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => Unit): Self = this.set("onRowWillUnmount", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRowWillUnmount: Self = this.set("onRowWillUnmount", js.undefined)
    
    @scala.inline
    def setOnShouldVirtualize(value: /* props */ IListProps[_] => Boolean): Self = this.set("onShouldVirtualize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShouldVirtualize: Self = this.set("onShouldVirtualize", js.undefined)
    
    @scala.inline
    def setRowElementEventMapVarargs(value: Callback*): Self = this.set("rowElementEventMap", js.Array(value :_*))
    
    @scala.inline
    def setRowElementEventMap(value: js.Array[Callback]): Self = this.set("rowElementEventMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowElementEventMap: Self = this.set("rowElementEventMap", js.undefined)
    
    @scala.inline
    def setSelection(value: ISelection[IObjectWithKey]): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: SelectionMode): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setSelectionPreservedOnEmptyClick(value: Boolean): Self = this.set("selectionPreservedOnEmptyClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionPreservedOnEmptyClick: Self = this.set("selectionPreservedOnEmptyClick", js.undefined)
    
    @scala.inline
    def setSelectionZoneProps(value: ISelectionZoneProps): Self = this.set("selectionZoneProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionZoneProps: Self = this.set("selectionZoneProps", js.undefined)
    
    @scala.inline
    def setSetKey(value: String): Self = this.set("setKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetKey: Self = this.set("setKey", js.undefined)
    
    @scala.inline
    def setShouldApplyApplicationRole(value: Boolean): Self = this.set("shouldApplyApplicationRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldApplyApplicationRole: Self = this.set("shouldApplyApplicationRole", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IDetailsListStyleProps => DeepPartial[IDetailsListStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setUseFastIcons(value: Boolean): Self = this.set("useFastIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseFastIcons: Self = this.set("useFastIcons", js.undefined)
    
    @scala.inline
    def setUsePageCache(value: Boolean): Self = this.set("usePageCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePageCache: Self = this.set("usePageCache", js.undefined)
    
    @scala.inline
    def setUseReducedRowRenderer(value: Boolean): Self = this.set("useReducedRowRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseReducedRowRenderer: Self = this.set("useReducedRowRenderer", js.undefined)
    
    @scala.inline
    def setViewport(value: IViewport): Self = this.set("viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
  }
}
