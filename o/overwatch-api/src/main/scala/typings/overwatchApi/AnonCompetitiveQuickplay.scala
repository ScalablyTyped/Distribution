package typings.overwatchApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompetitiveQuickplay extends js.Object {
  var competitive: String
  var quickplay: String
}

object AnonCompetitiveQuickplay {
  @scala.inline
  def apply(competitive: String, quickplay: String): AnonCompetitiveQuickplay = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCompetitiveQuickplay]
  }
}

