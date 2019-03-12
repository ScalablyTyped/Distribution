package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertAnonPreventDefaultD1[K1, K3, D3, K2, D2, D1] extends js.Object {
  def renderer(
    context: atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.TooltipContext[K1, K2, K3, D1, D2, D3]
  ): Anon_Insert | Anon_PreventDefault
}

object Anon_ContextRendererAnonInsertAnonPreventDefaultD1 {
  @scala.inline
  def apply[K1, K3, D3, K2, D2, D1](
    renderer: atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.TooltipContext[K1, K2, K3, D1, D2, D3] => Anon_Insert | Anon_PreventDefault
  ): Anon_ContextRendererAnonInsertAnonPreventDefaultD1[K1, K3, D3, K2, D2, D1] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertAnonPreventDefaultD1[K1, K3, D3, K2, D2, D1]]
  }
}

