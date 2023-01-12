package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pivotHierarchyCollection.toJSON()`. */
trait PivotHierarchyCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotHierarchyData]] = js.undefined
}
object PivotHierarchyCollectionData {
  
  inline def apply(): PivotHierarchyCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotHierarchyCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotHierarchyCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[PivotHierarchyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PivotHierarchyData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
