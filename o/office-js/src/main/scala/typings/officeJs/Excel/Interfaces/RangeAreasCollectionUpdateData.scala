package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the RangeAreasCollection object, for use in `rangeAreasCollection.set({ ... })`. */
trait RangeAreasCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[RangeAreasData]] = js.undefined
}
object RangeAreasCollectionUpdateData {
  
  inline def apply(): RangeAreasCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeAreasCollectionUpdateData]
  }
  
  extension [Self <: RangeAreasCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[RangeAreasData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RangeAreasData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
