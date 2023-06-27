package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a style of paragraph in a document.
  *
  * @remarks
  * [Api set: WordApi 1.5]
  */
trait ParagraphFormatLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the alignment for the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var alignment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the value (in points) for a first line or hanging indent. Use a positive value to set a first-line indent, and use a negative value to set a hanging indent.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var firstLineIndent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether all lines in the specified paragraphs remain on the same page when Microsoft Word repaginates the document.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var keepTogether: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the specified paragraph remains on the same page as the paragraph that follows it when Microsoft Word repaginates the document.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var keepWithNext: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the left indent.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var leftIndent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the line spacing (in points) for the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var lineSpacing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the amount of spacing (in gridlines) after the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var lineUnitAfter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the amount of spacing (in gridlines) before the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var lineUnitBefore: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether left and right indents are the same width.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var mirrorIndents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the outline level for the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var outlineLevel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the right indent (in points) for the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var rightIndent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the amount of spacing (in points) after the specified paragraph or text column.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var spaceAfter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the spacing (in points) before the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var spaceBefore: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the first and last lines in the specified paragraph remain on the same page as the rest of the paragraph when Microsoft Word repaginates the document.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var widowControl: js.UndefOr[Boolean] = js.undefined
}
object ParagraphFormatLoadOptions {
  
  inline def apply(): ParagraphFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphFormatLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParagraphFormatLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAlignment(value: Boolean): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setFirstLineIndent(value: Boolean): Self = StObject.set(x, "firstLineIndent", value.asInstanceOf[js.Any])
    
    inline def setFirstLineIndentUndefined: Self = StObject.set(x, "firstLineIndent", js.undefined)
    
    inline def setKeepTogether(value: Boolean): Self = StObject.set(x, "keepTogether", value.asInstanceOf[js.Any])
    
    inline def setKeepTogetherUndefined: Self = StObject.set(x, "keepTogether", js.undefined)
    
    inline def setKeepWithNext(value: Boolean): Self = StObject.set(x, "keepWithNext", value.asInstanceOf[js.Any])
    
    inline def setKeepWithNextUndefined: Self = StObject.set(x, "keepWithNext", js.undefined)
    
    inline def setLeftIndent(value: Boolean): Self = StObject.set(x, "leftIndent", value.asInstanceOf[js.Any])
    
    inline def setLeftIndentUndefined: Self = StObject.set(x, "leftIndent", js.undefined)
    
    inline def setLineSpacing(value: Boolean): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineSpacingUndefined: Self = StObject.set(x, "lineSpacing", js.undefined)
    
    inline def setLineUnitAfter(value: Boolean): Self = StObject.set(x, "lineUnitAfter", value.asInstanceOf[js.Any])
    
    inline def setLineUnitAfterUndefined: Self = StObject.set(x, "lineUnitAfter", js.undefined)
    
    inline def setLineUnitBefore(value: Boolean): Self = StObject.set(x, "lineUnitBefore", value.asInstanceOf[js.Any])
    
    inline def setLineUnitBeforeUndefined: Self = StObject.set(x, "lineUnitBefore", js.undefined)
    
    inline def setMirrorIndents(value: Boolean): Self = StObject.set(x, "mirrorIndents", value.asInstanceOf[js.Any])
    
    inline def setMirrorIndentsUndefined: Self = StObject.set(x, "mirrorIndents", js.undefined)
    
    inline def setOutlineLevel(value: Boolean): Self = StObject.set(x, "outlineLevel", value.asInstanceOf[js.Any])
    
    inline def setOutlineLevelUndefined: Self = StObject.set(x, "outlineLevel", js.undefined)
    
    inline def setRightIndent(value: Boolean): Self = StObject.set(x, "rightIndent", value.asInstanceOf[js.Any])
    
    inline def setRightIndentUndefined: Self = StObject.set(x, "rightIndent", js.undefined)
    
    inline def setSpaceAfter(value: Boolean): Self = StObject.set(x, "spaceAfter", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterUndefined: Self = StObject.set(x, "spaceAfter", js.undefined)
    
    inline def setSpaceBefore(value: Boolean): Self = StObject.set(x, "spaceBefore", value.asInstanceOf[js.Any])
    
    inline def setSpaceBeforeUndefined: Self = StObject.set(x, "spaceBefore", js.undefined)
    
    inline def setWidowControl(value: Boolean): Self = StObject.set(x, "widowControl", value.asInstanceOf[js.Any])
    
    inline def setWidowControlUndefined: Self = StObject.set(x, "widowControl", js.undefined)
  }
}
