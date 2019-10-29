package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickplayCompetitiveStats extends js.Object {
  var competitive: js.Array[Stat]
  var quickplay: js.Array[Stat]
}

object QuickplayCompetitiveStats {
  @scala.inline
  def apply(competitive: js.Array[Stat], quickplay: js.Array[Stat]): QuickplayCompetitiveStats = {
    val __obj = js.Dynamic.literal(competitive = competitive, quickplay = quickplay)
  
    __obj.asInstanceOf[QuickplayCompetitiveStats]
  }
}

