package typings.overwatchApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompetitiveQuickplayAnonEliminationsperlife extends js.Object {
  var competitive: AnonEliminationsperlifeGameswon
  var quickplay: AnonEliminationsperlife
}

object AnonCompetitiveQuickplayAnonEliminationsperlife {
  @scala.inline
  def apply(competitive: AnonEliminationsperlifeGameswon, quickplay: AnonEliminationsperlife): AnonCompetitiveQuickplayAnonEliminationsperlife = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCompetitiveQuickplayAnonEliminationsperlife]
  }
}

