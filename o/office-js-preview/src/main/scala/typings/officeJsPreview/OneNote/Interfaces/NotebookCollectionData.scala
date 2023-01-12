package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `notebookCollection.toJSON()`. */
trait NotebookCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[NotebookData]] = js.undefined
}
object NotebookCollectionData {
  
  inline def apply(): NotebookCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[NotebookData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: NotebookData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
