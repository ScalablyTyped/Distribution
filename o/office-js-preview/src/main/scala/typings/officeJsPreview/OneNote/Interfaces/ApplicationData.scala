package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "application.toJSON()". */
@js.native
trait ApplicationData extends StObject {
  
  /**
    *
    * Gets the collection of notebooks that are open in the OneNote application instance. In OneNote on the web, only one notebook at a time is open in the application instance. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var notebooks: js.UndefOr[js.Array[NotebookData]] = js.native
}
object ApplicationData {
  
  @scala.inline
  def apply(): ApplicationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationData]
  }
  
  @scala.inline
  implicit class ApplicationDataMutableBuilder[Self <: ApplicationData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebooks(value: js.Array[NotebookData]): Self = StObject.set(x, "notebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebooksUndefined: Self = StObject.set(x, "notebooks", js.undefined)
    
    @scala.inline
    def setNotebooksVarargs(value: NotebookData*): Self = StObject.set(x, "notebooks", js.Array(value :_*))
  }
}
