package typings.officeJsPreview.Word.Interfaces

import typings.officeJsPreview.Word.Alignment
import typings.officeJsPreview.Word.OutlineLevel
import typings.officeJsPreview.officeJsPreviewStrings.Centered
import typings.officeJsPreview.officeJsPreviewStrings.Justified
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.Mixed
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevel1
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevel2
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevel3
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevel4
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevel5
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevel6
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevel7
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevel8
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevel9
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevelBodyText
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `paragraphFormat.toJSON()`. */
trait ParagraphFormatData extends StObject {
  
  /**
    * Gets or sets the alignment for the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var alignment: js.UndefOr[Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified] = js.undefined
  
  /**
    * Gets or sets the value (in points) for a first line or hanging indent. Use a positive value to set a first-line indent, and use a negative value to set a hanging indent.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var firstLineIndent: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets whether all lines in the specified paragraphs remain on the same page when Microsoft Word repaginates the document.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var keepTogether: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets whether the specified paragraph remains on the same page as the paragraph that follows it when Microsoft Word repaginates the document.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var keepWithNext: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the left indent.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var leftIndent: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the line spacing (in points) for the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var lineSpacing: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the amount of spacing (in gridlines) after the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var lineUnitAfter: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the amount of spacing (in gridlines) before the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var lineUnitBefore: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets whether left and right indents are the same width.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var mirrorIndents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the outline level for the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var outlineLevel: js.UndefOr[
    OutlineLevel | OutlineLevel1 | OutlineLevel2 | OutlineLevel3 | OutlineLevel4 | OutlineLevel5 | OutlineLevel6 | OutlineLevel7 | OutlineLevel8 | OutlineLevel9 | OutlineLevelBodyText
  ] = js.undefined
  
  /**
    * Gets or sets the right indent (in points) for the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var rightIndent: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the amount of spacing (in points) after the specified paragraph or text column.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var spaceAfter: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the spacing (in points) before the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var spaceBefore: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets whether the first and last lines in the specified paragraph remain on the same page as the rest of the paragraph when Microsoft Word repaginates the document.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var widowControl: js.UndefOr[Boolean] = js.undefined
}
object ParagraphFormatData {
  
  inline def apply(): ParagraphFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphFormatData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParagraphFormatData] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setFirstLineIndent(value: Double): Self = StObject.set(x, "firstLineIndent", value.asInstanceOf[js.Any])
    
    inline def setFirstLineIndentUndefined: Self = StObject.set(x, "firstLineIndent", js.undefined)
    
    inline def setKeepTogether(value: Boolean): Self = StObject.set(x, "keepTogether", value.asInstanceOf[js.Any])
    
    inline def setKeepTogetherUndefined: Self = StObject.set(x, "keepTogether", js.undefined)
    
    inline def setKeepWithNext(value: Boolean): Self = StObject.set(x, "keepWithNext", value.asInstanceOf[js.Any])
    
    inline def setKeepWithNextUndefined: Self = StObject.set(x, "keepWithNext", js.undefined)
    
    inline def setLeftIndent(value: Double): Self = StObject.set(x, "leftIndent", value.asInstanceOf[js.Any])
    
    inline def setLeftIndentUndefined: Self = StObject.set(x, "leftIndent", js.undefined)
    
    inline def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineSpacingUndefined: Self = StObject.set(x, "lineSpacing", js.undefined)
    
    inline def setLineUnitAfter(value: Double): Self = StObject.set(x, "lineUnitAfter", value.asInstanceOf[js.Any])
    
    inline def setLineUnitAfterUndefined: Self = StObject.set(x, "lineUnitAfter", js.undefined)
    
    inline def setLineUnitBefore(value: Double): Self = StObject.set(x, "lineUnitBefore", value.asInstanceOf[js.Any])
    
    inline def setLineUnitBeforeUndefined: Self = StObject.set(x, "lineUnitBefore", js.undefined)
    
    inline def setMirrorIndents(value: Boolean): Self = StObject.set(x, "mirrorIndents", value.asInstanceOf[js.Any])
    
    inline def setMirrorIndentsUndefined: Self = StObject.set(x, "mirrorIndents", js.undefined)
    
    inline def setOutlineLevel(
      value: OutlineLevel | OutlineLevel1 | OutlineLevel2 | OutlineLevel3 | OutlineLevel4 | OutlineLevel5 | OutlineLevel6 | OutlineLevel7 | OutlineLevel8 | OutlineLevel9 | OutlineLevelBodyText
    ): Self = StObject.set(x, "outlineLevel", value.asInstanceOf[js.Any])
    
    inline def setOutlineLevelUndefined: Self = StObject.set(x, "outlineLevel", js.undefined)
    
    inline def setRightIndent(value: Double): Self = StObject.set(x, "rightIndent", value.asInstanceOf[js.Any])
    
    inline def setRightIndentUndefined: Self = StObject.set(x, "rightIndent", js.undefined)
    
    inline def setSpaceAfter(value: Double): Self = StObject.set(x, "spaceAfter", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterUndefined: Self = StObject.set(x, "spaceAfter", js.undefined)
    
    inline def setSpaceBefore(value: Double): Self = StObject.set(x, "spaceBefore", value.asInstanceOf[js.Any])
    
    inline def setSpaceBeforeUndefined: Self = StObject.set(x, "spaceBefore", js.undefined)
    
    inline def setWidowControl(value: Boolean): Self = StObject.set(x, "widowControl", value.asInstanceOf[js.Any])
    
    inline def setWidowControlUndefined: Self = StObject.set(x, "widowControl", js.undefined)
  }
}
