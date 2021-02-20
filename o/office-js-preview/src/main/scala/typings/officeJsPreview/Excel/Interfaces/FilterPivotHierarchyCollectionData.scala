package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `filterPivotHierarchyCollection.toJSON()`. */
@js.native
trait FilterPivotHierarchyCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[FilterPivotHierarchyData]] = js.native
}
object FilterPivotHierarchyCollectionData {
  
  @scala.inline
  def apply(): FilterPivotHierarchyCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterPivotHierarchyCollectionData]
  }
  
  @scala.inline
  implicit class FilterPivotHierarchyCollectionDataMutableBuilder[Self <: FilterPivotHierarchyCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[FilterPivotHierarchyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: FilterPivotHierarchyData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
