package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `11` extends js.Object {
  def renderer(context: TooltipContext): Insert | PreventDefault
}

object `11` {
  @scala.inline
  def apply(renderer: TooltipContext => Insert | PreventDefault): `11` = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`11`]
  }
}

