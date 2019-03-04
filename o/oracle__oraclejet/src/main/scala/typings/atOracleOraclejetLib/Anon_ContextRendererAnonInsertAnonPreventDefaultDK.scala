package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertAnonPreventDefaultDK[K, D] extends js.Object {
  def renderer(context: atOracleOraclejetLib.ojtreemapMod.ojTreemapNs.TooltipContext[K, D]): Anon_Insert | Anon_PreventDefault
}

object Anon_ContextRendererAnonInsertAnonPreventDefaultDK {
  @scala.inline
  def apply[K, D](
    renderer: js.Function1[
      atOracleOraclejetLib.ojtreemapMod.ojTreemapNs.TooltipContext[K, D], 
      Anon_Insert | Anon_PreventDefault
    ]
  ): Anon_ContextRendererAnonInsertAnonPreventDefaultDK[K, D] = {
    val __obj = js.Dynamic.literal(renderer = renderer)
  
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertAnonPreventDefaultDK[K, D]]
  }
}

