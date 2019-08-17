package typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
import typings.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutDotTypesMod.ICalloutProps
import typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotBaseMod.TooltipBase
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipProps extends HTMLAttributes[HTMLDivElement | TooltipBase] {
  /**
    * Properties to pass through for Callout, reference detail properties in ICalloutProps
    * @defaultvalue isBeakVisible: true, beakWidth: 16, gapSpace: 0, setInitialFocus: true, doNotLayer: false
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.undefined
  /**
    * Optional callback to access the ITooltip interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ITooltip]] = js.undefined
  /**
    *  Content to be passed to the tooltip
    */
  var content: js.UndefOr[String | Element | js.Array[Element]] = js.undefined
  /**
    * Length of delay. Can be set to zero if you do not want a delay.
    * @defaultvalue medium
    */
  var delay: js.UndefOr[TooltipDelay] = js.undefined
  /**
    * Indicator of how the tooltip should be anchored to its targetElement.
    * @defaultvalue DirectionalHint.topCenter
    */
  var directionalHint: js.UndefOr[DirectionalHint] = js.undefined
  /**
    * How the element should be positioned in RTL layouts.
    * If not specified, a mirror of `directionalHint` will be used instead
    */
  var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.undefined
  /**
    * Max width of tooltip
    * @defaultvalue 364px
    */
  var maxWidth: js.UndefOr[String | Null] = js.undefined
  /**
    *  Render function to populate content area
    */
  var onRenderContent: js.UndefOr[IRenderFunction[ITooltipProps]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ITooltipStyleProps, ITooltipStyles]] = js.undefined
  /**
    * Element to anchor the Tooltip to.
    */
  var targetElement: js.UndefOr[HTMLElement] = js.undefined
  /**
    * Theme to apply to the component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object ITooltipProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement | TooltipBase] = null,
    calloutProps: ICalloutProps = null,
    componentRef: IRefObject[ITooltip] = null,
    content: String | Element | js.Array[Element] = null,
    delay: TooltipDelay = null,
    directionalHint: DirectionalHint = null,
    directionalHintForRTL: DirectionalHint = null,
    maxWidth: String = null,
    onRenderContent: IRenderFunction[ITooltipProps] = null,
    styles: IStyleFunctionOrObject[ITooltipStyleProps, ITooltipStyles] = null,
    targetElement: HTMLElement = null,
    theme: ITheme = null
  ): ITooltipProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay)
    if (directionalHint != null) __obj.updateDynamic("directionalHint")(directionalHint)
    if (directionalHintForRTL != null) __obj.updateDynamic("directionalHintForRTL")(directionalHintForRTL)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth)
    if (onRenderContent != null) __obj.updateDynamic("onRenderContent")(onRenderContent)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (targetElement != null) __obj.updateDynamic("targetElement")(targetElement)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[ITooltipProps]
  }
}

