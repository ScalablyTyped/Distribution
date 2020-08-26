package typings.officeUiFabricReact.breadcrumbTypesMod

import typings.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.tooltipHostTypesMod.ITooltipHostProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.icomponentasMod.IComponentAs
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBreadcrumbProps extends HTMLAttributes[HTMLElement] {
  /**
    * Aria label for the root element of the breadcrumb (which is a navigation landmark).
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the IBreadcrumb interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IBreadcrumb]] = js.native
  /**
    * Render a custom divider in place of the default chevron `>`
    */
  var dividerAs: js.UndefOr[IComponentAs[IDividerAsProps]] = js.native
  /**
    * Extra props for the root FocusZone.
    */
  var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.native
  /**
    * Collection of breadcrumbs to render
    */
  var items: js.Array[IBreadcrumbItem] = js.native
  /**
    * The maximum number of breadcrumbs to display before coalescing.
    * If not specified, all breadcrumbs will be rendered.
    */
  var maxDisplayedItems: js.UndefOr[Double] = js.native
  /**
    * Method that determines how to group the length of the breadcrumb.
    * Return undefined to never increase breadcrumb length.
    */
  var onGrowData: js.UndefOr[js.Function1[/* data */ IBreadcrumbData, js.UndefOr[IBreadcrumbData]]] = js.native
  /**
    * Method that determines how to reduce the length of the breadcrumb.
    * Return undefined to never reduce breadcrumb length.
    */
  var onReduceData: js.UndefOr[js.Function1[/* data */ IBreadcrumbData, js.UndefOr[IBreadcrumbData]]] = js.native
  /** Custom render function for each breadcrumb item. */
  var onRenderItem: js.UndefOr[IRenderFunction[IBreadcrumbItem]] = js.native
  /**
    * Render a custom overflow icon in place of the default icon `...`
    */
  var onRenderOverflowIcon: js.UndefOr[IRenderFunction[IButtonProps]] = js.native
  /**
    * Aria label for the overflow button.
    */
  var overflowAriaLabel: js.UndefOr[String] = js.native
  /**
    * Optional index where overflow items will be collapsed. Defaults to 0.
    */
  var overflowIndex: js.UndefOr[Double] = js.native
  var styles: js.UndefOr[IStyleFunctionOrObject[IBreadcrumbStyleProps, IBreadcrumbStyles]] = js.native
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Extra props for the TooltipHost which wraps each breadcrumb item.
    */
  var tooltipHostProps: js.UndefOr[ITooltipHostProps] = js.native
}

object IBreadcrumbProps {
  @scala.inline
  def apply(items: js.Array[IBreadcrumbItem]): IBreadcrumbProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBreadcrumbProps]
  }
  @scala.inline
  implicit class IBreadcrumbPropsOps[Self <: IBreadcrumbProps] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: IBreadcrumbItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[IBreadcrumbItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IBreadcrumb | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IBreadcrumb]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setDividerAs(value: IComponentAs[IDividerAsProps]): Self = this.set("dividerAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDividerAs: Self = this.set("dividerAs", js.undefined)
    @scala.inline
    def setFocusZoneProps(value: IFocusZoneProps): Self = this.set("focusZoneProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusZoneProps: Self = this.set("focusZoneProps", js.undefined)
    @scala.inline
    def setMaxDisplayedItems(value: Double): Self = this.set("maxDisplayedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDisplayedItems: Self = this.set("maxDisplayedItems", js.undefined)
    @scala.inline
    def setOnGrowData(value: /* data */ IBreadcrumbData => js.UndefOr[IBreadcrumbData]): Self = this.set("onGrowData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGrowData: Self = this.set("onGrowData", js.undefined)
    @scala.inline
    def setOnReduceData(value: /* data */ IBreadcrumbData => js.UndefOr[IBreadcrumbData]): Self = this.set("onReduceData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReduceData: Self = this.set("onReduceData", js.undefined)
    @scala.inline
    def setOnRenderItem(
      value: (/* props */ js.UndefOr[IBreadcrumbItem], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IBreadcrumbItem], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderItem", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderItem: Self = this.set("onRenderItem", js.undefined)
    @scala.inline
    def setOnRenderOverflowIcon(
      value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderOverflowIcon", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderOverflowIcon: Self = this.set("onRenderOverflowIcon", js.undefined)
    @scala.inline
    def setOverflowAriaLabel(value: String): Self = this.set("overflowAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowAriaLabel: Self = this.set("overflowAriaLabel", js.undefined)
    @scala.inline
    def setOverflowIndex(value: Double): Self = this.set("overflowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowIndex: Self = this.set("overflowIndex", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IBreadcrumbStyleProps => DeepPartial[IBreadcrumbStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IBreadcrumbStyleProps, IBreadcrumbStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTooltipHostProps(value: ITooltipHostProps): Self = this.set("tooltipHostProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipHostProps: Self = this.set("tooltipHostProps", js.undefined)
  }
  
}

