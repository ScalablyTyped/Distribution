package typings.officeUiFabricReact.detailsColumnTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.anon.ItemIndex
import typings.officeUiFabricReact.detailsColumnBaseMod.DetailsColumnBase
import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typings.react.mod.ClassAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDetailsColumnProps extends ClassAttributes[DetailsColumnBase] {
  
  /**
    * Custom styles for cell rendering.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.native
  
  /**
    * The column definition for the component instance.
    */
  var column: IColumn = js.native
  
  /**
    * The column index for the component instance.
    */
  var columnIndex: Double = js.native
  
  /**
    * A reference to the component instance.
    */
  var componentRef: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * The drag and drop helper for the component instance.
    */
  var dragDropHelper: js.UndefOr[IDragDropHelper | Null] = js.native
  
  /**
    * Whether or not the column can be re-ordered via drag and drop.
    */
  var isDraggable: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not the column has been dropped via drag and drop.
    */
  var isDropped: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback fired when click event occurs.
    */
  var onColumnClick: js.UndefOr[
    js.Function2[/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn, Unit]
  ] = js.native
  
  /**
    * Callback fired on contextual menu event to provide contextual menu UI.
    */
  var onColumnContextMenu: js.UndefOr[
    js.Function2[/* column */ IColumn, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  ] = js.native
  
  /**
    * Render function for providing a column header tooltip.
    */
  var onRenderColumnHeaderTooltip: js.UndefOr[IRenderFunction[IDetailsColumnRenderTooltipProps]] = js.native
  
  /**
    * Parent ID used for accessibility label(s).
    */
  var parentId: js.UndefOr[String] = js.native
  
  /**
    * @deprecated use `updateDragInfo`
    */
  var setDraggedItemIndex: js.UndefOr[js.Function1[/* itemIndex */ Double, Unit]] = js.native
  
  /**
    * The component styles to respect during render.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]] = js.native
  
  /**
    * The theme object to respect during render.
    */
  var theme: js.UndefOr[ITheme] = js.native
  
  /**
    * Callback on drag and drop event.
    */
  var updateDragInfo: js.UndefOr[
    js.Function2[/* props */ ItemIndex, /* event */ js.UndefOr[typings.std.MouseEvent], Unit]
  ] = js.native
  
  /**
    * Whether to use fast icon and check components. The icons can't be targeted by customization
    * but are still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.native
}
object IDetailsColumnProps {
  
  @scala.inline
  def apply(column: IColumn, columnIndex: Double): IDetailsColumnProps = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsColumnProps]
  }
  
  @scala.inline
  implicit class IDetailsColumnPropsOps[Self <: IDetailsColumnProps] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: IColumn): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellStyleProps(value: ICellStyleProps): Self = this.set("cellStyleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellStyleProps: Self = this.set("cellStyleProps", js.undefined)
    
    @scala.inline
    def setComponentRef(value: () => Unit): Self = this.set("componentRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setDragDropHelper(value: IDragDropHelper): Self = this.set("dragDropHelper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragDropHelper: Self = this.set("dragDropHelper", js.undefined)
    
    @scala.inline
    def setDragDropHelperNull: Self = this.set("dragDropHelper", null)
    
    @scala.inline
    def setIsDraggable(value: Boolean): Self = this.set("isDraggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDraggable: Self = this.set("isDraggable", js.undefined)
    
    @scala.inline
    def setIsDropped(value: Boolean): Self = this.set("isDropped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDropped: Self = this.set("isDropped", js.undefined)
    
    @scala.inline
    def setOnColumnClick(value: (/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn) => Unit): Self = this.set("onColumnClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnColumnClick: Self = this.set("onColumnClick", js.undefined)
    
    @scala.inline
    def setOnColumnContextMenu(value: (/* column */ IColumn, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onColumnContextMenu", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnColumnContextMenu: Self = this.set("onColumnContextMenu", js.undefined)
    
    @scala.inline
    def setOnRenderColumnHeaderTooltip(
      value: (/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], Element | Null]
        ]) => Element | Null
    ): Self = this.set("onRenderColumnHeaderTooltip", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderColumnHeaderTooltip: Self = this.set("onRenderColumnHeaderTooltip", js.undefined)
    
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    
    @scala.inline
    def setSetDraggedItemIndex(value: /* itemIndex */ Double => Unit): Self = this.set("setDraggedItemIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDraggedItemIndex: Self = this.set("setDraggedItemIndex", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IDetailsColumnStyleProps => DeepPartial[IDetailsColumnStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setUpdateDragInfo(value: (/* props */ ItemIndex, /* event */ js.UndefOr[typings.std.MouseEvent]) => Unit): Self = this.set("updateDragInfo", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdateDragInfo: Self = this.set("updateDragInfo", js.undefined)
    
    @scala.inline
    def setUseFastIcons(value: Boolean): Self = this.set("useFastIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseFastIcons: Self = this.set("useFastIcons", js.undefined)
  }
}
