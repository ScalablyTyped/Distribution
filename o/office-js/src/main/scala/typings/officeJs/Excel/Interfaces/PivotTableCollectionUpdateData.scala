package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PivotTableCollection object, for use in `pivotTableCollection.set({ ... })`. */
trait PivotTableCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotTableData]] = js.undefined
}
object PivotTableCollectionUpdateData {
  
  inline def apply(): PivotTableCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTableCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[PivotTableData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PivotTableData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
