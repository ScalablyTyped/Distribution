package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.anon.PartialIButtonStyles
import typings.officeUiFabricReact.libComponentsFocusTrapZoneFocusTrapZoneDottypesMod.IFocusTrapZoneProps
import typings.officeUiFabricReact.libComponentsLayerLayerDottypesMod.ILayerProps
import typings.officeUiFabricReact.libComponentsOverlayOverlayDottypesMod.IOverlayProps
import typings.officeUiFabricReact.libComponentsPanelPanelDotbaseMod.PanelBase
import typings.officeUiFabricReact.libComponentsPopupPopupDottypesMod.IPopupProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import typings.uifabricUtilities.libIrenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPanelPanelDottypesMod {
  
  @js.native
  sealed trait PanelType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Panel/Panel.types", "PanelType")
  @js.native
  object PanelType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PanelType & Double] = js.native
    
    /**
      * Renders the Panel in `custom` size using `customWidth`, anchored to the far side (right in LTR mode).
      * - Has a fixed width provided by the `customWidth` prop
      * - When screen width reaches the `customWidth` value it will behave like a fluid width Panel
      * taking up 100% of the viewport width
      */
    @js.native
    sealed trait custom
      extends StObject
         with PanelType
    /* 7 */ val custom: typings.officeUiFabricReact.libComponentsPanelPanelDottypesMod.PanelType.custom & Double = js.native
    
    /**
      * Renders the Panel in `custom` size using `customWidth`, anchored to the near side (left in LTR mode).
      * - Has a fixed width provided by the `customWidth` prop
      * - When screen width reaches the `customWidth` value it will behave like a fluid width Panel
      * taking up 100% of the viewport width
      */
    @js.native
    sealed trait customNear
      extends StObject
         with PanelType
    /* 8 */ val customNear: typings.officeUiFabricReact.libComponentsPanelPanelDottypesMod.PanelType.customNear & Double = js.native
    
    /**
      * Renders the Panel in `extra large` size, anchored to the far side (right in LTR mode).
      * - Small (320-479): adapts to `PanelType.smallFluid` at this breakpoint
      * - Medium (480-639): adapts to `PanelType.smallFixedFar` at this breakpoint
      * - Large (640-1023): adapts to `PanelType.medium` at this breakpoint
      * - XLarge (1024-1365): adapts to `PanelType.large` at this breakpoint
      * - XXLarge (1366-1919): 176px fixed left margin, fluid width, 40px left/right padding
      * - XXXLarge (1920-up): 176px fixed left margin, fluid width, 40px left/right padding
      */
    @js.native
    sealed trait extraLarge
      extends StObject
         with PanelType
    /* 6 */ val extraLarge: typings.officeUiFabricReact.libComponentsPanelPanelDottypesMod.PanelType.extraLarge & Double = js.native
    
    /**
      * Renders the Panel in `large` size, anchored to the far side (right in LTR mode).
      * - Small (320-479): adapts to `PanelType.smallFluid` at this breakpoint
      * - Medium (480-639):  adapts to `PanelType.smallFixedFar` at this breakpoint
      * - Large (640-1023): adapts to `PanelType.medium` at this breakpoint
      * - XLarge (1024-1365): 48px fixed left margin, fluid width, 32px left/right padding
      * - XXLarge (1366-up): 428px fixed left margin, fluid width, 40px left/right padding
      */
    @js.native
    sealed trait large
      extends StObject
         with PanelType
    /* 4 */ val large: typings.officeUiFabricReact.libComponentsPanelPanelDottypesMod.PanelType.large & Double = js.native
    
    /**
      * Renders the Panel in `large` size, anchored to the far side (right in LTR mode), with a fixed width at
      * XX-Large breakpoint.
      * - Small (320-479): adapts to `PanelType.smallFluid` at this breakpoint
      * - Medium (480-639): adapts to `PanelType.smallFixedFar` at this breakpoint
      * - Large (640-1023): adapts to `PanelType.medium` at this breakpoint
      * - XLarge (1024-1365): 48px fixed left margin, fluid width, 32px left/right padding
      * - XXLarge (1366-up): 940px width, 40px left/right padding
      */
    @js.native
    sealed trait largeFixed
      extends StObject
         with PanelType
    /* 5 */ val largeFixed: typings.officeUiFabricReact.libComponentsPanelPanelDottypesMod.PanelType.largeFixed & Double = js.native
    
    /**
      * Renders the Panel in `medium` size, anchored to the far side (right in LTR mode).
      * - Small (320-479): adapts to `PanelType.smallFluid` at this breakpoint
      * - Medium (480-639): adapts to `PanelType.smallFixedFar` at this breakpoint
      * - Large (640-1023): 592px width, 32px left/right padding
      * - XLarge (1024-1365): 644px width, 32px left/right padding
      * - XXLarge (1366-up): 644px width, 40px left/right padding
      */
    @js.native
    sealed trait medium
      extends StObject
         with PanelType
    /* 3 */ val medium: typings.officeUiFabricReact.libComponentsPanelPanelDottypesMod.PanelType.medium & Double = js.native
    
    /**
      * Renders the Panel in fixed-width `small` size, anchored to the far side (right in LTR mode).
      * - Small (320-479): adapts to `PanelType.smallFluid` at this breakpoint
      * - Medium (480-639): 340px width, 16px left/right padding
      * - Large (640-1023): 340px width, 32px left/right padding
      * - XLarge (1024-1365): 340px width, 32px left/right padding
      * - XXLarge (1366-up): 340px width, 40px left/right padding
      */
    @js.native
    sealed trait smallFixedFar
      extends StObject
         with PanelType
    /* 1 */ val smallFixedFar: typings.officeUiFabricReact.libComponentsPanelPanelDottypesMod.PanelType.smallFixedFar & Double = js.native
    
    /**
      * Renders the Panel in fixed-width `small` size, anchored to the near side (left in LTR mode).
      * - Small (320-479): 272px width, 16px left/right padding
      * - Medium (480-639): 272px width, 16px left/right padding
      * - Large (640-1023): 272px width, 32px left/right padding
      * - XLarge (1024-1365): 272px width, 32px left/right padding
      * - XXLarge (1366-up): 272px width, 40px left/right padding
      */
    @js.native
    sealed trait smallFixedNear
      extends StObject
         with PanelType
    /* 2 */ val smallFixedNear: typings.officeUiFabricReact.libComponentsPanelPanelDottypesMod.PanelType.smallFixedNear & Double = js.native
    
    /**
      * Renders the Panel with a `fluid` (full screen) width.
      * Recommended for use on small screen breakpoints.
      * - Small (320-479): full screen width, 16px left/right padding
      * - Medium (480-639): full screen width, 16px left/right padding
      * - Large (640-1023): full screen width, 32px left/right padding
      * - XLarge (1024-1365): full screen width, 32px left/right padding
      * - XXLarge (1366-up): full screen width, 40px left/right padding
      */
    @js.native
    sealed trait smallFluid
      extends StObject
         with PanelType
    /* 0 */ val smallFluid: typings.officeUiFabricReact.libComponentsPanelPanelDottypesMod.PanelType.smallFluid & Double = js.native
  }
  
  @js.native
  trait IPanel extends StObject {
    
    /**
      * Forces the panel to dismiss.
      */
    def dismiss(): Unit = js.native
    def dismiss(ev: KeyboardEvent[HTMLElement]): Unit = js.native
    
    /**
      * Forces the panel to open.
      */
    def open(): Unit = js.native
  }
  
  @js.native
  trait IPanelHeaderRenderer extends IRenderFunction[IPanelProps] {
    
    /**
      * @param props - Props given to the panel
      * @param defaultRender - Default header renderer. If using this renderer in code that does not
      * assign `headerTextId` to an element elsewhere, it **must** be passed to this function.
      * @param headerTextId - If provided, this **must** be used as the ID of an element containing the
      * panel's title, because the panel popup uses this ID as its aria-labelledby.
      */
    def apply(): Element | Null = js.native
    def apply(props: Unit, defaultRender: Unit, headerTextId: String): Element | Null = js.native
    def apply(props: Unit, defaultRender: IPanelHeaderRenderer): Element | Null = js.native
    def apply(props: Unit, defaultRender: IPanelHeaderRenderer, headerTextId: String): Element | Null = js.native
    def apply(props: IPanelProps): Element | Null = js.native
    def apply(props: IPanelProps, defaultRender: Unit, headerTextId: String): Element | Null = js.native
    def apply(props: IPanelProps, defaultRender: IPanelHeaderRenderer): Element | Null = js.native
    def apply(props: IPanelProps, defaultRender: IPanelHeaderRenderer, headerTextId: String): Element | Null = js.native
  }
  
  trait IPanelProps
    extends StObject
       with HTMLAttributes[PanelBase] {
    
    /**
      * Allow body scroll on content and overlay on touch devices. Changing after mounting has no effect.
      * @defaultvalue false
      */
    var allowTouchBodyScroll: js.UndefOr[Boolean] = js.undefined
    
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
      * The props for header text container.
      */
    var headerTextProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
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
    var onOuterClick: js.UndefOr[
        js.Function1[/* ev */ js.UndefOr[MouseEvent[HTMLDivElement, NativeMouseEvent]], Unit]
      ] = js.undefined
    
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
      * Optional props to pass the Popup component that the panel uses.
      */
    var popupProps: js.UndefOr[IPopupProps] = js.undefined
    
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
      * @defaultvalue PanelType.smallFixedFar
      */
    var `type`: js.UndefOr[PanelType] = js.undefined
  }
  object IPanelProps {
    
    inline def apply(): IPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPanelProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPanelProps] (val x: Self) extends AnyVal {
      
      inline def setAllowTouchBodyScroll(value: Boolean): Self = StObject.set(x, "allowTouchBodyScroll", value.asInstanceOf[js.Any])
      
      inline def setAllowTouchBodyScrollUndefined: Self = StObject.set(x, "allowTouchBodyScroll", js.undefined)
      
      inline def setCloseButtonAriaLabel(value: String): Self = StObject.set(x, "closeButtonAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonAriaLabelUndefined: Self = StObject.set(x, "closeButtonAriaLabel", js.undefined)
      
      inline def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
      
      inline def setComponentIdUndefined: Self = StObject.set(x, "componentId", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IPanel]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IPanel | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setCustomWidth(value: String): Self = StObject.set(x, "customWidth", value.asInstanceOf[js.Any])
      
      inline def setCustomWidthUndefined: Self = StObject.set(x, "customWidth", js.undefined)
      
      inline def setElementToFocusOnDismiss(value: HTMLElement): Self = StObject.set(x, "elementToFocusOnDismiss", value.asInstanceOf[js.Any])
      
      inline def setElementToFocusOnDismissUndefined: Self = StObject.set(x, "elementToFocusOnDismiss", js.undefined)
      
      inline def setFirstFocusableSelector(value: String): Self = StObject.set(x, "firstFocusableSelector", value.asInstanceOf[js.Any])
      
      inline def setFirstFocusableSelectorUndefined: Self = StObject.set(x, "firstFocusableSelector", js.undefined)
      
      inline def setFocusTrapZoneProps(value: IFocusTrapZoneProps): Self = StObject.set(x, "focusTrapZoneProps", value.asInstanceOf[js.Any])
      
      inline def setFocusTrapZonePropsUndefined: Self = StObject.set(x, "focusTrapZoneProps", js.undefined)
      
      inline def setForceFocusInsideTrap(value: Boolean): Self = StObject.set(x, "forceFocusInsideTrap", value.asInstanceOf[js.Any])
      
      inline def setForceFocusInsideTrapUndefined: Self = StObject.set(x, "forceFocusInsideTrap", js.undefined)
      
      inline def setHasCloseButton(value: Boolean): Self = StObject.set(x, "hasCloseButton", value.asInstanceOf[js.Any])
      
      inline def setHasCloseButtonUndefined: Self = StObject.set(x, "hasCloseButton", js.undefined)
      
      inline def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
      
      inline def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
      
      inline def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      inline def setHeaderTextProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "headerTextProps", value.asInstanceOf[js.Any])
      
      inline def setHeaderTextPropsUndefined: Self = StObject.set(x, "headerTextProps", js.undefined)
      
      inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      inline def setIgnoreExternalFocusing(value: Boolean): Self = StObject.set(x, "ignoreExternalFocusing", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExternalFocusingUndefined: Self = StObject.set(x, "ignoreExternalFocusing", js.undefined)
      
      inline def setIsBlocking(value: Boolean): Self = StObject.set(x, "isBlocking", value.asInstanceOf[js.Any])
      
      inline def setIsBlockingUndefined: Self = StObject.set(x, "isBlocking", js.undefined)
      
      inline def setIsFooterAtBottom(value: Boolean): Self = StObject.set(x, "isFooterAtBottom", value.asInstanceOf[js.Any])
      
      inline def setIsFooterAtBottomUndefined: Self = StObject.set(x, "isFooterAtBottom", js.undefined)
      
      inline def setIsHiddenOnDismiss(value: Boolean): Self = StObject.set(x, "isHiddenOnDismiss", value.asInstanceOf[js.Any])
      
      inline def setIsHiddenOnDismissUndefined: Self = StObject.set(x, "isHiddenOnDismiss", js.undefined)
      
      inline def setIsLightDismiss(value: Boolean): Self = StObject.set(x, "isLightDismiss", value.asInstanceOf[js.Any])
      
      inline def setIsLightDismissUndefined: Self = StObject.set(x, "isLightDismiss", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setLayerProps(value: ILayerProps): Self = StObject.set(x, "layerProps", value.asInstanceOf[js.Any])
      
      inline def setLayerPropsUndefined: Self = StObject.set(x, "layerProps", js.undefined)
      
      inline def setOnDismiss(value: /* ev */ js.UndefOr[SyntheticEvent[HTMLElement, Event]] => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOnDismissed(value: () => Unit): Self = StObject.set(x, "onDismissed", js.Any.fromFunction0(value))
      
      inline def setOnDismissedUndefined: Self = StObject.set(x, "onDismissed", js.undefined)
      
      inline def setOnLightDismissClick(value: () => Unit): Self = StObject.set(x, "onLightDismissClick", js.Any.fromFunction0(value))
      
      inline def setOnLightDismissClickUndefined: Self = StObject.set(x, "onLightDismissClick", js.undefined)
      
      inline def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnOpened(value: () => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction0(value))
      
      inline def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
      
      inline def setOnOuterClick(value: /* ev */ js.UndefOr[MouseEvent[HTMLDivElement, NativeMouseEvent]] => Unit): Self = StObject.set(x, "onOuterClick", js.Any.fromFunction1(value))
      
      inline def setOnOuterClickUndefined: Self = StObject.set(x, "onOuterClick", js.undefined)
      
      inline def setOnRenderBody(
        value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderBody", js.Any.fromFunction2(value))
      
      inline def setOnRenderBodyUndefined: Self = StObject.set(x, "onRenderBody", js.undefined)
      
      inline def setOnRenderFooter(
        value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderFooter", js.Any.fromFunction2(value))
      
      inline def setOnRenderFooterContent(
        value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderFooterContent", js.Any.fromFunction2(value))
      
      inline def setOnRenderFooterContentUndefined: Self = StObject.set(x, "onRenderFooterContent", js.undefined)
      
      inline def setOnRenderFooterUndefined: Self = StObject.set(x, "onRenderFooter", js.undefined)
      
      inline def setOnRenderHeader(value: IPanelHeaderRenderer): Self = StObject.set(x, "onRenderHeader", value.asInstanceOf[js.Any])
      
      inline def setOnRenderHeaderUndefined: Self = StObject.set(x, "onRenderHeader", js.undefined)
      
      inline def setOnRenderNavigation(
        value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderNavigation", js.Any.fromFunction2(value))
      
      inline def setOnRenderNavigationContent(
        value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderNavigationContent", js.Any.fromFunction2(value))
      
      inline def setOnRenderNavigationContentUndefined: Self = StObject.set(x, "onRenderNavigationContent", js.undefined)
      
      inline def setOnRenderNavigationUndefined: Self = StObject.set(x, "onRenderNavigation", js.undefined)
      
      inline def setOverlayProps(value: IOverlayProps): Self = StObject.set(x, "overlayProps", value.asInstanceOf[js.Any])
      
      inline def setOverlayPropsUndefined: Self = StObject.set(x, "overlayProps", js.undefined)
      
      inline def setPopupProps(value: IPopupProps): Self = StObject.set(x, "popupProps", value.asInstanceOf[js.Any])
      
      inline def setPopupPropsUndefined: Self = StObject.set(x, "popupProps", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IPanelStyleProps => DeepPartial[IPanelStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: PanelType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IPanelStyleProps extends StObject {
    
    /**
      * Accept custom classNames
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Classname for FocusTrapZone element
      */
    var focusTrapZoneClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Panel has close button
      */
    var hasCloseButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines where the header is rendered based on whether the user
      * has passed in a custom onRenderNavigation or onRenderNavigationContent render callback
      */
    var hasCustomNavigation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional parameter to provider the class name for header text
      */
    var headerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Is animation currently running
      */
    var isAnimating: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines if content should stretch to fill available space putting footer at the bottom of the page
      */
    var isFooterAtBottom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Based on state value setting footer to sticky or not
      */
    var isFooterSticky: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Is panel hidden on dismiss
      */
    var isHiddenOnDismiss: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Is panel on right side
      */
    var isOnRightSide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Is Panel open
      */
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: ITheme
    
    /**
      * Type of the panel.
      */
    var `type`: js.UndefOr[PanelType] = js.undefined
  }
  object IPanelStyleProps {
    
    inline def apply(theme: ITheme): IPanelStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPanelStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPanelStyleProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFocusTrapZoneClassName(value: String): Self = StObject.set(x, "focusTrapZoneClassName", value.asInstanceOf[js.Any])
      
      inline def setFocusTrapZoneClassNameUndefined: Self = StObject.set(x, "focusTrapZoneClassName", js.undefined)
      
      inline def setHasCloseButton(value: Boolean): Self = StObject.set(x, "hasCloseButton", value.asInstanceOf[js.Any])
      
      inline def setHasCloseButtonUndefined: Self = StObject.set(x, "hasCloseButton", js.undefined)
      
      inline def setHasCustomNavigation(value: Boolean): Self = StObject.set(x, "hasCustomNavigation", value.asInstanceOf[js.Any])
      
      inline def setHasCustomNavigationUndefined: Self = StObject.set(x, "hasCustomNavigation", js.undefined)
      
      inline def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
      
      inline def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
      
      inline def setIsAnimating(value: Boolean): Self = StObject.set(x, "isAnimating", value.asInstanceOf[js.Any])
      
      inline def setIsAnimatingUndefined: Self = StObject.set(x, "isAnimating", js.undefined)
      
      inline def setIsFooterAtBottom(value: Boolean): Self = StObject.set(x, "isFooterAtBottom", value.asInstanceOf[js.Any])
      
      inline def setIsFooterAtBottomUndefined: Self = StObject.set(x, "isFooterAtBottom", js.undefined)
      
      inline def setIsFooterSticky(value: Boolean): Self = StObject.set(x, "isFooterSticky", value.asInstanceOf[js.Any])
      
      inline def setIsFooterStickyUndefined: Self = StObject.set(x, "isFooterSticky", js.undefined)
      
      inline def setIsHiddenOnDismiss(value: Boolean): Self = StObject.set(x, "isHiddenOnDismiss", value.asInstanceOf[js.Any])
      
      inline def setIsHiddenOnDismissUndefined: Self = StObject.set(x, "isHiddenOnDismiss", js.undefined)
      
      inline def setIsOnRightSide(value: Boolean): Self = StObject.set(x, "isOnRightSide", value.asInstanceOf[js.Any])
      
      inline def setIsOnRightSideUndefined: Self = StObject.set(x, "isOnRightSide", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setType(value: PanelType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IPanelStyles extends StObject {
    
    /**
      * Style for the close button IconButton element.
      * @deprecated Use `subComponentStyles.closeButton` instead.
      */
    var closeButton: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the navigation container element.
      */
    var commands: IStyle
    
    /**
      * Style for the body div element.
      */
    var content: IStyle
    
    /**
      * Style for the Body and Footer container element.
      */
    var contentInner: IStyle
    
    /**
      * Style for the footer div element.
      */
    var footer: IStyle
    
    /**
      * Style for the inner footer div element.
      */
    var footerInner: IStyle
    
    /**
      * Style for the header container div element.
      */
    var header: IStyle
    
    /**
      * Style for the header text div element.
      */
    var headerText: IStyle
    
    /**
      * Style for the hidden element.
      */
    var hiddenPanel: IStyle
    
    /**
      * Style for the main section element.
      */
    var main: IStyle
    
    /**
      * Style for the close button container element.
      */
    var navigation: IStyle
    
    /**
      * Style for the overlay element.
      */
    var overlay: IStyle
    
    /**
      * Style for the root element.
      */
    var root: IStyle
    
    /**
      * Style for the scrollable content area container element.
      */
    var scrollableContent: IStyle
    
    /**
      * Styling for subcomponents.
      */
    var subComponentStyles: IPanelSubComponentStyles
  }
  object IPanelStyles {
    
    inline def apply(subComponentStyles: IPanelSubComponentStyles): IPanelStyles = {
      val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPanelStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPanelStyles] (val x: Self) extends AnyVal {
      
      inline def setCloseButton(value: IStyle): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonNull: Self = StObject.set(x, "closeButton", null)
      
      inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      inline def setCommands(value: IStyle): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsNull: Self = StObject.set(x, "commands", null)
      
      inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      inline def setContent(value: IStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentInner(value: IStyle): Self = StObject.set(x, "contentInner", value.asInstanceOf[js.Any])
      
      inline def setContentInnerNull: Self = StObject.set(x, "contentInner", null)
      
      inline def setContentInnerUndefined: Self = StObject.set(x, "contentInner", js.undefined)
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setFooter(value: IStyle): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterInner(value: IStyle): Self = StObject.set(x, "footerInner", value.asInstanceOf[js.Any])
      
      inline def setFooterInnerNull: Self = StObject.set(x, "footerInner", null)
      
      inline def setFooterInnerUndefined: Self = StObject.set(x, "footerInner", js.undefined)
      
      inline def setFooterNull: Self = StObject.set(x, "footer", null)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: IStyle): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setHeaderText(value: IStyle): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      inline def setHeaderTextNull: Self = StObject.set(x, "headerText", null)
      
      inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHiddenPanel(value: IStyle): Self = StObject.set(x, "hiddenPanel", value.asInstanceOf[js.Any])
      
      inline def setHiddenPanelNull: Self = StObject.set(x, "hiddenPanel", null)
      
      inline def setHiddenPanelUndefined: Self = StObject.set(x, "hiddenPanel", js.undefined)
      
      inline def setMain(value: IStyle): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainNull: Self = StObject.set(x, "main", null)
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setNavigation(value: IStyle): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setNavigationNull: Self = StObject.set(x, "navigation", null)
      
      inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
      
      inline def setOverlay(value: IStyle): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayNull: Self = StObject.set(x, "overlay", null)
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setScrollableContent(value: IStyle): Self = StObject.set(x, "scrollableContent", value.asInstanceOf[js.Any])
      
      inline def setScrollableContentNull: Self = StObject.set(x, "scrollableContent", null)
      
      inline def setScrollableContentUndefined: Self = StObject.set(x, "scrollableContent", js.undefined)
      
      inline def setSubComponentStyles(value: IPanelSubComponentStyles): Self = StObject.set(x, "subComponentStyles", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPanelSubComponentStyles extends StObject {
    
    /**
      * Styling for close button child component.
      */
    var closeButton: PartialIButtonStyles
  }
  object IPanelSubComponentStyles {
    
    inline def apply(closeButton: PartialIButtonStyles): IPanelSubComponentStyles = {
      val __obj = js.Dynamic.literal(closeButton = closeButton.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPanelSubComponentStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPanelSubComponentStyles] (val x: Self) extends AnyVal {
      
      inline def setCloseButton(value: PartialIButtonStyles): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    }
  }
}
