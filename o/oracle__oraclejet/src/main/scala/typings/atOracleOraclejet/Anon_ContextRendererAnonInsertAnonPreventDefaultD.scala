package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojsunburstMod.ojSunburstNs.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertAnonPreventDefaultD[K, D] extends js.Object {
  def renderer(context: TooltipContext[K, D]): Anon_Insert | Anon_PreventDefault
}

object Anon_ContextRendererAnonInsertAnonPreventDefaultD {
  @scala.inline
  def apply[K, D](renderer: TooltipContext[K, D] => Anon_Insert | Anon_PreventDefault): Anon_ContextRendererAnonInsertAnonPreventDefaultD[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertAnonPreventDefaultD[K, D]]
  }
}

