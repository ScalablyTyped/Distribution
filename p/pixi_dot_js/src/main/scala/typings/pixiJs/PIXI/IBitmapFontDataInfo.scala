package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @memberof PIXI
  * @typedef {object} IBitmapFontDataInfo
  * @property {string} face
  * @property {number} size
  */
trait IBitmapFontDataInfo extends StObject {
  
  var face: String
  
  var size: Double
}
object IBitmapFontDataInfo {
  
  @scala.inline
  def apply(face: String, size: Double): IBitmapFontDataInfo = {
    val __obj = js.Dynamic.literal(face = face.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapFontDataInfo]
  }
  
  @scala.inline
  implicit class IBitmapFontDataInfoMutableBuilder[Self <: IBitmapFontDataInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFace(value: String): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
