package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextFormat extends StObject {
  
  /** True if the text is bold. */
  var bold: js.UndefOr[Boolean] = js.undefined
  
  /** The font family. */
  var fontFamily: js.UndefOr[String] = js.undefined
  
  /** The size of the font. */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /** The foreground color of the text. */
  var foregroundColor: js.UndefOr[Color] = js.undefined
  
  /** The foreground color of the text. If foreground_color is also set, this field takes precedence. */
  var foregroundColorStyle: js.UndefOr[ColorStyle] = js.undefined
  
  /** True if the text is italicized. */
  var italic: js.UndefOr[Boolean] = js.undefined
  
  /** True if the text has a strikethrough. */
  var strikethrough: js.UndefOr[Boolean] = js.undefined
  
  /** True if the text is underlined. */
  var underline: js.UndefOr[Boolean] = js.undefined
}
object TextFormat {
  
  @scala.inline
  def apply(): TextFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFormat]
  }
  
  @scala.inline
  implicit class TextFormatMutableBuilder[Self <: TextFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setForegroundColor(value: Color): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundColorStyle(value: ColorStyle): Self = StObject.set(x, "foregroundColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundColorStyleUndefined: Self = StObject.set(x, "foregroundColorStyle", js.undefined)
    
    @scala.inline
    def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    @scala.inline
    def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
    
    @scala.inline
    def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
