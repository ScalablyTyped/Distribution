package typings.pixiTextBitmap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBitmapFontDataChar extends StObject {
  
  /** Height of character in page. */
  var height: Double
  
  /** Unique id of character */
  var id: Double
  
  /** {@link PIXI.IBitmapFontDataPage} id */
  var page: Double
  
  /** Width of character in page. */
  var width: Double
  
  /** x-position of character in page. */
  var x: Double
  
  /** Advancement to apply to next character. */
  var xadvance: Double
  
  /** x-offset to apply when rendering character */
  var xoffset: Double
  
  /** y-position of character in page. */
  var y: Double
  
  /** y-offset to apply when rendering character. */
  var yoffset: Double
}
object IBitmapFontDataChar {
  
  inline def apply(
    height: Double,
    id: Double,
    page: Double,
    width: Double,
    x: Double,
    xadvance: Double,
    xoffset: Double,
    y: Double,
    yoffset: Double
  ): IBitmapFontDataChar = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xadvance = xadvance.asInstanceOf[js.Any], xoffset = xoffset.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yoffset = yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapFontDataChar]
  }
  
  extension [Self <: IBitmapFontDataChar](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXadvance(value: Double): Self = StObject.set(x, "xadvance", value.asInstanceOf[js.Any])
    
    inline def setXoffset(value: Double): Self = StObject.set(x, "xoffset", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYoffset(value: Double): Self = StObject.set(x, "yoffset", value.asInstanceOf[js.Any])
  }
}
