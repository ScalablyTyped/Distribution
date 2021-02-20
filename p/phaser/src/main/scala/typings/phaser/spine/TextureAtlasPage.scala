package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextureAtlasPage extends StObject {
  
  var height: Double = js.native
  
  var magFilter: TextureFilter = js.native
  
  var minFilter: TextureFilter = js.native
  
  var name: String = js.native
  
  var texture: Texture = js.native
  
  var uWrap: TextureWrap = js.native
  
  var vWrap: TextureWrap = js.native
  
  var width: Double = js.native
}
object TextureAtlasPage {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class TextureAtlasPageMutableBuilder[Self <: TextureAtlasPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagFilter(value: TextureFilter): Self = StObject.set(x, "magFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFilter(value: TextureFilter): Self = StObject.set(x, "minFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexture(value: Texture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUWrap(value: TextureWrap): Self = StObject.set(x, "uWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVWrap(value: TextureWrap): Self = StObject.set(x, "vWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
