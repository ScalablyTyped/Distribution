package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the FilterPivotHierarchyCollection object, for use in `filterPivotHierarchyCollection.set({ ... })`. */
@js.native
trait FilterPivotHierarchyCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[FilterPivotHierarchyData]] = js.native
}
object FilterPivotHierarchyCollectionUpdateData {
  
  @scala.inline
  def apply(): FilterPivotHierarchyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterPivotHierarchyCollectionUpdateData]
  }
  
  @scala.inline
  implicit class FilterPivotHierarchyCollectionUpdateDataMutableBuilder[Self <: FilterPivotHierarchyCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[FilterPivotHierarchyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: FilterPivotHierarchyData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
