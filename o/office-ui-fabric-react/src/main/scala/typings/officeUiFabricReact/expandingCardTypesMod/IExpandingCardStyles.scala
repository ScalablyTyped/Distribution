package typings.officeUiFabricReact.expandingCardTypesMod

import typings.officeUiFabricReact.baseCardTypesMod.IBaseCardStyles
import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExpandingCardStyles extends IBaseCardStyles {
  /**
    * Style for the main card element.
    */
  var compactCard: js.UndefOr[IStyle] = js.native
  /**
    * Base Style for the expanded card content.
    */
  var expandedCard: js.UndefOr[IStyle] = js.native
  /**
    * Style for the expanded card scroll content.
    */
  var expandedCardScroll: js.UndefOr[IStyle] = js.native
}

object IExpandingCardStyles {
  @scala.inline
  def apply(): IExpandingCardStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExpandingCardStyles]
  }
  @scala.inline
  implicit class IExpandingCardStylesOps[Self <: IExpandingCardStyles] (val x: Self) extends AnyVal {
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
    def setCompactCard(value: IStyle): Self = this.set("compactCard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompactCard: Self = this.set("compactCard", js.undefined)
    @scala.inline
    def setCompactCardNull: Self = this.set("compactCard", null)
    @scala.inline
    def setExpandedCard(value: IStyle): Self = this.set("expandedCard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandedCard: Self = this.set("expandedCard", js.undefined)
    @scala.inline
    def setExpandedCardNull: Self = this.set("expandedCard", null)
    @scala.inline
    def setExpandedCardScroll(value: IStyle): Self = this.set("expandedCardScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandedCardScroll: Self = this.set("expandedCardScroll", js.undefined)
    @scala.inline
    def setExpandedCardScrollNull: Self = this.set("expandedCardScroll", null)
  }
  
}

