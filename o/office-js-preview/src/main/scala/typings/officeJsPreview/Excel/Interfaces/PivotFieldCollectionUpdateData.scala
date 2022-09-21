package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PivotFieldCollection object, for use in `pivotFieldCollection.set({ ... })`. */
trait PivotFieldCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotFieldData]] = js.undefined
}
object PivotFieldCollectionUpdateData {
  
  inline def apply(): PivotFieldCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotFieldCollectionUpdateData]
  }
  
  extension [Self <: PivotFieldCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[PivotFieldData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PivotFieldData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
