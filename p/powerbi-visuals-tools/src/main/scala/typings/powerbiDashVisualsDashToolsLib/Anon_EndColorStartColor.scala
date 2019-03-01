package typings
package powerbiDashVisualsDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndColorStartColor extends js.Object {
  var endColor: js.UndefOr[scala.Boolean] = js.undefined
  var startColor: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_EndColorStartColor {
  @scala.inline
  def apply(
    endColor: js.UndefOr[scala.Boolean] = js.undefined,
    startColor: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_EndColorStartColor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endColor)) __obj.updateDynamic("endColor")(endColor)
    if (!js.isUndefined(startColor)) __obj.updateDynamic("startColor")(startColor)
    __obj.asInstanceOf[Anon_EndColorStartColor]
  }
}

