package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the SlicerStyleCollection object, for use in `slicerStyleCollection.set({ ... })`. */
trait SlicerStyleCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[SlicerStyleData]] = js.undefined
}
object SlicerStyleCollectionUpdateData {
  
  inline def apply(): SlicerStyleCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerStyleCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlicerStyleCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[SlicerStyleData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SlicerStyleData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
