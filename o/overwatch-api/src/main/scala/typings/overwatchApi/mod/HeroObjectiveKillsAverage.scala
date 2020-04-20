package typings.overwatchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeroObjectiveKillsAverage extends Hero {
  var objective_kills_average: String
}

object HeroObjectiveKillsAverage {
  @scala.inline
  def apply(hero: String, img: String, objective_kills_average: String): HeroObjectiveKillsAverage = {
    val __obj = js.Dynamic.literal(hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], objective_kills_average = objective_kills_average.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeroObjectiveKillsAverage]
  }
}

