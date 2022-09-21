package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `rowColumnPivotHierarchyCollection.toJSON()`. */
trait RowColumnPivotHierarchyCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[RowColumnPivotHierarchyData]] = js.undefined
}
object RowColumnPivotHierarchyCollectionData {
  
  inline def apply(): RowColumnPivotHierarchyCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowColumnPivotHierarchyCollectionData]
  }
  
  extension [Self <: RowColumnPivotHierarchyCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[RowColumnPivotHierarchyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RowColumnPivotHierarchyData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
