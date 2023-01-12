package typings.overwatchApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeroAccuracy
  extends StObject
     with Hero {
  
  var weapon_accuracy: String
}
object HeroAccuracy {
  
  inline def apply(hero: String, img: String, weapon_accuracy: String): HeroAccuracy = {
    val __obj = js.Dynamic.literal(hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], weapon_accuracy = weapon_accuracy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeroAccuracy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeroAccuracy] (val x: Self) extends AnyVal {
    
    inline def setWeapon_accuracy(value: String): Self = StObject.set(x, "weapon_accuracy", value.asInstanceOf[js.Any])
  }
}
