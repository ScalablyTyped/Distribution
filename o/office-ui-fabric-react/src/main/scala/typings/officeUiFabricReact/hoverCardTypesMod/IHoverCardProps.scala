package typings.officeUiFabricReact.hoverCardTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.expandingCardTypesMod.IExpandingCardProps
import typings.officeUiFabricReact.plainCardTypesMod.IPlainCardProps
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.keyCodesMod.KeyCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHoverCardProps extends HTMLAttributes[HTMLDivElement] {
  
  /**
    * Length of card dismiss delay. A min number is necessary for pointer to hop between target and card
    * @defaultvalue 100
    */
  var cardDismissDelay: js.UndefOr[Double] = js.native
  
  /**
    * Length of compact card delay
    * @defaultvalue 500
    */
  var cardOpenDelay: js.UndefOr[Double] = js.native
  
  /**
    * Optional callback to access the IHoverCardHost interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IHoverCard]] = js.native
  
  /**
    * This prop is to separate the target to anchor hover card from the target to attach event listener.
    * If set, this prop separates the target to anchor the hover card from the target to attach the event listener.
    * When no `eventListenerTarget` given, HoverCard will use `target` prop or its root to set event listener.
    */
  var eventListenerTarget: js.UndefOr[HTMLElement | String | Null] = js.native
  
  /**
    * Time in ms when expanded card should open after compact card
    * @defaultvalue 1500
    */
  var expandedCardOpenDelay: js.UndefOr[Double] = js.native
  
  /**
    * Additional ExpandingCard props to pass through HoverCard like renderers, target. gapSpace etc.
    * Used along with 'type' prop set to HoverCardType.expanding.
    * Reference detail properties in ICardProps and IExpandingCardProps.
    */
  var expandingCardProps: js.UndefOr[IExpandingCardProps] = js.native
  
  /**
    * Enables instant open of the full card upon click
    * @defaultvalue false
    */
  var instantOpenOnClick: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback when visible card is expanded.
    */
  var onCardExpand: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback when card hides
    */
  var onCardHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback when card becomes visible
    */
  var onCardVisible: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * HotKey used for opening the HoverCard when tabbed to target.
    * @defaultvalue 'KeyCodes.c'
    */
  var openHotKey: js.UndefOr[KeyCodes] = js.native
  
  /**
    * Additional PlainCard props to pass through HoverCard like renderers, target, gapSpace etc.
    * Used along with 'type' prop set to HoverCardType.plain.
    * See for more details ICardProps and IPlainCardProps interfaces.
    */
  var plainCardProps: js.UndefOr[IPlainCardProps] = js.native
  
  /**
    * Whether or not to mark the container as described by the hover card.
    * If not specified, the caller should mark as element as described by the hover card id.
    */
  var setAriaDescribedBy: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to true to set focus on the first focusable element in the card. Works in pair with the 'trapFocus' prop.
    * @defaultvalue false
    */
  var setInitialFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Should block hover card or not
    */
  var shouldBlockHoverCard: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * If true disables Card dismiss upon mouse leave, so that card sticks around.
    * @defaultvalue false
    */
  var sticky: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom styles for this component
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IHoverCardStyleProps, IHoverCardStyles]] = js.native
  
  /**
    * Optional target element to tag hover card on. If not provided and using HoverCard as a wrapper, don't set the
    * 'data-is-focusable=true' attribute to the root of the wrapped child.
    * If no target is given, HoverCard will use its root as a target and become the focusable element with a
    * focus listener attached to it.
    */
  var target: js.UndefOr[HTMLElement | String | Null] = js.native
  
  /**
    * Theme provided by higher order component.
    */
  var theme: js.UndefOr[ITheme] = js.native
  
  /**
    * Set to true if you want to render the content of the HoverCard in a FocusTrapZone for accessibility reasons.
    * Optionally 'setInitialFocus' prop can be set to true to move focus inside the FocusTrapZone.
    */
  var trapFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Type of the hover card to render.
    * @defaultvalue HoverCardType.expanding
    */
  var `type`: js.UndefOr[HoverCardType] = js.native
}
object IHoverCardProps {
  
  @scala.inline
  def apply(): IHoverCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHoverCardProps]
  }
  
  @scala.inline
  implicit class IHoverCardPropsOps[Self <: IHoverCardProps] (val x: Self) extends AnyVal {
    
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
    def setCardDismissDelay(value: Double): Self = this.set("cardDismissDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardDismissDelay: Self = this.set("cardDismissDelay", js.undefined)
    
    @scala.inline
    def setCardOpenDelay(value: Double): Self = this.set("cardOpenDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardOpenDelay: Self = this.set("cardOpenDelay", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IHoverCard | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[IHoverCard]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setEventListenerTarget(value: HTMLElement | String): Self = this.set("eventListenerTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventListenerTarget: Self = this.set("eventListenerTarget", js.undefined)
    
    @scala.inline
    def setEventListenerTargetNull: Self = this.set("eventListenerTarget", null)
    
    @scala.inline
    def setExpandedCardOpenDelay(value: Double): Self = this.set("expandedCardOpenDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedCardOpenDelay: Self = this.set("expandedCardOpenDelay", js.undefined)
    
    @scala.inline
    def setExpandingCardProps(value: IExpandingCardProps): Self = this.set("expandingCardProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandingCardProps: Self = this.set("expandingCardProps", js.undefined)
    
    @scala.inline
    def setInstantOpenOnClick(value: Boolean): Self = this.set("instantOpenOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstantOpenOnClick: Self = this.set("instantOpenOnClick", js.undefined)
    
    @scala.inline
    def setOnCardExpand(value: () => Unit): Self = this.set("onCardExpand", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnCardExpand: Self = this.set("onCardExpand", js.undefined)
    
    @scala.inline
    def setOnCardHide(value: () => Unit): Self = this.set("onCardHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnCardHide: Self = this.set("onCardHide", js.undefined)
    
    @scala.inline
    def setOnCardVisible(value: () => Unit): Self = this.set("onCardVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnCardVisible: Self = this.set("onCardVisible", js.undefined)
    
    @scala.inline
    def setOpenHotKey(value: KeyCodes): Self = this.set("openHotKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenHotKey: Self = this.set("openHotKey", js.undefined)
    
    @scala.inline
    def setPlainCardProps(value: IPlainCardProps): Self = this.set("plainCardProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlainCardProps: Self = this.set("plainCardProps", js.undefined)
    
    @scala.inline
    def setSetAriaDescribedBy(value: Boolean): Self = this.set("setAriaDescribedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetAriaDescribedBy: Self = this.set("setAriaDescribedBy", js.undefined)
    
    @scala.inline
    def setSetInitialFocus(value: Boolean): Self = this.set("setInitialFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetInitialFocus: Self = this.set("setInitialFocus", js.undefined)
    
    @scala.inline
    def setShouldBlockHoverCard(value: () => Unit): Self = this.set("shouldBlockHoverCard", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShouldBlockHoverCard: Self = this.set("shouldBlockHoverCard", js.undefined)
    
    @scala.inline
    def setSticky(value: Boolean): Self = this.set("sticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSticky: Self = this.set("sticky", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IHoverCardStyleProps => DeepPartial[IHoverCardStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IHoverCardStyleProps, IHoverCardStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTarget(value: HTMLElement | String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTrapFocus(value: Boolean): Self = this.set("trapFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrapFocus: Self = this.set("trapFocus", js.undefined)
    
    @scala.inline
    def setType(value: HoverCardType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
