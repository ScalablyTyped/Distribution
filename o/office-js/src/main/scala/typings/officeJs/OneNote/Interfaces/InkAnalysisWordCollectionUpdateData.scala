package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the InkAnalysisWordCollection object, for use in `inkAnalysisWordCollection.set({ ... })`. */
trait InkAnalysisWordCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[InkAnalysisWordData]] = js.undefined
}
object InkAnalysisWordCollectionUpdateData {
  
  inline def apply(): InkAnalysisWordCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisWordCollectionUpdateData]
  }
  
  extension [Self <: InkAnalysisWordCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[InkAnalysisWordData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: InkAnalysisWordData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
