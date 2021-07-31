package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the body of a document or a section.
  *
  * [Api set: WordApi 1.1]
  */
trait BodyLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the text format of the body. Use this to get and set font name, size, color and other properties.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontLoadOptions] = js.undefined
  
  /**
    *
    * Gets the parent body of the body. For example, a table cell body's parent body could be a header. Throws an error if there isn't a parent body.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.undefined
  
  /**
    *
    * Gets the parent body of the body. For example, a table cell body's parent body could be a header. Returns a null object if there isn't a parent body.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBodyOrNullObject: js.UndefOr[BodyLoadOptions] = js.undefined
  
  /**
    *
    * Gets the content control that contains the body. Throws an error if there isn't a parent content control.
    *
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.undefined
  
  /**
    *
    * Gets the content control that contains the body. Returns a null object if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.undefined
  
  /**
    *
    * Gets the parent section of the body. Throws an error if there isn't a parent section.
    *
    * [Api set: WordApi 1.3]
    */
  var parentSection: js.UndefOr[SectionLoadOptions] = js.undefined
  
  /**
    *
    * Gets the parent section of the body. Returns a null object if there isn't a parent section.
    *
    * [Api set: WordApi 1.3]
    */
  var parentSectionOrNullObject: js.UndefOr[SectionLoadOptions] = js.undefined
  
  /**
    *
    * Gets or sets the style name for the body. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets or sets the built-in style name for the body. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the text of the body. Use the insertText method to insert text. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the type of the body. The type can be 'MainDoc', 'Section', 'Header', 'Footer', or 'TableCell'. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
}
object BodyLoadOptions {
  
  @scala.inline
  def apply(): BodyLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyLoadOptions]
  }
  
  @scala.inline
  implicit class BodyLoadOptionsMutableBuilder[Self <: BodyLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setFont(value: FontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setParentBody(value: BodyLoadOptions): Self = StObject.set(x, "parentBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentBodyOrNullObject(value: BodyLoadOptions): Self = StObject.set(x, "parentBodyOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentBodyOrNullObjectUndefined: Self = StObject.set(x, "parentBodyOrNullObject", js.undefined)
    
    @scala.inline
    def setParentBodyUndefined: Self = StObject.set(x, "parentBody", js.undefined)
    
    @scala.inline
    def setParentContentControl(value: ContentControlLoadOptions): Self = StObject.set(x, "parentContentControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentContentControlOrNullObject(value: ContentControlLoadOptions): Self = StObject.set(x, "parentContentControlOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentContentControlOrNullObjectUndefined: Self = StObject.set(x, "parentContentControlOrNullObject", js.undefined)
    
    @scala.inline
    def setParentContentControlUndefined: Self = StObject.set(x, "parentContentControl", js.undefined)
    
    @scala.inline
    def setParentSection(value: SectionLoadOptions): Self = StObject.set(x, "parentSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentSectionOrNullObject(value: SectionLoadOptions): Self = StObject.set(x, "parentSectionOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentSectionOrNullObjectUndefined: Self = StObject.set(x, "parentSectionOrNullObject", js.undefined)
    
    @scala.inline
    def setParentSectionUndefined: Self = StObject.set(x, "parentSection", js.undefined)
    
    @scala.inline
    def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleBuiltIn(value: Boolean): Self = StObject.set(x, "styleBuiltIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleBuiltInUndefined: Self = StObject.set(x, "styleBuiltIn", js.undefined)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
