package typings.osrsJsonApi.mod.hiscores

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RankLevelXpObject extends js.Object {
  var level: Double = js.native
  var rank: String = js.native
  var xp: Double = js.native
}

object RankLevelXpObject {
  @scala.inline
  def apply(level: Double, rank: String, xp: Double): RankLevelXpObject = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], xp = xp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankLevelXpObject]
  }
  @scala.inline
  implicit class RankLevelXpObjectOps[Self <: RankLevelXpObject] (val x: Self) extends AnyVal {
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
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setRank(value: String): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def setXp(value: Double): Self = this.set("xp", value.asInstanceOf[js.Any])
  }
  
}

