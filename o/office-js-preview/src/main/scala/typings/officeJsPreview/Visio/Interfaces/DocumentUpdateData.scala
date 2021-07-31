package typings.officeJsPreview.Visio.Interfaces

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
  
  @scala.inline
  def apply(): DocumentUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentUpdateData]
  }
  
  @scala.inline
  implicit class DocumentUpdateDataMutableBuilder[Self <: DocumentUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: ApplicationUpdateData): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    @scala.inline
    def setView(value: DocumentViewUpdateData): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
