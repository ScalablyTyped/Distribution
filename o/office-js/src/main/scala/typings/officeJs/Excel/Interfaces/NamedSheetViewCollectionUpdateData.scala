package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the NamedSheetViewCollection object, for use in `namedSheetViewCollection.set({ ... })`. */
trait NamedSheetViewCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[NamedSheetViewData]] = js.undefined
}
object NamedSheetViewCollectionUpdateData {
  
  inline def apply(): NamedSheetViewCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedSheetViewCollectionUpdateData]
  }
  
  extension [Self <: NamedSheetViewCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[NamedSheetViewData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: NamedSheetViewData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
