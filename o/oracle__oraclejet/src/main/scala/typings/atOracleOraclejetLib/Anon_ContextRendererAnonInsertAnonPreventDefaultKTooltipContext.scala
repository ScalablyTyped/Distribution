package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertAnonPreventDefaultKTooltipContext[K] extends js.Object {
  def renderer(context: atOracleOraclejetLib.ojtagcloudMod.ojTagCloudNs.TooltipContext[K]): Anon_Insert | Anon_PreventDefault
}

object Anon_ContextRendererAnonInsertAnonPreventDefaultKTooltipContext {
  @scala.inline
  def apply[K](
    renderer: js.Function1[
      atOracleOraclejetLib.ojtagcloudMod.ojTagCloudNs.TooltipContext[K], 
      Anon_Insert | Anon_PreventDefault
    ]
  ): Anon_ContextRendererAnonInsertAnonPreventDefaultKTooltipContext[K] = {
    val __obj = js.Dynamic.literal(renderer = renderer)
  
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertAnonPreventDefaultKTooltipContext[K]]
  }
}

