package typings.overwatchDashApi

import typings.overwatchDashApi.overwatchDashApiMod.Endorsement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Frame extends js.Object {
  var frame: String
  var icon: String
  var level: Double
  var shotcaller: Endorsement
  var sportsmanship: Endorsement
  var teammate: Endorsement
}

object Anon_Frame {
  @scala.inline
  def apply(
    frame: String,
    icon: String,
    level: Double,
    shotcaller: Endorsement,
    sportsmanship: Endorsement,
    teammate: Endorsement
  ): Anon_Frame = {
    val __obj = js.Dynamic.literal(frame = frame, icon = icon, level = level, shotcaller = shotcaller, sportsmanship = sportsmanship, teammate = teammate)
  
    __obj.asInstanceOf[Anon_Frame]
  }
}

