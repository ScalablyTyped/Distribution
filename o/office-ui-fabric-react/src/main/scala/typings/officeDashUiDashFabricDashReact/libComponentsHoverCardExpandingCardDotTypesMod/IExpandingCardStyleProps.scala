package typings.officeDashUiDashFabricDashReact.libComponentsHoverCardExpandingCardDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.officeDashUiDashFabricDashReact.libComponentsHoverCardBaseCardDotTypesMod.IBaseCardStyleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExpandingCardStyleProps extends IBaseCardStyleProps {
  /**
    * Height of the compact section of the card.
    */
  var compactCardHeight: js.UndefOr[Double] = js.undefined
  /**
    * Boolean flag that expanded card is in Expanded.mode === expanded && first frame was rendered.
    */
  var expandedCardFirstFrameRendered: js.UndefOr[Boolean] = js.undefined
  /**
    * Height of the expanded section of the card.
    */
  var expandedCardHeight: js.UndefOr[Double] = js.undefined
  /**
    * Whether the content of the expanded card overflows vertically.
    */
  var needsScroll: js.UndefOr[Boolean] = js.undefined
}

object IExpandingCardStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    compactCardHeight: Int | Double = null,
    expandedCardFirstFrameRendered: js.UndefOr[Boolean] = js.undefined,
    expandedCardHeight: Int | Double = null,
    needsScroll: js.UndefOr[Boolean] = js.undefined
  ): IExpandingCardStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (className != null) __obj.updateDynamic("className")(className)
    if (compactCardHeight != null) __obj.updateDynamic("compactCardHeight")(compactCardHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(expandedCardFirstFrameRendered)) __obj.updateDynamic("expandedCardFirstFrameRendered")(expandedCardFirstFrameRendered)
    if (expandedCardHeight != null) __obj.updateDynamic("expandedCardHeight")(expandedCardHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(needsScroll)) __obj.updateDynamic("needsScroll")(needsScroll)
    __obj.asInstanceOf[IExpandingCardStyleProps]
  }
}

