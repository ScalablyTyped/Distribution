package typings.overwatchApi.mod

import typings.overwatchApi.anon.Competitive
import typings.overwatchApi.anon.Damage
import typings.overwatchApi.anon.Frame
import typings.overwatchApi.anon.Quickplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profile extends js.Object {
  var competitive: Damage = js.native
  var endorsement: Frame = js.native
  var games: Competitive = js.native
  var level: Double = js.native
  var levelFrame: String = js.native
  var playtime: Quickplay = js.native
  var portrait: String = js.native
  var `private`: Boolean = js.native
  var star: String = js.native
  var username: String = js.native
}

object Profile {
  @scala.inline
  def apply(
    competitive: Damage,
    endorsement: Frame,
    games: Competitive,
    level: Double,
    levelFrame: String,
    playtime: Quickplay,
    portrait: String,
    `private`: Boolean,
    star: String,
    username: String
  ): Profile = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], endorsement = endorsement.asInstanceOf[js.Any], games = games.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], levelFrame = levelFrame.asInstanceOf[js.Any], playtime = playtime.asInstanceOf[js.Any], portrait = portrait.asInstanceOf[js.Any], star = star.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompetitive(value: Damage): Self = this.set("competitive", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndorsement(value: Frame): Self = this.set("endorsement", value.asInstanceOf[js.Any])
    @scala.inline
    def setGames(value: Competitive): Self = this.set("games", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevelFrame(value: String): Self = this.set("levelFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaytime(value: Quickplay): Self = this.set("playtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortrait(value: String): Self = this.set("portrait", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def setStar(value: String): Self = this.set("star", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
  
}

