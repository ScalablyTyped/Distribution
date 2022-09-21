package typings.pixiTextBitmap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBitmapTextFontDescriptor extends StObject {
  
  var name: String
  
  var size: Double
}
object IBitmapTextFontDescriptor {
  
  inline def apply(name: String, size: Double): IBitmapTextFontDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapTextFontDescriptor]
  }
  
  extension [Self <: IBitmapTextFontDescriptor](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
