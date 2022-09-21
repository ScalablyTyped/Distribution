package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the InkWordCollection object, for use in `inkWordCollection.set({ ... })`. */
trait InkWordCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[InkWordData]] = js.undefined
}
object InkWordCollectionUpdateData {
  
  inline def apply(): InkWordCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkWordCollectionUpdateData]
  }
  
  extension [Self <: InkWordCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[InkWordData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: InkWordData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
