package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertAnonPreventDefaultCenterContext extends js.Object {
  def renderer(context: atOracleOraclejetLib.ojgaugeMod.ojStatusMeterGaugeNs.CenterContext): Anon_Insert | Anon_PreventDefault
}

object Anon_ContextRendererAnonInsertAnonPreventDefaultCenterContext {
  @scala.inline
  def apply(
    renderer: atOracleOraclejetLib.ojgaugeMod.ojStatusMeterGaugeNs.CenterContext => Anon_Insert | Anon_PreventDefault
  ): Anon_ContextRendererAnonInsertAnonPreventDefaultCenterContext = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertAnonPreventDefaultCenterContext]
  }
}

