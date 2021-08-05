package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `document.toJSON()`. */
trait DocumentData extends StObject {
  
  /**
    *
    * Gets the body object of the document. The body is the text that excludes headers, footers, footnotes, textboxes, etc.. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var body: js.UndefOr[BodyData] = js.undefined
  
  /**
    *
    * Gets the collection of content control objects in the document. This includes content controls in the body of the document, headers, footers, textboxes, etc.. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var contentControls: js.UndefOr[js.Array[ContentControlData]] = js.undefined
  
  /**
    *
    * Gets the properties of the document. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var properties: js.UndefOr[DocumentPropertiesData] = js.undefined
  
  /**
    *
    * Indicates whether the changes in the document have been saved. A value of true indicates that the document hasn't changed since it was saved. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var saved: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the collection of section objects in the document. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var sections: js.UndefOr[js.Array[SectionData]] = js.undefined
}
object DocumentData {
  
  inline def apply(): DocumentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentData]
  }
  
  extension [Self <: DocumentData](x: Self) {
    
    inline def setBody(value: BodyData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setContentControls(value: js.Array[ContentControlData]): Self = StObject.set(x, "contentControls", value.asInstanceOf[js.Any])
    
    inline def setContentControlsUndefined: Self = StObject.set(x, "contentControls", js.undefined)
    
    inline def setContentControlsVarargs(value: ContentControlData*): Self = StObject.set(x, "contentControls", js.Array(value :_*))
    
    inline def setProperties(value: DocumentPropertiesData): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setSaved(value: Boolean): Self = StObject.set(x, "saved", value.asInstanceOf[js.Any])
    
    inline def setSavedUndefined: Self = StObject.set(x, "saved", js.undefined)
    
    inline def setSections(value: js.Array[SectionData]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setSectionsVarargs(value: SectionData*): Self = StObject.set(x, "sections", js.Array(value :_*))
  }
}
