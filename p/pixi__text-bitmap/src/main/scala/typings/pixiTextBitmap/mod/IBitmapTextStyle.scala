package typings.pixiTextBitmap.mod

import typings.pixiText.mod.TextStyleAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBitmapTextStyle extends StObject {
  
  var align: TextStyleAlign
  
  var fontName: String
  
  var fontSize: Double
  
  var letterSpacing: Double
  
  var maxWidth: Double
  
  var tint: Double
}
object IBitmapTextStyle {
  
  inline def apply(
    align: TextStyleAlign,
    fontName: String,
    fontSize: Double,
    letterSpacing: Double,
    maxWidth: Double,
    tint: Double
  ): IBitmapTextStyle = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], fontName = fontName.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], tint = tint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapTextStyle]
  }
  
  extension [Self <: IBitmapTextStyle](x: Self) {
    
    inline def setAlign(value: TextStyleAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setTint(value: Double): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
  }
}
