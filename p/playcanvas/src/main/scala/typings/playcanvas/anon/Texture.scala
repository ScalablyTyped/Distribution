package typings.playcanvas.anon

import typings.playcanvas.buildPlaycanvasExtrasDotmjsMiniStatsWordAtlasMod.WordAtlas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Texture extends StObject {
  
  var atlas: WordAtlas
  
  var texture: Any
}
object Texture {
  
  inline def apply(atlas: WordAtlas, texture: Any): Texture = {
    val __obj = js.Dynamic.literal(atlas = atlas.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[Texture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Texture] (val x: Self) extends AnyVal {
    
    inline def setAtlas(value: WordAtlas): Self = StObject.set(x, "atlas", value.asInstanceOf[js.Any])
    
    inline def setTexture(value: Any): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
  }
}
