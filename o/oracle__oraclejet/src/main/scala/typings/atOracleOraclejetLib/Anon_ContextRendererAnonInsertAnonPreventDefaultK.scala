package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertAnonPreventDefaultK[K] extends js.Object {
  var renderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojnboxMod.ojNBoxNs.TooltipContext[K], 
    Anon_Insert | Anon_PreventDefault
  ]) | scala.Null
}

object Anon_ContextRendererAnonInsertAnonPreventDefaultK {
  @scala.inline
  def apply[K](
    renderer: /* context */ atOracleOraclejetLib.ojnboxMod.ojNBoxNs.TooltipContext[K] => Anon_Insert | Anon_PreventDefault = null
  ): Anon_ContextRendererAnonInsertAnonPreventDefaultK[K] = {
    val __obj = js.Dynamic.literal()
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertAnonPreventDefaultK[K]]
  }
}

