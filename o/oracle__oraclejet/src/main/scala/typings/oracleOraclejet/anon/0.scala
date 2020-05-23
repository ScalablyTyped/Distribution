package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojchartMod.ojSparkChart.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var renderer: (js.Function1[/* context */ TooltipContext, Insert | PreventDefault]) | Null
}

object `0` {
  @scala.inline
  def apply(renderer: /* context */ TooltipContext => Insert | PreventDefault = null): `0` = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`0`]
  }
}

