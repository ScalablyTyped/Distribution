package typings.pixiTextBitmap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBitmapFontDataInfo extends StObject {
  
  /** Font face */
  var face: String
  
  /** Font size */
  var size: Double
}
object IBitmapFontDataInfo {
  
  inline def apply(face: String, size: Double): IBitmapFontDataInfo = {
    val __obj = js.Dynamic.literal(face = face.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapFontDataInfo]
  }
  
  extension [Self <: IBitmapFontDataInfo](x: Self) {
    
    inline def setFace(value: String): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
