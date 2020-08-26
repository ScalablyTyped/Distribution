package typings.officeUiFabricReact.tooltipTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipStyleProps extends js.Object {
  /**
    * The width of the Callout's beak
    * @defaultvalue 16
    */
  var beakWidth: js.UndefOr[Double] = js.native
  var className: js.UndefOr[String] = js.native
  /**
    * Delay before tooltip appears.
    * @deprecated Delay logic moved to TooltipHost vs relying on animation delay.
    */
  var delay: js.UndefOr[TooltipDelay] = js.native
  /**
    * The gap between the Callout and the target
    * @defaultvalue 0
    */
  var gapSpace: js.UndefOr[Double] = js.native
  /**
    * Maximum width of tooltip.
    */
  var maxWidth: js.UndefOr[String] = js.native
  var theme: ITheme = js.native
}

object ITooltipStyleProps {
  @scala.inline
  def apply(theme: ITheme): ITooltipStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipStyleProps]
  }
  @scala.inline
  implicit class ITooltipStylePropsOps[Self <: ITooltipStyleProps] (val x: Self) extends AnyVal {
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeakWidth(value: Double): Self = this.set("beakWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeakWidth: Self = this.set("beakWidth", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDelay(value: TooltipDelay): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setGapSpace(value: Double): Self = this.set("gapSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGapSpace: Self = this.set("gapSpace", js.undefined)
    @scala.inline
    def setMaxWidth(value: String): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
  }
  
}

