package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2] extends js.Object {
  def renderer(context: atOracleOraclejetLib.ojganttMod.ojGanttNs.TooltipContext[K2, D2]): Anon_Insert | Anon_PreventDefault
}

object Anon_ContextRendererAnonInsertAnonPreventDefault {
  @scala.inline
  def apply[K2, D2](
    renderer: js.Function1[
      atOracleOraclejetLib.ojganttMod.ojGanttNs.TooltipContext[K2, D2], 
      Anon_Insert | Anon_PreventDefault
    ]
  ): Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderer")(renderer)
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2]]
  }
}

