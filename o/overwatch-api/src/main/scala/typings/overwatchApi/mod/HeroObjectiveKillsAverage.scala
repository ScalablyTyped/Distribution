package typings.overwatchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeroObjectiveKillsAverage extends Hero {
  var objective_kills_average: String = js.native
}

object HeroObjectiveKillsAverage {
  @scala.inline
  def apply(hero: String, img: String, objective_kills_average: String): HeroObjectiveKillsAverage = {
    val __obj = js.Dynamic.literal(hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], objective_kills_average = objective_kills_average.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeroObjectiveKillsAverage]
  }
  @scala.inline
  implicit class HeroObjectiveKillsAverageOps[Self <: HeroObjectiveKillsAverage] (val x: Self) extends AnyVal {
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
    def setObjective_kills_average(value: String): Self = this.set("objective_kills_average", value.asInstanceOf[js.Any])
  }
  
}

