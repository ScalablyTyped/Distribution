package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `document.toJSON()`. */
@js.native
trait DocumentData extends StObject {
  
  /**
    *
    * Gets the body object of the document. The body is the text that excludes headers, footers, footnotes, textboxes, etc.. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var body: js.UndefOr[BodyData] = js.native
  
  /**
    *
    * Gets the collection of content control objects in the document. This includes content controls in the body of the document, headers, footers, textboxes, etc.. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var contentControls: js.UndefOr[js.Array[ContentControlData]] = js.native
  
  /**
    *
    * Gets the custom XML parts in the document. Read-only.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var customXmlParts: js.UndefOr[js.Array[CustomXmlPartData]] = js.native
  
  /**
    *
    * Gets the properties of the document. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var properties: js.UndefOr[DocumentPropertiesData] = js.native
  
  /**
    *
    * Indicates whether the changes in the document have been saved. A value of true indicates that the document hasn't changed since it was saved. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var saved: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the collection of section objects in the document. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var sections: js.UndefOr[js.Array[SectionData]] = js.native
  
  /**
    *
    * Gets the add-in's settings in the document. Read-only.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var settings: js.UndefOr[js.Array[SettingData]] = js.native
}
object DocumentData {
  
  @scala.inline
  def apply(): DocumentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentData]
  }
  
  @scala.inline
  implicit class DocumentDataMutableBuilder[Self <: DocumentData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BodyData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setContentControls(value: js.Array[ContentControlData]): Self = StObject.set(x, "contentControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentControlsUndefined: Self = StObject.set(x, "contentControls", js.undefined)
    
    @scala.inline
    def setContentControlsVarargs(value: ContentControlData*): Self = StObject.set(x, "contentControls", js.Array(value :_*))
    
    @scala.inline
    def setCustomXmlParts(value: js.Array[CustomXmlPartData]): Self = StObject.set(x, "customXmlParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomXmlPartsUndefined: Self = StObject.set(x, "customXmlParts", js.undefined)
    
    @scala.inline
    def setCustomXmlPartsVarargs(value: CustomXmlPartData*): Self = StObject.set(x, "customXmlParts", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: DocumentPropertiesData): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setSaved(value: Boolean): Self = StObject.set(x, "saved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavedUndefined: Self = StObject.set(x, "saved", js.undefined)
    
    @scala.inline
    def setSections(value: js.Array[SectionData]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    @scala.inline
    def setSectionsVarargs(value: SectionData*): Self = StObject.set(x, "sections", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: js.Array[SettingData]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    @scala.inline
    def setSettingsVarargs(value: SettingData*): Self = StObject.set(x, "settings", js.Array(value :_*))
  }
}
