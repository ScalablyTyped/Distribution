package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ParagraphCollection object, for use in `paragraphCollection.set({ ... })`. */
trait ParagraphCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[ParagraphData]] = js.undefined
}
object ParagraphCollectionUpdateData {
  
  inline def apply(): ParagraphCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphCollectionUpdateData]
  }
  
  extension [Self <: ParagraphCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[ParagraphData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ParagraphData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
