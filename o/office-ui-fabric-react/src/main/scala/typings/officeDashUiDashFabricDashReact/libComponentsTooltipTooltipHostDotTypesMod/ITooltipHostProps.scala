package typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
import typings.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutDotTypesMod.ICalloutProps
import typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotTypesMod.ITooltipProps
import typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotTypesMod.TooltipDelay
import typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotBaseMod.TooltipHostBase
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipHostProps extends HTMLAttributes[HTMLDivElement | TooltipHostBase] {
  /**
    * Additional properties to pass through for Callout, reference detail properties in ICalloutProps
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.undefined
  /**
    * Optionally a number of milliseconds to delay closing the tooltip, so that
    * the user has time to hover over the tooltip and interact with it. Hovering
    * over the tooltip will count as hovering over the host, so that the tooltip
    * will stay open if the user is actively interacting with it.
    */
  var closeDelay: js.UndefOr[Double] = js.undefined
  /**
    * Optional callback to access the ITooltipHost interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ITooltipHost]] = js.undefined
  /**
    *  Content to be passed to the tooltip
    */
  var content: js.UndefOr[String | Element | js.Array[Element]] = js.undefined
  /**
    * Length of delay
    * @defaultvalue medium
    */
  var delay: js.UndefOr[TooltipDelay] = js.undefined
  /**
    * Indicator of how the tooltip should be anchored to its targetElement.
    */
  var directionalHint: js.UndefOr[DirectionalHint] = js.undefined
  /**
    * How the element should be positioned in RTL layouts.
    * If not specified, a mirror of `directionalHint` will be used instead
    */
  var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.undefined
  /**
    * Optional class name to apply to tooltip host.
    */
  var hostClassName: js.UndefOr[String] = js.undefined
  /**
    * Notifies when tooltip becomes visible or hidden, whatever the trigger was.
    */
  var onTooltipToggle: js.UndefOr[js.Function1[/* isTooltipVisible */ Boolean, Unit]] = js.undefined
  /**
    * Only show if there is overflow. If set, the tooltip hosts observes  and only shows the tooltip if this element has overflow.
    * It also uses the parent as target element for the tooltip.
    */
  var overflowMode: js.UndefOr[TooltipOverflowMode] = js.undefined
  /**
    * Whether or not to mark the container as described by the tooltip.
    * If not specified, the caller should mark as element as described by the tooltip id.
    */
  var setAriaDescribedBy: js.UndefOr[Boolean] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ITooltipHostStyleProps, ITooltipHostStyles]] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Additional properties to pass through for Tooltip, reference detail properties in ITooltipProps
    */
  var tooltipProps: js.UndefOr[ITooltipProps] = js.undefined
}

object ITooltipHostProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement | TooltipHostBase] = null,
    calloutProps: ICalloutProps = null,
    closeDelay: Int | Double = null,
    componentRef: IRefObject[ITooltipHost] = null,
    content: String | Element | js.Array[Element] = null,
    delay: TooltipDelay = null,
    directionalHint: DirectionalHint = null,
    directionalHintForRTL: DirectionalHint = null,
    hostClassName: String = null,
    onTooltipToggle: /* isTooltipVisible */ Boolean => Unit = null,
    overflowMode: TooltipOverflowMode = null,
    setAriaDescribedBy: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[ITooltipHostStyleProps, ITooltipHostStyles] = null,
    theme: ITheme = null,
    tooltipProps: ITooltipProps = null
  ): ITooltipHostProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps)
    if (closeDelay != null) __obj.updateDynamic("closeDelay")(closeDelay.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay)
    if (directionalHint != null) __obj.updateDynamic("directionalHint")(directionalHint)
    if (directionalHintForRTL != null) __obj.updateDynamic("directionalHintForRTL")(directionalHintForRTL)
    if (hostClassName != null) __obj.updateDynamic("hostClassName")(hostClassName)
    if (onTooltipToggle != null) __obj.updateDynamic("onTooltipToggle")(js.Any.fromFunction1(onTooltipToggle))
    if (overflowMode != null) __obj.updateDynamic("overflowMode")(overflowMode)
    if (!js.isUndefined(setAriaDescribedBy)) __obj.updateDynamic("setAriaDescribedBy")(setAriaDescribedBy)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltipProps != null) __obj.updateDynamic("tooltipProps")(tooltipProps)
    __obj.asInstanceOf[ITooltipHostProps]
  }
}

