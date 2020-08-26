package typings.officeUiFabricReact.detailsHeaderTypesMod

import typings.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnRenderTooltipProps
import typings.officeUiFabricReact.detailsHeaderBaseMod.DetailsHeaderBase
import typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode
import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.detailsListTypesMod.IColumnReorderOptions
import typings.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsCheckboxProps
import typings.officeUiFabricReact.detailsRowTypesMod.IDetailsItemProps
import typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility
import typings.react.mod.ClassAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsHeaderBaseProps
  extends ClassAttributes[DetailsHeaderBase]
     with IDetailsItemProps {
  /** ariaLabel for the entire header */
  var ariaLabel: js.UndefOr[String] = js.native
  /** ariaLabel for the header checkbox that selects or deselects everything */
  var ariaLabelForSelectAllCheckbox: js.UndefOr[String] = js.native
  /** ariaLabel for the selection column */
  var ariaLabelForSelectionColumn: js.UndefOr[String] = js.native
  /** ariaLabel for expand/collapse group button */
  var ariaLabelForToggleAllGroupsButton: js.UndefOr[String] = js.native
  /** Overriding class name */
  var className: js.UndefOr[String] = js.native
  /** Whether to collapse for all visibility */
  var collapseAllVisibility: js.UndefOr[CollapseAllVisibility] = js.native
  /** Column reordering options */
  var columnReorderOptions: js.UndefOr[IColumnReorderOptions] = js.native
  /** Column reordering options */
  var columnReorderProps: js.UndefOr[IColumnReorderHeaderProps] = js.native
  /** Ref to the component itself */
  var componentRef: js.UndefOr[IRefObject[IDetailsHeader]] = js.native
  /** Whether or not all is collapsed */
  var isAllCollapsed: js.UndefOr[Boolean] = js.native
  /** Layout mode - fixedColumns or justified */
  var layoutMode: DetailsListLayoutMode = js.native
  /** Minimum pixels to be moved before dragging is registered */
  var minimumPixelsForDrag: js.UndefOr[Double] = js.native
  /** Callback for when column is automatically resized */
  var onColumnAutoResized: js.UndefOr[js.Function2[/* column */ IColumn, /* columnIndex */ Double, Unit]] = js.native
  /** Callback for when the column is clicked */
  var onColumnClick: js.UndefOr[
    js.Function2[/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn, Unit]
  ] = js.native
  /** Callback for when the column needs to show a context menu */
  var onColumnContextMenu: js.UndefOr[
    js.Function2[/* column */ IColumn, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  ] = js.native
  /** Callback for when column sizing has changed */
  var onColumnIsSizingChanged: js.UndefOr[js.Function2[/* column */ IColumn, /* isSizing */ Boolean, Unit]] = js.native
  /** Callback for when column is resized */
  var onColumnResized: js.UndefOr[
    js.Function3[/* column */ IColumn, /* newWidth */ Double, /* columnIndex */ Double, Unit]
  ] = js.native
  /** Callback to render a tooltip for the column header */
  var onRenderColumnHeaderTooltip: js.UndefOr[IRenderFunction[IDetailsColumnRenderTooltipProps]] = js.native
  /** If provided, can be used to render a custom checkbox */
  var onRenderDetailsCheckbox: js.UndefOr[IRenderFunction[IDetailsCheckboxProps]] = js.native
  /** Callback for when collapse all is toggled */
  var onToggleCollapseAll: js.UndefOr[js.Function1[/* isAllCollapsed */ Boolean, Unit]] = js.native
  /** Select all button visibility */
  var selectAllVisibility: js.UndefOr[SelectAllVisibility] = js.native
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsHeaderStyleProps, IDetailsHeaderStyles]] = js.native
  /** Theme from the Higher Order Component */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Whether to use fast icon and check components. The icons can't be targeted by customization
    * but are still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.native
}

object IDetailsHeaderBaseProps {
  @scala.inline
  def apply(layoutMode: DetailsListLayoutMode): IDetailsHeaderBaseProps = {
    val __obj = js.Dynamic.literal(layoutMode = layoutMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsHeaderBaseProps]
  }
  @scala.inline
  implicit class IDetailsHeaderBasePropsOps[Self <: IDetailsHeaderBaseProps] (val x: Self) extends AnyVal {
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
    def setLayoutMode(value: DetailsListLayoutMode): Self = this.set("layoutMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setAriaLabelForSelectAllCheckbox(value: String): Self = this.set("ariaLabelForSelectAllCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabelForSelectAllCheckbox: Self = this.set("ariaLabelForSelectAllCheckbox", js.undefined)
    @scala.inline
    def setAriaLabelForSelectionColumn(value: String): Self = this.set("ariaLabelForSelectionColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabelForSelectionColumn: Self = this.set("ariaLabelForSelectionColumn", js.undefined)
    @scala.inline
    def setAriaLabelForToggleAllGroupsButton(value: String): Self = this.set("ariaLabelForToggleAllGroupsButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabelForToggleAllGroupsButton: Self = this.set("ariaLabelForToggleAllGroupsButton", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCollapseAllVisibility(value: CollapseAllVisibility): Self = this.set("collapseAllVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseAllVisibility: Self = this.set("collapseAllVisibility", js.undefined)
    @scala.inline
    def setColumnReorderOptions(value: IColumnReorderOptions): Self = this.set("columnReorderOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnReorderOptions: Self = this.set("columnReorderOptions", js.undefined)
    @scala.inline
    def setColumnReorderProps(value: IColumnReorderHeaderProps): Self = this.set("columnReorderProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnReorderProps: Self = this.set("columnReorderProps", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IDetailsHeader | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IDetailsHeader]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setIsAllCollapsed(value: Boolean): Self = this.set("isAllCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAllCollapsed: Self = this.set("isAllCollapsed", js.undefined)
    @scala.inline
    def setMinimumPixelsForDrag(value: Double): Self = this.set("minimumPixelsForDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumPixelsForDrag: Self = this.set("minimumPixelsForDrag", js.undefined)
    @scala.inline
    def setOnColumnAutoResized(value: (/* column */ IColumn, /* columnIndex */ Double) => Unit): Self = this.set("onColumnAutoResized", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnColumnAutoResized: Self = this.set("onColumnAutoResized", js.undefined)
    @scala.inline
    def setOnColumnClick(value: (/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn) => Unit): Self = this.set("onColumnClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnColumnClick: Self = this.set("onColumnClick", js.undefined)
    @scala.inline
    def setOnColumnContextMenu(value: (/* column */ IColumn, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onColumnContextMenu", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnColumnContextMenu: Self = this.set("onColumnContextMenu", js.undefined)
    @scala.inline
    def setOnColumnIsSizingChanged(value: (/* column */ IColumn, /* isSizing */ Boolean) => Unit): Self = this.set("onColumnIsSizingChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnColumnIsSizingChanged: Self = this.set("onColumnIsSizingChanged", js.undefined)
    @scala.inline
    def setOnColumnResized(value: (/* column */ IColumn, /* newWidth */ Double, /* columnIndex */ Double) => Unit): Self = this.set("onColumnResized", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnColumnResized: Self = this.set("onColumnResized", js.undefined)
    @scala.inline
    def setOnRenderColumnHeaderTooltip(
      value: (/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], Element | Null]
        ]) => Element | Null
    ): Self = this.set("onRenderColumnHeaderTooltip", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderColumnHeaderTooltip: Self = this.set("onRenderColumnHeaderTooltip", js.undefined)
    @scala.inline
    def setOnRenderDetailsCheckbox(
      value: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderDetailsCheckbox", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderDetailsCheckbox: Self = this.set("onRenderDetailsCheckbox", js.undefined)
    @scala.inline
    def setOnToggleCollapseAll(value: /* isAllCollapsed */ Boolean => Unit): Self = this.set("onToggleCollapseAll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnToggleCollapseAll: Self = this.set("onToggleCollapseAll", js.undefined)
    @scala.inline
    def setSelectAllVisibility(value: SelectAllVisibility): Self = this.set("selectAllVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectAllVisibility: Self = this.set("selectAllVisibility", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IDetailsHeaderStyleProps => DeepPartial[IDetailsHeaderStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDetailsHeaderStyleProps, IDetailsHeaderStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
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
  }
  
}

