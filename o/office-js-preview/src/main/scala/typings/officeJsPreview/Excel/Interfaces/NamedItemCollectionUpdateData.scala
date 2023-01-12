package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the NamedItemCollection object, for use in `namedItemCollection.set({ ... })`. */
trait NamedItemCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[NamedItemData]] = js.undefined
}
object NamedItemCollectionUpdateData {
  
  inline def apply(): NamedItemCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedItemCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamedItemCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[NamedItemData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: NamedItemData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
