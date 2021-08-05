package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the InkAnalysisLineCollection object, for use in "inkAnalysisLineCollection.set({ ... })". */
trait InkAnalysisLineCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[InkAnalysisLineData]] = js.undefined
}
object InkAnalysisLineCollectionUpdateData {
  
  inline def apply(): InkAnalysisLineCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisLineCollectionUpdateData]
  }
  
  extension [Self <: InkAnalysisLineCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[InkAnalysisLineData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: InkAnalysisLineData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
