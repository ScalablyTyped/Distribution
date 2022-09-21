package typings.officeJs.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TagCollection object, for use in `tagCollection.set({ ... })`. */
trait TagCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[TagData]] = js.undefined
}
object TagCollectionUpdateData {
  
  inline def apply(): TagCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagCollectionUpdateData]
  }
  
  extension [Self <: TagCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[TagData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TagData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
