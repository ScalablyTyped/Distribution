package typings.overwatchApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hero extends StObject {
  
  var hero: String = js.native
  
  var img: String = js.native
}
object Hero {
  
  @scala.inline
  def apply(hero: String, img: String): Hero = {
    val __obj = js.Dynamic.literal(hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hero]
  }
  
  @scala.inline
  implicit class HeroMutableBuilder[Self <: Hero] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHero(value: String): Self = StObject.set(x, "hero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
  }
}
