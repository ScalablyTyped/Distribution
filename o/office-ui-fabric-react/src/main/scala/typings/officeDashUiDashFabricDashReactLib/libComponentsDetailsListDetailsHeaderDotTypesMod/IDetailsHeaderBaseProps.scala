package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsHeaderDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDetailsHeaderBaseProps
  extends reactLib.reactMod.ReactNs.Props[
      officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsHeaderDotBaseMod.DetailsHeaderBase
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsItemProps {
  /** ariaLabel for the entire header */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /** ariaLabel for the header checkbox that selects or deselects everything */
  var ariaLabelForSelectAllCheckbox: js.UndefOr[java.lang.String] = js.undefined
  /** ariaLabel for the selection column */
  var ariaLabelForSelectionColumn: js.UndefOr[java.lang.String] = js.undefined
  /** Overriding class name */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to collapse for all visibility */
  var collapseAllVisibility: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility
  ] = js.undefined
  /** Column reordering options */
  var columnReorderOptions: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IColumnReorderOptions
  ] = js.undefined
  /** Column reordering options */
  var columnReorderProps: js.UndefOr[IColumnReorderHeaderProps] = js.undefined
  /** Ref to the component itself */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IDetailsHeader]] = js.undefined
  /** Whether or not all is collapsed */
  var isAllCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  /** Layout mode - fixedColumns or justified */
  var layoutMode: officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.DetailsListLayoutMode
  /** Minimum pixels to be moved before dragging is registered */
  var minimumPixelsForDrag: js.UndefOr[scala.Double] = js.undefined
  /** Callback for when column is automatically resized */
  var onColumnAutoResized: js.UndefOr[
    js.Function2[
      /* column */ officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IColumn, 
      /* columnIndex */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** Callback for when the column is clicked */
  var onColumnClick: js.UndefOr[
    js.Function2[
      /* ev */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
      /* column */ officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IColumn, 
      scala.Unit
    ]
  ] = js.undefined
  /** Callback for when the column needs to show a context menu */
  var onColumnContextMenu: js.UndefOr[
    js.Function2[
      /* column */ officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IColumn, 
      /* ev */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
  /** Callback for when column sizing has changed */
  var onColumnIsSizingChanged: js.UndefOr[
    js.Function2[
      /* column */ officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IColumn, 
      /* isSizing */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  /** Callback for when column is resized */
  var onColumnResized: js.UndefOr[
    js.Function3[
      /* column */ officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IColumn, 
      /* newWidth */ scala.Double, 
      /* columnIndex */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** Callback to render a tooltip for the column header */
  var onRenderColumnHeaderTooltip: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[
      officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipHostDotTypesMod.ITooltipHostProps
    ]
  ] = js.undefined
  /** Callback for when collapse all is toggled */
  var onToggleCollapseAll: js.UndefOr[js.Function1[/* isAllCollapsed */ scala.Boolean, scala.Unit]] = js.undefined
  /** Select all button visibility */
  var selectAllVisibility: js.UndefOr[SelectAllVisibility] = js.undefined
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IDetailsHeaderStyleProps, IDetailsHeaderStyles]
  ] = js.undefined
  /** Theme from the Higher Order Component */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

