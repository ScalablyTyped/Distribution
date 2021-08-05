package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `namedItemCollection.toJSON()`. */
trait NamedItemCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[NamedItemData]] = js.undefined
}
object NamedItemCollectionData {
  
  inline def apply(): NamedItemCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedItemCollectionData]
  }
  
  extension [Self <: NamedItemCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[NamedItemData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: NamedItemData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
