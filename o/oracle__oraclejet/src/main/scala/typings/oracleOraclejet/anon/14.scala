package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojpictochartMod.ojPictoChart.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `14`[K] extends js.Object {
  var renderer: (js.Function1[/* context */ TooltipContext[K], Insert | PreventDefault]) | Null
}

object `14` {
  @scala.inline
  def apply[K](renderer: /* context */ TooltipContext[K] => Insert | PreventDefault = null): `14`[K] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`14`[K]]
  }
}

