package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextureAtlasPage extends StObject {
  
  var height: Double
  
  var magFilter: TextureFilter
  
  var minFilter: TextureFilter
  
  var name: String
  
  var texture: Texture
  
  var uWrap: TextureWrap
  
  var vWrap: TextureWrap
  
  var width: Double
}
object TextureAtlasPage {
  
  inline def apply(
    height: Double,
    magFilter: TextureFilter,
    minFilter: TextureFilter,
    name: String,
    texture: Texture,
    uWrap: TextureWrap,
    vWrap: TextureWrap,
    width: Double
  ): TextureAtlasPage = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], magFilter = magFilter.asInstanceOf[js.Any], minFilter = minFilter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], uWrap = uWrap.asInstanceOf[js.Any], vWrap = vWrap.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureAtlasPage]
  }
  
  extension [Self <: TextureAtlasPage](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMagFilter(value: TextureFilter): Self = StObject.set(x, "magFilter", value.asInstanceOf[js.Any])
    
    inline def setMinFilter(value: TextureFilter): Self = StObject.set(x, "minFilter", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTexture(value: Texture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setUWrap(value: TextureWrap): Self = StObject.set(x, "uWrap", value.asInstanceOf[js.Any])
    
    inline def setVWrap(value: TextureWrap): Self = StObject.set(x, "vWrap", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
