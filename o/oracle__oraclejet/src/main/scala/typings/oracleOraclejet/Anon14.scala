package typings.oracleOraclejet

import typings.oracleOraclejet.ojpictochartMod.ojPictoChart.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon14[K] extends js.Object {
  var renderer: (js.Function1[/* context */ TooltipContext[K], AnonInsert | AnonPreventDefault]) | Null
}

object Anon14 {
  @scala.inline
  def apply[K](renderer: /* context */ TooltipContext[K] => AnonInsert | AnonPreventDefault = null): Anon14[K] = {
    val __obj = js.Dynamic.literal()
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[Anon14[K]]
  }
}

