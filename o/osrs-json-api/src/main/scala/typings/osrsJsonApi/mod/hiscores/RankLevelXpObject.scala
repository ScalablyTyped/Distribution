package typings.osrsJsonApi.mod.hiscores

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RankLevelXpObject extends js.Object {
  var level: Double
  var rank: String
  var xp: Double
}

object RankLevelXpObject {
  @scala.inline
  def apply(level: Double, rank: String, xp: Double): RankLevelXpObject = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], xp = xp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RankLevelXpObject]
  }
}

