package typings.overwatchApi.mod

import typings.overwatchApi.AnonCompetitive
import typings.overwatchApi.AnonCompetitiveQuickplay
import typings.overwatchApi.AnonDamage
import typings.overwatchApi.AnonFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  var competitive: AnonDamage
  var endorsement: AnonFrame
  var games: AnonCompetitive
  var level: Double
  var levelFrame: String
  var playtime: AnonCompetitiveQuickplay
  var portrait: String
  var `private`: Boolean
  var star: String
  var username: String
}

object Profile {
  @scala.inline
  def apply(
    competitive: AnonDamage,
    endorsement: AnonFrame,
    games: AnonCompetitive,
    level: Double,
    levelFrame: String,
    playtime: AnonCompetitiveQuickplay,
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

