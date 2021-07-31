package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PivotTableScopedCollection object, for use in `pivotTableScopedCollection.set({ ... })`. */
trait PivotTableScopedCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotTableData]] = js.undefined
}
object PivotTableScopedCollectionUpdateData {
  
  @scala.inline
  def apply(): PivotTableScopedCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableScopedCollectionUpdateData]
  }
  
  @scala.inline
  implicit class PivotTableScopedCollectionUpdateDataMutableBuilder[Self <: PivotTableScopedCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PivotTableData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PivotTableData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
