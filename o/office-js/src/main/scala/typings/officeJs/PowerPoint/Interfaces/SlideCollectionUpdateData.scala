package typings.officeJs.PowerPoint.Interfaces

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlideCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[SlideData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SlideData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
