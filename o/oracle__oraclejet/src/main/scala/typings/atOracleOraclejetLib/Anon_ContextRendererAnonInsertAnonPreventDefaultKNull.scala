package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertAnonPreventDefaultKNull[K] extends js.Object {
  var renderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojpictochartMod.ojPictoChartNs.TooltipContext[K], 
    Anon_Insert | Anon_PreventDefault
  ]) | scala.Null
}

object Anon_ContextRendererAnonInsertAnonPreventDefaultKNull {
  @scala.inline
  def apply[K](
    renderer: js.Function1[
      /* context */ atOracleOraclejetLib.ojpictochartMod.ojPictoChartNs.TooltipContext[K], 
      Anon_Insert | Anon_PreventDefault
    ] = null
  ): Anon_ContextRendererAnonInsertAnonPreventDefaultKNull[K] = {
    val __obj = js.Dynamic.literal()
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertAnonPreventDefaultKNull[K]]
  }
}

