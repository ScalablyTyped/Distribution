package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the DocumentCreated object, for use in `documentCreated.set({ ... })`. */
@js.native
trait DocumentCreatedUpdateData extends StObject {
  
  /**
    *
    * Gets the body object of the document. The body is the text that excludes headers, footers, footnotes, textboxes, etc..
    *
    * [Api set: WordApiHiddenDocument 1.3]
    */
  var body: js.UndefOr[BodyUpdateData] = js.native
  
  /**
    *
    * Gets the properties of the document.
    *
    * [Api set: WordApiHiddenDocument 1.3]
    */
  var properties: js.UndefOr[DocumentPropertiesUpdateData] = js.native
}
object DocumentCreatedUpdateData {
  
  @scala.inline
  def apply(): DocumentCreatedUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentCreatedUpdateData]
  }
  
  @scala.inline
  implicit class DocumentCreatedUpdateDataMutableBuilder[Self <: DocumentCreatedUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BodyUpdateData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setProperties(value: DocumentPropertiesUpdateData): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
