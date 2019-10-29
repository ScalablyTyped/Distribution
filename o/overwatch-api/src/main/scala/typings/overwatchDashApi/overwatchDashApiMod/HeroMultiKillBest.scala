package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeroMultiKillBest extends Hero {
  var multikill_best: String
}

object HeroMultiKillBest {
  @scala.inline
  def apply(hero: String, img: String, multikill_best: String): HeroMultiKillBest = {
    val __obj = js.Dynamic.literal(hero = hero, img = img, multikill_best = multikill_best)
  
    __obj.asInstanceOf[HeroMultiKillBest]
  }
}

