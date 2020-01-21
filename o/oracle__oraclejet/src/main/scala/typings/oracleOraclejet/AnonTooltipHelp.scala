package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTooltipHelp extends js.Object {
  var tooltipHelp: js.UndefOr[String] = js.undefined
  var tooltipRequired: js.UndefOr[String] = js.undefined
}

object AnonTooltipHelp {
  @scala.inline
  def apply(tooltipHelp: String = null, tooltipRequired: String = null): AnonTooltipHelp = {
    val __obj = js.Dynamic.literal()
    if (tooltipHelp != null) __obj.updateDynamic("tooltipHelp")(tooltipHelp.asInstanceOf[js.Any])
    if (tooltipRequired != null) __obj.updateDynamic("tooltipRequired")(tooltipRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTooltipHelp]
  }
}

