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
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDetailsListProps
  extends StObject
     with IBaseProps[IDetailsList]
     with IWithViewportProps {
  
  /** Accessible label describing or summarizing the list. */
  var ariaLabel: js.UndefOr[String] = js.undefined
  
  /** Accessible label for the grid within the list. */
  var ariaLabelForGrid: js.UndefOr[String] = js.undefined
  
  /** Accessible label for the list header. */
  var ariaLabelForListHeader: js.UndefOr[String] = js.undefined
  
  /** Accessible label for the select all checkbox. */
  var ariaLabelForSelectAllCheckbox: js.UndefOr[String] = js.undefined
  
  /** Accessible label for the name of the selection column. */
  var ariaLabelForSelectionColumn: js.UndefOr[String] = js.undefined
  
  /**
    * Props impacting the render style of cells. Since these have an impact on calculated column widths, they are
    * handled separately from normal theme styling, but they are passed to the styling system.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
  
  /** Accessible label for the row check button, e.g. "select row" */
  var checkButtonAriaLabel: js.UndefOr[String] = js.undefined
  
  /** Accessible label for the group header check button, e.g. "select section". */
  var checkButtonGroupAriaLabel: js.UndefOr[String] = js.undefined
  
  /** Class name to add to the cell of a checkbox. */
  var checkboxCellClassName: js.UndefOr[String] = js.undefined
  
  /**
    * Controls the visibility of selection check box.
    * @defaultvalue CheckboxVisibility.onHover
    */
  var checkboxVisibility: js.UndefOr[CheckboxVisibility] = js.undefined
  
  /** Class name to add to the root element. */
  var className: js.UndefOr[String] = js.undefined
  
  /** Options for column reordering using drag and drop. */
  var columnReorderOptions: js.UndefOr[IColumnReorderOptions] = js.undefined
  
  /** column defitions. If none are provided, default columns will be created based on the items' properties. */
  var columns: js.UndefOr[js.Array[IColumn]] = js.undefined
  
  /**
    * Whether to render in compact mode.
    * @defaultvalue false
    */
  var compact: js.UndefOr[Boolean] = js.undefined
  
  /** Controls how the list contrains overflow. */
  var constrainMode: js.UndefOr[ConstrainMode] = js.undefined
  
  /** Whether to disable the built-in SelectionZone, so the host component can provide its own. */
  var disableSelectionZone: js.UndefOr[Boolean] = js.undefined
  
  /** Map of callback functions related to row drag and drop functionality. */
  var dragDropEvents: js.UndefOr[IDragDropEvents] = js.undefined
  
  /** Whether to animate updates */
  var enableUpdateAnimations: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the selection zone should enter modal state on touch. */
  var enterModalSelectionOnTouch: js.UndefOr[Boolean] = js.undefined
  
  /** An optional margin for proportional columns, to e.g. account for scrollbars when laying out width. */
  var flexMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * If provided, will be the "default" item column cell value return.
    * A column's `getValueKey` can override `getCellValueKey`.
    */
  var getCellValueKey: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      String
    ]
  ] = js.undefined
  
  /** Callback to override default group height calculation used by list virtualization. */
  var getGroupHeight: js.UndefOr[js.Function2[/* group */ IGroup, /* groupIndex */ Double, Double]] = js.undefined
  
  /**
    * Callback to get the item key, to be used in the selection and on render.
    * Must be provided if sorting or filtering is enabled.
    */
  var getKey: js.UndefOr[js.Function2[/* item */ Any, /* index */ js.UndefOr[Double], String]] = js.undefined
  
  /** Callback to get the aria-describedby IDs (space-separated strings) of elements that describe the item. */
  var getRowAriaDescribedBy: js.UndefOr[js.Function1[/* item */ Any, String]] = js.undefined
  
  /** Callback to get the aria-label string for a given item. */
  var getRowAriaLabel: js.UndefOr[js.Function1[/* item */ Any, String]] = js.undefined
  
  /** Override properties to render groups. */
  var groupProps: js.UndefOr[IDetailsGroupRenderProps] = js.undefined
  
  /** Grouping instructions. */
  var groups: js.UndefOr[js.Array[IGroup]] = js.undefined
  
  /** Override for the indent width used for group nesting. */
  var indentWidth: js.UndefOr[Double] = js.undefined
  
  /** Default index to set focus to once the items have rendered and the index exists. */
  var initialFocusedIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls the visibility of the header.
    * @defaultvalue true
    */
  var isHeaderVisible: js.UndefOr[Boolean] = js.undefined
  
  /** Set this to true to indicate that the items being displayed are placeholder data. */
  var isPlaceholderData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines if an item is selected on focus.
    *
    * @defaultvalue true
    */
  var isSelectedOnFocus: js.UndefOr[Boolean] = js.undefined
  
  /** The items to render. */
  var items: js.Array[Any]
  
  /** Controls how the columns are adjusted. */
  var layoutMode: js.UndefOr[DetailsListLayoutMode] = js.undefined
  
  /** Properties to pass through to the List components being rendered. */
  var listProps: js.UndefOr[IListProps[Any]] = js.undefined
  
  /**
    * The minimum mouse move distance to interpret the action as drag event.
    * @defaultvalue 5
    */
  var minimumPixelsForDrag: js.UndefOr[Double] = js.undefined
  
  /**
    * Callback for when an item in the list becomes active by clicking anywhere inside the row or navigating to it
    * with the keyboard.
    */
  var onActiveItemChanged: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[Any], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[FocusEvent[HTMLElement, Element]], 
      Unit
    ]
  ] = js.undefined
  
  /** Callback for when the user clicks on the column header. */
  var onColumnHeaderClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      /* column */ js.UndefOr[IColumn], 
      Unit
    ]
  ] = js.undefined
  
  /** Callback for when the user asks for a contextual menu (usually via right click) from a column header. */
  var onColumnHeaderContextMenu: js.UndefOr[
    js.Function2[
      /* column */ js.UndefOr[IColumn], 
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      Unit
    ]
  ] = js.undefined
  
  /** Callback fired on column resize */
  var onColumnResize: js.UndefOr[
    js.Function3[
      /* column */ js.UndefOr[IColumn], 
      /* newWidth */ js.UndefOr[Double], 
      /* columnIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  
  /** Callback for when the list has been updated. Useful for telemetry tracking externally. */
  var onDidUpdate: js.UndefOr[js.Function1[/* detailsList */ js.UndefOr[DetailsListBase], Unit]] = js.undefined
  
  /**
    * Callback for when the context menu of an item has been accessed.
    * If undefined or false is returned, `ev.preventDefault()` will be called.
    */
  var onItemContextMenu: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[Any], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[Event], 
      Unit | Boolean
    ]
  ] = js.undefined
  
  /** Callback for when a given row has been invoked (by pressing enter while it is selected.) */
  var onItemInvoked: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[Any], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[Event], 
      Unit
    ]
  ] = js.undefined
  
  /**  If provided, can be used to render a custom checkbox. */
  var onRenderCheckbox: js.UndefOr[IRenderFunction[IDetailsListCheckboxProps]] = js.undefined
  
  /** An override to render the details footer. */
  var onRenderDetailsFooter: js.UndefOr[IRenderFunction[IDetailsFooterProps]] = js.undefined
  
  /** An override to render the details header. */
  var onRenderDetailsHeader: js.UndefOr[IRenderFunction[IDetailsHeaderProps]] = js.undefined
  
  /**
    * If provided, will be the "default" item column renderer method.
    * This affects cells within the rows, not the rows themselves.
    * If a column definition provides its own `onRender` method, that will be used instead of this.
    */
  var onRenderItemColumn: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      ReactNode
    ]
  ] = js.undefined
  
  /** Callback for what to render when the item is missing. */
  var onRenderMissingItem: js.UndefOr[
    js.Function2[
      /* index */ js.UndefOr[Double], 
      /* rowProps */ js.UndefOr[IDetailsRowProps], 
      ReactNode
    ]
  ] = js.undefined
  
  /**
    * Callback to override the default row rendering.
    */
  var onRenderRow: js.UndefOr[IRenderFunction[IDetailsRowProps]] = js.undefined
  
  /**
    * Callback for when a given row has been mounted. Useful for identifying when a row has been rendered on the page.
    */
  var onRowDidMount: js.UndefOr[js.Function2[/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], Unit]] = js.undefined
  
  /**
    * Callback for when a given row has been unmounted.
    * Useful for identifying when a row has been removed from the page.
    */
  var onRowWillUnmount: js.UndefOr[js.Function2[/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], Unit]] = js.undefined
  
  /**
    * Callback to determine whether the list should be rendered in full, or virtualized.
    *
    * Virtualization will add and remove pages of items as the user scrolls them into the visible range.
    * This benefits larger list scenarios by reducing the DOM on the screen, but can negatively affect performance
    * for smaller lists.
    *
    * The default implementation will virtualize when this callback is not provided.
    */
  var onShouldVirtualize: js.UndefOr[js.Function1[/* props */ IListProps[Any], Boolean]] = js.undefined
  
  /** Role for the list. */
  var role: js.UndefOr[String] = js.undefined
  
  /** Event names and corresponding callbacks that will be registered to rendered row elements. */
  var rowElementEventMap: js.UndefOr[js.Array[Callback]] = js.undefined
  
  /** Selection model to track selection state.  */
  var selection: js.UndefOr[ISelection[IObjectWithKey]] = js.undefined
  
  /** Controls how/if the details list manages selection. Options include none, single, multiple */
  var selectionMode: js.UndefOr[SelectionMode] = js.undefined
  
  /**
    * By default, selection is cleared when clicking on an empty (non-focusable) section of the screen.
    * Setting this value to true overrides that behavior and maintains selection.
    * @defaultvalue false
    **/
  var selectionPreservedOnEmptyClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Additional props to pass through to the SelectionZone created by default.
    */
  var selectionZoneProps: js.UndefOr[ISelectionZoneProps] = js.undefined
  
  /** A key that uniquely identifies the given items. If provided, the selection will be reset when the key changes. */
  var setKey: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the role `application` should be applied to the list.
    * @defaultvalue false
    */
  var shouldApplyApplicationRole: js.UndefOr[Boolean] = js.undefined
  
  /** Custom overrides to the themed or default styles. */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]] = js.undefined
  
  /** Theme provided by a higher-order component. */
  var theme: js.UndefOr[ITheme] = js.undefined
  
  /**
    * Whether to use fast icon and check components. The icons can't be targeted by customization
    * but are still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to enable render page caching. This is an experimental performance optimization that is off by default.
    * @defaultvalue false
    */
  var usePageCache: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to re-render a row only when props changed. Might cause regression when depending on external updates.
    * @defaultvalue false
    */
  var useReducedRowRenderer: js.UndefOr[Boolean] = js.undefined
  
  /** Viewport info, provided by the `withViewport` decorator. */
  var viewport: js.UndefOr[IViewport] = js.undefined
}
object IDetailsListProps {
  
  inline def apply(items: js.Array[Any]): IDetailsListProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListProps]
  }
  
  extension [Self <: IDetailsListProps](x: Self) {
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelForGrid(value: String): Self = StObject.set(x, "ariaLabelForGrid", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelForGridUndefined: Self = StObject.set(x, "ariaLabelForGrid", js.undefined)
    
    inline def setAriaLabelForListHeader(value: String): Self = StObject.set(x, "ariaLabelForListHeader", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelForListHeaderUndefined: Self = StObject.set(x, "ariaLabelForListHeader", js.undefined)
    
    inline def setAriaLabelForSelectAllCheckbox(value: String): Self = StObject.set(x, "ariaLabelForSelectAllCheckbox", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelForSelectAllCheckboxUndefined: Self = StObject.set(x, "ariaLabelForSelectAllCheckbox", js.undefined)
    
    inline def setAriaLabelForSelectionColumn(value: String): Self = StObject.set(x, "ariaLabelForSelectionColumn", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelForSelectionColumnUndefined: Self = StObject.set(x, "ariaLabelForSelectionColumn", js.undefined)
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setCellStyleProps(value: ICellStyleProps): Self = StObject.set(x, "cellStyleProps", value.asInstanceOf[js.Any])
    
    inline def setCellStylePropsUndefined: Self = StObject.set(x, "cellStyleProps", js.undefined)
    
    inline def setCheckButtonAriaLabel(value: String): Self = StObject.set(x, "checkButtonAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setCheckButtonAriaLabelUndefined: Self = StObject.set(x, "checkButtonAriaLabel", js.undefined)
    
    inline def setCheckButtonGroupAriaLabel(value: String): Self = StObject.set(x, "checkButtonGroupAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setCheckButtonGroupAriaLabelUndefined: Self = StObject.set(x, "checkButtonGroupAriaLabel", js.undefined)
    
    inline def setCheckboxCellClassName(value: String): Self = StObject.set(x, "checkboxCellClassName", value.asInstanceOf[js.Any])
    
    inline def setCheckboxCellClassNameUndefined: Self = StObject.set(x, "checkboxCellClassName", js.undefined)
    
    inline def setCheckboxVisibility(value: CheckboxVisibility): Self = StObject.set(x, "checkboxVisibility", value.asInstanceOf[js.Any])
    
    inline def setCheckboxVisibilityUndefined: Self = StObject.set(x, "checkboxVisibility", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColumnReorderOptions(value: IColumnReorderOptions): Self = StObject.set(x, "columnReorderOptions", value.asInstanceOf[js.Any])
    
    inline def setColumnReorderOptionsUndefined: Self = StObject.set(x, "columnReorderOptions", js.undefined)
    
    inline def setColumns(value: js.Array[IColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: IColumn*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    inline def setConstrainMode(value: ConstrainMode): Self = StObject.set(x, "constrainMode", value.asInstanceOf[js.Any])
    
    inline def setConstrainModeUndefined: Self = StObject.set(x, "constrainMode", js.undefined)
    
    inline def setDisableSelectionZone(value: Boolean): Self = StObject.set(x, "disableSelectionZone", value.asInstanceOf[js.Any])
    
    inline def setDisableSelectionZoneUndefined: Self = StObject.set(x, "disableSelectionZone", js.undefined)
    
    inline def setDragDropEvents(value: IDragDropEvents): Self = StObject.set(x, "dragDropEvents", value.asInstanceOf[js.Any])
    
    inline def setDragDropEventsUndefined: Self = StObject.set(x, "dragDropEvents", js.undefined)
    
    inline def setEnableUpdateAnimations(value: Boolean): Self = StObject.set(x, "enableUpdateAnimations", value.asInstanceOf[js.Any])
    
    inline def setEnableUpdateAnimationsUndefined: Self = StObject.set(x, "enableUpdateAnimations", js.undefined)
    
    inline def setEnterModalSelectionOnTouch(value: Boolean): Self = StObject.set(x, "enterModalSelectionOnTouch", value.asInstanceOf[js.Any])
    
    inline def setEnterModalSelectionOnTouchUndefined: Self = StObject.set(x, "enterModalSelectionOnTouch", js.undefined)
    
    inline def setFlexMargin(value: Double): Self = StObject.set(x, "flexMargin", value.asInstanceOf[js.Any])
    
    inline def setFlexMarginUndefined: Self = StObject.set(x, "flexMargin", js.undefined)
    
    inline def setGetCellValueKey(
      value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
    ): Self = StObject.set(x, "getCellValueKey", js.Any.fromFunction3(value))
    
    inline def setGetCellValueKeyUndefined: Self = StObject.set(x, "getCellValueKey", js.undefined)
    
    inline def setGetGroupHeight(value: (/* group */ IGroup, /* groupIndex */ Double) => Double): Self = StObject.set(x, "getGroupHeight", js.Any.fromFunction2(value))
    
    inline def setGetGroupHeightUndefined: Self = StObject.set(x, "getGroupHeight", js.undefined)
    
    inline def setGetKey(value: (/* item */ Any, /* index */ js.UndefOr[Double]) => String): Self = StObject.set(x, "getKey", js.Any.fromFunction2(value))
    
    inline def setGetKeyUndefined: Self = StObject.set(x, "getKey", js.undefined)
    
    inline def setGetRowAriaDescribedBy(value: /* item */ Any => String): Self = StObject.set(x, "getRowAriaDescribedBy", js.Any.fromFunction1(value))
    
    inline def setGetRowAriaDescribedByUndefined: Self = StObject.set(x, "getRowAriaDescribedBy", js.undefined)
    
    inline def setGetRowAriaLabel(value: /* item */ Any => String): Self = StObject.set(x, "getRowAriaLabel", js.Any.fromFunction1(value))
    
    inline def setGetRowAriaLabelUndefined: Self = StObject.set(x, "getRowAriaLabel", js.undefined)
    
    inline def setGroupProps(value: IDetailsGroupRenderProps): Self = StObject.set(x, "groupProps", value.asInstanceOf[js.Any])
    
    inline def setGroupPropsUndefined: Self = StObject.set(x, "groupProps", js.undefined)
    
    inline def setGroups(value: js.Array[IGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: IGroup*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setIndentWidth(value: Double): Self = StObject.set(x, "indentWidth", value.asInstanceOf[js.Any])
    
    inline def setIndentWidthUndefined: Self = StObject.set(x, "indentWidth", js.undefined)
    
    inline def setInitialFocusedIndex(value: Double): Self = StObject.set(x, "initialFocusedIndex", value.asInstanceOf[js.Any])
    
    inline def setInitialFocusedIndexUndefined: Self = StObject.set(x, "initialFocusedIndex", js.undefined)
    
    inline def setIsHeaderVisible(value: Boolean): Self = StObject.set(x, "isHeaderVisible", value.asInstanceOf[js.Any])
    
    inline def setIsHeaderVisibleUndefined: Self = StObject.set(x, "isHeaderVisible", js.undefined)
    
    inline def setIsPlaceholderData(value: Boolean): Self = StObject.set(x, "isPlaceholderData", value.asInstanceOf[js.Any])
    
    inline def setIsPlaceholderDataUndefined: Self = StObject.set(x, "isPlaceholderData", js.undefined)
    
    inline def setIsSelectedOnFocus(value: Boolean): Self = StObject.set(x, "isSelectedOnFocus", value.asInstanceOf[js.Any])
    
    inline def setIsSelectedOnFocusUndefined: Self = StObject.set(x, "isSelectedOnFocus", js.undefined)
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLayoutMode(value: DetailsListLayoutMode): Self = StObject.set(x, "layoutMode", value.asInstanceOf[js.Any])
    
    inline def setLayoutModeUndefined: Self = StObject.set(x, "layoutMode", js.undefined)
    
    inline def setListProps(value: IListProps[Any]): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
    
    inline def setListPropsUndefined: Self = StObject.set(x, "listProps", js.undefined)
    
    inline def setMinimumPixelsForDrag(value: Double): Self = StObject.set(x, "minimumPixelsForDrag", value.asInstanceOf[js.Any])
    
    inline def setMinimumPixelsForDragUndefined: Self = StObject.set(x, "minimumPixelsForDrag", js.undefined)
    
    inline def setOnActiveItemChanged(
      value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[FocusEvent[HTMLElement, Element]]) => Unit
    ): Self = StObject.set(x, "onActiveItemChanged", js.Any.fromFunction3(value))
    
    inline def setOnActiveItemChangedUndefined: Self = StObject.set(x, "onActiveItemChanged", js.undefined)
    
    inline def setOnColumnHeaderClick(
      value: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* column */ js.UndefOr[IColumn]) => Unit
    ): Self = StObject.set(x, "onColumnHeaderClick", js.Any.fromFunction2(value))
    
    inline def setOnColumnHeaderClickUndefined: Self = StObject.set(x, "onColumnHeaderClick", js.undefined)
    
    inline def setOnColumnHeaderContextMenu(
      value: (/* column */ js.UndefOr[IColumn], /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]]) => Unit
    ): Self = StObject.set(x, "onColumnHeaderContextMenu", js.Any.fromFunction2(value))
    
    inline def setOnColumnHeaderContextMenuUndefined: Self = StObject.set(x, "onColumnHeaderContextMenu", js.undefined)
    
    inline def setOnColumnResize(
      value: (/* column */ js.UndefOr[IColumn], /* newWidth */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Unit
    ): Self = StObject.set(x, "onColumnResize", js.Any.fromFunction3(value))
    
    inline def setOnColumnResizeUndefined: Self = StObject.set(x, "onColumnResize", js.undefined)
    
    inline def setOnDidUpdate(value: /* detailsList */ js.UndefOr[DetailsListBase] => Unit): Self = StObject.set(x, "onDidUpdate", js.Any.fromFunction1(value))
    
    inline def setOnDidUpdateUndefined: Self = StObject.set(x, "onDidUpdate", js.undefined)
    
    inline def setOnItemContextMenu(
      value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit | Boolean
    ): Self = StObject.set(x, "onItemContextMenu", js.Any.fromFunction3(value))
    
    inline def setOnItemContextMenuUndefined: Self = StObject.set(x, "onItemContextMenu", js.undefined)
    
    inline def setOnItemInvoked(
      value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit
    ): Self = StObject.set(x, "onItemInvoked", js.Any.fromFunction3(value))
    
    inline def setOnItemInvokedUndefined: Self = StObject.set(x, "onItemInvoked", js.undefined)
    
    inline def setOnRenderCheckbox(
      value: (/* props */ js.UndefOr[IDetailsListCheckboxProps], /* defaultRender */ js.UndefOr[
          js.Function1[
            /* props */ js.UndefOr[IDetailsListCheckboxProps], 
            typings.react.mod.global.JSX.Element | Null
          ]
        ]) => typings.react.mod.global.JSX.Element | Null
    ): Self = StObject.set(x, "onRenderCheckbox", js.Any.fromFunction2(value))
    
    inline def setOnRenderCheckboxUndefined: Self = StObject.set(x, "onRenderCheckbox", js.undefined)
    
    inline def setOnRenderDetailsFooter(
      value: (/* props */ js.UndefOr[IDetailsFooterProps], /* defaultRender */ js.UndefOr[
          js.Function1[
            /* props */ js.UndefOr[IDetailsFooterProps], 
            typings.react.mod.global.JSX.Element | Null
          ]
        ]) => typings.react.mod.global.JSX.Element | Null
    ): Self = StObject.set(x, "onRenderDetailsFooter", js.Any.fromFunction2(value))
    
    inline def setOnRenderDetailsFooterUndefined: Self = StObject.set(x, "onRenderDetailsFooter", js.undefined)
    
    inline def setOnRenderDetailsHeader(
      value: (/* props */ js.UndefOr[IDetailsHeaderProps], /* defaultRender */ js.UndefOr[
          js.Function1[
            /* props */ js.UndefOr[IDetailsHeaderProps], 
            typings.react.mod.global.JSX.Element | Null
          ]
        ]) => typings.react.mod.global.JSX.Element | Null
    ): Self = StObject.set(x, "onRenderDetailsHeader", js.Any.fromFunction2(value))
    
    inline def setOnRenderDetailsHeaderUndefined: Self = StObject.set(x, "onRenderDetailsHeader", js.undefined)
    
    inline def setOnRenderItemColumn(
      value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => ReactNode
    ): Self = StObject.set(x, "onRenderItemColumn", js.Any.fromFunction3(value))
    
    inline def setOnRenderItemColumnUndefined: Self = StObject.set(x, "onRenderItemColumn", js.undefined)
    
    inline def setOnRenderMissingItem(value: (/* index */ js.UndefOr[Double], /* rowProps */ js.UndefOr[IDetailsRowProps]) => ReactNode): Self = StObject.set(x, "onRenderMissingItem", js.Any.fromFunction2(value))
    
    inline def setOnRenderMissingItemUndefined: Self = StObject.set(x, "onRenderMissingItem", js.undefined)
    
    inline def setOnRenderRow(
      value: (/* props */ js.UndefOr[IDetailsRowProps], /* defaultRender */ js.UndefOr[
          js.Function1[
            /* props */ js.UndefOr[IDetailsRowProps], 
            typings.react.mod.global.JSX.Element | Null
          ]
        ]) => typings.react.mod.global.JSX.Element | Null
    ): Self = StObject.set(x, "onRenderRow", js.Any.fromFunction2(value))
    
    inline def setOnRenderRowUndefined: Self = StObject.set(x, "onRenderRow", js.undefined)
    
    inline def setOnRowDidMount(value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onRowDidMount", js.Any.fromFunction2(value))
    
    inline def setOnRowDidMountUndefined: Self = StObject.set(x, "onRowDidMount", js.undefined)
    
    inline def setOnRowWillUnmount(value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onRowWillUnmount", js.Any.fromFunction2(value))
    
    inline def setOnRowWillUnmountUndefined: Self = StObject.set(x, "onRowWillUnmount", js.undefined)
    
    inline def setOnShouldVirtualize(value: /* props */ IListProps[Any] => Boolean): Self = StObject.set(x, "onShouldVirtualize", js.Any.fromFunction1(value))
    
    inline def setOnShouldVirtualizeUndefined: Self = StObject.set(x, "onShouldVirtualize", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRowElementEventMap(value: js.Array[Callback]): Self = StObject.set(x, "rowElementEventMap", value.asInstanceOf[js.Any])
    
    inline def setRowElementEventMapUndefined: Self = StObject.set(x, "rowElementEventMap", js.undefined)
    
    inline def setRowElementEventMapVarargs(value: Callback*): Self = StObject.set(x, "rowElementEventMap", js.Array(value*))
    
    inline def setSelection(value: ISelection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setSelectionPreservedOnEmptyClick(value: Boolean): Self = StObject.set(x, "selectionPreservedOnEmptyClick", value.asInstanceOf[js.Any])
    
    inline def setSelectionPreservedOnEmptyClickUndefined: Self = StObject.set(x, "selectionPreservedOnEmptyClick", js.undefined)
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setSelectionZoneProps(value: ISelectionZoneProps): Self = StObject.set(x, "selectionZoneProps", value.asInstanceOf[js.Any])
    
    inline def setSelectionZonePropsUndefined: Self = StObject.set(x, "selectionZoneProps", js.undefined)
    
    inline def setSetKey(value: String): Self = StObject.set(x, "setKey", value.asInstanceOf[js.Any])
    
    inline def setSetKeyUndefined: Self = StObject.set(x, "setKey", js.undefined)
    
    inline def setShouldApplyApplicationRole(value: Boolean): Self = StObject.set(x, "shouldApplyApplicationRole", value.asInstanceOf[js.Any])
    
    inline def setShouldApplyApplicationRoleUndefined: Self = StObject.set(x, "shouldApplyApplicationRole", js.undefined)
    
    inline def setStyles(value: IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesFunction1(value: IDetailsListStyleProps => DeepPartial[IDetailsListStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setUseFastIcons(value: Boolean): Self = StObject.set(x, "useFastIcons", value.asInstanceOf[js.Any])
    
    inline def setUseFastIconsUndefined: Self = StObject.set(x, "useFastIcons", js.undefined)
    
    inline def setUsePageCache(value: Boolean): Self = StObject.set(x, "usePageCache", value.asInstanceOf[js.Any])
    
    inline def setUsePageCacheUndefined: Self = StObject.set(x, "usePageCache", js.undefined)
    
    inline def setUseReducedRowRenderer(value: Boolean): Self = StObject.set(x, "useReducedRowRenderer", value.asInstanceOf[js.Any])
    
    inline def setUseReducedRowRendererUndefined: Self = StObject.set(x, "useReducedRowRenderer", js.undefined)
    
    inline def setViewport(value: IViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
