package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableRowCollection object, for use in `tableRowCollection.set({ ... })`. */
trait TableRowCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[TableRowData]] = js.undefined
}
object TableRowCollectionUpdateData {
  
  inline def apply(): TableRowCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableRowCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[TableRowData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TableRowData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
