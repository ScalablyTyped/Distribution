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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Font object, for use in `font.set({ ... })`. */
@js.native
trait FontUpdateData extends js.Object {
  
  /**
    *
    * Gets or sets a value that indicates whether the font is bold. True if the font is formatted as bold, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var bold: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets the color for the specified font. You can provide the value in the '#RRGGBB' format or the color name.
    *
    * [Api set: WordApi 1.1]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether the font has a double strikethrough. True if the font is formatted as double strikethrough text, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var doubleStrikeThrough: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets the highlight color. To set it, use a value either in the '#RRGGBB' format or the color name. To remove highlight color, set it to null. The returned highlight color can be in the '#RRGGBB' format, an empty string for mixed highlight colors, or null for no highlight color.
    **Note**: Only the default highlight colors are available in Office for Windows Desktop. These are "Yellow", "Lime", "Turquoise", "Pink", "Blue", "Red", "DarkBlue", "Teal", "Green", "Purple", "DarkRed", "Olive", "Gray", "LightGray", and "Black". When the add-in runs in Office for Windows Desktop, any other color is converted to the closest color when applied to the font.
    *
    * [Api set: WordApi 1.1]
    */
  var highlightColor: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether the font is italicized. True if the font is italicized, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var italic: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets a value that represents the name of the font.
    *
    * [Api set: WordApi 1.1]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets or sets a value that represents the font size in points.
    *
    * [Api set: WordApi 1.1]
    */
  var size: js.UndefOr[Double] = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether the font has a strikethrough. True if the font is formatted as strikethrough text, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var strikeThrough: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether the font is a subscript. True if the font is formatted as subscript, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var subscript: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether the font is a superscript. True if the font is formatted as superscript, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var superscript: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets a value that indicates the font's underline type. 'None' if the font is not underlined.
    *
    * [Api set: WordApi 1.1]
    */
  var underline: js.UndefOr[
    UnderlineType | Mixed | None | Hidden | DotLine | Single | Word | typings.officeJs.officeJsStrings.Double | Thick | Dotted | DottedHeavy | DashLine | DashLineHeavy | DashLineLong | DashLineLongHeavy | DotDashLine | DotDashLineHeavy | TwoDotDashLine | TwoDotDashLineHeavy | Wave | WaveHeavy | WaveDouble
  ] = js.native
}
object FontUpdateData {
  
  @scala.inline
  def apply(): FontUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontUpdateData]
  }
  
  @scala.inline
  implicit class FontUpdateDataOps[Self <: FontUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDoubleStrikeThrough(value: Boolean): Self = this.set("doubleStrikeThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleStrikeThrough: Self = this.set("doubleStrikeThrough", js.undefined)
    
    @scala.inline
    def setHighlightColor(value: String): Self = this.set("highlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightColor: Self = this.set("highlightColor", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStrikeThrough(value: Boolean): Self = this.set("strikeThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrikeThrough: Self = this.set("strikeThrough", js.undefined)
    
    @scala.inline
    def setSubscript(value: Boolean): Self = this.set("subscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscript: Self = this.set("subscript", js.undefined)
    
    @scala.inline
    def setSuperscript(value: Boolean): Self = this.set("superscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuperscript: Self = this.set("superscript", js.undefined)
    
    @scala.inline
    def setUnderline(
      value: UnderlineType | Mixed | None | Hidden | DotLine | Single | Word | typings.officeJs.officeJsStrings.Double | Thick | Dotted | DottedHeavy | DashLine | DashLineHeavy | DashLineLong | DashLineLongHeavy | DotDashLine | DotDashLineHeavy | TwoDotDashLine | TwoDotDashLineHeavy | Wave | WaveHeavy | WaveDouble
    ): Self = this.set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
  }
}
