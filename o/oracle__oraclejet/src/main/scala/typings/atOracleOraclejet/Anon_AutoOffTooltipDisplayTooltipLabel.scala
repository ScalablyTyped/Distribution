package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoOffTooltipDisplayTooltipLabel extends js.Object {
  var tooltipDisplay: js.UndefOr[off | auto] = js.undefined
  var tooltipLabel: js.UndefOr[String] = js.undefined
}

object Anon_AutoOffTooltipDisplayTooltipLabel {
  @scala.inline
  def apply(tooltipDisplay: off | auto = null, tooltipLabel: String = null): Anon_AutoOffTooltipDisplayTooltipLabel = {
    val __obj = js.Dynamic.literal()
    if (tooltipDisplay != null) __obj.updateDynamic("tooltipDisplay")(tooltipDisplay.asInstanceOf[js.Any])
    if (tooltipLabel != null) __obj.updateDynamic("tooltipLabel")(tooltipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoOffTooltipDisplayTooltipLabel]
  }
}

