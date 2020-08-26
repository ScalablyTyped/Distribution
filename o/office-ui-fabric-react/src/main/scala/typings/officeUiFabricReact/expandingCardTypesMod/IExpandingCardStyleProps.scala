package typings.officeUiFabricReact.expandingCardTypesMod

import typings.officeUiFabricReact.baseCardTypesMod.IBaseCardStyleProps
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExpandingCardStyleProps extends IBaseCardStyleProps {
  /**
    * Height of the compact section of the card.
    */
  var compactCardHeight: js.UndefOr[Double] = js.native
  /**
    * Boolean flag that expanded card is in Expanded.mode === expanded && first frame was rendered.
    */
  var expandedCardFirstFrameRendered: js.UndefOr[Boolean] = js.native
  /**
    * Height of the expanded section of the card.
    */
  var expandedCardHeight: js.UndefOr[Double] = js.native
  /**
    * Whether the content of the expanded card overflows vertically.
    */
  var needsScroll: js.UndefOr[Boolean] = js.native
}

object IExpandingCardStyleProps {
  @scala.inline
  def apply(theme: ITheme): IExpandingCardStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExpandingCardStyleProps]
  }
  @scala.inline
  implicit class IExpandingCardStylePropsOps[Self <: IExpandingCardStyleProps] (val x: Self) extends AnyVal {
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
    def setCompactCardHeight(value: Double): Self = this.set("compactCardHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompactCardHeight: Self = this.set("compactCardHeight", js.undefined)
    @scala.inline
    def setExpandedCardFirstFrameRendered(value: Boolean): Self = this.set("expandedCardFirstFrameRendered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandedCardFirstFrameRendered: Self = this.set("expandedCardFirstFrameRendered", js.undefined)
    @scala.inline
    def setExpandedCardHeight(value: Double): Self = this.set("expandedCardHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandedCardHeight: Self = this.set("expandedCardHeight", js.undefined)
    @scala.inline
    def setNeedsScroll(value: Boolean): Self = this.set("needsScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedsScroll: Self = this.set("needsScroll", js.undefined)
  }
  
}

