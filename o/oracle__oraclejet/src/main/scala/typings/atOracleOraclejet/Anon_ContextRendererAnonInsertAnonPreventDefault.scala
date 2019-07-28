package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojganttMod.ojGanttNs.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2] extends js.Object {
  def renderer(context: TooltipContext[K2, D2]): Anon_Insert | Anon_PreventDefault
}

object Anon_ContextRendererAnonInsertAnonPreventDefault {
  @scala.inline
  def apply[K2, D2](renderer: TooltipContext[K2, D2] => Anon_Insert | Anon_PreventDefault): Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2]]
  }
}

