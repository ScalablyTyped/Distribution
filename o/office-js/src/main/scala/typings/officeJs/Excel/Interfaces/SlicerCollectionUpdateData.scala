package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the SlicerCollection object, for use in `slicerCollection.set({ ... })`. */
trait SlicerCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[SlicerData]] = js.undefined
}
object SlicerCollectionUpdateData {
  
  inline def apply(): SlicerCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerCollectionUpdateData]
  }
  
  extension [Self <: SlicerCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[SlicerData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SlicerData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
