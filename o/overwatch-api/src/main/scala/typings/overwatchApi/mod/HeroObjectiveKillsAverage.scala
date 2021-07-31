package typings.overwatchApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeroObjectiveKillsAverage
  extends StObject
     with Hero {
  
  var objective_kills_average: String
}
object HeroObjectiveKillsAverage {
  
  @scala.inline
  def apply(hero: String, img: String, objective_kills_average: String): HeroObjectiveKillsAverage = {
    val __obj = js.Dynamic.literal(hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], objective_kills_average = objective_kills_average.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeroObjectiveKillsAverage]
  }
  
  @scala.inline
  implicit class HeroObjectiveKillsAverageMutableBuilder[Self <: HeroObjectiveKillsAverage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjective_kills_average(value: String): Self = StObject.set(x, "objective_kills_average", value.asInstanceOf[js.Any])
  }
}
