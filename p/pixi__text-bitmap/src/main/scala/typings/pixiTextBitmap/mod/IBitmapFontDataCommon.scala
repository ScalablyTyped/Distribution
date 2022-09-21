package typings.pixiTextBitmap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBitmapFontDataCommon extends StObject {
  
  /** Line height, in pixels. */
  var lineHeight: Double
}
object IBitmapFontDataCommon {
  
  inline def apply(lineHeight: Double): IBitmapFontDataCommon = {
    val __obj = js.Dynamic.literal(lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapFontDataCommon]
  }
  
  extension [Self <: IBitmapFontDataCommon](x: Self) {
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
