package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojnboxMod.ojNBoxNs.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertAnonPreventDefaultK[K] extends js.Object {
  var renderer: (js.Function1[/* context */ TooltipContext[K], Anon_Insert | Anon_PreventDefault]) | Null
}

object Anon_ContextRendererAnonInsertAnonPreventDefaultK {
  @scala.inline
  def apply[K](renderer: /* context */ TooltipContext[K] => Anon_Insert | Anon_PreventDefault = null): Anon_ContextRendererAnonInsertAnonPreventDefaultK[K] = {
    val __obj = js.Dynamic.literal()
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertAnonPreventDefaultK[K]]
  }
}

