package typings.overwatchApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompetitiveQuickplay extends js.Object {
  var competitive: AnonGameswon
  var quickplay: AnonEliminationsperlife
}

object AnonCompetitiveQuickplay {
  @scala.inline
  def apply(competitive: AnonGameswon, quickplay: AnonEliminationsperlife): AnonCompetitiveQuickplay = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCompetitiveQuickplay]
  }
}

