package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdiagramMod.ojDiagram.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `5`[K1, K2, D1, D2] extends js.Object {
  def renderer(context: TooltipContext[K1, K2, D1, D2]): Insert | PreventDefault
}

object `5` {
  @scala.inline
  def apply[K1, K2, D1, D2](renderer: TooltipContext[K1, K2, D1, D2] => Insert | PreventDefault): `5`[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`5`[K1, K2, D1, D2]]
  }
}

