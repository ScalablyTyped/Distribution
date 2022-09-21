package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PivotItemCollection object, for use in `pivotItemCollection.set({ ... })`. */
trait PivotItemCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotItemData]] = js.undefined
}
object PivotItemCollectionUpdateData {
  
  inline def apply(): PivotItemCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotItemCollectionUpdateData]
  }
  
  extension [Self <: PivotItemCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[PivotItemData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PivotItemData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
