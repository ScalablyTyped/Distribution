package typings.oracleOraclejet

import typings.oracleOraclejet.ojganttMod.ojGantt.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextRendererAnonInsertAnonPreventDefault[K2, D2] extends js.Object {
  def renderer(context: TooltipContext[K2, D2]): AnonInsert | AnonPreventDefault
}

object AnonContextRendererAnonInsertAnonPreventDefault {
  @scala.inline
  def apply[K2, D2](renderer: TooltipContext[K2, D2] => AnonInsert | AnonPreventDefault): AnonContextRendererAnonInsertAnonPreventDefault[K2, D2] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[AnonContextRendererAnonInsertAnonPreventDefault[K2, D2]]
  }
}

