package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the DocumentCreated object, for use in `documentCreated.set({ ... })`. */
trait DocumentCreatedUpdateData extends StObject {
  
  /**
    * Gets the body object of the document. The body is the text that excludes headers, footers, footnotes, textboxes, etc.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.3]
    */
  var body: js.UndefOr[BodyUpdateData] = js.undefined
  
  /**
    * Gets the properties of the document.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.3]
    */
  var properties: js.UndefOr[DocumentPropertiesUpdateData] = js.undefined
}
object DocumentCreatedUpdateData {
  
  inline def apply(): DocumentCreatedUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentCreatedUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentCreatedUpdateData] (val x: Self) extends AnyVal {
    
    inline def setBody(value: BodyUpdateData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setProperties(value: DocumentPropertiesUpdateData): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
