package typings.officeJsPreview.Word.Interfaces

import typings.officeJsPreview.Word.ContentControlAppearance
import typings.officeJsPreview.officeJsPreviewStrings.BoundingBox
import typings.officeJsPreview.officeJsPreviewStrings.Hidden
import typings.officeJsPreview.officeJsPreviewStrings.Tags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ContentControl object, for use in `contentControl.set({ ... })`. */
trait ContentControlUpdateData extends StObject {
  
  /**
    *
    * Gets or sets the appearance of the content control. The value can be 'BoundingBox', 'Tags', or 'Hidden'.
    *
    * [Api set: WordApi 1.1]
    */
  var appearance: js.UndefOr[ContentControlAppearance | BoundingBox | Tags | Hidden] = js.undefined
  
  /**
    *
    * Gets or sets a value that indicates whether the user can delete the content control. Mutually exclusive with removeWhenEdited.
    *
    * [Api set: WordApi 1.1]
    */
  var cannotDelete: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets or sets a value that indicates whether the user can edit the contents of the content control.
    *
    * [Api set: WordApi 1.1]
    */
  var cannotEdit: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets or sets the color of the content control. Color is specified in '#RRGGBB' format or by using the color name.
    *
    * [Api set: WordApi 1.1]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets the text format of the content control. Use this to get and set font name, size, color, and other properties.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontUpdateData] = js.undefined
  
  /**
    *
    * Gets or sets the placeholder text of the content control. Dimmed text will be displayed when the content control is empty.
    *
    * [Api set: WordApi 1.1]
    */
  var placeholderText: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets or sets a value that indicates whether the content control is removed after it is edited. Mutually exclusive with cannotDelete.
    *
    * [Api set: WordApi 1.1]
    */
  var removeWhenEdited: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets or sets the style name for the content control. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets or sets the built-in style name for the content control. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any
  ] = js.undefined
  
  /**
    *
    * Gets or sets a tag to identify a content control.
    *
    * [Api set: WordApi 1.1]
    */
  var tag: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets or sets the title for a content control.
    *
    * [Api set: WordApi 1.1]
    */
  var title: js.UndefOr[String] = js.undefined
}
object ContentControlUpdateData {
  
  @scala.inline
  def apply(): ContentControlUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentControlUpdateData]
  }
  
  @scala.inline
  implicit class ContentControlUpdateDataMutableBuilder[Self <: ContentControlUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppearance(value: ContentControlAppearance | BoundingBox | Tags | Hidden): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    @scala.inline
    def setCannotDelete(value: Boolean): Self = StObject.set(x, "cannotDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCannotDeleteUndefined: Self = StObject.set(x, "cannotDelete", js.undefined)
    
    @scala.inline
    def setCannotEdit(value: Boolean): Self = StObject.set(x, "cannotEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCannotEditUndefined: Self = StObject.set(x, "cannotEdit", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFont(value: FontUpdateData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
    
    @scala.inline
    def setRemoveWhenEdited(value: Boolean): Self = StObject.set(x, "removeWhenEdited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveWhenEditedUndefined: Self = StObject.set(x, "removeWhenEdited", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleBuiltIn(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any): Self = StObject.set(x, "styleBuiltIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleBuiltInUndefined: Self = StObject.set(x, "styleBuiltIn", js.undefined)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
