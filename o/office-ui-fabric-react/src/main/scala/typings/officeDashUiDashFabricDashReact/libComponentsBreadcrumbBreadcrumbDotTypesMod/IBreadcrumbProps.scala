package typings.officeDashUiDashFabricDashReact.libComponentsBreadcrumbBreadcrumbDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIComponentAsMod.IComponentAs
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButtonProps
import typings.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.IFocusZoneProps
import typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod.ITooltipHostProps
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBreadcrumbProps extends HTMLAttributes[HTMLElement] {
  /**
    * Aria label for the root element of the breadcrumb (which is a navigation landmark).
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to access the IBreadcrumb interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IBreadcrumb]] = js.undefined
  /**
    * Render a custom divider in place of the default chevron `>`
    */
  var dividerAs: js.UndefOr[IComponentAs[IDividerAsProps]] = js.undefined
  /**
    * Extra props for the root FocusZone.
    */
  var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.undefined
  /**
    * Collection of breadcrumbs to render
    */
  var items: js.Array[IBreadcrumbItem]
  /**
    * The maximum number of breadcrumbs to display before coalescing.
    * If not specified, all breadcrumbs will be rendered.
    */
  var maxDisplayedItems: js.UndefOr[Double] = js.undefined
  /**
    * Method that determines how to reduce the length of the breadcrumb.
    * Return undefined to never reduce breadcrumb length.
    */
  var onReduceData: js.UndefOr[js.Function1[/* data */ IBreadcrumbData, js.UndefOr[IBreadcrumbData]]] = js.undefined
  /** Custom render function for each breadcrumb item. */
  var onRenderItem: js.UndefOr[IRenderFunction[IBreadcrumbItem]] = js.undefined
  /**
    * Render a custom overflow icon in place of the default icon `...`
    */
  var onRenderOverflowIcon: js.UndefOr[IRenderFunction[IButtonProps]] = js.undefined
  /**
    * Aria label for the overflow button.
    */
  var overflowAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Optional index where overflow items will be collapsed. Defaults to 0.
    */
  var overflowIndex: js.UndefOr[Double] = js.undefined
  var styles: js.UndefOr[IStyleFunctionOrObject[IBreadcrumbStyleProps, IBreadcrumbStyles]] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Extra props for the TooltipHost which wraps each breadcrumb item.
    */
  var tooltipHostProps: js.UndefOr[ITooltipHostProps] = js.undefined
}

object IBreadcrumbProps {
  @scala.inline
  def apply(
    items: js.Array[IBreadcrumbItem],
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    ariaLabel: String = null,
    className: String = null,
    componentRef: IRefObject[IBreadcrumb] = null,
    dividerAs: IComponentAs[IDividerAsProps] = null,
    focusZoneProps: IFocusZoneProps = null,
    maxDisplayedItems: Int | Double = null,
    onReduceData: /* data */ IBreadcrumbData => js.UndefOr[IBreadcrumbData] = null,
    onRenderItem: (/* props */ js.UndefOr[IBreadcrumbItem], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IBreadcrumbItem], Element | Null]]) => Element | Null = null,
    onRenderOverflowIcon: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null = null,
    overflowAriaLabel: String = null,
    overflowIndex: Int | Double = null,
    styles: IStyleFunctionOrObject[IBreadcrumbStyleProps, IBreadcrumbStyles] = null,
    theme: ITheme = null,
    tooltipHostProps: ITooltipHostProps = null
  ): IBreadcrumbProps = {
    val __obj = js.Dynamic.literal(items = items)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (dividerAs != null) __obj.updateDynamic("dividerAs")(dividerAs.asInstanceOf[js.Any])
    if (focusZoneProps != null) __obj.updateDynamic("focusZoneProps")(focusZoneProps)
    if (maxDisplayedItems != null) __obj.updateDynamic("maxDisplayedItems")(maxDisplayedItems.asInstanceOf[js.Any])
    if (onReduceData != null) __obj.updateDynamic("onReduceData")(js.Any.fromFunction1(onReduceData))
    if (onRenderItem != null) __obj.updateDynamic("onRenderItem")(js.Any.fromFunction2(onRenderItem))
    if (onRenderOverflowIcon != null) __obj.updateDynamic("onRenderOverflowIcon")(js.Any.fromFunction2(onRenderOverflowIcon))
    if (overflowAriaLabel != null) __obj.updateDynamic("overflowAriaLabel")(overflowAriaLabel)
    if (overflowIndex != null) __obj.updateDynamic("overflowIndex")(overflowIndex.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltipHostProps != null) __obj.updateDynamic("tooltipHostProps")(tooltipHostProps)
    __obj.asInstanceOf[IBreadcrumbProps]
  }
}

