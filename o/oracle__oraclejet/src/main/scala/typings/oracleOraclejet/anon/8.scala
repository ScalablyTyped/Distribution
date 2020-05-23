package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojgaugeMod.ojLedGauge.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `8` extends js.Object {
  def renderer(context: TooltipContext): Insert | PreventDefault
}

object `8` {
  @scala.inline
  def apply(renderer: TooltipContext => Insert | PreventDefault): `8` = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`8`]
  }
}

