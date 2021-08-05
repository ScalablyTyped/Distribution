package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the SlicerItemCollection object, for use in `slicerItemCollection.set({ ... })`. */
trait SlicerItemCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[SlicerItemData]] = js.undefined
}
object SlicerItemCollectionUpdateData {
  
  inline def apply(): SlicerItemCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerItemCollectionUpdateData]
  }
  
  extension [Self <: SlicerItemCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[SlicerItemData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SlicerItemData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
