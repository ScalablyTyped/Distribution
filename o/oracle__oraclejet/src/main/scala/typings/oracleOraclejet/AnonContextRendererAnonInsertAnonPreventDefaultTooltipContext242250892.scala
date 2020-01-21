package typings.oracleOraclejet

import typings.oracleOraclejet.ojgaugeMod.ojRatingGauge.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext242250892 extends js.Object {
  def renderer(context: TooltipContext): AnonInsert | AnonPreventDefault
}

object AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext242250892 {
  @scala.inline
  def apply(renderer: TooltipContext => AnonInsert | AnonPreventDefault): AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext242250892 = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext242250892]
  }
}

