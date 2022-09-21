package typings.pixiTextBitmap.mod

import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiUtils.mod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBitmapFontCharacter extends StObject {
  
  var kerning: Dict[Double]
  
  var page: Double
  
  var texture: Texture[Resource]
  
  var xAdvance: Double
  
  var xOffset: Double
  
  var yOffset: Double
}
object IBitmapFontCharacter {
  
  inline def apply(
    kerning: Dict[Double],
    page: Double,
    texture: Texture[Resource],
    xAdvance: Double,
    xOffset: Double,
    yOffset: Double
  ): IBitmapFontCharacter = {
    val __obj = js.Dynamic.literal(kerning = kerning.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], xAdvance = xAdvance.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapFontCharacter]
  }
  
  extension [Self <: IBitmapFontCharacter](x: Self) {
    
    inline def setKerning(value: Dict[Double]): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setTexture(value: Texture[Resource]): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setXAdvance(value: Double): Self = StObject.set(x, "xAdvance", value.asInstanceOf[js.Any])
    
    inline def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
    
    inline def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
  }
}
