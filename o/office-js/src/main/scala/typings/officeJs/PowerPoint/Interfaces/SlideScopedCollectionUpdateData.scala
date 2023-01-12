package typings.officeJs.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the SlideScopedCollection object, for use in `slideScopedCollection.set({ ... })`. */
trait SlideScopedCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[SlideData]] = js.undefined
}
object SlideScopedCollectionUpdateData {
  
  inline def apply(): SlideScopedCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideScopedCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlideScopedCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[SlideData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SlideData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
