package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the top-level object that contains all globally addressable OneNote objects such as notebooks, the active notebook, and the active section.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait ApplicationLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the collection of notebooks that are open in the OneNote application instance. In OneNote on the web, only one notebook at a time is open in the application instance.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var notebooks: js.UndefOr[NotebookCollectionLoadOptions] = js.undefined
}
object ApplicationLoadOptions {
  
  inline def apply(): ApplicationLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationLoadOptions]
  }
  
  extension [Self <: ApplicationLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setNotebooks(value: NotebookCollectionLoadOptions): Self = StObject.set(x, "notebooks", value.asInstanceOf[js.Any])
    
    inline def setNotebooksUndefined: Self = StObject.set(x, "notebooks", js.undefined)
  }
}
