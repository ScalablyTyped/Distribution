package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDetailsListProps
  extends atUifabricUtilitiesLib.libBaseComponentMod.IBaseProps[IDetailsList]
     with officeDashUiDashFabricDashReactLib.libUtilitiesDecoratorsWithViewportMod.IWithViewportProps {
  /** A text summary of the table set via aria-label. */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /** Aria label for grid in details list. */
  var ariaLabelForGrid: js.UndefOr[java.lang.String] = js.undefined
  /** The aria-label attribute to stamp out on the list header */
  var ariaLabelForListHeader: js.UndefOr[java.lang.String] = js.undefined
  /** The aria-label attribute to stamp out on select all checkbox for the list */
  var ariaLabelForSelectAllCheckbox: js.UndefOr[java.lang.String] = js.undefined
  /**
       * An ARIA label for the name of the selection column, for localization.
       */
  var ariaLabelForSelectionColumn: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Props impacting the render style of cells. Since these have an impact on calculated column widths, they are
       * handled separately from normal theme styling, but they are passed to the styling system.
       */
  var cellStyleProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotTypesMod.ICellStyleProps
  ] = js.undefined
  /** Check button aria label for details list. */
  var checkButtonAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional class name to add to the cell of a checkbox
       */
  var checkboxCellClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Controls the visibility of selection check box.
       * @defaultvalue CheckboxVisibility.onHover
       */
  var checkboxVisibility: js.UndefOr[CheckboxVisibility] = js.undefined
  /** Optional class name to add to the root element. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Options for column re-order using drag and drop
       */
  var columnReorderOptions: js.UndefOr[IColumnReorderOptions] = js.undefined
  /** Given column defitions. If none are provided, default columns will be created based on the item's properties. */
  var columns: js.UndefOr[js.Array[IColumn]] = js.undefined
  /** Boolean value to indicate if the component should render in compact mode. Set to false by default */
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  /** Controls how the list contrains overflow. */
  var constrainMode: js.UndefOr[ConstrainMode] = js.undefined
  /**
       * Whether or not to disable the built-in SelectionZone, so the host component can provide its own.
       */
  var disableSelectionZone: js.UndefOr[scala.Boolean] = js.undefined
  /** Map of callback functions related to row drag and drop functionality. */
  var dragDropEvents: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesDragdropInterfacesMod.IDragDropEvents
  ] = js.undefined
  /**
       * If set to true and we provide an empty array, it will render 10 lines of whatever provided in onRenderMissingItem.
       * @defaultvalue false
       */
  var enableShimmer: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether or not the selection zone should enter modal state on touch.
       */
  var enterModalSelectionOnTouch: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Optional function which will be called to estimate the height (in pixels) of the given group.
       *
       * By default, scrolling through a large virtualized GroupedList will often "jump" due to the order
       * in which heights are calculated. For more details, see https://github.com/OfficeDev/office-ui-fabric-react/issues/5094
       *
       * Pass this prop to ensure the list uses the computed height rather than cached DOM measurements,
       * avoiding the scroll jumping issue.
       */
  var getGroupHeight: js.UndefOr[
    js.Function2[
      /* group */ officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotTypesMod.IGroup, 
      /* groupIndex */ scala.Double, 
      scala.Double
    ]
  ] = js.undefined
  /** Optional callback to get the item key, to be used in the selection and on render. */
  var getKey: js.UndefOr[
    js.Function2[/* item */ js.Any, /* index */ js.UndefOr[scala.Double], java.lang.String]
  ] = js.undefined
  /** Optional callback to get the aria-describedby IDs (space separated strings) of the elements that describe the item. */
  var getRowAriaDescribedBy: js.UndefOr[js.Function1[/* item */ js.Any, java.lang.String]] = js.undefined
  /** Optional callback to get the aria-label string for a given item. */
  var getRowAriaLabel: js.UndefOr[js.Function1[/* item */ js.Any, java.lang.String]] = js.undefined
  /** Optional override properties to render groups. The definition for IGroupRenderProps can be found under the GroupedList component. */
  var groupProps: js.UndefOr[IDetailsGroupRenderProps] = js.undefined
  /** Optional grouping instructions. The definition for IGroup can be found under the GroupedList component. */
  var groups: js.UndefOr[
    js.Array[
      officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotTypesMod.IGroup
    ]
  ] = js.undefined
  /** Optional override for the indent width used for group nesting. */
  var indentWidth: js.UndefOr[scala.Double] = js.undefined
  /**
       * Optional default focused index to set focus to once the items have rendered and the index exists.
       */
  var initialFocusedIndex: js.UndefOr[scala.Double] = js.undefined
  /**
       * Controls the visibility of the details header.
       * @defaultvalue true
       */
  var isHeaderVisible: js.UndefOr[scala.Boolean] = js.undefined
  /** The items to render. */
  var items: js.Array[_]
  /** Controls how the columns are adjusted. */
  var layoutMode: js.UndefOr[DetailsListLayoutMode] = js.undefined
  /** Optional properties to pass through to the list components being rendered. */
  var listProps: js.UndefOr[officeDashUiDashFabricDashReactLib.libComponentsListListDotTypesMod.IListProps] = js.undefined
  /**
       * The minimum mouse move distance to interpret the action as drag event.
       * @defaultvalue 5
       */
  var minimumPixelsForDrag: js.UndefOr[scala.Double] = js.undefined
  /** Callback for when an item in the list becomes active by clicking anywhere inside the row or navigating to it with keyboard. */
  var onActiveItemChanged: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[scala.Double], 
      /* ev */ js.UndefOr[reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement]], 
      scala.Unit
    ]
  ] = js.undefined
  /** Callback for when the user clicks on the column header. */
  var onColumnHeaderClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[
        reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]
      ], 
      /* column */ js.UndefOr[IColumn], 
      scala.Unit
    ]
  ] = js.undefined
  /** Callback for when the user asks for a contextual menu (usually via right click) from a column header. */
  var onColumnHeaderContextMenu: js.UndefOr[
    js.Function2[
      /* column */ js.UndefOr[IColumn], 
      /* ev */ js.UndefOr[
        reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]
      ], 
      scala.Unit
    ]
  ] = js.undefined
  /** Callback fired on column resize */
  var onColumnResize: js.UndefOr[
    js.Function3[
      /* column */ js.UndefOr[IColumn], 
      /* newWidth */ js.UndefOr[scala.Double], 
      /* columnIndex */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** Callback for when the details list has been updated. Useful for telemetry tracking externally. */
  var onDidUpdate: js.UndefOr[
    js.Function1[
      /* detailsList */ js.UndefOr[
        officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotBaseMod.DetailsListBase
      ], 
      _
    ]
  ] = js.undefined
  /**
       * Callback for when the context menu of an item has been accessed.
       * If undefined or false are returned, ev.preventDefault() will be called.
       */
  var onItemContextMenu: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[scala.Double], 
      /* ev */ js.UndefOr[reactLib.Event], 
      scala.Unit | scala.Boolean
    ]
  ] = js.undefined
  /** Callback for when a given row has been invoked (by pressing enter while it is selected.) */
  var onItemInvoked: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[scala.Double], 
      /* ev */ js.UndefOr[reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * An override to render the details footer.
       */
  var onRenderDetailsFooter: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[
      officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsFooterDotTypesMod.IDetailsFooterProps
    ]
  ] = js.undefined
  /**
       * An override to render the details header.
       */
  var onRenderDetailsHeader: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[
      officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsHeaderDotTypesMod.IDetailsHeaderProps
    ]
  ] = js.undefined
  /**
       * If provided, will be the "default" item column renderer method. This affects cells within the rows; not the rows themselves.
       * If a column definition provides its own onRender method, that will be used instead of this.
       */
  var onRenderItemColumn: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[scala.Double], 
      /* column */ js.UndefOr[IColumn], 
      _
    ]
  ] = js.undefined
  /** Callback for what to render when the item is missing. */
  var onRenderMissingItem: js.UndefOr[
    js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* rowProps */ js.UndefOr[
        officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsRowProps
      ], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  /**
       *  If provided, will allow the caller to override the default row rendering.
       */
  var onRenderRow: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[
      officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsRowProps
    ]
  ] = js.undefined
  /** Callback for when a given row has been mounted. Useful for identifying when a row has been rendered on the page. */
  var onRowDidMount: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  /** Callback for when a given row has been unmounted. Useful for identifying when a row has been removed from the page. */
  var onRowWillUnmount: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  /**
       * Optional callback to determine whether the list should be rendered in full, or virtualized.
       * Virtualization will add and remove pages of items as the user scrolls them into the visible range.
       * This benefits larger list scenarios by reducing the DOM on the screen, but can negatively affect performance for smaller lists.
       * The default implementation will virtualize when this callback is not provided.
       */
  var onShouldVirtualize: js.UndefOr[
    js.Function1[
      /* props */ officeDashUiDashFabricDashReactLib.libComponentsListListDotTypesMod.IListProps, 
      scala.Boolean
    ]
  ] = js.undefined
  /** Event names and corresponding callbacks that will be registered to rendered row elements. */
  var rowElementEventMap: js.UndefOr[js.Array[officeDashUiDashFabricDashReactLib.Anon_EventNameCallback]] = js.undefined
  /** Optional selection model to track selection state.  */
  var selection: js.UndefOr[officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.ISelection] = js.undefined
  /** Controls how/if the details list manages selection. Options include none, single, multiple */
  var selectionMode: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.SelectionMode
  ] = js.undefined
  /**
       * By default, selection is cleared when clicking on an empty (non-focusable) section of the screen. Setting this value to true
       * overrides that behavior and maintains selection.
       * @defaultvalue false
       **/
  var selectionPreservedOnEmptyClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Addition props to pass through to the selection zone created by default.
       */
  var selectionZoneProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesSelectionSelectionZoneMod.ISelectionZoneProps
  ] = js.undefined
  /** A key that uniquely identifies the given items. If provided, the selection will be reset when the key changes. */
  var setKey: js.UndefOr[java.lang.String] = js.undefined
  /** Boolean value to indicate if the role application should be applied on details list. Set to false by default */
  var shouldApplyApplicationRole: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Style function to be passed in to override the themed or default styles
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]
  ] = js.undefined
  /**
       * Theme provided by the Higher Order Component
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * Boolean value to enable render page caching. This is an experimental performance optimization
       * that is off by default.
       * @defaultvalue false
       */
  var usePageCache: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Rerender DetailsRow only when props changed. Might cause regression when depending on external updates.
       * @defaultvalue false
       */
  var useReducedRowRenderer: js.UndefOr[scala.Boolean] = js.undefined
  /** Viewport, provided by the withViewport decorator. */
  var viewport: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesDecoratorsWithViewportMod.IViewport
  ] = js.undefined
}

