package typings.overwatchApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeroMultiKillBest
  extends StObject
     with Hero {
  
  var multikill_best: String
}
object HeroMultiKillBest {
  
  @scala.inline
  def apply(hero: String, img: String, multikill_best: String): HeroMultiKillBest = {
    val __obj = js.Dynamic.literal(hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], multikill_best = multikill_best.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeroMultiKillBest]
  }
  
  @scala.inline
  implicit class HeroMultiKillBestMutableBuilder[Self <: HeroMultiKillBest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultikill_best(value: String): Self = StObject.set(x, "multikill_best", value.asInstanceOf[js.Any])
  }
}
