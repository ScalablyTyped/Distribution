package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the FilterPivotHierarchyCollection object, for use in `filterPivotHierarchyCollection.set({ ... })`. */
trait FilterPivotHierarchyCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[FilterPivotHierarchyData]] = js.undefined
}
object FilterPivotHierarchyCollectionUpdateData {
  
  inline def apply(): FilterPivotHierarchyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterPivotHierarchyCollectionUpdateData]
  }
  
  extension [Self <: FilterPivotHierarchyCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[FilterPivotHierarchyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: FilterPivotHierarchyData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
