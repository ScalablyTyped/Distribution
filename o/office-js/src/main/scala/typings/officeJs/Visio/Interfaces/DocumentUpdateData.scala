package typings.officeJs.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Document object, for use in "document.set({ ... })". */
trait DocumentUpdateData extends StObject {
  
  /**
    *
    * Represents a Visio application instance that contains this document.
    *
    * [Api set:  1.1]
    */
  var application: js.UndefOr[ApplicationUpdateData] = js.undefined
  
  /**
    *
    * Returns the DocumentView object.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[DocumentViewUpdateData] = js.undefined
}
object DocumentUpdateData {
  
  inline def apply(): DocumentUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentUpdateData]
  }
  
  extension [Self <: DocumentUpdateData](x: Self) {
    
    inline def setApplication(value: ApplicationUpdateData): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setView(value: DocumentViewUpdateData): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
