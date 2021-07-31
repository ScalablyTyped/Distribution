package typings.overwatchApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeroElimsPerLife
  extends StObject
     with Hero {
  
  var eliminations_per_life: String
}
object HeroElimsPerLife {
  
  @scala.inline
  def apply(eliminations_per_life: String, hero: String, img: String): HeroElimsPerLife = {
    val __obj = js.Dynamic.literal(eliminations_per_life = eliminations_per_life.asInstanceOf[js.Any], hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeroElimsPerLife]
  }
  
  @scala.inline
  implicit class HeroElimsPerLifeMutableBuilder[Self <: HeroElimsPerLife] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEliminations_per_life(value: String): Self = StObject.set(x, "eliminations_per_life", value.asInstanceOf[js.Any])
  }
}
