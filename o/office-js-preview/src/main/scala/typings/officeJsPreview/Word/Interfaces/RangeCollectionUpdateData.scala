package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the RangeCollection object, for use in `rangeCollection.set({ ... })`. */
trait RangeCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[RangeData]] = js.undefined
}
object RangeCollectionUpdateData {
  
  inline def apply(): RangeCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeCollectionUpdateData]
  }
  
  extension [Self <: RangeCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[RangeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RangeData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
