package typings.officeJs.Word.Interfaces

import typings.officeJs.Word.UnderlineType
import typings.officeJs.officeJsStrings.DashLine
import typings.officeJs.officeJsStrings.DashLineHeavy
import typings.officeJs.officeJsStrings.DashLineLong
import typings.officeJs.officeJsStrings.DashLineLongHeavy
import typings.officeJs.officeJsStrings.DotDashLine
import typings.officeJs.officeJsStrings.DotDashLineHeavy
import typings.officeJs.officeJsStrings.DotLine
import typings.officeJs.officeJsStrings.Dotted
import typings.officeJs.officeJsStrings.DottedHeavy
import typings.officeJs.officeJsStrings.Hidden
import typings.officeJs.officeJsStrings.Mixed
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Single
import typings.officeJs.officeJsStrings.Thick
import typings.officeJs.officeJsStrings.TwoDotDashLine
import typings.officeJs.officeJsStrings.TwoDotDashLineHeavy
import typings.officeJs.officeJsStrings.Wave
import typings.officeJs.officeJsStrings.WaveDouble
import typings.officeJs.officeJsStrings.WaveHeavy
import typings.officeJs.officeJsStrings.Word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Font object, for use in `font.set({ ... })`. */
trait FontUpdateData extends StObject {
  
  /**
    *
    * Gets or sets a value that indicates whether the font is bold. True if the font is formatted as bold, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets or sets the color for the specified font. You can provide the value in the '#RRGGBB' format or the color name.
    *
    * [Api set: WordApi 1.1]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets or sets a value that indicates whether the font has a double strikethrough. True if the font is formatted as double strikethrough text, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var doubleStrikeThrough: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets or sets the highlight color. To set it, use a value either in the '#RRGGBB' format or the color name. To remove highlight color, set it to null. The returned highlight color can be in the '#RRGGBB' format, an empty string for mixed highlight colors, or null for no highlight color.
    **Note**: Only the default highlight colors are available in Office for Windows Desktop. These are "Yellow", "Lime", "Turquoise", "Pink", "Blue", "Red", "DarkBlue", "Teal", "Green", "Purple", "DarkRed", "Olive", "Gray", "LightGray", and "Black". When the add-in runs in Office for Windows Desktop, any other color is converted to the closest color when applied to the font.
    *
    * [Api set: WordApi 1.1]
    */
  var highlightColor: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets or sets a value that indicates whether the font is italicized. True if the font is italicized, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets or sets a value that represents the name of the font.
    *
    * [Api set: WordApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets or sets a value that represents the font size in points.
    *
    * [Api set: WordApi 1.1]
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Gets or sets a value that indicates whether the font has a strikethrough. True if the font is formatted as strikethrough text, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var strikeThrough: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets or sets a value that indicates whether the font is a subscript. True if the font is formatted as subscript, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var subscript: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets or sets a value that indicates whether the font is a superscript. True if the font is formatted as superscript, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var superscript: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets or sets a value that indicates the font's underline type. 'None' if the font is not underlined.
    *
    * [Api set: WordApi 1.1]
    */
  var underline: js.UndefOr[
    UnderlineType | Mixed | None | Hidden | DotLine | Single | Word | typings.officeJs.officeJsStrings.Double | Thick | Dotted | DottedHeavy | DashLine | DashLineHeavy | DashLineLong | DashLineLongHeavy | DotDashLine | DotDashLineHeavy | TwoDotDashLine | TwoDotDashLineHeavy | Wave | WaveHeavy | WaveDouble
  ] = js.undefined
}
object FontUpdateData {
  
  inline def apply(): FontUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontUpdateData]
  }
  
  extension [Self <: FontUpdateData](x: Self) {
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDoubleStrikeThrough(value: Boolean): Self = StObject.set(x, "doubleStrikeThrough", value.asInstanceOf[js.Any])
    
    inline def setDoubleStrikeThroughUndefined: Self = StObject.set(x, "doubleStrikeThrough", js.undefined)
    
    inline def setHighlightColor(value: String): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
    
    inline def setHighlightColorUndefined: Self = StObject.set(x, "highlightColor", js.undefined)
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStrikeThrough(value: Boolean): Self = StObject.set(x, "strikeThrough", value.asInstanceOf[js.Any])
    
    inline def setStrikeThroughUndefined: Self = StObject.set(x, "strikeThrough", js.undefined)
    
    inline def setSubscript(value: Boolean): Self = StObject.set(x, "subscript", value.asInstanceOf[js.Any])
    
    inline def setSubscriptUndefined: Self = StObject.set(x, "subscript", js.undefined)
    
    inline def setSuperscript(value: Boolean): Self = StObject.set(x, "superscript", value.asInstanceOf[js.Any])
    
    inline def setSuperscriptUndefined: Self = StObject.set(x, "superscript", js.undefined)
    
    inline def setUnderline(
      value: UnderlineType | Mixed | None | Hidden | DotLine | Single | Word | typings.officeJs.officeJsStrings.Double | Thick | Dotted | DottedHeavy | DashLine | DashLineHeavy | DashLineLong | DashLineLongHeavy | DotDashLine | DotDashLineHeavy | TwoDotDashLine | TwoDotDashLineHeavy | Wave | WaveHeavy | WaveDouble
    ): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
