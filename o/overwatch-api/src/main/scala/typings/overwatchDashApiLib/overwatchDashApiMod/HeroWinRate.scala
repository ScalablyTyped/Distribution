package typings
package overwatchDashApiLib.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeroWinRate extends TopHeroStats {
  var win_rate: java.lang.String
}

object HeroWinRate {
  @scala.inline
  def apply(hero: OverwatchHero, img: java.lang.String, win_rate: java.lang.String): HeroWinRate = {
    val __obj = js.Dynamic.literal(hero = hero, img = img, win_rate = win_rate)
  
    __obj.asInstanceOf[HeroWinRate]
  }
}

