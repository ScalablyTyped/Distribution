package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the RangeViewCollection object, for use in `rangeViewCollection.set({ ... })`. */
trait RangeViewCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[RangeViewData]] = js.undefined
}
object RangeViewCollectionUpdateData {
  
  inline def apply(): RangeViewCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeViewCollectionUpdateData]
  }
  
  extension [Self <: RangeViewCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[RangeViewData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RangeViewData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
