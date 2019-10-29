package typings.overwatchDashApi.overwatchDashApiMod

import typings.overwatchDashApi.Anon_Competitive
import typings.overwatchDashApi.Anon_CompetitiveQuickplay
import typings.overwatchDashApi.Anon_Damage
import typings.overwatchDashApi.Anon_Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  var competitive: Anon_Damage
  var endorsement: Anon_Frame
  var games: Anon_Competitive
  var level: Double
  var levelFrame: String
  var playtime: Anon_CompetitiveQuickplay
  var portrait: String
  var `private`: Boolean
  var star: String
  var username: String
}

object Profile {
  @scala.inline
  def apply(
    competitive: Anon_Damage,
    endorsement: Anon_Frame,
    games: Anon_Competitive,
    level: Double,
    levelFrame: String,
    playtime: Anon_CompetitiveQuickplay,
    portrait: String,
    `private`: Boolean,
    star: String,
    username: String
  ): Profile = {
    val __obj = js.Dynamic.literal(competitive = competitive, endorsement = endorsement, games = games, level = level, levelFrame = levelFrame, playtime = playtime, portrait = portrait, star = star, username = username)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[Profile]
  }
}

