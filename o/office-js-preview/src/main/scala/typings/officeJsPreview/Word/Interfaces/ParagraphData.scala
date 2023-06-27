package typings.officeJsPreview.Word.Interfaces

import typings.officeJsPreview.Word.Alignment
import typings.officeJsPreview.officeJsPreviewStrings.Centered
import typings.officeJsPreview.officeJsPreviewStrings.Justified
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.Mixed
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `paragraph.toJSON()`. */
trait ParagraphData extends StObject {
  
  /**
    * Specifies the alignment for a paragraph. The value can be 'left', 'centered', 'right', or 'justified'.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var alignment: js.UndefOr[Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified] = js.undefined
  
  /**
    * Gets the collection of fields in the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var fields: js.UndefOr[js.Array[FieldData]] = js.undefined
  
  /**
    * Specifies the value, in points, for a first line or hanging indent. Use a positive value to set a first-line indent, and use a negative value to set a hanging indent.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var firstLineIndent: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the text format of the paragraph. Use this to get and set font name, size, color, and other properties.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontData] = js.undefined
  
  /**
    * Gets the collection of InlinePicture objects in the paragraph. The collection does not include floating images.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var inlinePictures: js.UndefOr[js.Array[InlinePictureData]] = js.undefined
  
  /**
    * Indicates the paragraph is the last one inside its parent body.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var isLastParagraph: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Checks whether the paragraph is a list item.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var isListItem: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the left indent value, in points, for the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var leftIndent: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the line spacing, in points, for the specified paragraph. In the Word UI, this value is divided by 12.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var lineSpacing: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the amount of spacing, in grid lines, after the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var lineUnitAfter: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the amount of spacing, in grid lines, before the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var lineUnitBefore: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the ListItem for the paragraph. Throws an `ItemNotFound` error if the paragraph is not part of a list.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var listItem: js.UndefOr[ListItemData] = js.undefined
  
  /**
    * Gets the ListItem for the paragraph. If the paragraph is not part of a list, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var listItemOrNullObject: js.UndefOr[ListItemData] = js.undefined
  
  /**
    * Specifies the outline level for the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var outlineLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the right indent value, in points, for the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var rightIndent: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the spacing, in points, after the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var spaceAfter: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the spacing, in points, before the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var spaceBefore: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the style name for the paragraph. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the built-in style name for the paragraph. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150, starting with typings.officeJsPreview.Word.BuiltInStyleName, typings.officeJsPreview.officeJsPreviewStrings.Other, typings.officeJsPreview.officeJsPreviewStrings.Normal */ Any
  ] = js.undefined
  
  /**
    * Gets the level of the paragraph's table. It returns 0 if the paragraph is not in a table.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var tableNestingLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the text of the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[String] = js.undefined
}
object ParagraphData {
  
  inline def apply(): ParagraphData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParagraphData] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setFields(value: js.Array[FieldData]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: FieldData*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFirstLineIndent(value: Double): Self = StObject.set(x, "firstLineIndent", value.asInstanceOf[js.Any])
    
    inline def setFirstLineIndentUndefined: Self = StObject.set(x, "firstLineIndent", js.undefined)
    
    inline def setFont(value: FontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setInlinePictures(value: js.Array[InlinePictureData]): Self = StObject.set(x, "inlinePictures", value.asInstanceOf[js.Any])
    
    inline def setInlinePicturesUndefined: Self = StObject.set(x, "inlinePictures", js.undefined)
    
    inline def setInlinePicturesVarargs(value: InlinePictureData*): Self = StObject.set(x, "inlinePictures", js.Array(value*))
    
    inline def setIsLastParagraph(value: Boolean): Self = StObject.set(x, "isLastParagraph", value.asInstanceOf[js.Any])
    
    inline def setIsLastParagraphUndefined: Self = StObject.set(x, "isLastParagraph", js.undefined)
    
    inline def setIsListItem(value: Boolean): Self = StObject.set(x, "isListItem", value.asInstanceOf[js.Any])
    
    inline def setIsListItemUndefined: Self = StObject.set(x, "isListItem", js.undefined)
    
    inline def setLeftIndent(value: Double): Self = StObject.set(x, "leftIndent", value.asInstanceOf[js.Any])
    
    inline def setLeftIndentUndefined: Self = StObject.set(x, "leftIndent", js.undefined)
    
    inline def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineSpacingUndefined: Self = StObject.set(x, "lineSpacing", js.undefined)
    
    inline def setLineUnitAfter(value: Double): Self = StObject.set(x, "lineUnitAfter", value.asInstanceOf[js.Any])
    
    inline def setLineUnitAfterUndefined: Self = StObject.set(x, "lineUnitAfter", js.undefined)
    
    inline def setLineUnitBefore(value: Double): Self = StObject.set(x, "lineUnitBefore", value.asInstanceOf[js.Any])
    
    inline def setLineUnitBeforeUndefined: Self = StObject.set(x, "lineUnitBefore", js.undefined)
    
    inline def setListItem(value: ListItemData): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
    
    inline def setListItemOrNullObject(value: ListItemData): Self = StObject.set(x, "listItemOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setListItemOrNullObjectUndefined: Self = StObject.set(x, "listItemOrNullObject", js.undefined)
    
    inline def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
    
    inline def setOutlineLevel(value: Double): Self = StObject.set(x, "outlineLevel", value.asInstanceOf[js.Any])
    
    inline def setOutlineLevelUndefined: Self = StObject.set(x, "outlineLevel", js.undefined)
    
    inline def setRightIndent(value: Double): Self = StObject.set(x, "rightIndent", value.asInstanceOf[js.Any])
    
    inline def setRightIndentUndefined: Self = StObject.set(x, "rightIndent", js.undefined)
    
    inline def setSpaceAfter(value: Double): Self = StObject.set(x, "spaceAfter", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterUndefined: Self = StObject.set(x, "spaceAfter", js.undefined)
    
    inline def setSpaceBefore(value: Double): Self = StObject.set(x, "spaceBefore", value.asInstanceOf[js.Any])
    
    inline def setSpaceBeforeUndefined: Self = StObject.set(x, "spaceBefore", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleBuiltIn(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150, starting with typings.officeJsPreview.Word.BuiltInStyleName, typings.officeJsPreview.officeJsPreviewStrings.Other, typings.officeJsPreview.officeJsPreviewStrings.Normal */ Any
    ): Self = StObject.set(x, "styleBuiltIn", value.asInstanceOf[js.Any])
    
    inline def setStyleBuiltInUndefined: Self = StObject.set(x, "styleBuiltIn", js.undefined)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTableNestingLevel(value: Double): Self = StObject.set(x, "tableNestingLevel", value.asInstanceOf[js.Any])
    
    inline def setTableNestingLevelUndefined: Self = StObject.set(x, "tableNestingLevel", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
