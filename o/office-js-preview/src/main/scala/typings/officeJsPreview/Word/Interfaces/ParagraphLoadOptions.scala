package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single paragraph in a selection, range, content control, or document body.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
trait ParagraphLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the alignment for a paragraph. The value can be 'left', 'centered', 'right', or 'justified'.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var alignment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the value, in points, for a first line or hanging indent. Use a positive value to set a first-line indent, and use a negative value to set a hanging indent.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var firstLineIndent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the text format of the paragraph. Use this to get and set font name, size, color, and other properties.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontLoadOptions] = js.undefined
  
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
  var leftIndent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the line spacing, in points, for the specified paragraph. In the Word UI, this value is divided by 12.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var lineSpacing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the amount of spacing, in grid lines, after the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var lineUnitAfter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the amount of spacing, in grid lines, before the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var lineUnitBefore: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the List to which this paragraph belongs. Throws an `ItemNotFound` error if the paragraph is not in a list.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var list: js.UndefOr[ListLoadOptions] = js.undefined
  
  /**
    * Gets the ListItem for the paragraph. Throws an `ItemNotFound` error if the paragraph is not part of a list.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var listItem: js.UndefOr[ListItemLoadOptions] = js.undefined
  
  /**
    * Gets the ListItem for the paragraph. If the paragraph is not part of a list, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var listItemOrNullObject: js.UndefOr[ListItemLoadOptions] = js.undefined
  
  /**
    * Gets the List to which this paragraph belongs. If the paragraph is not in a list, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var listOrNullObject: js.UndefOr[ListLoadOptions] = js.undefined
  
  /**
    * Specifies the outline level for the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var outlineLevel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the parent body of the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.undefined
  
  /**
    * Gets the content control that contains the paragraph. Throws an `ItemNotFound` error if there isn't a parent content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.undefined
  
  /**
    * Gets the content control that contains the paragraph. If there isn't a parent content control, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.undefined
  
  /**
    * Gets the table that contains the paragraph. Throws an `ItemNotFound` error if it is not contained in a table.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.undefined
  
  /**
    * Gets the table cell that contains the paragraph. Throws an `ItemNotFound` error if it is not contained in a table cell.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.undefined
  
  /**
    * Gets the table cell that contains the paragraph. If it is not contained in a table cell, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellLoadOptions] = js.undefined
  
  /**
    * Gets the table that contains the paragraph. If it is not contained in a table, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var parentTableOrNullObject: js.UndefOr[TableLoadOptions] = js.undefined
  
  /**
    * Specifies the right indent value, in points, for the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var rightIndent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the spacing, in points, after the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var spaceAfter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the spacing, in points, before the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var spaceBefore: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the style name for the paragraph. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the built-in style name for the paragraph. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the level of the paragraph's table. It returns 0 if the paragraph is not in a table.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var tableNestingLevel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the text of the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.undefined
}
object ParagraphLoadOptions {
  
  inline def apply(): ParagraphLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParagraphLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAlignment(value: Boolean): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setFirstLineIndent(value: Boolean): Self = StObject.set(x, "firstLineIndent", value.asInstanceOf[js.Any])
    
    inline def setFirstLineIndentUndefined: Self = StObject.set(x, "firstLineIndent", js.undefined)
    
    inline def setFont(value: FontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setIsLastParagraph(value: Boolean): Self = StObject.set(x, "isLastParagraph", value.asInstanceOf[js.Any])
    
    inline def setIsLastParagraphUndefined: Self = StObject.set(x, "isLastParagraph", js.undefined)
    
    inline def setIsListItem(value: Boolean): Self = StObject.set(x, "isListItem", value.asInstanceOf[js.Any])
    
    inline def setIsListItemUndefined: Self = StObject.set(x, "isListItem", js.undefined)
    
    inline def setLeftIndent(value: Boolean): Self = StObject.set(x, "leftIndent", value.asInstanceOf[js.Any])
    
    inline def setLeftIndentUndefined: Self = StObject.set(x, "leftIndent", js.undefined)
    
    inline def setLineSpacing(value: Boolean): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineSpacingUndefined: Self = StObject.set(x, "lineSpacing", js.undefined)
    
    inline def setLineUnitAfter(value: Boolean): Self = StObject.set(x, "lineUnitAfter", value.asInstanceOf[js.Any])
    
    inline def setLineUnitAfterUndefined: Self = StObject.set(x, "lineUnitAfter", js.undefined)
    
    inline def setLineUnitBefore(value: Boolean): Self = StObject.set(x, "lineUnitBefore", value.asInstanceOf[js.Any])
    
    inline def setLineUnitBeforeUndefined: Self = StObject.set(x, "lineUnitBefore", js.undefined)
    
    inline def setList(value: ListLoadOptions): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListItem(value: ListItemLoadOptions): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
    
    inline def setListItemOrNullObject(value: ListItemLoadOptions): Self = StObject.set(x, "listItemOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setListItemOrNullObjectUndefined: Self = StObject.set(x, "listItemOrNullObject", js.undefined)
    
    inline def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
    
    inline def setListOrNullObject(value: ListLoadOptions): Self = StObject.set(x, "listOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setListOrNullObjectUndefined: Self = StObject.set(x, "listOrNullObject", js.undefined)
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setOutlineLevel(value: Boolean): Self = StObject.set(x, "outlineLevel", value.asInstanceOf[js.Any])
    
    inline def setOutlineLevelUndefined: Self = StObject.set(x, "outlineLevel", js.undefined)
    
    inline def setParentBody(value: BodyLoadOptions): Self = StObject.set(x, "parentBody", value.asInstanceOf[js.Any])
    
    inline def setParentBodyUndefined: Self = StObject.set(x, "parentBody", js.undefined)
    
    inline def setParentContentControl(value: ContentControlLoadOptions): Self = StObject.set(x, "parentContentControl", value.asInstanceOf[js.Any])
    
    inline def setParentContentControlOrNullObject(value: ContentControlLoadOptions): Self = StObject.set(x, "parentContentControlOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setParentContentControlOrNullObjectUndefined: Self = StObject.set(x, "parentContentControlOrNullObject", js.undefined)
    
    inline def setParentContentControlUndefined: Self = StObject.set(x, "parentContentControl", js.undefined)
    
    inline def setParentTable(value: TableLoadOptions): Self = StObject.set(x, "parentTable", value.asInstanceOf[js.Any])
    
    inline def setParentTableCell(value: TableCellLoadOptions): Self = StObject.set(x, "parentTableCell", value.asInstanceOf[js.Any])
    
    inline def setParentTableCellOrNullObject(value: TableCellLoadOptions): Self = StObject.set(x, "parentTableCellOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setParentTableCellOrNullObjectUndefined: Self = StObject.set(x, "parentTableCellOrNullObject", js.undefined)
    
    inline def setParentTableCellUndefined: Self = StObject.set(x, "parentTableCell", js.undefined)
    
    inline def setParentTableOrNullObject(value: TableLoadOptions): Self = StObject.set(x, "parentTableOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setParentTableOrNullObjectUndefined: Self = StObject.set(x, "parentTableOrNullObject", js.undefined)
    
    inline def setParentTableUndefined: Self = StObject.set(x, "parentTable", js.undefined)
    
    inline def setRightIndent(value: Boolean): Self = StObject.set(x, "rightIndent", value.asInstanceOf[js.Any])
    
    inline def setRightIndentUndefined: Self = StObject.set(x, "rightIndent", js.undefined)
    
    inline def setSpaceAfter(value: Boolean): Self = StObject.set(x, "spaceAfter", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterUndefined: Self = StObject.set(x, "spaceAfter", js.undefined)
    
    inline def setSpaceBefore(value: Boolean): Self = StObject.set(x, "spaceBefore", value.asInstanceOf[js.Any])
    
    inline def setSpaceBeforeUndefined: Self = StObject.set(x, "spaceBefore", js.undefined)
    
    inline def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleBuiltIn(value: Boolean): Self = StObject.set(x, "styleBuiltIn", value.asInstanceOf[js.Any])
    
    inline def setStyleBuiltInUndefined: Self = StObject.set(x, "styleBuiltIn", js.undefined)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTableNestingLevel(value: Boolean): Self = StObject.set(x, "tableNestingLevel", value.asInstanceOf[js.Any])
    
    inline def setTableNestingLevelUndefined: Self = StObject.set(x, "tableNestingLevel", js.undefined)
    
    inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
