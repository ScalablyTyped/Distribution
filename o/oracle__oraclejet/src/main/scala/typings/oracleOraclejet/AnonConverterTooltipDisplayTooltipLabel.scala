package typings.oracleOraclejet

import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConverterTooltipDisplayTooltipLabel extends js.Object {
  var converter: js.UndefOr[Converter[Double]] = js.undefined
  var tooltipDisplay: js.UndefOr[off | auto] = js.undefined
  var tooltipLabel: js.UndefOr[String] = js.undefined
}

object AnonConverterTooltipDisplayTooltipLabel {
  @scala.inline
  def apply(
    converter: Converter[Double] = null,
    tooltipDisplay: off | auto = null,
    tooltipLabel: String = null
  ): AnonConverterTooltipDisplayTooltipLabel = {
    val __obj = js.Dynamic.literal()
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (tooltipDisplay != null) __obj.updateDynamic("tooltipDisplay")(tooltipDisplay.asInstanceOf[js.Any])
    if (tooltipLabel != null) __obj.updateDynamic("tooltipLabel")(tooltipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConverterTooltipDisplayTooltipLabel]
  }
}

