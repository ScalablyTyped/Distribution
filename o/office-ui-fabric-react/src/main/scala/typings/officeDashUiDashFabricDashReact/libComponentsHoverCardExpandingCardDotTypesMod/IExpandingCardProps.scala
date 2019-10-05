package typings.officeDashUiDashFabricDashReact.libComponentsHoverCardExpandingCardDotTypesMod

import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libComponentsHoverCardBaseCardDotTypesMod.IBaseCardProps
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExpandingCardProps extends IBaseCardProps[IExpandingCard, IExpandingCardStyles, IExpandingCardStyleProps] {
  /**
    * Height of compact card
    * @defaultvalue 156
    */
  var compactCardHeight: js.UndefOr[Double] = js.undefined
  /**
    * Height of expanded card
    * @defaultvalue 384
    */
  var expandedCardHeight: js.UndefOr[Double] = js.undefined
  /**
    * Use to open the card in expanded format and not wait for the delay
    * @defaultvalue ExpandingCardMode.compact
    */
  var mode: js.UndefOr[ExpandingCardMode] = js.undefined
  /**
    *  Render function to populate compact content area
    */
  var onRenderCompactCard: js.UndefOr[IRenderFunction[_]] = js.undefined
  /**
    *  Render function to populate expanded content area
    */
  var onRenderExpandedCard: js.UndefOr[IRenderFunction[_]] = js.undefined
}

object IExpandingCardProps {
  @scala.inline
  def apply(
    IBaseCardProps: IBaseCardProps[IExpandingCard, IExpandingCardStyles, IExpandingCardStyleProps] = null,
    compactCardHeight: Int | Double = null,
    expandedCardHeight: Int | Double = null,
    mode: ExpandingCardMode = null,
    onRenderCompactCard: (/* props */ js.UndefOr[_], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[_], Element | Null]]) => Element | Null = null,
    onRenderExpandedCard: (/* props */ js.UndefOr[_], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[_], Element | Null]]) => Element | Null = null
  ): IExpandingCardProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IBaseCardProps)
    if (compactCardHeight != null) __obj.updateDynamic("compactCardHeight")(compactCardHeight.asInstanceOf[js.Any])
    if (expandedCardHeight != null) __obj.updateDynamic("expandedCardHeight")(expandedCardHeight.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (onRenderCompactCard != null) __obj.updateDynamic("onRenderCompactCard")(js.Any.fromFunction2(onRenderCompactCard))
    if (onRenderExpandedCard != null) __obj.updateDynamic("onRenderExpandedCard")(js.Any.fromFunction2(onRenderExpandedCard))
    __obj.asInstanceOf[IExpandingCardProps]
  }
}

