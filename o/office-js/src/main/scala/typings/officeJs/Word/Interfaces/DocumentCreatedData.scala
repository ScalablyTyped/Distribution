package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `documentCreated.toJSON()`. */
trait DocumentCreatedData extends StObject {
  
  /**
    * Gets the body object of the document. The body is the text that excludes headers, footers, footnotes, textboxes, etc.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.3]
    */
  var body: js.UndefOr[BodyData] = js.undefined
  
  /**
    * Gets the collection of content control objects in the document. This includes content controls in the body of the document, headers, footers, textboxes, etc.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.3]
    */
  var contentControls: js.UndefOr[js.Array[ContentControlData]] = js.undefined
  
  /**
    * Gets the custom XML parts in the document.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.4]
    */
  var customXmlParts: js.UndefOr[js.Array[CustomXmlPartData]] = js.undefined
  
  /**
    * Gets the properties of the document.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.3]
    */
  var properties: js.UndefOr[DocumentPropertiesData] = js.undefined
  
  /**
    * Indicates whether the changes in the document have been saved. A value of true indicates that the document hasn't changed since it was saved.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.3]
    */
  var saved: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the collection of section objects in the document.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.3]
    */
  var sections: js.UndefOr[js.Array[SectionData]] = js.undefined
  
  /**
    * Gets the add-in's settings in the document.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.4]
    */
  var settings: js.UndefOr[js.Array[SettingData]] = js.undefined
}
object DocumentCreatedData {
  
  inline def apply(): DocumentCreatedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentCreatedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentCreatedData] (val x: Self) extends AnyVal {
    
    inline def setBody(value: BodyData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setContentControls(value: js.Array[ContentControlData]): Self = StObject.set(x, "contentControls", value.asInstanceOf[js.Any])
    
    inline def setContentControlsUndefined: Self = StObject.set(x, "contentControls", js.undefined)
    
    inline def setContentControlsVarargs(value: ContentControlData*): Self = StObject.set(x, "contentControls", js.Array(value*))
    
    inline def setCustomXmlParts(value: js.Array[CustomXmlPartData]): Self = StObject.set(x, "customXmlParts", value.asInstanceOf[js.Any])
    
    inline def setCustomXmlPartsUndefined: Self = StObject.set(x, "customXmlParts", js.undefined)
    
    inline def setCustomXmlPartsVarargs(value: CustomXmlPartData*): Self = StObject.set(x, "customXmlParts", js.Array(value*))
    
    inline def setProperties(value: DocumentPropertiesData): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setSaved(value: Boolean): Self = StObject.set(x, "saved", value.asInstanceOf[js.Any])
    
    inline def setSavedUndefined: Self = StObject.set(x, "saved", js.undefined)
    
    inline def setSections(value: js.Array[SectionData]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setSectionsVarargs(value: SectionData*): Self = StObject.set(x, "sections", js.Array(value*))
    
    inline def setSettings(value: js.Array[SettingData]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSettingsVarargs(value: SettingData*): Self = StObject.set(x, "settings", js.Array(value*))
  }
}
