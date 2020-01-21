package typings.overwatchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeroMultiKillBest extends Hero {
  var multikill_best: String
}

object HeroMultiKillBest {
  @scala.inline
  def apply(hero: String, img: String, multikill_best: String): HeroMultiKillBest = {
    val __obj = js.Dynamic.literal(hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], multikill_best = multikill_best.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeroMultiKillBest]
  }
}

