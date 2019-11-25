package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeroAccuracy extends Hero {
  var weapon_accuracy: String
}

object HeroAccuracy {
  @scala.inline
  def apply(hero: String, img: String, weapon_accuracy: String): HeroAccuracy = {
    val __obj = js.Dynamic.literal(hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], weapon_accuracy = weapon_accuracy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeroAccuracy]
  }
}

