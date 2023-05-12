package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ListLevelCollection object, for use in `listLevelCollection.set({ ... })`. */
trait ListLevelCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[ListLevelData]] = js.undefined
}
object ListLevelCollectionUpdateData {
  
  inline def apply(): ListLevelCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLevelCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLevelCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[ListLevelData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ListLevelData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
