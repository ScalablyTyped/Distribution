package typings.officeJs.Word.Interfaces

import typings.officeJs.Word.ChangeTrackingMode
import typings.officeJs.officeJsStrings.Off
import typings.officeJs.officeJsStrings.TrackAll
import typings.officeJs.officeJsStrings.TrackMineOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Document object, for use in `document.set({ ... })`. */
trait DocumentUpdateData extends StObject {
  
  /**
    * Gets the body object of the main document. The body is the text that excludes headers, footers, footnotes, textboxes, etc.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var body: js.UndefOr[BodyUpdateData] = js.undefined
  
  /**
    * Gets or sets the ChangeTracking mode.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var changeTrackingMode: js.UndefOr[ChangeTrackingMode | Off | TrackAll | TrackMineOnly] = js.undefined
  
  /**
    * Gets the properties of the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var properties: js.UndefOr[DocumentPropertiesUpdateData] = js.undefined
}
object DocumentUpdateData {
  
  inline def apply(): DocumentUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentUpdateData]
  }
  
  extension [Self <: DocumentUpdateData](x: Self) {
    
    inline def setBody(value: BodyUpdateData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setChangeTrackingMode(value: ChangeTrackingMode | Off | TrackAll | TrackMineOnly): Self = StObject.set(x, "changeTrackingMode", value.asInstanceOf[js.Any])
    
    inline def setChangeTrackingModeUndefined: Self = StObject.set(x, "changeTrackingMode", js.undefined)
    
    inline def setProperties(value: DocumentPropertiesUpdateData): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
