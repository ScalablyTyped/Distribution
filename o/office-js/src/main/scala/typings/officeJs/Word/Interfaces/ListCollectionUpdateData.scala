package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ListCollection object, for use in `listCollection.set({ ... })`. */
trait ListCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[ListData]] = js.undefined
}
object ListCollectionUpdateData {
  
  inline def apply(): ListCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionUpdateData]
  }
  
  extension [Self <: ListCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[ListData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ListData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
