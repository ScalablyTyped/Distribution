package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipHelp extends js.Object {
  var tooltipHelp: js.UndefOr[String] = js.native
  var tooltipRequired: js.UndefOr[String] = js.native
}

object TooltipHelp {
  @scala.inline
  def apply(): TooltipHelp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipHelp]
  }
  @scala.inline
  implicit class TooltipHelpOps[Self <: TooltipHelp] (val x: Self) extends AnyVal {
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
    def setTooltipHelp(value: String): Self = this.set("tooltipHelp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipHelp: Self = this.set("tooltipHelp", js.undefined)
    @scala.inline
    def setTooltipRequired(value: String): Self = this.set("tooltipRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipRequired: Self = this.set("tooltipRequired", js.undefined)
  }
  
}

