package typings.officeJsPreview.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the SlideCollection object, for use in `slideCollection.set({ ... })`. */
trait SlideCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[SlideData]] = js.undefined
}
object SlideCollectionUpdateData {
  
  inline def apply(): SlideCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideCollectionUpdateData]
  }
  
  extension [Self <: SlideCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[SlideData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SlideData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
