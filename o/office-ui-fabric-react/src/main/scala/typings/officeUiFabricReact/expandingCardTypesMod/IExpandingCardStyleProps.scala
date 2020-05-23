package typings.officeUiFabricReact.expandingCardTypesMod

import typings.officeUiFabricReact.baseCardTypesMod.IBaseCardStyleProps
import typings.uifabricStyling.ithemeMod.ITheme
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
    compactCardHeight: js.UndefOr[Double] = js.undefined,
    expandedCardFirstFrameRendered: js.UndefOr[Boolean] = js.undefined,
    expandedCardHeight: js.UndefOr[Double] = js.undefined,
    needsScroll: js.UndefOr[Boolean] = js.undefined
  ): IExpandingCardStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compactCardHeight)) __obj.updateDynamic("compactCardHeight")(compactCardHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expandedCardFirstFrameRendered)) __obj.updateDynamic("expandedCardFirstFrameRendered")(expandedCardFirstFrameRendered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expandedCardHeight)) __obj.updateDynamic("expandedCardHeight")(expandedCardHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(needsScroll)) __obj.updateDynamic("needsScroll")(needsScroll.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExpandingCardStyleProps]
  }
}

