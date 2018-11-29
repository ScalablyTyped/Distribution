package typings
package officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipHostDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITooltipHostProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[
      reactLib.HTMLDivElement | officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipHostDotBaseMod.TooltipHostBase
    ] {
  /**
       * Additional properties to pass through for Callout, reference detail properties in ICalloutProps
       */
  var calloutProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsCalloutCalloutDotTypesMod.ICalloutProps
  ] = js.undefined
  /**
       * Optionally a number of milliseconds to delay closing the tooltip, so that
       * the user has time to hover over the tooltip and interact with it. Hovering
       * over the tooltip will count as hovering over the host, so that the tooltip
       * will stay open if the user is actively interacting with it.
       */
  var closeDelay: js.UndefOr[scala.Double] = js.undefined
  /**
       * Optional callback to access the ITooltipHost interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[ITooltipHost]] = js.undefined
  /**
       * String to be passed to the tooltip
       */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Length of delay
       * @defaultvalue medium
       */
  var delay: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipDotTypesMod.TooltipDelay
  ] = js.undefined
  /**
       * Indicator of how the tooltip should be anchored to its targetElement.
       */
  var directionalHint: js.UndefOr[officeDashUiDashFabricDashReactLib.libCommonDirectionalHintMod.DirectionalHint] = js.undefined
  /**
       * How the element should be positioned in RTL layouts.
       * If not specified, a mirror of `directionalHint` will be used instead
       */
  var directionalHintForRTL: js.UndefOr[officeDashUiDashFabricDashReactLib.libCommonDirectionalHintMod.DirectionalHint] = js.undefined
  /**
       * Optional class name to apply to tooltip host.
       */
  var hostClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Notifies when tooltip becomes visible or hidden, whatever the trigger was.
       */
  var onTooltipToggle: js.UndefOr[js.Function1[/* isTooltipVisible */ scala.Boolean, scala.Unit]] = js.undefined
  /**
       * Only show if there is overflow. If set, the tooltip hosts observes  and only shows the tooltip if this element has overflow.
       * It also uses the parent as target element for the tooltip.
       */
  var overflowMode: js.UndefOr[TooltipOverflowMode] = js.undefined
  /**
       * Whether or not to mark the container as described by the tooltip.
       * If not specified, the caller should mark as element as described by the tooltip id.
       */
  var setAriaDescribedBy: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[ITooltipHostStyleProps, ITooltipHostStyles]
  ] = js.undefined
  /**
       * Theme provided by High-Order Component.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * Additional properties to pass through for Tooltip, reference detail properties in ITooltipProps
       */
  var tooltipProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipDotTypesMod.ITooltipProps
  ] = js.undefined
}

