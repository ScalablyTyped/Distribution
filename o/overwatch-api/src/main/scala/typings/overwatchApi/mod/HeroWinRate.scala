package typings.overwatchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeroWinRate extends Hero {
  var win_rate: String
}

object HeroWinRate {
  @scala.inline
  def apply(hero: String, img: String, win_rate: String): HeroWinRate = {
    val __obj = js.Dynamic.literal(hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], win_rate = win_rate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeroWinRate]
  }
}

