package typings.officeUiFabricReact.detailsColumnTypesMod

import typings.officeUiFabricReact.anon.ItemIndex
import typings.officeUiFabricReact.detailsColumnBaseMod.DetailsColumnBase
import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typings.react.mod.ClassAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
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
  var onRenderColumnHeaderTooltip: js.UndefOr[IRenderFunction[IDetailsColumnRenderTooltipProps]] = js.undefined
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
    js.Function2[/* props */ ItemIndex, /* event */ js.UndefOr[typings.std.MouseEvent], Unit]
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
    dragDropHelper: js.UndefOr[Null | IDragDropHelper] = js.undefined,
    isDraggable: js.UndefOr[Boolean] = js.undefined,
    isDropped: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    onColumnClick: (/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn) => Unit = null,
    onColumnContextMenu: (/* column */ IColumn, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onRenderColumnHeaderTooltip: (/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], /* defaultRender */ js.UndefOr[
      js.Function1[/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], Element | Null]
    ]) => Element | Null = null,
    parentId: String = null,
    ref: js.UndefOr[Null | LegacyRef[DetailsColumnBase]] = js.undefined,
    setDraggedItemIndex: /* itemIndex */ Double => Unit = null,
    styles: IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles] = null,
    theme: ITheme = null,
    updateDragInfo: (/* props */ ItemIndex, /* event */ js.UndefOr[typings.std.MouseEvent]) => Unit = null,
    useFastIcons: js.UndefOr[Boolean] = js.undefined
  ): IDetailsColumnProps = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(js.Any.fromFunction0(componentRef))
    if (!js.isUndefined(dragDropHelper)) __obj.updateDynamic("dragDropHelper")(dragDropHelper.asInstanceOf[js.Any])
    if (!js.isUndefined(isDraggable)) __obj.updateDynamic("isDraggable")(isDraggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDropped)) __obj.updateDynamic("isDropped")(isDropped.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onColumnClick != null) __obj.updateDynamic("onColumnClick")(js.Any.fromFunction2(onColumnClick))
    if (onColumnContextMenu != null) __obj.updateDynamic("onColumnContextMenu")(js.Any.fromFunction2(onColumnContextMenu))
    if (onRenderColumnHeaderTooltip != null) __obj.updateDynamic("onRenderColumnHeaderTooltip")(js.Any.fromFunction2(onRenderColumnHeaderTooltip))
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (setDraggedItemIndex != null) __obj.updateDynamic("setDraggedItemIndex")(js.Any.fromFunction1(setDraggedItemIndex))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (updateDragInfo != null) __obj.updateDynamic("updateDragInfo")(js.Any.fromFunction2(updateDragInfo))
    if (!js.isUndefined(useFastIcons)) __obj.updateDynamic("useFastIcons")(useFastIcons.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsColumnProps]
  }
}

