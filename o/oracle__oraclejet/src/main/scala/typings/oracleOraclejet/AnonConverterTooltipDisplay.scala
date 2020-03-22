package typings.oracleOraclejet

import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConverterTooltipDisplay extends js.Object {
  var converter: js.UndefOr[Converter[String]] = js.undefined
  var tooltipDisplay: js.UndefOr[off | auto] = js.undefined
  var tooltipLabel: js.UndefOr[String] = js.undefined
}

object AnonConverterTooltipDisplay {
  @scala.inline
  def apply(
    converter: Converter[String] = null,
    tooltipDisplay: off | auto = null,
    tooltipLabel: String = null
  ): AnonConverterTooltipDisplay = {
    val __obj = js.Dynamic.literal()
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (tooltipDisplay != null) __obj.updateDynamic("tooltipDisplay")(tooltipDisplay.asInstanceOf[js.Any])
    if (tooltipLabel != null) __obj.updateDynamic("tooltipLabel")(tooltipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConverterTooltipDisplay]
  }
}

