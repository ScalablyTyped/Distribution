package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtreemapMod.ojTreemap.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `27`[K, D] extends js.Object {
  def renderer(context: TooltipContext[K, D]): Insert | PreventDefault
}

object `27` {
  @scala.inline
  def apply[K, D](renderer: TooltipContext[K, D] => Insert | PreventDefault): `27`[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`27`[K, D]]
  }
}

