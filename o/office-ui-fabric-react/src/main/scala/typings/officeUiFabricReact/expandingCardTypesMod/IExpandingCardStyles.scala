package typings.officeUiFabricReact.expandingCardTypesMod

import typings.officeUiFabricReact.baseCardTypesMod.IBaseCardStyles
import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExpandingCardStyles extends IBaseCardStyles {
  /**
    * Style for the main card element.
    */
  var compactCard: js.UndefOr[IStyle] = js.undefined
  /**
    * Base Style for the expanded card content.
    */
  var expandedCard: js.UndefOr[IStyle] = js.undefined
  /**
    * Style for the expanded card scroll content.
    */
  var expandedCardScroll: js.UndefOr[IStyle] = js.undefined
}

object IExpandingCardStyles {
  @scala.inline
  def apply(
    compactCard: js.UndefOr[Null | IStyle] = js.undefined,
    expandedCard: js.UndefOr[Null | IStyle] = js.undefined,
    expandedCardScroll: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): IExpandingCardStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compactCard)) __obj.updateDynamic("compactCard")(compactCard.asInstanceOf[js.Any])
    if (!js.isUndefined(expandedCard)) __obj.updateDynamic("expandedCard")(expandedCard.asInstanceOf[js.Any])
    if (!js.isUndefined(expandedCardScroll)) __obj.updateDynamic("expandedCardScroll")(expandedCardScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExpandingCardStyles]
  }
}

