package typings.officeDashUiDashFabricDashReact.libComponentsPanelPanelDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libComponentsFocusTrapZoneFocusTrapZoneDotTypesMod.IFocusTrapZoneProps
import typings.officeDashUiDashFabricDashReact.libComponentsLayerLayerDotTypesMod.ILayerProps
import typings.officeDashUiDashFabricDashReact.libComponentsOverlayOverlayDotTypesMod.IOverlayProps
import typings.officeDashUiDashFabricDashReact.libComponentsPanelPanelDotBaseMod.PanelBase
import typings.react.Event
import typings.react.reactMod.Global.JSX.Element
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.SyntheticEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelProps extends HTMLAttributes[PanelBase] {
  /**
    * Aria label on close button
    */
  var closeButtonAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Deprecated property. Serves no function.
    * @deprecated Serves no function.
    */
  var componentId: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to access the IPanel interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IPanel]] = js.undefined
  /**
    * Custom panel width, used only when `type` is set to `PanelType.custom`.
    */
  var customWidth: js.UndefOr[String] = js.undefined
  /**
    * Sets the HTMLElement to focus on when exiting the FocusTrapZone.
    * @defaultvalue The element.target that triggered the Panel.
    */
  var elementToFocusOnDismiss: js.UndefOr[HTMLElement] = js.undefined
  /**
    * Indicates the selector for first focusable item.
    * Deprecated, use `focusTrapZoneProps`.
    * @deprecated Use `focusTrapZoneProps`.
    */
  var firstFocusableSelector: js.UndefOr[String] = js.undefined
  /**
    * Optional props to pass to the FocusTrapZone component to manage focus in the panel.
    */
  var focusTrapZoneProps: js.UndefOr[IFocusTrapZoneProps] = js.undefined
  /**
    * Indicates whether Panel should force focus inside the focus trap zone.
    * If not explicitly specified, behavior aligns with FocusTrapZone's default behavior.
    * Deprecated, use `focusTrapZoneProps`.
    * @deprecated Use `focusTrapZoneProps`.
    */
  var forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined
  /**
    * Has the close button visible.
    * @defaultvalue true
    */
  var hasCloseButton: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional parameter to provider the class name for header text
    */
  var headerClassName: js.UndefOr[String] = js.undefined
  /**
    * Header text for the Panel.
    * @defaultvalue ""
    */
  var headerText: js.UndefOr[String] = js.undefined
  /**
    * Indicates if this Panel will ignore keeping track of HTMLElement that activated the Zone.
    * Deprecated, use `focusTrapZoneProps`.
    * @defaultvalue false
    * @deprecated Use `focusTrapZoneProps`.
    */
  var ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the panel uses a modal overlay or not
    * @defaultvalue true
    */
  var isBlocking: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines if content should stretch to fill available space putting footer at the bottom of the page
    * @defaultvalue false
    */
  var isFooterAtBottom: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the panel is hidden on dismiss, instead of destroyed in the DOM.
    * Protects the contents from being destroyed when the panel is dismissed.
    * @defaultvalue false
    */
  var isHiddenOnDismiss: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the panel can be light dismissed.
    * @defaultvalue false
    */
  var isLightDismiss: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the panel is displayed.
    * If true, will cause panel to stay open even if dismissed.
    * If false, will cause panel to stay hidden.
    * If undefined, will allow the panel to control its own visility through open/dismiss methods.
    * @defaultvalue undefined
    */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional props to pass to the Layer component hosting the panel.
    */
  var layerProps: js.UndefOr[ILayerProps] = js.undefined
  /**
    * A callback function for when the panel is closed, before the animation completes.
    * If the panel should NOT be dismissed based on some keyboard event, then simply call ev.preventDefault() on it
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], Unit]] = js.undefined
  /**
    * A callback function which is called **after** the Panel is dismissed and the animation is complete.
    * (If you need to update the Panel's `isOpen` prop in response to a dismiss event, use `onDismiss` instead.)
    */
  var onDismissed: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Optional custom function to handle clicks outside the panel in lightdismiss mode
    */
  var onLightDismissClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A callback function for when the Panel is opened, before the animation completes.
    */
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A callback function for when the Panel is opened, after the animation completes.
    */
  var onOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Optional custom function to handle clicks outside this component
    */
  var onOuterClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Optional custom renderer for body region. Replaces any children passed into the component.
    */
  var onRenderBody: js.UndefOr[IRenderFunction[IPanelProps]] = js.undefined
  /**
    * Optional custom renderer for footer region. Replaces sticky footer.
    */
  var onRenderFooter: js.UndefOr[IRenderFunction[IPanelProps]] = js.undefined
  /**
    * Custom renderer for content in the sticky footer
    */
  var onRenderFooterContent: js.UndefOr[IRenderFunction[IPanelProps]] = js.undefined
  /**
    * Optional custom renderer for header region. Replaces current title
    */
  var onRenderHeader: js.UndefOr[IPanelHeaderRenderer] = js.undefined
  /**
    * Optional custom renderer navigation region. Replaces the region that contains the close button.
    */
  var onRenderNavigation: js.UndefOr[IRenderFunction[IPanelProps]] = js.undefined
  /**
    * Optional custom renderer for content in the navigation region. Replaces current close button.
    */
  var onRenderNavigationContent: js.UndefOr[IRenderFunction[IPanelProps]] = js.undefined
  /**
    * Optional props to pass to the Overlay component that the panel uses.
    */
  var overlayProps: js.UndefOr[IOverlayProps] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles]] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Type of the panel.
    * @defaultvalue PanelType.smallFixedRight
    */
  var `type`: js.UndefOr[PanelType] = js.undefined
}

object IPanelProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[PanelBase] = null,
    className: String = null,
    closeButtonAriaLabel: String = null,
    componentId: String = null,
    componentRef: IRefObject[IPanel] = null,
    customWidth: String = null,
    elementToFocusOnDismiss: HTMLElement = null,
    firstFocusableSelector: String = null,
    focusTrapZoneProps: IFocusTrapZoneProps = null,
    forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined,
    hasCloseButton: js.UndefOr[Boolean] = js.undefined,
    headerClassName: String = null,
    headerText: String = null,
    ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined,
    isBlocking: js.UndefOr[Boolean] = js.undefined,
    isFooterAtBottom: js.UndefOr[Boolean] = js.undefined,
    isHiddenOnDismiss: js.UndefOr[Boolean] = js.undefined,
    isLightDismiss: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    layerProps: ILayerProps = null,
    onDismiss: /* ev */ js.UndefOr[SyntheticEvent[HTMLElement, Event]] => Unit = null,
    onDismissed: () => Unit = null,
    onLightDismissClick: () => Unit = null,
    onOpen: () => Unit = null,
    onOpened: () => Unit = null,
    onOuterClick: () => Unit = null,
    onRenderBody: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null = null,
    onRenderFooter: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null = null,
    onRenderFooterContent: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null = null,
    onRenderHeader: IPanelHeaderRenderer = null,
    onRenderNavigation: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null = null,
    onRenderNavigationContent: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null = null,
    overlayProps: IOverlayProps = null,
    styles: IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles] = null,
    theme: ITheme = null,
    `type`: PanelType = null
  ): IPanelProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel)
    if (componentId != null) __obj.updateDynamic("componentId")(componentId)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (customWidth != null) __obj.updateDynamic("customWidth")(customWidth)
    if (elementToFocusOnDismiss != null) __obj.updateDynamic("elementToFocusOnDismiss")(elementToFocusOnDismiss)
    if (firstFocusableSelector != null) __obj.updateDynamic("firstFocusableSelector")(firstFocusableSelector)
    if (focusTrapZoneProps != null) __obj.updateDynamic("focusTrapZoneProps")(focusTrapZoneProps)
    if (!js.isUndefined(forceFocusInsideTrap)) __obj.updateDynamic("forceFocusInsideTrap")(forceFocusInsideTrap)
    if (!js.isUndefined(hasCloseButton)) __obj.updateDynamic("hasCloseButton")(hasCloseButton)
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName)
    if (headerText != null) __obj.updateDynamic("headerText")(headerText)
    if (!js.isUndefined(ignoreExternalFocusing)) __obj.updateDynamic("ignoreExternalFocusing")(ignoreExternalFocusing)
    if (!js.isUndefined(isBlocking)) __obj.updateDynamic("isBlocking")(isBlocking)
    if (!js.isUndefined(isFooterAtBottom)) __obj.updateDynamic("isFooterAtBottom")(isFooterAtBottom)
    if (!js.isUndefined(isHiddenOnDismiss)) __obj.updateDynamic("isHiddenOnDismiss")(isHiddenOnDismiss)
    if (!js.isUndefined(isLightDismiss)) __obj.updateDynamic("isLightDismiss")(isLightDismiss)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (layerProps != null) __obj.updateDynamic("layerProps")(layerProps)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (onDismissed != null) __obj.updateDynamic("onDismissed")(js.Any.fromFunction0(onDismissed))
    if (onLightDismissClick != null) __obj.updateDynamic("onLightDismissClick")(js.Any.fromFunction0(onLightDismissClick))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction0(onOpened))
    if (onOuterClick != null) __obj.updateDynamic("onOuterClick")(js.Any.fromFunction0(onOuterClick))
    if (onRenderBody != null) __obj.updateDynamic("onRenderBody")(js.Any.fromFunction2(onRenderBody))
    if (onRenderFooter != null) __obj.updateDynamic("onRenderFooter")(js.Any.fromFunction2(onRenderFooter))
    if (onRenderFooterContent != null) __obj.updateDynamic("onRenderFooterContent")(js.Any.fromFunction2(onRenderFooterContent))
    if (onRenderHeader != null) __obj.updateDynamic("onRenderHeader")(onRenderHeader)
    if (onRenderNavigation != null) __obj.updateDynamic("onRenderNavigation")(js.Any.fromFunction2(onRenderNavigation))
    if (onRenderNavigationContent != null) __obj.updateDynamic("onRenderNavigationContent")(js.Any.fromFunction2(onRenderNavigationContent))
    if (overlayProps != null) __obj.updateDynamic("overlayProps")(overlayProps)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPanelProps]
  }
}

