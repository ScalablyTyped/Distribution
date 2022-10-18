package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the body of a document or a section.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
trait BodyLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the text format of the body. Use this to get and set font name, size, color and other properties.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontLoadOptions] = js.undefined
  
  /**
    * Gets the parent body of the body. For example, a table cell body's parent body could be a header. Throws an `ItemNotFound` error if there isn't a parent body.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.undefined
  
  /**
    * Gets the parent body of the body. For example, a table cell body's parent body could be a header. If there isn't a parent body, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var parentBodyOrNullObject: js.UndefOr[BodyLoadOptions] = js.undefined
  
  /**
    * Gets the content control that contains the body. Throws an `ItemNotFound` error if there isn't a parent content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.undefined
  
  /**
    * Gets the content control that contains the body. If there isn't a parent content control, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.undefined
  
  /**
    * Gets the parent section of the body. Throws an `ItemNotFound` error if there isn't a parent section.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var parentSection: js.UndefOr[SectionLoadOptions] = js.undefined
  
  /**
    * Gets the parent section of the body. If there isn't a parent section, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var parentSectionOrNullObject: js.UndefOr[SectionLoadOptions] = js.undefined
  
  /**
    * Gets or sets the style name for the body. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the built-in style name for the body. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the text of the body. Use the insertText method to insert text.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the type of the body. The type can be 'MainDoc', 'Section', 'Header', 'Footer', or 'TableCell'. Additional types ‘Footnote’, ‘Endnote’, and ‘NoteItem’ are supported in WordApiOnline 1.1 and later.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
}
object BodyLoadOptions {
  
  inline def apply(): BodyLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyLoadOptions]
  }
  
  extension [Self <: BodyLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setFont(value: FontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setParentBody(value: BodyLoadOptions): Self = StObject.set(x, "parentBody", value.asInstanceOf[js.Any])
    
    inline def setParentBodyOrNullObject(value: BodyLoadOptions): Self = StObject.set(x, "parentBodyOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setParentBodyOrNullObjectUndefined: Self = StObject.set(x, "parentBodyOrNullObject", js.undefined)
    
    inline def setParentBodyUndefined: Self = StObject.set(x, "parentBody", js.undefined)
    
    inline def setParentContentControl(value: ContentControlLoadOptions): Self = StObject.set(x, "parentContentControl", value.asInstanceOf[js.Any])
    
    inline def setParentContentControlOrNullObject(value: ContentControlLoadOptions): Self = StObject.set(x, "parentContentControlOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setParentContentControlOrNullObjectUndefined: Self = StObject.set(x, "parentContentControlOrNullObject", js.undefined)
    
    inline def setParentContentControlUndefined: Self = StObject.set(x, "parentContentControl", js.undefined)
    
    inline def setParentSection(value: SectionLoadOptions): Self = StObject.set(x, "parentSection", value.asInstanceOf[js.Any])
    
    inline def setParentSectionOrNullObject(value: SectionLoadOptions): Self = StObject.set(x, "parentSectionOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setParentSectionOrNullObjectUndefined: Self = StObject.set(x, "parentSectionOrNullObject", js.undefined)
    
    inline def setParentSectionUndefined: Self = StObject.set(x, "parentSection", js.undefined)
    
    inline def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleBuiltIn(value: Boolean): Self = StObject.set(x, "styleBuiltIn", value.asInstanceOf[js.Any])
    
    inline def setStyleBuiltInUndefined: Self = StObject.set(x, "styleBuiltIn", js.undefined)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
