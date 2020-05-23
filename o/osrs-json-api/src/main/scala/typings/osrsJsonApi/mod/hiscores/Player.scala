package typings.osrsJsonApi.mod.hiscores

import typings.osrsJsonApi.anon.AbyssalSire
import typings.osrsJsonApi.anon.Agility
import typings.osrsJsonApi.anon.All
import typings.osrsJsonApi.anon.Hunter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Player extends js.Object {
  var bh: Hunter
  var bosses: AbyssalSire
  var clues: All
  var lms: RankScoreObject
  var skills: Agility
}

object Player {
  @scala.inline
  def apply(bh: Hunter, bosses: AbyssalSire, clues: All, lms: RankScoreObject, skills: Agility): Player = {
    val __obj = js.Dynamic.literal(bh = bh.asInstanceOf[js.Any], bosses = bosses.asInstanceOf[js.Any], clues = clues.asInstanceOf[js.Any], lms = lms.asInstanceOf[js.Any], skills = skills.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
}

