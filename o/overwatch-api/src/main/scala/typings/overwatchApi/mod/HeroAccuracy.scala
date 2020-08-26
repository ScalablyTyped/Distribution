package typings.overwatchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeroAccuracy extends Hero {
  var weapon_accuracy: String = js.native
}

object HeroAccuracy {
  @scala.inline
  def apply(hero: String, img: String, weapon_accuracy: String): HeroAccuracy = {
    val __obj = js.Dynamic.literal(hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], weapon_accuracy = weapon_accuracy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeroAccuracy]
  }
  @scala.inline
  implicit class HeroAccuracyOps[Self <: HeroAccuracy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWeapon_accuracy(value: String): Self = this.set("weapon_accuracy", value.asInstanceOf[js.Any])
  }
  
}

