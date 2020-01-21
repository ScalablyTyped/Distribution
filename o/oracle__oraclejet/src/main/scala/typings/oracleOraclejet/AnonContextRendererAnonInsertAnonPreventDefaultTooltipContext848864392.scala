package typings.oracleOraclejet

import typings.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext848864392 extends js.Object {
  def renderer(context: TooltipContext): AnonInsert | AnonPreventDefault
}

object AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext848864392 {
  @scala.inline
  def apply(renderer: TooltipContext => AnonInsert | AnonPreventDefault): AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext848864392 = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext848864392]
  }
}

