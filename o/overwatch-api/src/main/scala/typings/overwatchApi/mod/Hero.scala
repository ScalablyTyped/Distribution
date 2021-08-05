package typings.overwatchApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hero extends StObject {
  
  var hero: String
  
  var img: String
}
object Hero {
  
  inline def apply(hero: String, img: String): Hero = {
    val __obj = js.Dynamic.literal(hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hero]
  }
  
  extension [Self <: Hero](x: Self) {
    
    inline def setHero(value: String): Self = StObject.set(x, "hero", value.asInstanceOf[js.Any])
    
    inline def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
  }
}
