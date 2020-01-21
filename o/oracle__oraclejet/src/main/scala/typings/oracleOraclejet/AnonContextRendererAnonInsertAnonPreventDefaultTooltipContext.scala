package typings.oracleOraclejet

import typings.oracleOraclejet.ojgaugeMod.ojLedGauge.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext extends js.Object {
  def renderer(context: TooltipContext): AnonInsert | AnonPreventDefault
}

object AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext {
  @scala.inline
  def apply(renderer: TooltipContext => AnonInsert | AnonPreventDefault): AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext]
  }
}

