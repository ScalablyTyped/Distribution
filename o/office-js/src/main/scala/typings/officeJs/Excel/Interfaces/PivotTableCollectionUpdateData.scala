package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PivotTableCollection object, for use in `pivotTableCollection.set({ ... })`. */
@js.native
trait PivotTableCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotTableData]] = js.native
}
object PivotTableCollectionUpdateData {
  
  @scala.inline
  def apply(): PivotTableCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableCollectionUpdateData]
  }
  
  @scala.inline
  implicit class PivotTableCollectionUpdateDataMutableBuilder[Self <: PivotTableCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PivotTableData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PivotTableData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
