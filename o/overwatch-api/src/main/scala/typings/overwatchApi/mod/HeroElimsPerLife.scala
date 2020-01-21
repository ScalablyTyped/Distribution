package typings.overwatchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeroElimsPerLife extends Hero {
  var eliminations_per_life: String
}

object HeroElimsPerLife {
  @scala.inline
  def apply(eliminations_per_life: String, hero: String, img: String): HeroElimsPerLife = {
    val __obj = js.Dynamic.literal(eliminations_per_life = eliminations_per_life.asInstanceOf[js.Any], hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeroElimsPerLife]
  }
}

