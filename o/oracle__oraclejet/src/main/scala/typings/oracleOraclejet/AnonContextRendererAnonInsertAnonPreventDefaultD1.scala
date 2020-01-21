package typings.oracleOraclejet

import typings.oracleOraclejet.ojthematicmapMod.ojThematicMap.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextRendererAnonInsertAnonPreventDefaultD1[K1, K2, K3, D1, D2, D3] extends js.Object {
  def renderer(context: TooltipContext[K1, K2, K3, D1, D2, D3]): AnonInsert | AnonPreventDefault
}

object AnonContextRendererAnonInsertAnonPreventDefaultD1 {
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](renderer: TooltipContext[K1, K2, K3, D1, D2, D3] => AnonInsert | AnonPreventDefault): AnonContextRendererAnonInsertAnonPreventDefaultD1[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[AnonContextRendererAnonInsertAnonPreventDefaultD1[K1, K2, K3, D1, D2, D3]]
  }
}

