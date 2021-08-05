package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `dataPivotHierarchyCollection.toJSON()`. */
trait DataPivotHierarchyCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[DataPivotHierarchyData]] = js.undefined
}
object DataPivotHierarchyCollectionData {
  
  inline def apply(): DataPivotHierarchyCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPivotHierarchyCollectionData]
  }
  
  extension [Self <: DataPivotHierarchyCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[DataPivotHierarchyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: DataPivotHierarchyData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
