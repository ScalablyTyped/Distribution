package typings.pixiJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontName extends StObject {
  
  var align: js.UndefOr[String] = js.undefined
  
  var fontName: String
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var letterSpacing: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var tint: js.UndefOr[Double] = js.undefined
}
object FontName {
  
  @scala.inline
  def apply(fontName: String): FontName = {
    val __obj = js.Dynamic.literal(fontName = fontName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontName]
  }
  
  @scala.inline
  implicit class FontNameMutableBuilder[Self <: FontName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setTint(value: Double): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintUndefined: Self = StObject.set(x, "tint", js.undefined)
  }
}
