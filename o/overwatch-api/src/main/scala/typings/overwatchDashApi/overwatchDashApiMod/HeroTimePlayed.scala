package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeroTimePlayed extends TopHeroStats {
  var played: String
}

object HeroTimePlayed {
  @scala.inline
  def apply(hero: OverwatchHero, img: String, played: String): HeroTimePlayed = {
    val __obj = js.Dynamic.literal(hero = hero, img = img, played = played)
  
    __obj.asInstanceOf[HeroTimePlayed]
  }
}

