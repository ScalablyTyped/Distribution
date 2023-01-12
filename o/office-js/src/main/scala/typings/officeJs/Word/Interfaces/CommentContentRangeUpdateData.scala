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
import typings.officeJs.officeJsStrings.Double
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

/** An interface for updating data on the CommentContentRange object, for use in `commentContentRange.set({ ... })`. */
trait CommentContentRangeUpdateData extends StObject {
  
  /**
    * Gets or sets a value that indicates whether the comment text is bold.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the first hyperlink in the range, or sets a hyperlink on the range. All hyperlinks in the range are deleted when you set a new hyperlink on the range.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var hyperlink: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets a value that indicates whether the comment text is italicized.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets a value that indicates whether the comment text has a strikethrough.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var strikeThrough: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets a value that indicates the comment text's underline type. 'None' if the comment text is not underlined.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var underline: js.UndefOr[
    UnderlineType | Mixed | None | Hidden | DotLine | Single | Word | Double | Thick | Dotted | DottedHeavy | DashLine | DashLineHeavy | DashLineLong | DashLineLongHeavy | DotDashLine | DotDashLineHeavy | TwoDotDashLine | TwoDotDashLineHeavy | Wave | WaveHeavy | WaveDouble
  ] = js.undefined
}
object CommentContentRangeUpdateData {
  
  inline def apply(): CommentContentRangeUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentContentRangeUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentContentRangeUpdateData] (val x: Self) extends AnyVal {
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setHyperlink(value: String): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setStrikeThrough(value: Boolean): Self = StObject.set(x, "strikeThrough", value.asInstanceOf[js.Any])
    
    inline def setStrikeThroughUndefined: Self = StObject.set(x, "strikeThrough", js.undefined)
    
    inline def setUnderline(
      value: UnderlineType | Mixed | None | Hidden | DotLine | Single | Word | Double | Thick | Dotted | DottedHeavy | DashLine | DashLineHeavy | DashLineLong | DashLineLongHeavy | DotDashLine | DotDashLineHeavy | TwoDotDashLine | TwoDotDashLineHeavy | Wave | WaveHeavy | WaveDouble
    ): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
