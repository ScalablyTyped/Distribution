package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PivotTableScopedCollection object, for use in `pivotTableScopedCollection.set({ ... })`. */
trait PivotTableScopedCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotTableData]] = js.undefined
}
object PivotTableScopedCollectionUpdateData {
  
  inline def apply(): PivotTableScopedCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableScopedCollectionUpdateData]
  }
  
  extension [Self <: PivotTableScopedCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[PivotTableData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PivotTableData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
