package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "notebookCollection.toJSON()". */
trait NotebookCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[NotebookData]] = js.undefined
}
object NotebookCollectionData {
  
  @scala.inline
  def apply(): NotebookCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookCollectionData]
  }
  
  @scala.inline
  implicit class NotebookCollectionDataMutableBuilder[Self <: NotebookCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[NotebookData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: NotebookData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
