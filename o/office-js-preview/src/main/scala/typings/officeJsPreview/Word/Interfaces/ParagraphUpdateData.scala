package typings.officeJsPreview.Word.Interfaces

import typings.officeJsPreview.Word.Alignment
import typings.officeJsPreview.officeJsPreviewStrings.Centered
import typings.officeJsPreview.officeJsPreviewStrings.Justified
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.Mixed
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Paragraph object, for use in `paragraph.set({ ... })`. */
@js.native
trait ParagraphUpdateData extends js.Object {
  
  /**
    *
    * Gets or sets the alignment for a paragraph. The value can be 'left', 'centered', 'right', or 'justified'.
    *
    * [Api set: WordApi 1.1]
    */
  var alignment: js.UndefOr[Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified] = js.native
  
  /**
    *
    * Gets or sets the value, in points, for a first line or hanging indent. Use a positive value to set a first-line indent, and use a negative value to set a hanging indent.
    *
    * [Api set: WordApi 1.1]
    */
  var firstLineIndent: js.UndefOr[Double] = js.native
  
  /**
    *
    * Gets the text format of the paragraph. Use this to get and set font name, size, color, and other properties.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontUpdateData] = js.native
  
  /**
    *
    * Gets or sets the left indent value, in points, for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var leftIndent: js.UndefOr[Double] = js.native
  
  /**
    *
    * Gets or sets the line spacing, in points, for the specified paragraph. In the Word UI, this value is divided by 12.
    *
    * [Api set: WordApi 1.1]
    */
  var lineSpacing: js.UndefOr[Double] = js.native
  
  /**
    *
    * Gets or sets the amount of spacing, in grid lines, after the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var lineUnitAfter: js.UndefOr[Double] = js.native
  
  /**
    *
    * Gets or sets the amount of spacing, in grid lines, before the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var lineUnitBefore: js.UndefOr[Double] = js.native
  
  /**
    *
    * Gets the ListItem for the paragraph. Throws an error if the paragraph is not part of a list.
    *
    * [Api set: WordApi 1.3]
    */
  var listItem: js.UndefOr[ListItemUpdateData] = js.native
  
  /**
    *
    * Gets the ListItem for the paragraph. Returns a null object if the paragraph is not part of a list.
    *
    * [Api set: WordApi 1.3]
    */
  var listItemOrNullObject: js.UndefOr[ListItemUpdateData] = js.native
  
  /**
    *
    * Gets or sets the outline level for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var outlineLevel: js.UndefOr[Double] = js.native
  
  /**
    *
    * Gets or sets the right indent value, in points, for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var rightIndent: js.UndefOr[Double] = js.native
  
  /**
    *
    * Gets or sets the spacing, in points, after the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var spaceAfter: js.UndefOr[Double] = js.native
  
  /**
    *
    * Gets or sets the spacing, in points, before the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var spaceBefore: js.UndefOr[Double] = js.native
  
  /**
    *
    * Gets or sets the style name for the paragraph. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets or sets the built-in style name for the paragraph. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any
  ] = js.native
}
object ParagraphUpdateData {
  
  @scala.inline
  def apply(): ParagraphUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphUpdateData]
  }
  
  @scala.inline
  implicit class ParagraphUpdateDataOps[Self <: ParagraphUpdateData] (val x: Self) extends AnyVal {
    
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
    def setAlignment(value: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setFirstLineIndent(value: Double): Self = this.set("firstLineIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstLineIndent: Self = this.set("firstLineIndent", js.undefined)
    
    @scala.inline
    def setFont(value: FontUpdateData): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setLeftIndent(value: Double): Self = this.set("leftIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftIndent: Self = this.set("leftIndent", js.undefined)
    
    @scala.inline
    def setLineSpacing(value: Double): Self = this.set("lineSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineSpacing: Self = this.set("lineSpacing", js.undefined)
    
    @scala.inline
    def setLineUnitAfter(value: Double): Self = this.set("lineUnitAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineUnitAfter: Self = this.set("lineUnitAfter", js.undefined)
    
    @scala.inline
    def setLineUnitBefore(value: Double): Self = this.set("lineUnitBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineUnitBefore: Self = this.set("lineUnitBefore", js.undefined)
    
    @scala.inline
    def setListItem(value: ListItemUpdateData): Self = this.set("listItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItem: Self = this.set("listItem", js.undefined)
    
    @scala.inline
    def setListItemOrNullObject(value: ListItemUpdateData): Self = this.set("listItemOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItemOrNullObject: Self = this.set("listItemOrNullObject", js.undefined)
    
    @scala.inline
    def setOutlineLevel(value: Double): Self = this.set("outlineLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineLevel: Self = this.set("outlineLevel", js.undefined)
    
    @scala.inline
    def setRightIndent(value: Double): Self = this.set("rightIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightIndent: Self = this.set("rightIndent", js.undefined)
    
    @scala.inline
    def setSpaceAfter(value: Double): Self = this.set("spaceAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaceAfter: Self = this.set("spaceAfter", js.undefined)
    
    @scala.inline
    def setSpaceBefore(value: Double): Self = this.set("spaceBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaceBefore: Self = this.set("spaceBefore", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleBuiltIn(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any): Self = this.set("styleBuiltIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleBuiltIn: Self = this.set("styleBuiltIn", js.undefined)
  }
}
