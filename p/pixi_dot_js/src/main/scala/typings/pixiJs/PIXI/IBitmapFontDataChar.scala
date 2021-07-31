package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @memberof PIXI
  * @typedef {object} IBitmapFontDataChar
  * @property {string} id
  * @property {number} page
  * @property {number} x
  * @property {number} y
  * @property {number} width
  * @property {number} height
  * @property {number} xoffset
  * @property {number} yoffset
  * @property {number} xadvance
  */
trait IBitmapFontDataChar extends StObject {
  
  var height: Double
  
  var id: String
  
  var page: Double
  
  var width: Double
  
  var x: Double
  
  var xadvance: Double
  
  var xoffset: Double
  
  var y: Double
  
  var yoffset: Double
}
object IBitmapFontDataChar {
  
  @scala.inline
  def apply(
    height: Double,
    id: String,
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
  
  @scala.inline
  implicit class IBitmapFontDataCharMutableBuilder[Self <: IBitmapFontDataChar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXadvance(value: Double): Self = StObject.set(x, "xadvance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXoffset(value: Double): Self = StObject.set(x, "xoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoffset(value: Double): Self = StObject.set(x, "yoffset", value.asInstanceOf[js.Any])
  }
}
