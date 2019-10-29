package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeroObjectiveKillsAverage extends Hero {
  var objective_kills_average: String
}

object HeroObjectiveKillsAverage {
  @scala.inline
  def apply(hero: String, img: String, objective_kills_average: String): HeroObjectiveKillsAverage = {
    val __obj = js.Dynamic.literal(hero = hero, img = img, objective_kills_average = objective_kills_average)
  
    __obj.asInstanceOf[HeroObjectiveKillsAverage]
  }
}

