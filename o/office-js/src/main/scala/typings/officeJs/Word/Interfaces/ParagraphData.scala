package typings.officeJs.Word.Interfaces

import typings.officeJs.Word.Alignment
import typings.officeJs.officeJsStrings.Centered
import typings.officeJs.officeJsStrings.Justified
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.Mixed
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `paragraph.toJSON()`. */
trait ParagraphData extends StObject {
  
  /**
    *
    * Gets or sets the alignment for a paragraph. The value can be 'left', 'centered', 'right', or 'justified'.
    *
    * [Api set: WordApi 1.1]
    */
  var alignment: js.UndefOr[Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified] = js.undefined
  
  /**
    *
    * Gets or sets the value, in points, for a first line or hanging indent. Use a positive value to set a first-line indent, and use a negative value to set a hanging indent.
    *
    * [Api set: WordApi 1.1]
    */
  var firstLineIndent: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Gets the text format of the paragraph. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontData] = js.undefined
  
  /**
    *
    * Gets the collection of InlinePicture objects in the paragraph. The collection does not include floating images. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var inlinePictures: js.UndefOr[js.Array[InlinePictureData]] = js.undefined
  
  /**
    *
    * Indicates the paragraph is the last one inside its parent body. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var isLastParagraph: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Checks whether the paragraph is a list item. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var isListItem: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets or sets the left indent value, in points, for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var leftIndent: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Gets or sets the line spacing, in points, for the specified paragraph. In the Word UI, this value is divided by 12.
    *
    * [Api set: WordApi 1.1]
    */
  var lineSpacing: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Gets or sets the amount of spacing, in grid lines, after the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var lineUnitAfter: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Gets or sets the amount of spacing, in grid lines, before the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var lineUnitBefore: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Gets the ListItem for the paragraph. Throws an error if the paragraph is not part of a list. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var listItem: js.UndefOr[ListItemData] = js.undefined
  
  /**
    *
    * Gets the ListItem for the paragraph. Returns a null object if the paragraph is not part of a list. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var listItemOrNullObject: js.UndefOr[ListItemData] = js.undefined
  
  /**
    *
    * Gets or sets the outline level for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var outlineLevel: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Gets or sets the right indent value, in points, for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var rightIndent: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Gets or sets the spacing, in points, after the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var spaceAfter: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Gets or sets the spacing, in points, before the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var spaceBefore: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Gets or sets the style name for the paragraph. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets or sets the built-in style name for the paragraph. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any
  ] = js.undefined
  
  /**
    *
    * Gets the level of the paragraph's table. It returns 0 if the paragraph is not in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var tableNestingLevel: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Gets the text of the paragraph. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[String] = js.undefined
}
object ParagraphData {
  
  @scala.inline
  def apply(): ParagraphData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphData]
  }
  
  @scala.inline
  implicit class ParagraphDataMutableBuilder[Self <: ParagraphData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setFirstLineIndent(value: Double): Self = StObject.set(x, "firstLineIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLineIndentUndefined: Self = StObject.set(x, "firstLineIndent", js.undefined)
    
    @scala.inline
    def setFont(value: FontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setInlinePictures(value: js.Array[InlinePictureData]): Self = StObject.set(x, "inlinePictures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlinePicturesUndefined: Self = StObject.set(x, "inlinePictures", js.undefined)
    
    @scala.inline
    def setInlinePicturesVarargs(value: InlinePictureData*): Self = StObject.set(x, "inlinePictures", js.Array(value :_*))
    
    @scala.inline
    def setIsLastParagraph(value: Boolean): Self = StObject.set(x, "isLastParagraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLastParagraphUndefined: Self = StObject.set(x, "isLastParagraph", js.undefined)
    
    @scala.inline
    def setIsListItem(value: Boolean): Self = StObject.set(x, "isListItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsListItemUndefined: Self = StObject.set(x, "isListItem", js.undefined)
    
    @scala.inline
    def setLeftIndent(value: Double): Self = StObject.set(x, "leftIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIndentUndefined: Self = StObject.set(x, "leftIndent", js.undefined)
    
    @scala.inline
    def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSpacingUndefined: Self = StObject.set(x, "lineSpacing", js.undefined)
    
    @scala.inline
    def setLineUnitAfter(value: Double): Self = StObject.set(x, "lineUnitAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUnitAfterUndefined: Self = StObject.set(x, "lineUnitAfter", js.undefined)
    
    @scala.inline
    def setLineUnitBefore(value: Double): Self = StObject.set(x, "lineUnitBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUnitBeforeUndefined: Self = StObject.set(x, "lineUnitBefore", js.undefined)
    
    @scala.inline
    def setListItem(value: ListItemData): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItemOrNullObject(value: ListItemData): Self = StObject.set(x, "listItemOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItemOrNullObjectUndefined: Self = StObject.set(x, "listItemOrNullObject", js.undefined)
    
    @scala.inline
    def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
    
    @scala.inline
    def setOutlineLevel(value: Double): Self = StObject.set(x, "outlineLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineLevelUndefined: Self = StObject.set(x, "outlineLevel", js.undefined)
    
    @scala.inline
    def setRightIndent(value: Double): Self = StObject.set(x, "rightIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIndentUndefined: Self = StObject.set(x, "rightIndent", js.undefined)
    
    @scala.inline
    def setSpaceAfter(value: Double): Self = StObject.set(x, "spaceAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterUndefined: Self = StObject.set(x, "spaceAfter", js.undefined)
    
    @scala.inline
    def setSpaceBefore(value: Double): Self = StObject.set(x, "spaceBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBeforeUndefined: Self = StObject.set(x, "spaceBefore", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleBuiltIn(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any): Self = StObject.set(x, "styleBuiltIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleBuiltInUndefined: Self = StObject.set(x, "styleBuiltIn", js.undefined)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTableNestingLevel(value: Double): Self = StObject.set(x, "tableNestingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNestingLevelUndefined: Self = StObject.set(x, "tableNestingLevel", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
