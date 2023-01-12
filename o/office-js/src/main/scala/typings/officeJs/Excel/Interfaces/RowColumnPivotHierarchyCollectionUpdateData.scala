package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the RowColumnPivotHierarchyCollection object, for use in `rowColumnPivotHierarchyCollection.set({ ... })`. */
trait RowColumnPivotHierarchyCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[RowColumnPivotHierarchyData]] = js.undefined
}
object RowColumnPivotHierarchyCollectionUpdateData {
  
  inline def apply(): RowColumnPivotHierarchyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowColumnPivotHierarchyCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowColumnPivotHierarchyCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[RowColumnPivotHierarchyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RowColumnPivotHierarchyData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
