package typings.officeJsPreview.Word.Interfaces

import typings.officeJsPreview.Word.UnderlineType
import typings.officeJsPreview.officeJsPreviewStrings.DashLine
import typings.officeJsPreview.officeJsPreviewStrings.DashLineHeavy
import typings.officeJsPreview.officeJsPreviewStrings.DashLineLong
import typings.officeJsPreview.officeJsPreviewStrings.DashLineLongHeavy
import typings.officeJsPreview.officeJsPreviewStrings.DotDashLine
import typings.officeJsPreview.officeJsPreviewStrings.DotDashLineHeavy
import typings.officeJsPreview.officeJsPreviewStrings.DotLine
import typings.officeJsPreview.officeJsPreviewStrings.Dotted
import typings.officeJsPreview.officeJsPreviewStrings.DottedHeavy
import typings.officeJsPreview.officeJsPreviewStrings.Hidden
import typings.officeJsPreview.officeJsPreviewStrings.Mixed
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.Single
import typings.officeJsPreview.officeJsPreviewStrings.Thick
import typings.officeJsPreview.officeJsPreviewStrings.TwoDotDashLine
import typings.officeJsPreview.officeJsPreviewStrings.TwoDotDashLineHeavy
import typings.officeJsPreview.officeJsPreviewStrings.Wave
import typings.officeJsPreview.officeJsPreviewStrings.WaveDouble
import typings.officeJsPreview.officeJsPreviewStrings.WaveHeavy
import typings.officeJsPreview.officeJsPreviewStrings.Word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `font.toJSON()`. */
trait FontData extends StObject {
  
  /**
    * Specifies a value that indicates whether the font is bold. True if the font is formatted as bold, otherwise, false.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the color for the specified font. You can provide the value in the '#RRGGBB' format or the color name.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a value that indicates whether the font has a double strikethrough. True if the font is formatted as double strikethrough text, otherwise, false.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var doubleStrikeThrough: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the highlight color. To set it, use a value either in the '#RRGGBB' format or the color name. To remove highlight color, set it to null. The returned highlight color can be in the '#RRGGBB' format, an empty string for mixed highlight colors, or null for no highlight color. Note: Only the default highlight colors are available in Office for Windows Desktop. These are "Yellow", "Lime", "Turquoise", "Pink", "Blue", "Red", "DarkBlue", "Teal", "Green", "Purple", "DarkRed", "Olive", "Gray", "LightGray", and "Black". When the add-in runs in Office for Windows Desktop, any other color is converted to the closest color when applied to the font.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var highlightColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a value that indicates whether the font is italicized. True if the font is italicized, otherwise, false.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a value that represents the name of the font.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a value that represents the font size in points.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a value that indicates whether the font has a strikethrough. True if the font is formatted as strikethrough text, otherwise, false.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var strikeThrough: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a value that indicates whether the font is a subscript. True if the font is formatted as subscript, otherwise, false.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var subscript: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a value that indicates whether the font is a superscript. True if the font is formatted as superscript, otherwise, false.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var superscript: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a value that indicates the font's underline type. 'None' if the font is not underlined.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var underline: js.UndefOr[
    UnderlineType | Mixed | None | Hidden | DotLine | Single | Word | typings.officeJsPreview.officeJsPreviewStrings.Double | Thick | Dotted | DottedHeavy | DashLine | DashLineHeavy | DashLineLong | DashLineLongHeavy | DotDashLine | DotDashLineHeavy | TwoDotDashLine | TwoDotDashLineHeavy | Wave | WaveHeavy | WaveDouble
  ] = js.undefined
}
object FontData {
  
  inline def apply(): FontData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontData] (val x: Self) extends AnyVal {
    
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
      value: UnderlineType | Mixed | None | Hidden | DotLine | Single | Word | typings.officeJsPreview.officeJsPreviewStrings.Double | Thick | Dotted | DottedHeavy | DashLine | DashLineHeavy | DashLineLong | DashLineLongHeavy | DotDashLine | DotDashLineHeavy | TwoDotDashLine | TwoDotDashLineHeavy | Wave | WaveHeavy | WaveDouble
    ): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
