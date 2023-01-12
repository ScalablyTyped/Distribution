package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tableColumnCollection.toJSON()`. */
trait TableColumnCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[TableColumnData]] = js.undefined
}
object TableColumnCollectionData {
  
  inline def apply(): TableColumnCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableColumnCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableColumnCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[TableColumnData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TableColumnData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
