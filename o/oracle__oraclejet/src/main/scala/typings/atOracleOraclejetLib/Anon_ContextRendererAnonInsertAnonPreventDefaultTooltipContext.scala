package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext extends js.Object {
  def renderer(context: atOracleOraclejetLib.ojgaugeMod.ojLedGaugeNs.TooltipContext): Anon_Insert | Anon_PreventDefault
}

object Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext {
  @scala.inline
  def apply(
    renderer: atOracleOraclejetLib.ojgaugeMod.ojLedGaugeNs.TooltipContext => Anon_Insert | Anon_PreventDefault
  ): Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext]
  }
}

