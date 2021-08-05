package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the BindingCollection object, for use in `bindingCollection.set({ ... })`. */
trait BindingCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[BindingData]] = js.undefined
}
object BindingCollectionUpdateData {
  
  inline def apply(): BindingCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingCollectionUpdateData]
  }
  
  extension [Self <: BindingCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[BindingData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: BindingData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
