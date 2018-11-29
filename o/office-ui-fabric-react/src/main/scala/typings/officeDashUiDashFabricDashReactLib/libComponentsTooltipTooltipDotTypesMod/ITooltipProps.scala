package typings
package officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITooltipProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[
      reactLib.HTMLDivElement | officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipDotBaseMod.TooltipBase
    ] {
  /**
       * Properties to pass through for Callout, reference detail properties in ICalloutProps
       * @defaultvalue isBeakVisible: true, beakWidth: 16, gapSpace: 0, setInitialFocus: true, doNotLayer: false
       */
  var calloutProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsCalloutCalloutDotTypesMod.ICalloutProps
  ] = js.undefined
  /**
       * Optional callback to access the ITooltip interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[ITooltip]] = js.undefined
  /**
       *  String to be passed to the tooltip
       */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Length of delay. Can be set to zero if you do not want a delay.
       * @defaultvalue medium
       */
  var delay: js.UndefOr[TooltipDelay] = js.undefined
  /**
       * Indicator of how the tooltip should be anchored to its targetElement.
       * @defaultvalue DirectionalHint.topCenter
       */
  var directionalHint: js.UndefOr[officeDashUiDashFabricDashReactLib.libCommonDirectionalHintMod.DirectionalHint] = js.undefined
  /**
       * How the element should be positioned in RTL layouts.
       * If not specified, a mirror of `directionalHint` will be used instead
       */
  var directionalHintForRTL: js.UndefOr[officeDashUiDashFabricDashReactLib.libCommonDirectionalHintMod.DirectionalHint] = js.undefined
  /**
       * Max width of tooltip
       * @defaultvalue 364px
       */
  var maxWidth: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       *  Render function to populate content area
       */
  var onRenderContent: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[ITooltipProps]] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[ITooltipStyleProps, ITooltipStyles]
  ] = js.undefined
  /**
       * Element to anchor the Tooltip to.
       */
  var targetElement: js.UndefOr[reactLib.HTMLElement] = js.undefined
  /**
       * Theme to apply to the component.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

