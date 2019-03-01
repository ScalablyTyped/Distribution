package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillRuleGeneric[TColor, TValue, TStrategy] extends js.Object {
  var linearGradient2: js.UndefOr[LinearGradient2Generic[TColor, TValue, TStrategy]] = js.undefined
  var linearGradient3: js.UndefOr[LinearGradient3Generic[TColor, TValue, TStrategy]] = js.undefined
}

object FillRuleGeneric {
  @scala.inline
  def apply[TColor, TValue, TStrategy](
    linearGradient2: LinearGradient2Generic[TColor, TValue, TStrategy] = null,
    linearGradient3: LinearGradient3Generic[TColor, TValue, TStrategy] = null
  ): FillRuleGeneric[TColor, TValue, TStrategy] = {
    val __obj = js.Dynamic.literal()
    if (linearGradient2 != null) __obj.updateDynamic("linearGradient2")(linearGradient2)
    if (linearGradient3 != null) __obj.updateDynamic("linearGradient3")(linearGradient3)
    __obj.asInstanceOf[FillRuleGeneric[TColor, TValue, TStrategy]]
  }
}

