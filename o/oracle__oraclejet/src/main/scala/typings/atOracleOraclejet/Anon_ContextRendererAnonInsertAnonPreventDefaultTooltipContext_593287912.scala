package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojgaugeMod.ojRatingGauge.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_593287912 extends js.Object {
  def renderer(context: TooltipContext): Anon_Insert | Anon_PreventDefault
}

object Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_593287912 {
  @scala.inline
  def apply(renderer: TooltipContext => Anon_Insert | Anon_PreventDefault): Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_593287912 = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_593287912]
  }
}

