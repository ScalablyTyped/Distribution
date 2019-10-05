package typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libKeyCodesMod.KeyCodes
import typings.officeDashUiDashFabricDashReact.libComponentsHoverCardExpandingCardDotTypesMod.IExpandingCardProps
import typings.officeDashUiDashFabricDashReact.libComponentsHoverCardPlainCardPlainCardDotTypesMod.IPlainCardProps
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHoverCardProps extends HTMLAttributes[HTMLDivElement] {
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
    * Optional target element to tag hover card on.
    * If not provided and using HoverCard as a wrapper, don't set 'data-is-focusable=true' attribute to the root of the wrapped child.
    * When no target given, HoverCard will use it's root as a target and become the focusable element with a focus listener attached to it.
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
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    cardDismissDelay: Int | Double = null,
    cardOpenDelay: Int | Double = null,
    className: String = null,
    componentRef: IRefObject[IHoverCard] = null,
    eventListenerTarget: HTMLElement | String = null,
    expandedCardOpenDelay: Int | Double = null,
    expandingCardProps: IExpandingCardProps = null,
    instantOpenOnClick: js.UndefOr[Boolean] = js.undefined,
    onCardExpand: () => Unit = null,
    onCardHide: () => Unit = null,
    onCardVisible: () => Unit = null,
    openHotKey: Int | Double = null,
    plainCardProps: IPlainCardProps = null,
    setAriaDescribedBy: js.UndefOr[Boolean] = js.undefined,
    setInitialFocus: js.UndefOr[Boolean] = js.undefined,
    shouldBlockHoverCard: () => Unit = null,
    sticky: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IHoverCardStyleProps, IHoverCardStyles] = null,
    target: HTMLElement | String = null,
    theme: ITheme = null,
    trapFocus: js.UndefOr[Boolean] = js.undefined,
    `type`: HoverCardType = null
  ): IHoverCardProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (cardDismissDelay != null) __obj.updateDynamic("cardDismissDelay")(cardDismissDelay.asInstanceOf[js.Any])
    if (cardOpenDelay != null) __obj.updateDynamic("cardOpenDelay")(cardOpenDelay.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (eventListenerTarget != null) __obj.updateDynamic("eventListenerTarget")(eventListenerTarget.asInstanceOf[js.Any])
    if (expandedCardOpenDelay != null) __obj.updateDynamic("expandedCardOpenDelay")(expandedCardOpenDelay.asInstanceOf[js.Any])
    if (expandingCardProps != null) __obj.updateDynamic("expandingCardProps")(expandingCardProps)
    if (!js.isUndefined(instantOpenOnClick)) __obj.updateDynamic("instantOpenOnClick")(instantOpenOnClick)
    if (onCardExpand != null) __obj.updateDynamic("onCardExpand")(js.Any.fromFunction0(onCardExpand))
    if (onCardHide != null) __obj.updateDynamic("onCardHide")(js.Any.fromFunction0(onCardHide))
    if (onCardVisible != null) __obj.updateDynamic("onCardVisible")(js.Any.fromFunction0(onCardVisible))
    if (openHotKey != null) __obj.updateDynamic("openHotKey")(openHotKey.asInstanceOf[js.Any])
    if (plainCardProps != null) __obj.updateDynamic("plainCardProps")(plainCardProps)
    if (!js.isUndefined(setAriaDescribedBy)) __obj.updateDynamic("setAriaDescribedBy")(setAriaDescribedBy)
    if (!js.isUndefined(setInitialFocus)) __obj.updateDynamic("setInitialFocus")(setInitialFocus)
    if (shouldBlockHoverCard != null) __obj.updateDynamic("shouldBlockHoverCard")(js.Any.fromFunction0(shouldBlockHoverCard))
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(trapFocus)) __obj.updateDynamic("trapFocus")(trapFocus)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IHoverCardProps]
  }
}

