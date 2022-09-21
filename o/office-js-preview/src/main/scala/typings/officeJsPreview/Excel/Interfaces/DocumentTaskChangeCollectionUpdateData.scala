package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the DocumentTaskChangeCollection object, for use in `documentTaskChangeCollection.set({ ... })`. */
trait DocumentTaskChangeCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[DocumentTaskChangeData]] = js.undefined
}
object DocumentTaskChangeCollectionUpdateData {
  
  inline def apply(): DocumentTaskChangeCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTaskChangeCollectionUpdateData]
  }
  
  extension [Self <: DocumentTaskChangeCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[DocumentTaskChangeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: DocumentTaskChangeData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
