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
    compactCard: IStyle = null,
    expandedCard: IStyle = null,
    expandedCardScroll: IStyle = null,
    root: IStyle = null
  ): IExpandingCardStyles = {
    val __obj = js.Dynamic.literal()
    if (compactCard != null) __obj.updateDynamic("compactCard")(compactCard.asInstanceOf[js.Any])
    if (expandedCard != null) __obj.updateDynamic("expandedCard")(expandedCard.asInstanceOf[js.Any])
    if (expandedCardScroll != null) __obj.updateDynamic("expandedCardScroll")(expandedCardScroll.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExpandingCardStyles]
  }
}

