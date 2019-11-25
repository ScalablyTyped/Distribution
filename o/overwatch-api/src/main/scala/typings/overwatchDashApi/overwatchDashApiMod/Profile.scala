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
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], endorsement = endorsement.asInstanceOf[js.Any], games = games.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], levelFrame = levelFrame.asInstanceOf[js.Any], playtime = playtime.asInstanceOf[js.Any], portrait = portrait.asInstanceOf[js.Any], star = star.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

