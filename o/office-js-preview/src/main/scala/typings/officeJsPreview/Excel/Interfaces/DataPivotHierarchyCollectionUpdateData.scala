package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the DataPivotHierarchyCollection object, for use in `dataPivotHierarchyCollection.set({ ... })`. */
trait DataPivotHierarchyCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[DataPivotHierarchyData]] = js.undefined
}
object DataPivotHierarchyCollectionUpdateData {
  
  @scala.inline
  def apply(): DataPivotHierarchyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPivotHierarchyCollectionUpdateData]
  }
  
  @scala.inline
  implicit class DataPivotHierarchyCollectionUpdateDataMutableBuilder[Self <: DataPivotHierarchyCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[DataPivotHierarchyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: DataPivotHierarchyData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
