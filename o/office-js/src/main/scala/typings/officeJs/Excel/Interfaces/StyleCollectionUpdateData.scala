package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the StyleCollection object, for use in `styleCollection.set({ ... })`. */
trait StyleCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[StyleData]] = js.undefined
}
object StyleCollectionUpdateData {
  
  inline def apply(): StyleCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleCollectionUpdateData]
  }
  
  extension [Self <: StyleCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[StyleData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: StyleData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
