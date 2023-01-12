package typings.officeJsPreview.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the SlideLayoutCollection object, for use in `slideLayoutCollection.set({ ... })`. */
trait SlideLayoutCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[SlideLayoutData]] = js.undefined
}
object SlideLayoutCollectionUpdateData {
  
  inline def apply(): SlideLayoutCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideLayoutCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlideLayoutCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[SlideLayoutData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SlideLayoutData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
