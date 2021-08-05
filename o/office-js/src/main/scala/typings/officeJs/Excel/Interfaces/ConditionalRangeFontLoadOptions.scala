package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * This object represents the font attributes (font style, color, etc.) for an object.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalRangeFontLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the font is bold.
    *
    * [Api set: ExcelApi 1.6]
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * HTML color code representation of the text color (e.g., #FF0000 represents Red).
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the font is italic.
    *
    * [Api set: ExcelApi 1.6]
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the strikethrough status of the font.
    *
    * [Api set: ExcelApi 1.6]
    */
  var strikethrough: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The type of underline applied to the font. See Excel.ConditionalRangeFontUnderlineStyle for details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var underline: js.UndefOr[Boolean] = js.undefined
}
object ConditionalRangeFontLoadOptions {
  
  inline def apply(): ConditionalRangeFontLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeFontLoadOptions]
  }
  
  extension [Self <: ConditionalRangeFontLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
    
    inline def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
