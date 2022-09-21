package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the DocumentTaskCollection object, for use in `documentTaskCollection.set({ ... })`. */
trait DocumentTaskCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[DocumentTaskData]] = js.undefined
}
object DocumentTaskCollectionUpdateData {
  
  inline def apply(): DocumentTaskCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTaskCollectionUpdateData]
  }
  
  extension [Self <: DocumentTaskCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[DocumentTaskData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: DocumentTaskData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
