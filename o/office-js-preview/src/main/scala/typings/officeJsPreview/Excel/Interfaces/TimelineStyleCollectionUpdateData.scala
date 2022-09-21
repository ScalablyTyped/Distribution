package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TimelineStyleCollection object, for use in `timelineStyleCollection.set({ ... })`. */
trait TimelineStyleCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[TimelineStyleData]] = js.undefined
}
object TimelineStyleCollectionUpdateData {
  
  inline def apply(): TimelineStyleCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineStyleCollectionUpdateData]
  }
  
  extension [Self <: TimelineStyleCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[TimelineStyleData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TimelineStyleData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
