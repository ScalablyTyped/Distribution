package typings.oracleOraclejet

import typings.oracleOraclejet.ojchartMod.ojChart.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRenderer extends js.Object {
  def renderer(context: TooltipContext): AnonInsert | AnonPreventDefault
}

object AnonRenderer {
  @scala.inline
  def apply(renderer: TooltipContext => AnonInsert | AnonPreventDefault): AnonRenderer = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[AnonRenderer]
  }
}

