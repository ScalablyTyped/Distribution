package typings.osrsJsonApi.mod.hiscores

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RankScoreObject extends js.Object {
  var rank: Double
  var score: Double
}

object RankScoreObject {
  @scala.inline
  def apply(rank: Double, score: Double): RankScoreObject = {
    val __obj = js.Dynamic.literal(rank = rank.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankScoreObject]
  }
}

