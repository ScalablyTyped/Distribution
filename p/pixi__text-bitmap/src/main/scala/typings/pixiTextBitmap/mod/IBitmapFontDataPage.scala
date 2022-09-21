package typings.pixiTextBitmap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBitmapFontDataPage extends StObject {
  
  /** File name */
  var file: String
  
  /** Unique id for bitmap texture */
  var id: Double
}
object IBitmapFontDataPage {
  
  inline def apply(file: String, id: Double): IBitmapFontDataPage = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapFontDataPage]
  }
  
  extension [Self <: IBitmapFontDataPage](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
