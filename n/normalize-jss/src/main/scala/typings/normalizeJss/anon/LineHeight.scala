package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineHeight extends StObject {
  
  var fontFamily: String
  
  var lineHeight: String
  
  var textSizeAdjust: String
}
object LineHeight {
  
  inline def apply(fontFamily: String, lineHeight: String, textSizeAdjust: String): LineHeight = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], textSizeAdjust = textSizeAdjust.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeight]
  }
  
  extension [Self <: LineHeight](x: Self) {
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setTextSizeAdjust(value: String): Self = StObject.set(x, "textSizeAdjust", value.asInstanceOf[js.Any])
  }
}
