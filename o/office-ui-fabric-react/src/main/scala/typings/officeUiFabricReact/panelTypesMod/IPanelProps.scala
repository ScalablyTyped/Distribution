package typings.officeUiFabricReact.panelTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.focusTrapZoneTypesMod.IFocusTrapZoneProps
import typings.officeUiFabricReact.layerTypesMod.ILayerProps
import typings.officeUiFabricReact.overlayTypesMod.IOverlayProps
import typings.officeUiFabricReact.panelBaseMod.PanelBase
import typings.officeUiFabricReact.popupTypesMod.IPopupProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanelProps extends HTMLAttributes[PanelBase] {
  
  /**
    * Allow body scroll on content and overlay on touch devices. Changing after mounting has no effect.
    * @defaultvalue false
    */
  var allowTouchBodyScroll: js.UndefOr[Boolean] = js.native
  
  /**
    * Aria label on close button
    */
  var closeButtonAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Deprecated property. Serves no function.
    * @deprecated Serves no function.
    */
  var componentId: js.UndefOr[String] = js.native
  
  /**
    * Optional callback to access the IPanel interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IPanel]] = js.native
  
  /**
    * Custom panel width, used only when `type` is set to `PanelType.custom`.
    */
  var customWidth: js.UndefOr[String] = js.native
  
  /**
    * Sets the HTMLElement to focus on when exiting the FocusTrapZone.
    * @defaultvalue The element.target that triggered the Panel.
    */
  var elementToFocusOnDismiss: js.UndefOr[HTMLElement] = js.native
  
  /**
    * Indicates the selector for first focusable item.
    * Deprecated, use `focusTrapZoneProps`.
    * @deprecated Use `focusTrapZoneProps`.
    */
  var firstFocusableSelector: js.UndefOr[String] = js.native
  
  /**
    * Optional props to pass to the FocusTrapZone component to manage focus in the panel.
    */
  var focusTrapZoneProps: js.UndefOr[IFocusTrapZoneProps] = js.native
  
  /**
    * Indicates whether Panel should force focus inside the focus trap zone.
    * If not explicitly specified, behavior aligns with FocusTrapZone's default behavior.
    * Deprecated, use `focusTrapZoneProps`.
    * @deprecated Use `focusTrapZoneProps`.
    */
  var forceFocusInsideTrap: js.UndefOr[Boolean] = js.native
  
  /**
    * Has the close button visible.
    * @defaultvalue true
    */
  var hasCloseButton: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional parameter to provider the class name for header text
    */
  var headerClassName: js.UndefOr[String] = js.native
  
  /**
    * Header text for the Panel.
    * @defaultvalue ""
    */
  var headerText: js.UndefOr[String] = js.native
  
  /**
    * The props for header text container.
    */
  var headerTextProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  
  /**
    * Indicates if this Panel will ignore keeping track of HTMLElement that activated the Zone.
    * Deprecated, use `focusTrapZoneProps`.
    * @defaultvalue false
    * @deprecated Use `focusTrapZoneProps`.
    */
  var ignoreExternalFocusing: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the panel uses a modal overlay or not
    * @defaultvalue true
    */
  var isBlocking: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines if content should stretch to fill available space putting footer at the bottom of the page
    * @defaultvalue false
    */
  var isFooterAtBottom: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the panel is hidden on dismiss, instead of destroyed in the DOM.
    * Protects the contents from being destroyed when the panel is dismissed.
    * @defaultvalue false
    */
  var isHiddenOnDismiss: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the panel can be light dismissed.
    * @defaultvalue false
    */
  var isLightDismiss: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the panel is displayed.
    * If true, will cause panel to stay open even if dismissed.
    * If false, will cause panel to stay hidden.
    * If undefined, will allow the panel to control its own visility through open/dismiss methods.
    * @defaultvalue undefined
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional props to pass to the Layer component hosting the panel.
    */
  var layerProps: js.UndefOr[ILayerProps] = js.native
  
  /**
    * A callback function for when the panel is closed, before the animation completes.
    * If the panel should NOT be dismissed based on some keyboard event, then simply call ev.preventDefault() on it
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], Unit]] = js.native
  
  /**
    * A callback function which is called **after** the Panel is dismissed and the animation is complete.
    * (If you need to update the Panel's `isOpen` prop in response to a dismiss event, use `onDismiss` instead.)
    */
  var onDismissed: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Optional custom function to handle clicks outside the panel in lightdismiss mode
    */
  var onLightDismissClick: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A callback function for when the Panel is opened, before the animation completes.
    */
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A callback function for when the Panel is opened, after the animation completes.
    */
  var onOpened: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Optional custom function to handle clicks outside this component
    */
  var onOuterClick: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Optional custom renderer for body region. Replaces any children passed into the component.
    */
  var onRenderBody: js.UndefOr[IRenderFunction[IPanelProps]] = js.native
  
  /**
    * Optional custom renderer for footer region. Replaces sticky footer.
    */
  var onRenderFooter: js.UndefOr[IRenderFunction[IPanelProps]] = js.native
  
  /**
    * Custom renderer for content in the sticky footer
    */
  var onRenderFooterContent: js.UndefOr[IRenderFunction[IPanelProps]] = js.native
  
  /**
    * Optional custom renderer for header region. Replaces current title
    */
  var onRenderHeader: js.UndefOr[IPanelHeaderRenderer] = js.native
  
  /**
    * Optional custom renderer navigation region. Replaces the region that contains the close button.
    */
  var onRenderNavigation: js.UndefOr[IRenderFunction[IPanelProps]] = js.native
  
  /**
    * Optional custom renderer for content in the navigation region. Replaces current close button.
    */
  var onRenderNavigationContent: js.UndefOr[IRenderFunction[IPanelProps]] = js.native
  
  /**
    * Optional props to pass to the Overlay component that the panel uses.
    */
  var overlayProps: js.UndefOr[IOverlayProps] = js.native
  
  /**
    * Optional props to pass the Popup component that the panel uses.
    */
  var popupProps: js.UndefOr[IPopupProps] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles]] = js.native
  
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
  
  /**
    * Type of the panel.
    * @defaultvalue PanelType.smallFixedFar
    */
  var `type`: js.UndefOr[PanelType] = js.native
}
object IPanelProps {
  
  @scala.inline
  def apply(): IPanelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanelProps]
  }
  
  @scala.inline
  implicit class IPanelPropsOps[Self <: IPanelProps] (val x: Self) extends AnyVal {
    
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
    def setAllowTouchBodyScroll(value: Boolean): Self = this.set("allowTouchBodyScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTouchBodyScroll: Self = this.set("allowTouchBodyScroll", js.undefined)
    
    @scala.inline
    def setCloseButtonAriaLabel(value: String): Self = this.set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseButtonAriaLabel: Self = this.set("closeButtonAriaLabel", js.undefined)
    
    @scala.inline
    def setComponentId(value: String): Self = this.set("componentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentId: Self = this.set("componentId", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IPanel | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[IPanel]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setCustomWidth(value: String): Self = this.set("customWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomWidth: Self = this.set("customWidth", js.undefined)
    
    @scala.inline
    def setElementToFocusOnDismiss(value: HTMLElement): Self = this.set("elementToFocusOnDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementToFocusOnDismiss: Self = this.set("elementToFocusOnDismiss", js.undefined)
    
    @scala.inline
    def setFirstFocusableSelector(value: String): Self = this.set("firstFocusableSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstFocusableSelector: Self = this.set("firstFocusableSelector", js.undefined)
    
    @scala.inline
    def setFocusTrapZoneProps(value: IFocusTrapZoneProps): Self = this.set("focusTrapZoneProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusTrapZoneProps: Self = this.set("focusTrapZoneProps", js.undefined)
    
    @scala.inline
    def setForceFocusInsideTrap(value: Boolean): Self = this.set("forceFocusInsideTrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceFocusInsideTrap: Self = this.set("forceFocusInsideTrap", js.undefined)
    
    @scala.inline
    def setHasCloseButton(value: Boolean): Self = this.set("hasCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasCloseButton: Self = this.set("hasCloseButton", js.undefined)
    
    @scala.inline
    def setHeaderClassName(value: String): Self = this.set("headerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderClassName: Self = this.set("headerClassName", js.undefined)
    
    @scala.inline
    def setHeaderText(value: String): Self = this.set("headerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderText: Self = this.set("headerText", js.undefined)
    
    @scala.inline
    def setHeaderTextProps(value: HTMLAttributes[HTMLDivElement]): Self = this.set("headerTextProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTextProps: Self = this.set("headerTextProps", js.undefined)
    
    @scala.inline
    def setIgnoreExternalFocusing(value: Boolean): Self = this.set("ignoreExternalFocusing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreExternalFocusing: Self = this.set("ignoreExternalFocusing", js.undefined)
    
    @scala.inline
    def setIsBlocking(value: Boolean): Self = this.set("isBlocking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBlocking: Self = this.set("isBlocking", js.undefined)
    
    @scala.inline
    def setIsFooterAtBottom(value: Boolean): Self = this.set("isFooterAtBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFooterAtBottom: Self = this.set("isFooterAtBottom", js.undefined)
    
    @scala.inline
    def setIsHiddenOnDismiss(value: Boolean): Self = this.set("isHiddenOnDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHiddenOnDismiss: Self = this.set("isHiddenOnDismiss", js.undefined)
    
    @scala.inline
    def setIsLightDismiss(value: Boolean): Self = this.set("isLightDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLightDismiss: Self = this.set("isLightDismiss", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setLayerProps(value: ILayerProps): Self = this.set("layerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerProps: Self = this.set("layerProps", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: /* ev */ js.UndefOr[SyntheticEvent[HTMLElement, Event]] => Unit): Self = this.set("onDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setOnDismissed(value: () => Unit): Self = this.set("onDismissed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDismissed: Self = this.set("onDismissed", js.undefined)
    
    @scala.inline
    def setOnLightDismissClick(value: () => Unit): Self = this.set("onLightDismissClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLightDismissClick: Self = this.set("onLightDismissClick", js.undefined)
    
    @scala.inline
    def setOnOpen(value: () => Unit): Self = this.set("onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOnOpened(value: () => Unit): Self = this.set("onOpened", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOpened: Self = this.set("onOpened", js.undefined)
    
    @scala.inline
    def setOnOuterClick(value: () => Unit): Self = this.set("onOuterClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOuterClick: Self = this.set("onOuterClick", js.undefined)
    
    @scala.inline
    def setOnRenderBody(
      value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderBody", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderBody: Self = this.set("onRenderBody", js.undefined)
    
    @scala.inline
    def setOnRenderFooter(
      value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderFooter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderFooter: Self = this.set("onRenderFooter", js.undefined)
    
    @scala.inline
    def setOnRenderFooterContent(
      value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderFooterContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderFooterContent: Self = this.set("onRenderFooterContent", js.undefined)
    
    @scala.inline
    def setOnRenderHeader(value: IPanelHeaderRenderer): Self = this.set("onRenderHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRenderHeader: Self = this.set("onRenderHeader", js.undefined)
    
    @scala.inline
    def setOnRenderNavigation(
      value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderNavigation", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderNavigation: Self = this.set("onRenderNavigation", js.undefined)
    
    @scala.inline
    def setOnRenderNavigationContent(
      value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderNavigationContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderNavigationContent: Self = this.set("onRenderNavigationContent", js.undefined)
    
    @scala.inline
    def setOverlayProps(value: IOverlayProps): Self = this.set("overlayProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayProps: Self = this.set("overlayProps", js.undefined)
    
    @scala.inline
    def setPopupProps(value: IPopupProps): Self = this.set("popupProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupProps: Self = this.set("popupProps", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IPanelStyleProps => DeepPartial[IPanelStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setType(value: PanelType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
