package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `documentCreated.toJSON()`. */
@js.native
trait DocumentCreatedData extends StObject {
  
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
}
object DocumentCreatedData {
  
  @scala.inline
  def apply(): DocumentCreatedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentCreatedData]
  }
  
  @scala.inline
  implicit class DocumentCreatedDataMutableBuilder[Self <: DocumentCreatedData] (val x: Self) extends AnyVal {
    
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
  }
}
