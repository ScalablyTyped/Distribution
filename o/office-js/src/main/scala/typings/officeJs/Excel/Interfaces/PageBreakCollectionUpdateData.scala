package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PageBreakCollection object, for use in `pageBreakCollection.set({ ... })`. */
trait PageBreakCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[PageBreakData]] = js.undefined
}
object PageBreakCollectionUpdateData {
  
  inline def apply(): PageBreakCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageBreakCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageBreakCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[PageBreakData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PageBreakData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
