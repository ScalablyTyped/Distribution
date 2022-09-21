package typings.officeJs.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the SlideMasterCollection object, for use in `slideMasterCollection.set({ ... })`. */
trait SlideMasterCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[SlideMasterData]] = js.undefined
}
object SlideMasterCollectionUpdateData {
  
  inline def apply(): SlideMasterCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideMasterCollectionUpdateData]
  }
  
  extension [Self <: SlideMasterCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[SlideMasterData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SlideMasterData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
