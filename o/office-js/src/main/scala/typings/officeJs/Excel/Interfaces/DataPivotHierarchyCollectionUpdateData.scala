package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the DataPivotHierarchyCollection object, for use in `dataPivotHierarchyCollection.set({ ... })`. */
trait DataPivotHierarchyCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[DataPivotHierarchyData]] = js.undefined
}
object DataPivotHierarchyCollectionUpdateData {
  
  inline def apply(): DataPivotHierarchyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPivotHierarchyCollectionUpdateData]
  }
  
  extension [Self <: DataPivotHierarchyCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[DataPivotHierarchyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: DataPivotHierarchyData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
