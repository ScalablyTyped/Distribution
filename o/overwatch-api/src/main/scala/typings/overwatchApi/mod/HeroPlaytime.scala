package typings.overwatchApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeroPlaytime extends Hero {
  
  var played: String = js.native
}
object HeroPlaytime {
  
  @scala.inline
  def apply(hero: String, img: String, played: String): HeroPlaytime = {
    val __obj = js.Dynamic.literal(hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeroPlaytime]
  }
  
  @scala.inline
  implicit class HeroPlaytimeMutableBuilder[Self <: HeroPlaytime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayed(value: String): Self = StObject.set(x, "played", value.asInstanceOf[js.Any])
  }
}
