package typings.pixiTextBitmap

import typings.pixiColor.libColorMod.ColorSource
import typings.pixiText.libTextStyleMod.TextStyleAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBitmapTextStyleMod {
  
  trait IBitmapTextFontDescriptor extends StObject {
    
    var name: String
    
    var size: Double
  }
  object IBitmapTextFontDescriptor {
    
    inline def apply(name: String, size: Double): IBitmapTextFontDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBitmapTextFontDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBitmapTextFontDescriptor] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBitmapTextStyle extends StObject {
    
    var align: TextStyleAlign
    
    var fontName: String
    
    var fontSize: Double
    
    var letterSpacing: Double
    
    var maxWidth: Double
    
    var tint: ColorSource
  }
  object IBitmapTextStyle {
    
    inline def apply(
      align: TextStyleAlign,
      fontName: String,
      fontSize: Double,
      letterSpacing: Double,
      maxWidth: Double,
      tint: ColorSource
    ): IBitmapTextStyle = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], fontName = fontName.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], tint = tint.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBitmapTextStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBitmapTextStyle] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: TextStyleAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setTint(value: ColorSource): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
      
      inline def setTintVarargs(value: Double*): Self = StObject.set(x, "tint", js.Array(value*))
    }
  }
}
