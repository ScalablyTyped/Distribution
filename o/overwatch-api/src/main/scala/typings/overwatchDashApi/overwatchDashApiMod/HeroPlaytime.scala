package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeroPlaytime extends Hero {
  var played: String
}

object HeroPlaytime {
  @scala.inline
  def apply(hero: String, img: String, played: String): HeroPlaytime = {
    val __obj = js.Dynamic.literal(hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeroPlaytime]
  }
}

