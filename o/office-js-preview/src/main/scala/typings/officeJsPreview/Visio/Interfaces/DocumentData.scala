package typings.officeJsPreview.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "document.toJSON()". */
@js.native
trait DocumentData extends StObject {
  
  /**
    *
    * Represents a Visio application instance that contains this document. Read-only.
    *
    * [Api set:  1.1]
    */
  var application: js.UndefOr[ApplicationData] = js.native
  
  /**
    *
    * Represents a collection of pages associated with the document. Read-only.
    *
    * [Api set:  1.1]
    */
  var pages: js.UndefOr[js.Array[PageData]] = js.native
  
  /**
    *
    * Returns the DocumentView object. Read-only.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[DocumentViewData] = js.native
}
object DocumentData {
  
  @scala.inline
  def apply(): DocumentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentData]
  }
  
  @scala.inline
  implicit class DocumentDataMutableBuilder[Self <: DocumentData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: ApplicationData): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    @scala.inline
    def setPages(value: js.Array[PageData]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    @scala.inline
    def setPagesVarargs(value: PageData*): Self = StObject.set(x, "pages", js.Array(value :_*))
    
    @scala.inline
    def setView(value: DocumentViewData): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
