package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsColumnDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.Anon_ItemIndex
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsColumnDotBaseMod.DetailsColumnBase
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IColumn
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod.ICellStyleProps
import typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod.ITooltipHostProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesDragdropInterfacesMod.IDragDropHelper
import typings.react.NativeMouseEvent
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.Global.JSX.Element
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsColumnProps extends ClassAttributes[DetailsColumnBase] {
  /**
    * Custom styles for cell rendering.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
  /**
    * The column definition for the component instance.
    */
  var column: IColumn
  /**
    * The column index for the component instance.
    */
  var columnIndex: Double
  /**
    * A reference to the component instance.
    */
  var componentRef: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The drag and drop helper for the component instance.
    */
  var dragDropHelper: js.UndefOr[IDragDropHelper | Null] = js.undefined
  /**
    * Whether or not the column can be re-ordered via drag and drop.
    */
  var isDraggable: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not the column has been dropped via drag and drop.
    */
  var isDropped: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback fired when click event occurs.
    */
  var onColumnClick: js.UndefOr[
    js.Function2[/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn, Unit]
  ] = js.undefined
  /**
    * Callback fired on contextual menu event to provide contextual menu UI.
    */
  var onColumnContextMenu: js.UndefOr[
    js.Function2[/* column */ IColumn, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  ] = js.undefined
  /**
    * Render function for providing a column header tooltip.
    */
  var onRenderColumnHeaderTooltip: js.UndefOr[IRenderFunction[ITooltipHostProps]] = js.undefined
  /**
    * Parent ID used for accessibility label(s).
    */
  var parentId: js.UndefOr[String] = js.undefined
  /**
    * @deprecated use `updateDragInfo`
    */
  var setDraggedItemIndex: js.UndefOr[js.Function1[/* itemIndex */ Double, Unit]] = js.undefined
  /**
    * The component styles to respect during render.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]] = js.undefined
  /**
    * The theme object to respect during render.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Callback on drag and drop event.
    */
  var updateDragInfo: js.UndefOr[
    js.Function2[/* props */ Anon_ItemIndex, /* event */ js.UndefOr[typings.std.MouseEvent], Unit]
  ] = js.undefined
  /**
    * Whether to use fast icon and check components. The icons can't be targeted by customization
    * but are still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.undefined
}

object IDetailsColumnProps {
  @scala.inline
  def apply(
    column: IColumn,
    columnIndex: Double,
    cellStyleProps: ICellStyleProps = null,
    componentRef: () => Unit = null,
    dragDropHelper: IDragDropHelper = null,
    isDraggable: js.UndefOr[Boolean] = js.undefined,
    isDropped: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    onColumnClick: (/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn) => Unit = null,
    onColumnContextMenu: (/* column */ IColumn, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onRenderColumnHeaderTooltip: (/* props */ js.UndefOr[ITooltipHostProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITooltipHostProps], Element | Null]]) => Element | Null = null,
    parentId: String = null,
    ref: LegacyRef[DetailsColumnBase] = null,
    setDraggedItemIndex: /* itemIndex */ Double => Unit = null,
    styles: IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles] = null,
    theme: ITheme = null,
    updateDragInfo: (/* props */ Anon_ItemIndex, /* event */ js.UndefOr[typings.std.MouseEvent]) => Unit = null,
    useFastIcons: js.UndefOr[Boolean] = js.undefined
  ): IDetailsColumnProps = {
    val __obj = js.Dynamic.literal(column = column, columnIndex = columnIndex)
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps)
    if (componentRef != null) __obj.updateDynamic("componentRef")(js.Any.fromFunction0(componentRef))
    if (dragDropHelper != null) __obj.updateDynamic("dragDropHelper")(dragDropHelper)
    if (!js.isUndefined(isDraggable)) __obj.updateDynamic("isDraggable")(isDraggable)
    if (!js.isUndefined(isDropped)) __obj.updateDynamic("isDropped")(isDropped)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onColumnClick != null) __obj.updateDynamic("onColumnClick")(js.Any.fromFunction2(onColumnClick))
    if (onColumnContextMenu != null) __obj.updateDynamic("onColumnContextMenu")(js.Any.fromFunction2(onColumnContextMenu))
    if (onRenderColumnHeaderTooltip != null) __obj.updateDynamic("onRenderColumnHeaderTooltip")(js.Any.fromFunction2(onRenderColumnHeaderTooltip))
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (setDraggedItemIndex != null) __obj.updateDynamic("setDraggedItemIndex")(js.Any.fromFunction1(setDraggedItemIndex))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (updateDragInfo != null) __obj.updateDynamic("updateDragInfo")(js.Any.fromFunction2(updateDragInfo))
    if (!js.isUndefined(useFastIcons)) __obj.updateDynamic("useFastIcons")(useFastIcons)
    __obj.asInstanceOf[IDetailsColumnProps]
  }
}

