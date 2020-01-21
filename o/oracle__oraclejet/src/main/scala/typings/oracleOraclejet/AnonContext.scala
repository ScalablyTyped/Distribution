package typings.oracleOraclejet

import typings.oracleOraclejet.ojchartMod.ojChart.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  def renderer(context: TooltipContext): AnonInsert | AnonPreventDefault
}

object AnonContext {
  @scala.inline
  def apply(renderer: TooltipContext => AnonInsert | AnonPreventDefault): AnonContext = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[AnonContext]
  }
}

