package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `noteItemCollection.toJSON()`. */
trait NoteItemCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[NoteItemData]] = js.undefined
}
object NoteItemCollectionData {
  
  inline def apply(): NoteItemCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteItemCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoteItemCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[NoteItemData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: NoteItemData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
