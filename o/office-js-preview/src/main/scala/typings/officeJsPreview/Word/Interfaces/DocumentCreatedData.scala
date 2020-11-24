package typings.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `documentCreated.toJSON()`. */
@js.native
trait DocumentCreatedData extends js.Object {
  
  /**
    *
    * Gets the body object of the document. The body is the text that excludes headers, footers, footnotes, textboxes, etc.. Read-only.
    *
    * [Api set: WordApiHiddenDocument 1.3]
    */
  var body: js.UndefOr[BodyData] = js.native
  
  /**
    *
    * Gets the collection of content control objects in the document. This includes content controls in the body of the document, headers, footers, textboxes, etc.. Read-only.
    *
    * [Api set: WordApiHiddenDocument 1.3]
    */
  var contentControls: js.UndefOr[js.Array[ContentControlData]] = js.native
  
  /**
    *
    * Gets the custom XML parts in the document. Read-only.
    *
    * [Api set: WordApiHiddenDocument 1.4]
    * @beta
    */
  var customXmlParts: js.UndefOr[js.Array[CustomXmlPartData]] = js.native
  
  /**
    *
    * Gets the properties of the document. Read-only.
    *
    * [Api set: WordApiHiddenDocument 1.3]
    */
  var properties: js.UndefOr[DocumentPropertiesData] = js.native
  
  /**
    *
    * Indicates whether the changes in the document have been saved. A value of true indicates that the document hasn't changed since it was saved. Read-only.
    *
    * [Api set: WordApiHiddenDocument 1.3]
    */
  var saved: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the collection of section objects in the document. Read-only.
    *
    * [Api set: WordApiHiddenDocument 1.3]
    */
  var sections: js.UndefOr[js.Array[SectionData]] = js.native
  
  /**
    *
    * Gets the add-in's settings in the document. Read-only.
    *
    * [Api set: WordApiHiddenDocument 1.4]
    * @beta
    */
  var settings: js.UndefOr[js.Array[SettingData]] = js.native
}
object DocumentCreatedData {
  
  @scala.inline
  def apply(): DocumentCreatedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentCreatedData]
  }
  
  @scala.inline
  implicit class DocumentCreatedDataOps[Self <: DocumentCreatedData] (val x: Self) extends AnyVal {
    
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
    def setBody(value: BodyData): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setContentControlsVarargs(value: ContentControlData*): Self = this.set("contentControls", js.Array(value :_*))
    
    @scala.inline
    def setContentControls(value: js.Array[ContentControlData]): Self = this.set("contentControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentControls: Self = this.set("contentControls", js.undefined)
    
    @scala.inline
    def setCustomXmlPartsVarargs(value: CustomXmlPartData*): Self = this.set("customXmlParts", js.Array(value :_*))
    
    @scala.inline
    def setCustomXmlParts(value: js.Array[CustomXmlPartData]): Self = this.set("customXmlParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomXmlParts: Self = this.set("customXmlParts", js.undefined)
    
    @scala.inline
    def setProperties(value: DocumentPropertiesData): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setSaved(value: Boolean): Self = this.set("saved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaved: Self = this.set("saved", js.undefined)
    
    @scala.inline
    def setSectionsVarargs(value: SectionData*): Self = this.set("sections", js.Array(value :_*))
    
    @scala.inline
    def setSections(value: js.Array[SectionData]): Self = this.set("sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSections: Self = this.set("sections", js.undefined)
    
    @scala.inline
    def setSettingsVarargs(value: SettingData*): Self = this.set("settings", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: js.Array[SettingData]): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
}
