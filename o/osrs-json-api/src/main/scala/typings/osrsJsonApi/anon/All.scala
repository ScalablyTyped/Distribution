package typings.osrsJsonApi.anon

import typings.osrsJsonApi.mod.hiscores.RankScoreObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait All extends js.Object {
  var all: RankScoreObject = js.native
  var beginner: RankScoreObject = js.native
  var easy: RankScoreObject = js.native
  var elite: RankScoreObject = js.native
  var hard: RankScoreObject = js.native
  var master: RankScoreObject = js.native
  var medium: RankScoreObject = js.native
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
  @scala.inline
  implicit class AllOps[Self <: All] (val x: Self) extends AnyVal {
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
    def setAll(value: RankScoreObject): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeginner(value: RankScoreObject): Self = this.set("beginner", value.asInstanceOf[js.Any])
    @scala.inline
    def setEasy(value: RankScoreObject): Self = this.set("easy", value.asInstanceOf[js.Any])
    @scala.inline
    def setElite(value: RankScoreObject): Self = this.set("elite", value.asInstanceOf[js.Any])
    @scala.inline
    def setHard(value: RankScoreObject): Self = this.set("hard", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaster(value: RankScoreObject): Self = this.set("master", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedium(value: RankScoreObject): Self = this.set("medium", value.asInstanceOf[js.Any])
  }
  
}

