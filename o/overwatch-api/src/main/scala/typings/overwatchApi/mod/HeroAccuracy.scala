package typings.overwatchApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class HeroAccuracyMutableBuilder[Self <: HeroAccuracy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWeapon_accuracy(value: String): Self = StObject.set(x, "weapon_accuracy", value.asInstanceOf[js.Any])
  }
}
