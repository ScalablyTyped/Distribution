package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojganttMod.ojGantt.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `7`[K2, D2] extends js.Object {
  def renderer(context: TooltipContext[K2, D2]): Insert | PreventDefault
}

object `7` {
  @scala.inline
  def apply[K2, D2](renderer: TooltipContext[K2, D2] => Insert | PreventDefault): `7`[K2, D2] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`7`[K2, D2]]
  }
}

