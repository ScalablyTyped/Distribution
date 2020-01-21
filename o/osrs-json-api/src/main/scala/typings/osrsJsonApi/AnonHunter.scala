package typings.osrsJsonApi

import typings.osrsJsonApi.mod.hiscores.RankScoreObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHunter extends js.Object {
  var hunter: RankScoreObject
  var rogue: RankScoreObject
}

object AnonHunter {
  @scala.inline
  def apply(hunter: RankScoreObject, rogue: RankScoreObject): AnonHunter = {
    val __obj = js.Dynamic.literal(hunter = hunter.asInstanceOf[js.Any], rogue = rogue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHunter]
  }
}

