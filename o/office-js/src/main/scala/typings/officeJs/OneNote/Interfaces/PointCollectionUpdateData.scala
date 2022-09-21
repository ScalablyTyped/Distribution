package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PointCollection object, for use in `pointCollection.set({ ... })`. */
trait PointCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[PointData]] = js.undefined
}
object PointCollectionUpdateData {
  
  inline def apply(): PointCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCollectionUpdateData]
  }
  
  extension [Self <: PointCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[PointData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PointData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
