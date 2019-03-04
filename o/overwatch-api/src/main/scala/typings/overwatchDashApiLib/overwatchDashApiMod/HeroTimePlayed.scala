package typings
package overwatchDashApiLib.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeroTimePlayed extends TopHeroStats {
  var played: java.lang.String
}

object HeroTimePlayed {
  @scala.inline
  def apply(hero: OverwatchHero, img: java.lang.String, played: java.lang.String): HeroTimePlayed = {
    val __obj = js.Dynamic.literal(hero = hero, img = img, played = played)
  
    __obj.asInstanceOf[HeroTimePlayed]
  }
}

