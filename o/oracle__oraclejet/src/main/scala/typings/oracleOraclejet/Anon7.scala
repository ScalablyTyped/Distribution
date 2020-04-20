package typings.oracleOraclejet

import typings.oracleOraclejet.ojganttMod.ojGantt.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon7[K2, D2] extends js.Object {
  def renderer(context: TooltipContext[K2, D2]): AnonInsert | AnonPreventDefault
}

object Anon7 {
  @scala.inline
  def apply[K2, D2](renderer: TooltipContext[K2, D2] => AnonInsert | AnonPreventDefault): Anon7[K2, D2] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[Anon7[K2, D2]]
  }
}

