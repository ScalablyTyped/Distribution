package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFamily extends StObject {
  
  var fontFamily: String
  
  var fontSize: String
  
  var lineHeight: String
  
  var margin: Double
}
object FontFamily {
  
  @scala.inline
  def apply(fontFamily: String, fontSize: String, lineHeight: String, margin: Double): FontFamily = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamily]
  }
  
  @scala.inline
  implicit class FontFamilyMutableBuilder[Self <: FontFamily] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
  }
}
