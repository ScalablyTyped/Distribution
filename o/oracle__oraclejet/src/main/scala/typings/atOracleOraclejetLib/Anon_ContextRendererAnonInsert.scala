package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsert[K1, K2, D1, D2] extends js.Object {
  def renderer(context: atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.TooltipContext[K1, K2, D1, D2]): Anon_Insert | Anon_PreventDefault
}

object Anon_ContextRendererAnonInsert {
  @scala.inline
  def apply[K1, K2, D1, D2](
    renderer: js.Function1[
      atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.TooltipContext[K1, K2, D1, D2], 
      Anon_Insert | Anon_PreventDefault
    ]
  ): Anon_ContextRendererAnonInsert[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(renderer = renderer)
  
    __obj.asInstanceOf[Anon_ContextRendererAnonInsert[K1, K2, D1, D2]]
  }
}

