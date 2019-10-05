package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojpictochartMod.ojPictoChart.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertAnonPreventDefaultKNull[K] extends js.Object {
  var renderer: (js.Function1[/* context */ TooltipContext[K], Anon_Insert | Anon_PreventDefault]) | Null
}

object Anon_ContextRendererAnonInsertAnonPreventDefaultKNull {
  @scala.inline
  def apply[K](renderer: /* context */ TooltipContext[K] => Anon_Insert | Anon_PreventDefault = null): Anon_ContextRendererAnonInsertAnonPreventDefaultKNull[K] = {
    val __obj = js.Dynamic.literal()
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertAnonPreventDefaultKNull[K]]
  }
}

