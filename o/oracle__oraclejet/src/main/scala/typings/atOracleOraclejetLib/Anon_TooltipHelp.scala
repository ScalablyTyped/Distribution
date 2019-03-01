package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TooltipHelp extends js.Object {
  var tooltipHelp: js.UndefOr[java.lang.String] = js.undefined
  var tooltipRequired: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_TooltipHelp {
  @scala.inline
  def apply(tooltipHelp: java.lang.String = null, tooltipRequired: java.lang.String = null): Anon_TooltipHelp = {
    val __obj = js.Dynamic.literal()
    if (tooltipHelp != null) __obj.updateDynamic("tooltipHelp")(tooltipHelp)
    if (tooltipRequired != null) __obj.updateDynamic("tooltipRequired")(tooltipRequired)
    __obj.asInstanceOf[Anon_TooltipHelp]
  }
}

