package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertAnonPreventDefaultD[K, D] extends js.Object {
  def renderer(context: atOracleOraclejetLib.ojsunburstMod.ojSunburstNs.TooltipContext[K, D]): Anon_Insert | Anon_PreventDefault
}

object Anon_ContextRendererAnonInsertAnonPreventDefaultD {
  @scala.inline
  def apply[K, D](
    renderer: js.Function1[
      atOracleOraclejetLib.ojsunburstMod.ojSunburstNs.TooltipContext[K, D], 
      Anon_Insert | Anon_PreventDefault
    ]
  ): Anon_ContextRendererAnonInsertAnonPreventDefaultD[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderer")(renderer)
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertAnonPreventDefaultD[K, D]]
  }
}

