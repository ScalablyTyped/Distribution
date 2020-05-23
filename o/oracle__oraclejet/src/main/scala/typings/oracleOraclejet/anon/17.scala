package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojsunburstMod.ojSunburst.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `17`[K, D] extends js.Object {
  def renderer(context: TooltipContext[K, D]): Insert | PreventDefault
}

object `17` {
  @scala.inline
  def apply[K, D](renderer: TooltipContext[K, D] => Insert | PreventDefault): `17`[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`17`[K, D]]
  }
}

