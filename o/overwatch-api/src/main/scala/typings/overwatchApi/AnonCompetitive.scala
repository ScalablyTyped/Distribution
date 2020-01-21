package typings.overwatchApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompetitive extends js.Object {
  var competitive: AnonDraw
  var quickplay: AnonPlayed
}

object AnonCompetitive {
  @scala.inline
  def apply(competitive: AnonDraw, quickplay: AnonPlayed): AnonCompetitive = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCompetitive]
  }
}

