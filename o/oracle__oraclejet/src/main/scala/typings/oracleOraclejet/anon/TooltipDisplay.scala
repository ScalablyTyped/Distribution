package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipDisplay extends js.Object {
  var tooltipDisplay: off | auto = js.native
  var tooltipLabel: String | js.Array[String] = js.native
}

object TooltipDisplay {
  @scala.inline
  def apply(tooltipDisplay: off | auto, tooltipLabel: String | js.Array[String]): TooltipDisplay = {
    val __obj = js.Dynamic.literal(tooltipDisplay = tooltipDisplay.asInstanceOf[js.Any], tooltipLabel = tooltipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipDisplay]
  }
  @scala.inline
  implicit class TooltipDisplayOps[Self <: TooltipDisplay] (val x: Self) extends AnyVal {
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
    def setTooltipDisplay(value: off | auto): Self = this.set("tooltipDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltipLabelVarargs(value: String*): Self = this.set("tooltipLabel", js.Array(value :_*))
    @scala.inline
    def setTooltipLabel(value: String | js.Array[String]): Self = this.set("tooltipLabel", value.asInstanceOf[js.Any])
  }
  
}

