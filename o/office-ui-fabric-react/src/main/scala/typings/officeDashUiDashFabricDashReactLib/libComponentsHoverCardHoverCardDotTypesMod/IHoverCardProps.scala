package typings
package officeDashUiDashFabricDashReactLib.libComponentsHoverCardHoverCardDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IHoverCardProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  /**
       * Length of card dismiss delay. A min number is necessary for pointer to hop between target and card
       * @defaultvalue 100
       */
  var cardDismissDelay: js.UndefOr[scala.Double] = js.undefined
  /**
       * Length of compact card delay
       * @defaultvalue 500
       */
  var cardOpenDelay: js.UndefOr[scala.Double] = js.undefined
  /**
       * Optional callback to access the IHoverCardHost interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IHoverCard]] = js.undefined
  /**
       * Time in ms when expanded card should open after compact card
       * @defaultvalue 1500
       */
  var expandedCardOpenDelay: js.UndefOr[scala.Double] = js.undefined
  /**
       * Additional ExpandingCard props to pass through HoverCard like renderers, target. gapSpace etc.
       * Used along with 'type' prop set to HoverCardType.expanding.
       * Reference detail properties in ICardProps and IExpandingCardProps.
       */
  var expandingCardProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsHoverCardExpandingCardDotTypesMod.IExpandingCardProps
  ] = js.undefined
  /**
       * Enables instant open of the full card upon click
       * @defaultvalue false
       */
  var instantOpenOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Callback when card hides
       */
  var onCardHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Callback when card becomes visible
       */
  var onCardVisible: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * HotKey used for opening the HoverCard when tabbed to target.
       * @defaultvalue 'KeyCodes.c'
       */
  var openHotKey: js.UndefOr[atUifabricUtilitiesLib.libKeyCodesMod.KeyCodes] = js.undefined
  /**
       * Additional PlainCard props to pass through HoverCard like renderers, target, gapSpace etc.
       * Used along with 'type' prop set to HoverCardType.plain.
       * See for more details ICardProps and IPlainCardProps interfaces.
       */
  var plainCardProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsHoverCardPlainCardPlainCardDotTypesMod.IPlainCardProps
  ] = js.undefined
  /**
       * Whether or not to mark the container as described by the hover card.
       * If not specified, the caller should mark as element as described by the hover card id.
       */
  var setAriaDescribedBy: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Set to true to set focus on the first focusable element in the card. Works in pair with the 'trapFocus' prop.
       * @defaultvalue false
       */
  var setInitialFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Should block hover card or not
       */
  var shouldBlockHoverCard: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * If true disables Card dismiss upon mouse leave, so that card sticks around.
       * @defaultvalue false
       */
  var sticky: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Custom styles for this component
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IHoverCardStyleProps, IHoverCardStyles]
  ] = js.undefined
  /**
       * Optional target element to tag hover card on.
       * If not provided and using HoverCard as a wrapper, don't set 'data-is-focusable=true' attribute to the root of the wrapped child.
       * When no target given, HoverCard will use it's root as a target and become the focusable element with a focus listener attached to it.
       */
  var target: js.UndefOr[reactLib.HTMLElement | java.lang.String] = js.undefined
  /**
       * Theme provided by higher order component.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * Set to true if you want to render the content of the HoverCard in a FocusTrapZone for accessibility reasons.
       * Optionally 'setInitialFocus' prop can be set to true to move focus inside the FocusTrapZone.
       */
  var trapFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Type of the hover card to render.
       * @defaultvalue HoverCardType.expanding
       */
  var `type`: js.UndefOr[HoverCardType] = js.undefined
}

