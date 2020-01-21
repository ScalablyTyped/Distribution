package typings.oracleOraclejet

import typings.oracleOraclejet.ojchartMod.ojSparkChart.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextRenderer extends js.Object {
  var renderer: (js.Function1[/* context */ TooltipContext, AnonInsert | AnonPreventDefault]) | Null
}

object AnonContextRenderer {
  @scala.inline
  def apply(renderer: /* context */ TooltipContext => AnonInsert | AnonPreventDefault = null): AnonContextRenderer = {
    val __obj = js.Dynamic.literal()
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[AnonContextRenderer]
  }
}

