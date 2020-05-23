package typings.osrsJsonApi.anon

import typings.osrsJsonApi.mod.hiscores.RankScoreObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait All extends js.Object {
  var all: RankScoreObject
  var beginner: RankScoreObject
  var easy: RankScoreObject
  var elite: RankScoreObject
  var hard: RankScoreObject
  var master: RankScoreObject
  var medium: RankScoreObject
}

object All {
  @scala.inline
  def apply(
    all: RankScoreObject,
    beginner: RankScoreObject,
    easy: RankScoreObject,
    elite: RankScoreObject,
    hard: RankScoreObject,
    master: RankScoreObject,
    medium: RankScoreObject
  ): All = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], beginner = beginner.asInstanceOf[js.Any], easy = easy.asInstanceOf[js.Any], elite = elite.asInstanceOf[js.Any], hard = hard.asInstanceOf[js.Any], master = master.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any])
    __obj.asInstanceOf[All]
  }
}

