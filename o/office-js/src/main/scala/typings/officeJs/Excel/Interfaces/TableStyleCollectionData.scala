package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tableStyleCollection.toJSON()`. */
trait TableStyleCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[TableStyleData]] = js.undefined
}
object TableStyleCollectionData {
  
  inline def apply(): TableStyleCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableStyleCollectionData]
  }
  
  extension [Self <: TableStyleCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[TableStyleData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TableStyleData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
