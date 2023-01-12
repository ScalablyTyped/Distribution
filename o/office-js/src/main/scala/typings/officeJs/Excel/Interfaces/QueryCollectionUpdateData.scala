package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the QueryCollection object, for use in `queryCollection.set({ ... })`. */
trait QueryCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[QueryData]] = js.undefined
}
object QueryCollectionUpdateData {
  
  inline def apply(): QueryCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[QueryData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: QueryData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
