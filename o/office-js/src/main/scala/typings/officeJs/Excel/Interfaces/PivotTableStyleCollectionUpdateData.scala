package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PivotTableStyleCollection object, for use in `pivotTableStyleCollection.set({ ... })`. */
trait PivotTableStyleCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotTableStyleData]] = js.undefined
}
object PivotTableStyleCollectionUpdateData {
  
  inline def apply(): PivotTableStyleCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableStyleCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTableStyleCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[PivotTableStyleData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PivotTableStyleData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
