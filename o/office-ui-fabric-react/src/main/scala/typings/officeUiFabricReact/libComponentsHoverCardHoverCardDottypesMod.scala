package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsHoverCardExpandingCardDottypesMod.IExpandingCardProps
import typings.officeUiFabricReact.libComponentsHoverCardPlainCardPlainCardDottypesMod.IPlainCardProps
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import typings.uifabricUtilities.libKeyCodesMod.KeyCodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsHoverCardHoverCardDottypesMod {
  
  @js.native
  sealed trait HoverCardType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/HoverCard/HoverCard.types", "HoverCardType")
  @js.native
  object HoverCardType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[HoverCardType & String] = js.native
    
    /**
      * File card consisting of two parts: compact and expanded. Has some default sizes if not specified.
      */
    @js.native
    sealed trait expanding
      extends StObject
         with HoverCardType
    /* "ExpandingCard" */ val expanding: typings.officeUiFabricReact.libComponentsHoverCardHoverCardDottypesMod.HoverCardType.expanding & String = js.native
    
    /**
      * Plain card consisting of one part responsive to the size of content.
      */
    @js.native
    sealed trait plain
      extends StObject
         with HoverCardType
    /* "PlainCard" */ val plain: typings.officeUiFabricReact.libComponentsHoverCardHoverCardDottypesMod.HoverCardType.plain & String = js.native
  }
  
  @js.native
  sealed trait OpenCardMode extends StObject
  @JSImport("office-ui-fabric-react/lib/components/HoverCard/HoverCard.types", "OpenCardMode")
  @js.native
  object OpenCardMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OpenCardMode & Double] = js.native
    
    /**
      * Open card by hot key
      */
    @js.native
    sealed trait hotKey
      extends StObject
         with OpenCardMode
    /* 1 */ val hotKey: typings.officeUiFabricReact.libComponentsHoverCardHoverCardDottypesMod.OpenCardMode.hotKey & Double = js.native
    
    /**
      * Open card by hover
      */
    @js.native
    sealed trait hover
      extends StObject
         with OpenCardMode
    /* 0 */ val hover: typings.officeUiFabricReact.libComponentsHoverCardHoverCardDottypesMod.OpenCardMode.hover & Double = js.native
  }
  
  @js.native
  trait IHoverCard extends StObject {
    
    /**
      * Public `dismiss` method to be used through `componentRef` of the HoverCard.
      * Boolean argument controls if the dismiss happens with a timeout delay.
      */
    def dismiss(): Unit = js.native
    def dismiss(withTimeOut: Boolean): Unit = js.native
  }
  
  trait IHoverCardProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Length of card dismiss delay. A min number is necessary for pointer to hop between target and card
      * @defaultvalue 100
      */
    var cardDismissDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Length of compact card delay
      * @defaultvalue 500
      */
    var cardOpenDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional callback to access the IHoverCardHost interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IHoverCard]] = js.undefined
    
    /**
      * This prop is to separate the target to anchor hover card from the target to attach event listener.
      * If set, this prop separates the target to anchor the hover card from the target to attach the event listener.
      * When no `eventListenerTarget` given, HoverCard will use `target` prop or its root to set event listener.
      */
    var eventListenerTarget: js.UndefOr[HTMLElement | String | Null] = js.undefined
    
    /**
      * Time in ms when expanded card should open after compact card
      * @defaultvalue 1500
      */
    var expandedCardOpenDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Additional ExpandingCard props to pass through HoverCard like renderers, target. gapSpace etc.
      * Used along with 'type' prop set to HoverCardType.expanding.
      * Reference detail properties in ICardProps and IExpandingCardProps.
      */
    var expandingCardProps: js.UndefOr[IExpandingCardProps] = js.undefined
    
    /**
      * Enables instant open of the full card upon click
      * @defaultvalue false
      */
    var instantOpenOnClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback when visible card is expanded.
      */
    var onCardExpand: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback when card hides
      */
    var onCardHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback when card becomes visible
      */
    var onCardVisible: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * HotKey used for opening the HoverCard when tabbed to target.
      * @defaultvalue 'KeyCodes.c'
      */
    var openHotKey: js.UndefOr[KeyCodes] = js.undefined
    
    /**
      * Additional PlainCard props to pass through HoverCard like renderers, target, gapSpace etc.
      * Used along with 'type' prop set to HoverCardType.plain.
      * See for more details ICardProps and IPlainCardProps interfaces.
      */
    var plainCardProps: js.UndefOr[IPlainCardProps] = js.undefined
    
    /**
      * Whether or not to mark the container as described by the hover card.
      * If not specified, the caller should mark as element as described by the hover card id.
      */
    var setAriaDescribedBy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true to set focus on the first focusable element in the card. Works in pair with the 'trapFocus' prop.
      * @defaultvalue false
      */
    var setInitialFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should block hover card or not
      */
    var shouldBlockHoverCard: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If true disables Card dismiss upon mouse leave, so that card sticks around.
      * @defaultvalue false
      */
    var sticky: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom styles for this component
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IHoverCardStyleProps, IHoverCardStyles]] = js.undefined
    
    /**
      * Optional target element to tag hover card on. If not provided and using HoverCard as a wrapper, don't set the
      * 'data-is-focusable=true' attribute to the root of the wrapped child.
      * If no target is given, HoverCard will use its root as a target and become the focusable element with a
      * focus listener attached to it.
      */
    var target: js.UndefOr[HTMLElement | String | Null] = js.undefined
    
    /**
      * Theme provided by higher order component.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Set to true if you want to render the content of the HoverCard in a FocusTrapZone for accessibility reasons.
      * Optionally 'setInitialFocus' prop can be set to true to move focus inside the FocusTrapZone.
      */
    var trapFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Type of the hover card to render.
      * @defaultvalue HoverCardType.expanding
      */
    var `type`: js.UndefOr[HoverCardType] = js.undefined
  }
  object IHoverCardProps {
    
    inline def apply(): IHoverCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHoverCardProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IHoverCardProps] (val x: Self) extends AnyVal {
      
      inline def setCardDismissDelay(value: Double): Self = StObject.set(x, "cardDismissDelay", value.asInstanceOf[js.Any])
      
      inline def setCardDismissDelayUndefined: Self = StObject.set(x, "cardDismissDelay", js.undefined)
      
      inline def setCardOpenDelay(value: Double): Self = StObject.set(x, "cardOpenDelay", value.asInstanceOf[js.Any])
      
      inline def setCardOpenDelayUndefined: Self = StObject.set(x, "cardOpenDelay", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IHoverCard]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IHoverCard | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setEventListenerTarget(value: HTMLElement | String): Self = StObject.set(x, "eventListenerTarget", value.asInstanceOf[js.Any])
      
      inline def setEventListenerTargetNull: Self = StObject.set(x, "eventListenerTarget", null)
      
      inline def setEventListenerTargetUndefined: Self = StObject.set(x, "eventListenerTarget", js.undefined)
      
      inline def setExpandedCardOpenDelay(value: Double): Self = StObject.set(x, "expandedCardOpenDelay", value.asInstanceOf[js.Any])
      
      inline def setExpandedCardOpenDelayUndefined: Self = StObject.set(x, "expandedCardOpenDelay", js.undefined)
      
      inline def setExpandingCardProps(value: IExpandingCardProps): Self = StObject.set(x, "expandingCardProps", value.asInstanceOf[js.Any])
      
      inline def setExpandingCardPropsUndefined: Self = StObject.set(x, "expandingCardProps", js.undefined)
      
      inline def setInstantOpenOnClick(value: Boolean): Self = StObject.set(x, "instantOpenOnClick", value.asInstanceOf[js.Any])
      
      inline def setInstantOpenOnClickUndefined: Self = StObject.set(x, "instantOpenOnClick", js.undefined)
      
      inline def setOnCardExpand(value: () => Unit): Self = StObject.set(x, "onCardExpand", js.Any.fromFunction0(value))
      
      inline def setOnCardExpandUndefined: Self = StObject.set(x, "onCardExpand", js.undefined)
      
      inline def setOnCardHide(value: () => Unit): Self = StObject.set(x, "onCardHide", js.Any.fromFunction0(value))
      
      inline def setOnCardHideUndefined: Self = StObject.set(x, "onCardHide", js.undefined)
      
      inline def setOnCardVisible(value: () => Unit): Self = StObject.set(x, "onCardVisible", js.Any.fromFunction0(value))
      
      inline def setOnCardVisibleUndefined: Self = StObject.set(x, "onCardVisible", js.undefined)
      
      inline def setOpenHotKey(value: KeyCodes): Self = StObject.set(x, "openHotKey", value.asInstanceOf[js.Any])
      
      inline def setOpenHotKeyUndefined: Self = StObject.set(x, "openHotKey", js.undefined)
      
      inline def setPlainCardProps(value: IPlainCardProps): Self = StObject.set(x, "plainCardProps", value.asInstanceOf[js.Any])
      
      inline def setPlainCardPropsUndefined: Self = StObject.set(x, "plainCardProps", js.undefined)
      
      inline def setSetAriaDescribedBy(value: Boolean): Self = StObject.set(x, "setAriaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setSetAriaDescribedByUndefined: Self = StObject.set(x, "setAriaDescribedBy", js.undefined)
      
      inline def setSetInitialFocus(value: Boolean): Self = StObject.set(x, "setInitialFocus", value.asInstanceOf[js.Any])
      
      inline def setSetInitialFocusUndefined: Self = StObject.set(x, "setInitialFocus", js.undefined)
      
      inline def setShouldBlockHoverCard(value: () => Unit): Self = StObject.set(x, "shouldBlockHoverCard", js.Any.fromFunction0(value))
      
      inline def setShouldBlockHoverCardUndefined: Self = StObject.set(x, "shouldBlockHoverCard", js.undefined)
      
      inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IHoverCardStyleProps, IHoverCardStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IHoverCardStyleProps => DeepPartial[IHoverCardStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTarget(value: HTMLElement | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTrapFocus(value: Boolean): Self = StObject.set(x, "trapFocus", value.asInstanceOf[js.Any])
      
      inline def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
      
      inline def setType(value: HoverCardType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IHoverCardStyleProps extends StObject {
    
    /**
      * Optional className(s) for the host div of HoverCard.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: ITheme
  }
  object IHoverCardStyleProps {
    
    inline def apply(theme: ITheme): IHoverCardStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHoverCardStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IHoverCardStyleProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IHoverCardStyles extends StObject {
    
    /**
      * Style for the host element in the default enabled, non-toggled state.
      */
    var host: js.UndefOr[IStyle] = js.undefined
  }
  object IHoverCardStyles {
    
    inline def apply(): IHoverCardStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHoverCardStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IHoverCardStyles] (val x: Self) extends AnyVal {
      
      inline def setHost(value: IStyle): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    }
  }
}
