package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojgaugeMod.ojRatingGauge.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `9` extends js.Object {
  def renderer(context: TooltipContext): Insert | PreventDefault
}

object `9` {
  @scala.inline
  def apply(renderer: TooltipContext => Insert | PreventDefault): `9` = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`9`]
  }
}

