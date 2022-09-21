package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object represents the font attributes (font name, font size, color, etc.) for an object.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
trait RangeFontLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the bold status of the font.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  
  /**
    * HTML color code representation of the text color (e.g., #FF0000 represents Red).
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the italic status of the font.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Font name (e.g., "Calibri"). The name's length should not be greater than 31 characters.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Font size.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var size: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the strikethrough status of font. A `null` value indicates that the entire range doesn't have a uniform strikethrough setting.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var strikethrough: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the subscript status of font.
    Returns `true` if all the fonts of the range are subscript.
    Returns `false` if all the fonts of the range are superscript or normal (neither superscript, nor subscript).
    Returns `null` otherwise.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var subscript: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the superscript status of font.
    Returns `true` if all the fonts of the range are superscript.
    Returns `false` if all the fonts of the range are subscript or normal (neither superscript, nor subscript).
    Returns `null` otherwise.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var superscript: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a double that lightens or darkens a color for the range font. The value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A `null` value indicates that the entire range doesn't have a uniform font `tintAndShade` setting.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Type of underline applied to the font. See `Excel.RangeUnderlineStyle` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var underline: js.UndefOr[Boolean] = js.undefined
}
object RangeFontLoadOptions {
  
  inline def apply(): RangeFontLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeFontLoadOptions]
  }
  
  extension [Self <: RangeFontLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
    
    inline def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
    
    inline def setSubscript(value: Boolean): Self = StObject.set(x, "subscript", value.asInstanceOf[js.Any])
    
    inline def setSubscriptUndefined: Self = StObject.set(x, "subscript", js.undefined)
    
    inline def setSuperscript(value: Boolean): Self = StObject.set(x, "superscript", value.asInstanceOf[js.Any])
    
    inline def setSuperscriptUndefined: Self = StObject.set(x, "superscript", js.undefined)
    
    inline def setTintAndShade(value: Boolean): Self = StObject.set(x, "tintAndShade", value.asInstanceOf[js.Any])
    
    inline def setTintAndShadeUndefined: Self = StObject.set(x, "tintAndShade", js.undefined)
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
