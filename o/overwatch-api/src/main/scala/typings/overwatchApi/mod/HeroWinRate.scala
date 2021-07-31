package typings.overwatchApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeroWinRate
  extends StObject
     with Hero {
  
  var win_rate: String
}
object HeroWinRate {
  
  @scala.inline
  def apply(hero: String, img: String, win_rate: String): HeroWinRate = {
    val __obj = js.Dynamic.literal(hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], win_rate = win_rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeroWinRate]
  }
  
  @scala.inline
  implicit class HeroWinRateMutableBuilder[Self <: HeroWinRate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWin_rate(value: String): Self = StObject.set(x, "win_rate", value.asInstanceOf[js.Any])
  }
}
