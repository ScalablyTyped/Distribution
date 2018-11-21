package typings
package officeDashUiDashFabricDashReactLib.libComponentsHoverCardExpandingCardDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IExpandingCardProps
  extends officeDashUiDashFabricDashReactLib.libComponentsHoverCardBaseCardDotTypesMod.IBaseCardProps[IExpandingCard, IExpandingCardStyles, IExpandingCardStyleProps] {
  /**
       * Height of compact card
       * @default 156
       */
  var compactCardHeight: js.UndefOr[scala.Double] = js.undefined
  /**
       * Height of expanded card
       * @default 384
       */
  var expandedCardHeight: js.UndefOr[scala.Double] = js.undefined
  /**
       * Use to open the card in expanded format and not wait for the delay
       * @default ExpandingCardMode.compact
       */
  var mode: js.UndefOr[ExpandingCardMode] = js.undefined
  /**
       *  Render function to populate compact content area
       */
  var onRenderCompactCard: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IExpandingCardProps]
  ] = js.undefined
  /**
       *  Render function to populate expanded content area
       */
  var onRenderExpandedCard: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IExpandingCardProps]
  ] = js.undefined
}

