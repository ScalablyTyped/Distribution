package typings
package officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPanelProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotBaseMod.PanelBase] {
  /**
       * Aria label on close button
       */
  var closeButtonAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Deprecated property. Serves no function.
       * @deprecated
       */
  var componentId: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional callback to access the IPanel interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IPanel]] = js.undefined
  /**
       * Custom panel width, used only when type is set to PanelType.custom.
       */
  var customWidth: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Sets the HTMLElement to focus on when exiting the FocusTrapZone.
       * @default The element.target that triggered the Panel.
       */
  var elementToFocusOnDismiss: js.UndefOr[reactLib.HTMLElement] = js.undefined
  /**
       * Indicates the selector for first focusable item.
       * Deprecated, use focusTrapZoneProps.
       * @deprecated
       */
  var firstFocusableSelector: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional props to pass to the FocusTrapZone component to manage focus in the panel.
       */
  var focusTrapZoneProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsFocusTrapZoneFocusTrapZoneDotTypesMod.IFocusTrapZoneProps
  ] = js.undefined
  /**
       * Indicates whether Panel should force focus inside the focus trap zone
       * Deprecated, use focusTrapZoneProps.
       * @default true
       * @deprecated
       */
  var forceFocusInsideTrap: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Has the close button visible.
       * @default true
       */
  var hasCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Optional parameter to provider the class name for header text
       */
  var headerClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Header text for the Panel.
       * @default ""
       */
  var headerText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Indicates if this Panel will ignore keeping track of HTMLElement that activated the Zone.
       * Deprecated, use focusTrapZoneProps.
       * @default false
       * @deprecated
       */
  var ignoreExternalFocusing: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the panel uses a modal overlay or not
       * @default true
       */
  var isBlocking: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Determines if content should stretch to fill available space putting footer at the bottom of the page
       * @default false
       */
  var isFooterAtBottom: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the panel is hidden on dismiss, instead of destroyed in the DOM.
       * Protects the contents from being destroyed when the panel is dismissed.
       * @default false
       */
  var isHiddenOnDismiss: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the panel can be light dismissed.
       * @default false
       */
  var isLightDismiss: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the panel is displayed.
       * @default false
       */
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Optional props to pass to the Layer component hosting the panel.
       */
  var layerProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsLayerLayerDotTypesMod.ILayerProps
  ] = js.undefined
  /**
       * A callback function for when the panel is closed, before the animation completes.
       * If the panel should NOT be dismissed based on some keyboard event, then simply call ev.preventDefault() on it
       */
  var onDismiss: js.UndefOr[
    js.Function1[
      /* ev */ js.UndefOr[reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * A callback function which is called after the Panel is dismissed and the animation is complete.
       */
  var onDismissed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Optional custom function to handle clicks outside the panel in lightdismiss mode
       */
  var onLightDismissClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Optional custom function to handle clicks outside this component
       */
  var onOuterClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Optional custom renderer for body region. Replaces any children passed into the component.
       */
  var onRenderBody: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IPanelProps]] = js.undefined
  /**
       * Optional custom renderer for footer region. Replaces sticky footer.
       */
  var onRenderFooter: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IPanelProps]] = js.undefined
  /**
       * Custom renderer for content in the sticky footer
       */
  var onRenderFooterContent: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IPanelProps]] = js.undefined
  /**
       * Optional custom renderer for header region. Replaces current title
       */
  var onRenderHeader: js.UndefOr[IPanelHeaderRenderer] = js.undefined
  /**
       * Optional custom renderer navigation region. Replaces current close button.
       */
  var onRenderNavigation: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IPanelProps]] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles]
  ] = js.undefined
  /**
       * Theme provided by High-Order Component.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * Type of the panel.
       * @default PanelType.smallFixedRight
       */
  var `type`: js.UndefOr[PanelType] = js.undefined
}

