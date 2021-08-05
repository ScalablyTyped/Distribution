package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * The Document object is the top level object. A Document object contains one or more sections, content controls, and the body that contains the contents of the document.
  *
  * [Api set: WordApi 1.1]
  */
trait DocumentLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets or sets a value that indicates that, when opening a new document, whether it is allowed to close this document even if this document is untitled. True to close, false otherwise.
    *
    * [Api set: WordApi]
    */
  var allowCloseOnUntitled: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the body object of the document. The body is the text that excludes headers, footers, footnotes, textboxes, etc..
    *
    * [Api set: WordApi 1.1]
    */
  var body: js.UndefOr[BodyLoadOptions] = js.undefined
  
  /**
    *
    * Gets the properties of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var properties: js.UndefOr[DocumentPropertiesLoadOptions] = js.undefined
  
  /**
    *
    * Indicates whether the changes in the document have been saved. A value of true indicates that the document hasn't changed since it was saved. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var saved: js.UndefOr[Boolean] = js.undefined
}
object DocumentLoadOptions {
  
  inline def apply(): DocumentLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentLoadOptions]
  }
  
  extension [Self <: DocumentLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAllowCloseOnUntitled(value: Boolean): Self = StObject.set(x, "allowCloseOnUntitled", value.asInstanceOf[js.Any])
    
    inline def setAllowCloseOnUntitledUndefined: Self = StObject.set(x, "allowCloseOnUntitled", js.undefined)
    
    inline def setBody(value: BodyLoadOptions): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setProperties(value: DocumentPropertiesLoadOptions): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setSaved(value: Boolean): Self = StObject.set(x, "saved", value.asInstanceOf[js.Any])
    
    inline def setSavedUndefined: Self = StObject.set(x, "saved", js.undefined)
  }
}
