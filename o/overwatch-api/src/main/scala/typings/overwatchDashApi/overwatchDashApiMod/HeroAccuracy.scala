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
    val __obj = js.Dynamic.literal(hero = hero, img = img, weapon_accuracy = weapon_accuracy)
  
    __obj.asInstanceOf[HeroAccuracy]
  }
}

