package typings.officeJs.Word.Interfaces

import typings.officeJs.Word.ContentControlAppearance
import typings.officeJs.officeJsStrings.BoundingBox
import typings.officeJs.officeJsStrings.Hidden
import typings.officeJs.officeJsStrings.Tags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ContentControl object, for use in `contentControl.set({ ... })`. */
trait ContentControlUpdateData extends StObject {
  
  /**
    * Specifies the appearance of the content control. The value can be 'BoundingBox', 'Tags', or 'Hidden'.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var appearance: js.UndefOr[ContentControlAppearance | BoundingBox | Tags | Hidden] = js.undefined
  
  /**
    * Specifies a value that indicates whether the user can delete the content control. Mutually exclusive with removeWhenEdited.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var cannotDelete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a value that indicates whether the user can edit the contents of the content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var cannotEdit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the color of the content control. Color is specified in '#RRGGBB' format or by using the color name.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the text format of the content control. Use this to get and set font name, size, color, and other properties.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontUpdateData] = js.undefined
  
  /**
    * Specifies the placeholder text of the content control. Dimmed text will be displayed when the content control is empty. **Note**: The set operation for this property is not supported in Word on the web.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var placeholderText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a value that indicates whether the content control is removed after it is edited. Mutually exclusive with cannotDelete.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var removeWhenEdited: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the style name for the content control. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the built-in style name for the content control. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150, starting with typings.officeJs.Word.BuiltInStyleName, typings.officeJs.officeJsStrings.Other, typings.officeJs.officeJsStrings.Normal */ Any
  ] = js.undefined
  
  /**
    * Specifies a tag to identify a content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var tag: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the title for a content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var title: js.UndefOr[String] = js.undefined
}
object ContentControlUpdateData {
  
  inline def apply(): ContentControlUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentControlUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentControlUpdateData] (val x: Self) extends AnyVal {
    
    inline def setAppearance(value: ContentControlAppearance | BoundingBox | Tags | Hidden): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    inline def setCannotDelete(value: Boolean): Self = StObject.set(x, "cannotDelete", value.asInstanceOf[js.Any])
    
    inline def setCannotDeleteUndefined: Self = StObject.set(x, "cannotDelete", js.undefined)
    
    inline def setCannotEdit(value: Boolean): Self = StObject.set(x, "cannotEdit", value.asInstanceOf[js.Any])
    
    inline def setCannotEditUndefined: Self = StObject.set(x, "cannotEdit", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFont(value: FontUpdateData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
    
    inline def setRemoveWhenEdited(value: Boolean): Self = StObject.set(x, "removeWhenEdited", value.asInstanceOf[js.Any])
    
    inline def setRemoveWhenEditedUndefined: Self = StObject.set(x, "removeWhenEdited", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleBuiltIn(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150, starting with typings.officeJs.Word.BuiltInStyleName, typings.officeJs.officeJsStrings.Other, typings.officeJs.officeJsStrings.Normal */ Any
    ): Self = StObject.set(x, "styleBuiltIn", value.asInstanceOf[js.Any])
    
    inline def setStyleBuiltInUndefined: Self = StObject.set(x, "styleBuiltIn", js.undefined)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
