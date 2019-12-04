package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojthematicmapMod.ojThematicMap.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertAnonPreventDefaultD1[D3, K1, K2, D1, K3, D2] extends js.Object {
  def renderer(context: TooltipContext[K1, K2, K3, D1, D2, D3]): Anon_Insert | Anon_PreventDefault
}

object Anon_ContextRendererAnonInsertAnonPreventDefaultD1 {
  @scala.inline
  def apply[D3, K1, K2, D1, K3, D2](renderer: TooltipContext[K1, K2, K3, D1, D2, D3] => Anon_Insert | Anon_PreventDefault): Anon_ContextRendererAnonInsertAnonPreventDefaultD1[D3, K1, K2, D1, K3, D2] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertAnonPreventDefaultD1[D3, K1, K2, D1, K3, D2]]
  }
}

