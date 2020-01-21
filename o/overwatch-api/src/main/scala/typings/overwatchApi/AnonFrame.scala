package typings.overwatchApi

import typings.overwatchApi.mod.Endorsement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrame extends js.Object {
  var frame: String
  var icon: String
  var level: Double
  var shotcaller: Endorsement
  var sportsmanship: Endorsement
  var teammate: Endorsement
}

object AnonFrame {
  @scala.inline
  def apply(
    frame: String,
    icon: String,
    level: Double,
    shotcaller: Endorsement,
    sportsmanship: Endorsement,
    teammate: Endorsement
  ): AnonFrame = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], shotcaller = shotcaller.asInstanceOf[js.Any], sportsmanship = sportsmanship.asInstanceOf[js.Any], teammate = teammate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFrame]
  }
}

