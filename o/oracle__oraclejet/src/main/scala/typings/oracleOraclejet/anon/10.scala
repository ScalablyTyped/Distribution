package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.CenterContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `10` extends js.Object {
  def renderer(context: CenterContext): Insert | PreventDefault
}

object `10` {
  @scala.inline
  def apply(renderer: CenterContext => Insert | PreventDefault): `10` = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`10`]
  }
}

