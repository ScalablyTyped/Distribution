package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoOffTooltipDisplayTooltipLabel extends js.Object {
  var tooltipDisplay: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ] = js.undefined
  var tooltipLabel: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AutoOffTooltipDisplayTooltipLabel {
  @scala.inline
  def apply(
    tooltipDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = null,
    tooltipLabel: java.lang.String = null
  ): Anon_AutoOffTooltipDisplayTooltipLabel = {
    val __obj = js.Dynamic.literal()
    if (tooltipDisplay != null) __obj.updateDynamic("tooltipDisplay")(tooltipDisplay.asInstanceOf[js.Any])
    if (tooltipLabel != null) __obj.updateDynamic("tooltipLabel")(tooltipLabel)
    __obj.asInstanceOf[Anon_AutoOffTooltipDisplayTooltipLabel]
  }
}

