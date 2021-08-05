package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the InkAnalysisParagraphCollection object, for use in "inkAnalysisParagraphCollection.set({ ... })". */
trait InkAnalysisParagraphCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[InkAnalysisParagraphData]] = js.undefined
}
object InkAnalysisParagraphCollectionUpdateData {
  
  inline def apply(): InkAnalysisParagraphCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisParagraphCollectionUpdateData]
  }
  
  extension [Self <: InkAnalysisParagraphCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[InkAnalysisParagraphData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: InkAnalysisParagraphData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
