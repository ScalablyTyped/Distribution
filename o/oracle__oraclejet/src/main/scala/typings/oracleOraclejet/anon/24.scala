package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtagcloudMod.ojTagCloud.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `24`[K] extends js.Object {
  def renderer(context: TooltipContext[K]): Insert | PreventDefault
}

object `24` {
  @scala.inline
  def apply[K](renderer: TooltipContext[K] => Insert | PreventDefault): `24`[K] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`24`[K]]
  }
}

