package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTooltipDisplay extends js.Object {
  var tooltipDisplay: off | auto
  var tooltipLabel: String | js.Array[String]
}

object AnonTooltipDisplay {
  @scala.inline
  def apply(tooltipDisplay: off | auto, tooltipLabel: String | js.Array[String]): AnonTooltipDisplay = {
    val __obj = js.Dynamic.literal(tooltipDisplay = tooltipDisplay.asInstanceOf[js.Any], tooltipLabel = tooltipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTooltipDisplay]
  }
}

