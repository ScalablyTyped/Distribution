package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `application.toJSON()`. */
trait ApplicationData extends StObject {
  
  /**
    * Gets the collection of notebooks that are open in the OneNote application instance. In OneNote Online, only one notebook at a time is open in the application instance. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var notebooks: js.UndefOr[js.Array[NotebookData]] = js.undefined
}
object ApplicationData {
  
  inline def apply(): ApplicationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationData] (val x: Self) extends AnyVal {
    
    inline def setNotebooks(value: js.Array[NotebookData]): Self = StObject.set(x, "notebooks", value.asInstanceOf[js.Any])
    
    inline def setNotebooksUndefined: Self = StObject.set(x, "notebooks", js.undefined)
    
    inline def setNotebooksVarargs(value: NotebookData*): Self = StObject.set(x, "notebooks", js.Array(value*))
  }
}
