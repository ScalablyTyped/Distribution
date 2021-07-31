package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the NotebookCollection object, for use in "notebookCollection.set({ ... })". */
trait NotebookCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[NotebookData]] = js.undefined
}
object NotebookCollectionUpdateData {
  
  @scala.inline
  def apply(): NotebookCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookCollectionUpdateData]
  }
  
  @scala.inline
  implicit class NotebookCollectionUpdateDataMutableBuilder[Self <: NotebookCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[NotebookData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: NotebookData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
