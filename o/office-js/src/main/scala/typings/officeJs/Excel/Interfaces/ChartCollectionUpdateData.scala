package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartCollection object, for use in `chartCollection.set({ ... })`. */
trait ChartCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[ChartData]] = js.undefined
}
object ChartCollectionUpdateData {
  
  inline def apply(): ChartCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[ChartData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ChartData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
