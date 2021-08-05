package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tableScopedCollection.toJSON()`. */
trait TableScopedCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[TableData]] = js.undefined
}
object TableScopedCollectionData {
  
  inline def apply(): TableScopedCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableScopedCollectionData]
  }
  
  extension [Self <: TableScopedCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[TableData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TableData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
