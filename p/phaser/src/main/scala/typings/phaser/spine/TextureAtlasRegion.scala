package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextureAtlasRegion
  extends StObject
     with TextureRegion {
  
  var degrees: Double
  
  var index: Double
  
  var name: String
  
  var page: TextureAtlasPage
  
  var texture: Texture
  
  var x: Double
  
  var y: Double
}
object TextureAtlasRegion {
  
  @scala.inline
  def apply(
    degrees: Double,
    height: Double,
    index: Double,
    name: String,
    offsetX: Double,
    offsetY: Double,
    originalHeight: Double,
    originalWidth: Double,
    page: TextureAtlasPage,
    renderObject: js.Any,
    rotate: Boolean,
    texture: Texture,
    u: Double,
    u2: Double,
    v: Double,
    v2: Double,
    width: Double,
    x: Double,
    y: Double
  ): TextureAtlasRegion = {
    val __obj = js.Dynamic.literal(degrees = degrees.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], renderObject = renderObject.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], u2 = u2.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], v2 = v2.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureAtlasRegion]
  }
  
  @scala.inline
  implicit class TextureAtlasRegionMutableBuilder[Self <: TextureAtlasRegion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDegrees(value: Double): Self = StObject.set(x, "degrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: TextureAtlasPage): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexture(value: Texture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
