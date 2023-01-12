package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the NoteItemCollection object, for use in `noteItemCollection.set({ ... })`. */
trait NoteItemCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[NoteItemData]] = js.undefined
}
object NoteItemCollectionUpdateData {
  
  inline def apply(): NoteItemCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteItemCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoteItemCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[NoteItemData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: NoteItemData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
