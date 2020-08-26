package typings.oversmash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hero extends js.Object {
  var assists: js.UndefOr[Statistic] = js.native
  var average: js.UndefOr[Statistic] = js.native
  var awards: js.UndefOr[Statistic] = js.native
  var best: js.UndefOr[Statistic] = js.native
  var combat: js.UndefOr[Statistic] = js.native
  var game: js.UndefOr[Game] = js.native
  var hero: js.UndefOr[Statistic] = js.native
  var misc: js.UndefOr[Statistic] = js.native
  var name: String = js.native
  var rawName: String = js.native
  var raw_name: String = js.native
}

object Hero {
  @scala.inline
  def apply(name: String, rawName: String, raw_name: String): Hero = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], raw_name = raw_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hero]
  }
  @scala.inline
  implicit class HeroOps[Self <: Hero] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawName(value: String): Self = this.set("rawName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw_name(value: String): Self = this.set("raw_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssists(value: Statistic): Self = this.set("assists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssists: Self = this.set("assists", js.undefined)
    @scala.inline
    def setAverage(value: Statistic): Self = this.set("average", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverage: Self = this.set("average", js.undefined)
    @scala.inline
    def setAwards(value: Statistic): Self = this.set("awards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwards: Self = this.set("awards", js.undefined)
    @scala.inline
    def setBest(value: Statistic): Self = this.set("best", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBest: Self = this.set("best", js.undefined)
    @scala.inline
    def setCombat(value: Statistic): Self = this.set("combat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCombat: Self = this.set("combat", js.undefined)
    @scala.inline
    def setGame(value: Game): Self = this.set("game", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGame: Self = this.set("game", js.undefined)
    @scala.inline
    def setHero(value: Statistic): Self = this.set("hero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHero: Self = this.set("hero", js.undefined)
    @scala.inline
    def setMisc(value: Statistic): Self = this.set("misc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMisc: Self = this.set("misc", js.undefined)
  }
  
}

