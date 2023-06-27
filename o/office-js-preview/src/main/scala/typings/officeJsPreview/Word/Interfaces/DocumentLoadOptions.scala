package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Document object is the top level object. A Document object contains one or more sections, content controls, and the body that contains the contents of the document.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
trait DocumentLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the body object of the main document. The body is the text that excludes headers, footers, footnotes, textboxes, etc.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var body: js.UndefOr[BodyLoadOptions] = js.undefined
  
  /**
    * Specifies the ChangeTracking mode.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var changeTrackingMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the properties of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var properties: js.UndefOr[DocumentPropertiesLoadOptions] = js.undefined
  
  /**
    * Indicates whether the changes in the document have been saved. A value of true indicates that the document hasn't changed since it was saved.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var saved: js.UndefOr[Boolean] = js.undefined
}
object DocumentLoadOptions {
  
  inline def apply(): DocumentLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setBody(value: BodyLoadOptions): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setChangeTrackingMode(value: Boolean): Self = StObject.set(x, "changeTrackingMode", value.asInstanceOf[js.Any])
    
    inline def setChangeTrackingModeUndefined: Self = StObject.set(x, "changeTrackingMode", js.undefined)
    
    inline def setProperties(value: DocumentPropertiesLoadOptions): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setSaved(value: Boolean): Self = StObject.set(x, "saved", value.asInstanceOf[js.Any])
    
    inline def setSavedUndefined: Self = StObject.set(x, "saved", js.undefined)
  }
}
