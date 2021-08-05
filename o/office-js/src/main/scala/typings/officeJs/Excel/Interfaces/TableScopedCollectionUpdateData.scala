package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableScopedCollection object, for use in `tableScopedCollection.set({ ... })`. */
trait TableScopedCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[TableData]] = js.undefined
}
object TableScopedCollectionUpdateData {
  
  inline def apply(): TableScopedCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableScopedCollectionUpdateData]
  }
  
  extension [Self <: TableScopedCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[TableData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TableData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
