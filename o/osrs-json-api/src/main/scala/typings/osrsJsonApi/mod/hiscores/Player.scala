package typings.osrsJsonApi.mod.hiscores

import typings.osrsJsonApi.anon.AbyssalSire
import typings.osrsJsonApi.anon.Agility
import typings.osrsJsonApi.anon.All
import typings.osrsJsonApi.anon.Hunter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Player extends js.Object {
  var bh: Hunter = js.native
  var bosses: AbyssalSire = js.native
  var clues: All = js.native
  var lms: RankScoreObject = js.native
  var skills: Agility = js.native
}

object Player {
  @scala.inline
  def apply(bh: Hunter, bosses: AbyssalSire, clues: All, lms: RankScoreObject, skills: Agility): Player = {
    val __obj = js.Dynamic.literal(bh = bh.asInstanceOf[js.Any], bosses = bosses.asInstanceOf[js.Any], clues = clues.asInstanceOf[js.Any], lms = lms.asInstanceOf[js.Any], skills = skills.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
  @scala.inline
  implicit class PlayerOps[Self <: Player] (val x: Self) extends AnyVal {
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
    def setBh(value: Hunter): Self = this.set("bh", value.asInstanceOf[js.Any])
    @scala.inline
    def setBosses(value: AbyssalSire): Self = this.set("bosses", value.asInstanceOf[js.Any])
    @scala.inline
    def setClues(value: All): Self = this.set("clues", value.asInstanceOf[js.Any])
    @scala.inline
    def setLms(value: RankScoreObject): Self = this.set("lms", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkills(value: Agility): Self = this.set("skills", value.asInstanceOf[js.Any])
  }
  
}

