package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `filterPivotHierarchyCollection.toJSON()`. */
trait FilterPivotHierarchyCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[FilterPivotHierarchyData]] = js.undefined
}
object FilterPivotHierarchyCollectionData {
  
  inline def apply(): FilterPivotHierarchyCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterPivotHierarchyCollectionData]
  }
  
  extension [Self <: FilterPivotHierarchyCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[FilterPivotHierarchyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: FilterPivotHierarchyData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
