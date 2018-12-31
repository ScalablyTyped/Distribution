package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsColumnDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsColumnProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[
      officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsColumnDotBaseMod.DetailsColumnBase
    ] {
  var cellStyleProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotTypesMod.ICellStyleProps
  ] = js.undefined
  var column: officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IColumn
  var columnIndex: scala.Double
  var componentRef: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var dragDropHelper: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesDragdropInterfacesMod.IDragDropHelper | scala.Null
  ] = js.undefined
  var isDraggable: js.UndefOr[scala.Boolean] = js.undefined
  var isDropped: js.UndefOr[scala.Boolean] = js.undefined
  var onColumnClick: js.UndefOr[
    js.Function2[
      /* ev */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* column */ officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IColumn, 
      scala.Unit
    ]
  ] = js.undefined
  var onColumnContextMenu: js.UndefOr[
    js.Function2[
      /* column */ officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IColumn, 
      /* ev */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onRenderColumnHeaderTooltip: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[
      officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipHostDotTypesMod.ITooltipHostProps
    ]
  ] = js.undefined
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  var setDraggedItemIndex: js.UndefOr[js.Function1[/* itemIndex */ scala.Double, scala.Unit]] = js.undefined
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]
  ] = js.undefined
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  var updateDragInfo: js.UndefOr[
    js.Function2[
      /* props */ officeDashUiDashFabricDashReactLib.Anon_ItemIndex, 
      /* event */ js.UndefOr[reactLib.MouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
}

