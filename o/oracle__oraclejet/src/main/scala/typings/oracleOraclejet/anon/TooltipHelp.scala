package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipHelp extends js.Object {
  var tooltipHelp: js.UndefOr[String] = js.undefined
  var tooltipRequired: js.UndefOr[String] = js.undefined
}

object TooltipHelp {
  @scala.inline
  def apply(tooltipHelp: String = null, tooltipRequired: String = null): TooltipHelp = {
    val __obj = js.Dynamic.literal()
    if (tooltipHelp != null) __obj.updateDynamic("tooltipHelp")(tooltipHelp.asInstanceOf[js.Any])
    if (tooltipRequired != null) __obj.updateDynamic("tooltipRequired")(tooltipRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipHelp]
  }
}

