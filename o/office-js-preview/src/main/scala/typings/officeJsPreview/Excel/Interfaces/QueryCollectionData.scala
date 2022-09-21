package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `queryCollection.toJSON()`. */
trait QueryCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[QueryData]] = js.undefined
}
object QueryCollectionData {
  
  inline def apply(): QueryCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryCollectionData]
  }
  
  extension [Self <: QueryCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[QueryData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: QueryData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
